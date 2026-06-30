package rd4;

/* loaded from: classes4.dex */
public final class b implements n55.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rd4.d f475781b;

    public b(java.lang.String str, rd4.d dVar) {
        this.f475780a = str;
        this.f475781b = dVar;
    }

    @Override // n55.e
    public void a(o55.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResult", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1$1");
        rd4.d dVar = this.f475781b;
        java.lang.String workTagId = this.f475780a;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "result is null, workTagId: " + workTagId);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 f17 = rd4.d.f(dVar);
            if (f17 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(workTagId, "$workTagId");
                f17.d(3, null, workTagId);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "result is find " + workTagId);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 f18 = rd4.d.f(dVar);
            if (f18 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(workTagId, "$workTagId");
                f18.d(1, aVar, workTagId);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResult", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1$1");
    }
}
