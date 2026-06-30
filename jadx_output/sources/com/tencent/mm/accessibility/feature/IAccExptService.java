package com.tencent.mm.accessibility.feature;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0007H&J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H&¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/accessibility/feature/IAccExptService;", "Li95/m;", "Ljz5/f0;", "initAccConfig", "Lq15/a;", "msg", "onReceiveStrikeMsg", "", "isWhiteUser", "isForceStrike", "needInterceptAccAction", "needClearNodeInfo", "needUseFakeInfo", "needInterceptEvilTouch", "", "getTouchExDelayConfirmTimeMs", "hasAccServiceInWhiteList", "hasEvilServiceInEvilList", "Landroid/app/Activity;", "context", "checkEvilServiceStatus", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "onActivityCreate", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface IAccExptService extends i95.m {
    void checkEvilServiceStatus(android.app.Activity activity);

    long getTouchExDelayConfirmTimeMs();

    boolean hasAccServiceInWhiteList();

    boolean hasEvilServiceInEvilList();

    void initAccConfig();

    boolean isForceStrike();

    boolean isWhiteUser();

    boolean needClearNodeInfo();

    boolean needInterceptAccAction();

    boolean needInterceptEvilTouch();

    boolean needUseFakeInfo();

    void onActivityCreate(android.app.Activity activity);

    void onReceiveStrikeMsg(q15.a aVar);
}
