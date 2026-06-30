package com.tencent.mm.accessibility.feature;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\b\u0010\u000b\u001a\u00020\u0002H&¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/tencent/mm/accessibility/feature/IAccessibilityService;", "Li95/m;", "Ljz5/f0;", "triggerOnCreate", "onPerformAccAction", "onClearNodeInfo", "onFakeNodeInfo", "onScreenShotDisable", "onEvilTextChange", "onInitNodeInfo", "needInterceptAccAction", "onInjectionIntercept", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public interface IAccessibilityService extends i95.m {
    void needInterceptAccAction();

    void onClearNodeInfo();

    void onEvilTextChange();

    void onFakeNodeInfo();

    void onInitNodeInfo();

    void onInjectionIntercept();

    void onPerformAccAction();

    void onScreenShotDisable();

    void triggerOnCreate();
}
