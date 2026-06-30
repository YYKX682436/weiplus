package n91;

/* loaded from: classes7.dex */
public class n extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f417423e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f417424d;

    /* JADX WARN: Removed duplicated region for block: B:15:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(android.content.Context r19, final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 r20) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n91.n.<init>(android.content.Context, com.tencent.mm.plugin.appbrand.o6):void");
    }

    public void b() {
        android.view.View rootView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime = this.f417424d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 x07 = runtime.x0();
        android.view.View findViewById = (x07 == null || (rootView = x07.getRootView()) == null) ? null : rootView.findViewById(com.p314xaae8f345.mm.R.id.w_);
        hk1.e eVar = findViewById instanceof hk1.e ? (hk1.e) findViewById : null;
        android.app.Activity r07 = runtime.r0();
        if (r07 == null) {
            return;
        }
        mi1.h hVar = (mi1.h) runtime.s0().a(r07, mi1.h.class);
        if (eVar == null || hVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12504x38244a7c c12504x38244a7c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12504x38244a7c((android.content.Context) r07, false);
        android.view.View findViewById2 = c12504x38244a7c.findViewById(com.p314xaae8f345.mm.R.id.f568390mn5);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/custom_loading/CustomLoadingSplashView", "attachHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/appbrand/custom_loading/CustomLoadingSplashView", "attachHeaderView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        c12504x38244a7c.mo52141x53bfe316(runtime.u0().f158812e);
        c12504x38244a7c.m52152x4bd4ce78(runtime.u0().f158813f);
        c12504x38244a7c.mo52146x8f9a66e6(new n91.r(runtime));
        eVar.b(hVar, null);
        eVar.a(c12504x38244a7c.m52147xfb86a31b(), null);
        eVar.m133671x7dc6fe8f(runtime.f156343s);
        eVar.m133672xef2521ec(0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: getView */
    public android.view.View mo52965xfb86a31b() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void j(java.lang.String str, java.lang.String str2) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void k(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    public void n(yz5.a aVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setAppServiceType */
    public /* bridge */ /* synthetic */ void mo52967xf31bdbb0(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setCanShowHideAnimation */
    public /* bridge */ /* synthetic */ void mo52968x5fa745f7(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.vc
    /* renamed from: setProgress */
    public void mo52970x3ae760af(int i17) {
    }
}
