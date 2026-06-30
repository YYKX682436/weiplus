package com.tencent.mm.accessibility.feature;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/accessibility/feature/ActivityAccCallbacks;", "Lcom/tencent/mm/app/v6;", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroid/os/Bundle;", "bundle", "Ljz5/f0;", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivitySaveInstanceState", "onActivityDestroyed", "<init>", "()V", "feature-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ActivityAccCallbacks implements com.tencent.mm.app.v6 {
    @Override // com.tencent.mm.app.v6
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.accessibility.feature.IAccExptService iAccExptService = (com.tencent.mm.accessibility.feature.IAccExptService) i95.n0.c(com.tencent.mm.accessibility.feature.IAccExptService.class);
        if (iAccExptService != null) {
            iAccExptService.onActivityCreate(activity);
        }
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityDestroyed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityPaused(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostDestroyed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostPaused(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostResumed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostStarted(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPostStopped(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreDestroyed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPrePaused(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreResumed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreStarted(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public /* bridge */ /* synthetic */ void onActivityPreStopped(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityResumed(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.app.v6
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(bundle, "bundle");
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStarted(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStopped(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
    }
}
