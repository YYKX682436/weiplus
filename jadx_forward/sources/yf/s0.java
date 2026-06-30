package yf;

/* loaded from: classes7.dex */
public class s0 extends tf.d {

    /* renamed from: a, reason: collision with root package name */
    public yf.h0 f542993a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542994b;

    public s0(yf.i0 i0Var) {
        this.f542994b = i0Var;
    }

    @Override // tf.d
    public int c() {
        return this.f542994b.f334030d;
    }

    @Override // tf.d
    public java.lang.String d() {
        return this.f542994b.w();
    }

    @Override // tf.d
    public java.lang.String e() {
        return this.f542994b.x();
    }

    @Override // tf.d
    public tf.f g() {
        if (this.f542993a == null) {
            this.f542993a = new yf.h0(this.f542994b);
        }
        return this.f542993a;
    }

    @Override // tf.d
    public pd1.n i() {
        return pd1.n.LivePusher;
    }
}
