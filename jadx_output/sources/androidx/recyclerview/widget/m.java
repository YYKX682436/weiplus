package androidx.recyclerview.widget;

/* loaded from: classes15.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public long f12125a = 0;

    /* renamed from: b, reason: collision with root package name */
    public androidx.recyclerview.widget.m f12126b;

    public void a(int i17) {
        if (i17 < 64) {
            this.f12125a &= ~(1 << i17);
            return;
        }
        androidx.recyclerview.widget.m mVar = this.f12126b;
        if (mVar != null) {
            mVar.a(i17 - 64);
        }
    }

    public int b(int i17) {
        androidx.recyclerview.widget.m mVar = this.f12126b;
        return mVar == null ? i17 >= 64 ? java.lang.Long.bitCount(this.f12125a) : java.lang.Long.bitCount(this.f12125a & ((1 << i17) - 1)) : i17 < 64 ? java.lang.Long.bitCount(this.f12125a & ((1 << i17) - 1)) : mVar.b(i17 - 64) + java.lang.Long.bitCount(this.f12125a);
    }

    public final void c() {
        if (this.f12126b == null) {
            this.f12126b = new androidx.recyclerview.widget.m();
        }
    }

    public boolean d(int i17) {
        if (i17 < 64) {
            return (this.f12125a & (1 << i17)) != 0;
        }
        c();
        return this.f12126b.d(i17 - 64);
    }

    public void e(int i17, boolean z17) {
        if (i17 >= 64) {
            c();
            this.f12126b.e(i17 - 64, z17);
            return;
        }
        long j17 = this.f12125a;
        boolean z18 = (Long.MIN_VALUE & j17) != 0;
        long j18 = (1 << i17) - 1;
        this.f12125a = ((j17 & (~j18)) << 1) | (j17 & j18);
        if (z17) {
            h(i17);
        } else {
            a(i17);
        }
        if (z18 || this.f12126b != null) {
            c();
            this.f12126b.e(0, z18);
        }
    }

    public boolean f(int i17) {
        if (i17 >= 64) {
            c();
            return this.f12126b.f(i17 - 64);
        }
        long j17 = 1 << i17;
        long j18 = this.f12125a;
        boolean z17 = (j18 & j17) != 0;
        long j19 = j18 & (~j17);
        this.f12125a = j19;
        long j27 = j17 - 1;
        this.f12125a = (j19 & j27) | java.lang.Long.rotateRight((~j27) & j19, 1);
        androidx.recyclerview.widget.m mVar = this.f12126b;
        if (mVar != null) {
            if (mVar.d(0)) {
                h(63);
            }
            this.f12126b.f(0);
        }
        return z17;
    }

    public void g() {
        this.f12125a = 0L;
        androidx.recyclerview.widget.m mVar = this.f12126b;
        if (mVar != null) {
            mVar.g();
        }
    }

    public void h(int i17) {
        if (i17 < 64) {
            this.f12125a |= 1 << i17;
        } else {
            c();
            this.f12126b.h(i17 - 64);
        }
    }

    public java.lang.String toString() {
        if (this.f12126b == null) {
            return java.lang.Long.toBinaryString(this.f12125a);
        }
        return this.f12126b.toString() + "xx" + java.lang.Long.toBinaryString(this.f12125a);
    }
}
