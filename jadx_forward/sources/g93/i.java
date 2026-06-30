package g93;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g93.j f351313d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g93.j jVar) {
        super(0);
        this.f351313d = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String stringExtra = this.f351313d.m158359x1e885992().getStringExtra("chatroomlist");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            java.lang.String str = stringExtra;
            if (str != null) {
                return r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
            }
        }
        return kz5.p0.f395529d;
    }
}
