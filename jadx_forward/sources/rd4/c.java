package rd4;

/* loaded from: classes4.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6159x3bba2a8a f475782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd4.d f475783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6159x3bba2a8a c6159x3bba2a8a, rd4.d dVar) {
        super(0);
        this.f475782d = c6159x3bba2a8a;
        this.f475783e = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6159x3bba2a8a c6159x3bba2a8a = this.f475782d;
        am.ty tyVar = c6159x3bba2a8a.f136421g;
        int i17 = tyVar.f89574a;
        java.lang.String str = tyVar.f89575b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "remux event return >> code: " + i17 + ", workTagId: " + str);
        am.ty tyVar2 = c6159x3bba2a8a.f136421g;
        rd4.d dVar = this.f475783e;
        if (i17 == 4001) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 f17 = rd4.d.f(dVar);
            if (f17 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                f17.c(str, tyVar2.f89577d);
            }
        } else if (i17 != 4007) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "background remux is error, " + i17 + ", " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o9 f18 = rd4.d.f(dVar);
            if (f18 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                f18.d(3, null, str);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.SightWidgetBackgroundVideoHandler", "background remux done, " + str);
            pp0.o0 o0Var = (pp0.o0) i95.n0.c(pp0.o0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            ((yy0.g8) o0Var).Ai(str, new rd4.b(str, dVar));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.w0.f246522a.e(tyVar2.f89576c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ui.maas.backgroundvideo.SightWidgetTemplateBackgroundVideoHandler$templateVideoResultEventListener$1$callback$1");
        return f0Var;
    }
}
