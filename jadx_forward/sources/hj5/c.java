package hj5;

/* loaded from: classes.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj5.e f363199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hj5.e eVar) {
        super(0);
        this.f363199d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hj5.e eVar = this.f363199d;
        java.lang.String stringExtra = eVar.m158359x1e885992().getStringExtra("key_rightButtonWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return eVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571992vn);
    }
}
