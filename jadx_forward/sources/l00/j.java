package l00;

/* loaded from: classes7.dex */
public final class j implements jc3.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l00.m f396260d;

    public j(l00.m mVar) {
        this.f396260d = mVar;
    }

    @Override // jc3.r
    public void c(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "onCanvasViewFirstFrameRendered, canvasId: " + i17 + ", surfaceReady: " + z17);
        l00.m mVar = this.f396260d;
        mVar.f396264e.a(mVar.f396265f);
    }

    @Override // jc3.r
    public boolean d(int i17, cf3.d view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanvasViewDestroy, canvasId: ");
        sb6.append(i17);
        sb6.append(", viewGroupId: ");
        l00.m mVar = this.f396260d;
        sb6.append(mVar.f396263d);
        sb6.append(", viewId: ");
        sb6.append(mVar.f396265f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", sb6.toString());
        mVar.f396264e.c(mVar.f396265f);
        return true;
    }

    @Override // jc3.r
    public void e(int i17, cf3.d view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanvasViewCreated, canvasId: ");
        sb6.append(i17);
        sb6.append(", viewGroupId: ");
        l00.m mVar = this.f396260d;
        sb6.append(mVar.f396263d);
        sb6.append(", viewId: ");
        sb6.append(mVar.f396265f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", sb6.toString());
        mVar.f396264e.b(mVar.f396263d, mVar.f396265f, view);
    }

    @Override // jc3.r
    public void f(int i17, cf3.d view, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCanvasViewLayout, canvasId: ");
        sb6.append(i17);
        sb6.append(", viewGroupId: ");
        l00.m mVar = this.f396260d;
        sb6.append(mVar.f396263d);
        sb6.append(", viewId: ");
        sb6.append(mVar.f396265f);
        sb6.append(", left: ");
        sb6.append(i18);
        sb6.append(", top: ");
        sb6.append(i19);
        sb6.append(", width: ");
        sb6.append(i27);
        sb6.append(", height: ");
        sb6.append(i28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", sb6.toString());
        mVar.f396264e.d(mVar.f396265f, i18, i19, i27, i28);
    }
}
