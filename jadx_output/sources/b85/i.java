package b85;

/* loaded from: classes14.dex */
public final class i extends com.tencent.mm.accessibility.core.provider.Provider {

    /* renamed from: a, reason: collision with root package name */
    public static final b85.i f18352a = new b85.i();

    public static final fo3.r a(b85.i iVar, android.view.View view, com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        iVar.getClass();
        java.util.Map<java.lang.Integer, yz5.l> map = mMBaseAccessibilityConfig.getSecurityCheckViewMap$plugin_autoaccessibility_release().get(java.lang.Integer.valueOf(view.getId()));
        if (map == null) {
            return null;
        }
        android.view.View findRoot$plugin_autoaccessibility_release = mMBaseAccessibilityConfig.findRoot$plugin_autoaccessibility_release(view, kz5.n0.S0(map.keySet()));
        yz5.l lVar = map.get(findRoot$plugin_autoaccessibility_release != null ? java.lang.Integer.valueOf(findRoot$plugin_autoaccessibility_release.getId()) : null);
        if (lVar == null) {
            lVar = map.get(iVar.getLayoutId(view));
        }
        if (lVar != null) {
            return (fo3.r) lVar.invoke(view);
        }
        return null;
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealOnAction(android.view.View view, int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        if (i17 != 16) {
            return;
        }
        getConfig(view, new b85.f(view));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public void dealOnTouchEvent(android.view.View view, android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        if (kz5.z.F(new int[]{0, 1, 2}, event.getAction())) {
            getConfig(view, new b85.g(view, event));
        }
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public int getAuthority() {
        return 24;
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public boolean needDelegateTouch(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return getConfig(view, new b85.h(view));
    }

    @Override // com.tencent.mm.accessibility.core.provider.Provider
    public boolean onInterceptTouchEvent(android.view.View v17, android.view.MotionEvent motionEvent, java.lang.StackTraceElement[] stacks) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        kotlin.jvm.internal.o.g(stacks, "stacks");
        int i17 = b85.e.f18347e0;
        b85.e eVar = (b85.e) i95.n0.c(b85.e.class);
        return eVar != null && eVar.isEvilTraces(kz5.z.z0(stacks));
    }
}
