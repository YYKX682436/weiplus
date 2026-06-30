package d22;

/* loaded from: classes15.dex */
public final class t implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d22.p f307407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f307408b;

    public t(d22.p pVar, android.content.Context context) {
        this.f307407a = pVar;
        this.f307408b = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: fail */
    public void mo25333x2fd71e(java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMEmoticonLiteAppOpenApi", "checkLiteApp fail: " + appId + ", errCode: " + i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h
    /* renamed from: success */
    public void mo25334x90b54003(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEmoticonLiteAppOpenApi", "checkLiteApp success and preload appId:%s", this.f307407a.j());
        android.content.Context context = this.f307408b;
        java.lang.String appId = this.f307407a.j();
        java.lang.String page = this.f307407a.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        ku5.u0 u0Var = ku5.t0.f394148d;
        d22.s sVar = new d22.s(appId, page, context);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(sVar, 500L, false);
    }
}
