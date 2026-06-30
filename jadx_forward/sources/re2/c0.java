package re2;

/* loaded from: classes3.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.e0 f475905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(re2.e0 e0Var) {
        super(2);
        this.f475905d = e0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        this.f475905d.f475934n = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f475905d.c(), "doPoll failed: errCode=" + intValue + ", errMsg=" + ((java.lang.String) obj2));
        if (!this.f475905d.g(intValue)) {
            if (this.f475905d.e()) {
                this.f475905d.f(4);
            } else if (this.f475905d.f475935o) {
                this.f475905d.f475935o = false;
                this.f475905d.i();
            } else {
                re2.e0 e0Var = this.f475905d;
                if (e0Var.f475922b == re2.a0.f475889e) {
                    e0Var.f475932l.postDelayed(e0Var.f475937q, e0Var.f475933m);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
