package vr;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f520933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f520934e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f520935f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vr.g gVar, yz5.l lVar, android.content.Context context) {
        super(0);
        this.f520933d = gVar;
        this.f520934e = lVar;
        this.f520935f = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar = this.f520934e;
        vr.g gVar = this.f520933d;
        try {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.j6 j6Var = gVar.f520939d;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = gVar.f520938c;
            if (j6Var != null) {
                abstractC19636xc6b37291.mo75328x6c4ebec7(j6Var);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 k0Var = gVar.f520940e;
            if (k0Var != null) {
                abstractC19636xc6b37291.mo75339x5e04422d(k0Var);
            }
            pm0.v.X(new vr.a(gVar, new vr.e(gVar, this.f520935f, lVar)));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizEmoticonContext", "showEmoticonPanel error: " + e17.getMessage());
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
