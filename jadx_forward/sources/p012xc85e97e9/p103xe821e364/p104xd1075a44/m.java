package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public long f93658a = 0;

    /* renamed from: b, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.m f93659b;

    public void a(int i17) {
        if (i17 < 64) {
            this.f93658a &= ~(1 << i17);
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m mVar = this.f93659b;
        if (mVar != null) {
            mVar.a(i17 - 64);
        }
    }

    public int b(int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m mVar = this.f93659b;
        return mVar == null ? i17 >= 64 ? java.lang.Long.bitCount(this.f93658a) : java.lang.Long.bitCount(this.f93658a & ((1 << i17) - 1)) : i17 < 64 ? java.lang.Long.bitCount(this.f93658a & ((1 << i17) - 1)) : mVar.b(i17 - 64) + java.lang.Long.bitCount(this.f93658a);
    }

    public final void c() {
        if (this.f93659b == null) {
            this.f93659b = new p012xc85e97e9.p103xe821e364.p104xd1075a44.m();
        }
    }

    public boolean d(int i17) {
        if (i17 < 64) {
            return (this.f93658a & (1 << i17)) != 0;
        }
        c();
        return this.f93659b.d(i17 - 64);
    }

    public void e(int i17, boolean z17) {
        if (i17 >= 64) {
            c();
            this.f93659b.e(i17 - 64, z17);
            return;
        }
        long j17 = this.f93658a;
        boolean z18 = (Long.MIN_VALUE & j17) != 0;
        long j18 = (1 << i17) - 1;
        this.f93658a = ((j17 & (~j18)) << 1) | (j17 & j18);
        if (z17) {
            h(i17);
        } else {
            a(i17);
        }
        if (z18 || this.f93659b != null) {
            c();
            this.f93659b.e(0, z18);
        }
    }

    public boolean f(int i17) {
        if (i17 >= 64) {
            c();
            return this.f93659b.f(i17 - 64);
        }
        long j17 = 1 << i17;
        long j18 = this.f93658a;
        boolean z17 = (j18 & j17) != 0;
        long j19 = j18 & (~j17);
        this.f93658a = j19;
        long j27 = j17 - 1;
        this.f93658a = (j19 & j27) | java.lang.Long.rotateRight((~j27) & j19, 1);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m mVar = this.f93659b;
        if (mVar != null) {
            if (mVar.d(0)) {
                h(63);
            }
            this.f93659b.f(0);
        }
        return z17;
    }

    public void g() {
        this.f93658a = 0L;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.m mVar = this.f93659b;
        if (mVar != null) {
            mVar.g();
        }
    }

    public void h(int i17) {
        if (i17 < 64) {
            this.f93658a |= 1 << i17;
        } else {
            c();
            this.f93659b.h(i17 - 64);
        }
    }

    /* renamed from: toString */
    public java.lang.String m8214x9616526c() {
        if (this.f93659b == null) {
            return java.lang.Long.toBinaryString(this.f93658a);
        }
        return this.f93659b.m8214x9616526c() + "xx" + java.lang.Long.toBinaryString(this.f93658a);
    }
}
