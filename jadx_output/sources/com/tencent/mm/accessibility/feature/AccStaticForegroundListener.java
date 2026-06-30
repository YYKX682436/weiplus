package com.tencent.mm.accessibility.feature;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/mm/accessibility/feature/AccStaticForegroundListener;", "Lcom/tencent/mm/app/z2;", "", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Ljz5/f0;", "onAppForeground", "onAppBackground", "<init>", "()V", "Companion", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class AccStaticForegroundListener extends com.tencent.mm.app.z2 {
    private static final java.lang.String TAG = "MicroMsg.AccStaticForegroundListener";

    @Override // com.tencent.mm.app.a3
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.accessibility.core.AccTouchTimeReporter.INSTANCE.onAppForeground(com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isTouchExplorationEnable());
    }

    @Override // com.tencent.mm.app.a3
    public void onAppForeground(java.lang.String str) {
        ((com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class)).initAccConfig();
        com.tencent.mm.accessibility.core.AccTouchTimeReporter.INSTANCE.onAppForeground(com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isTouchExplorationEnable());
    }
}
