package com.tencent.mm.plugin.appbrand.ui;

@kotlin.Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/uc;", "Lcom/tencent/mm/plugin/appbrand/ui/d7;", "com/tencent/mm/plugin/appbrand/ui/qc", "B", "Ljz5/g;", "getKeyEventInterceptor", "()Lcom/tencent/mm/plugin/appbrand/ui/qc;", "keyEventInterceptor", "Lcom/tencent/mm/plugin/appbrand/o6;", "value", "C", "Lcom/tencent/mm/plugin/appbrand/o6;", "getRuntime", "()Lcom/tencent/mm/plugin/appbrand/o6;", "setRuntime", "(Lcom/tencent/mm/plugin/appbrand/o6;)V", "runtime", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", com.tencent.mm.plugin.appbrand.j0.f78445f, "", "showActionBarLoading", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;Z)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class uc extends com.tencent.mm.plugin.appbrand.ui.d7 {

    /* renamed from: B, reason: from kotlin metadata */
    public final jz5.g keyEventInterceptor;

    /* renamed from: C, reason: from kotlin metadata */
    public com.tencent.mm.plugin.appbrand.o6 runtime;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uc(android.content.Context context, android.graphics.Bitmap snapshot) {
        this(context, snapshot, false, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
    }

    private final com.tencent.mm.plugin.appbrand.ui.qc getKeyEventInterceptor() {
        return (com.tencent.mm.plugin.appbrand.ui.qc) ((jz5.n) this.keyEventInterceptor).getValue();
    }

    public static final void setCanShowAlphaCover(boolean z17) {
        com.tencent.mm.sdk.platformtools.o4 a17 = com.tencent.mm.plugin.appbrand.app.q0.f75227a.a();
        if (a17 != null) {
            a17.putBoolean("FakeNativeSnapshotDisplayLoadingSplash_SHOW_ALPHA_COVER", z17);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.d7, com.tencent.mm.plugin.appbrand.ui.jc
    public java.lang.String D() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.runtime;
        java.lang.String str = o6Var != null ? o6Var.f74803n : null;
        if (str == null) {
            str = "null";
        }
        return "FakeNativeSnapshotDisplayLoadingSplash:".concat(str);
    }

    public final com.tencent.mm.plugin.appbrand.o6 getRuntime() {
        return this.runtime;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.d7, com.tencent.mm.plugin.appbrand.ui.vc
    public void n(yz5.a aVar) {
        com.tencent.mm.plugin.appbrand.ui.u5.b(this);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.d7, com.tencent.mm.plugin.appbrand.ui.jc, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.runtime;
        if (o6Var != null) {
            o6Var.B1(getKeyEventInterceptor());
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.d7, com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setAppServiceType(int i17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.d7, com.tencent.mm.plugin.appbrand.ui.hc, com.tencent.mm.plugin.appbrand.ui.jc, com.tencent.mm.plugin.appbrand.ui.vc
    public /* bridge */ /* synthetic */ void setCanShowHideAnimation(boolean z17) {
    }

    public final void setRuntime(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.runtime = o6Var;
        if (o6Var != null) {
            o6Var.P(4, 1, getKeyEventInterceptor());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(android.content.Context context, android.graphics.Bitmap snapshot, boolean z17) {
        super(context, snapshot, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        this.keyEventInterceptor = jz5.h.b(new com.tencent.mm.plugin.appbrand.ui.rc(this));
        setPromptVisible(false);
        if (z17) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.plugin.appbrand.ui.kd kdVar = new com.tencent.mm.plugin.appbrand.ui.kd(context2);
            al1.l lVar = new al1.l(getContext());
            lVar.addView(kdVar);
            addView(lVar, new android.widget.FrameLayout.LayoutParams(-1, -2));
            lVar.addOnAttachStateChangeListener(new com.tencent.mm.plugin.appbrand.ui.tc(kdVar, this, lVar));
        }
    }

    public /* synthetic */ uc(android.content.Context context, android.graphics.Bitmap bitmap, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(context, bitmap, (i17 & 4) != 0 ? true : z17);
    }
}
