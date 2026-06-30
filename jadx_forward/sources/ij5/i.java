package ij5;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f373306d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ij5.t tVar) {
        super(0);
        this.f373306d = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ij5.t tVar = this.f373306d;
        java.lang.String stringExtra = tVar.m158359x1e885992().getStringExtra("key_chatroomSessionWord");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                return stringExtra;
            }
        }
        return tVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ifz);
    }
}
