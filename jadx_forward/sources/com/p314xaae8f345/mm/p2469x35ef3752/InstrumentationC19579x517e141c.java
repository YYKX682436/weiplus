package com.p314xaae8f345.mm.p2469x35ef3752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001JN\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/pluginguard/ActivityHookInstrumentation;", "Landroid/app/Instrumentation;", "Landroid/content/Context;", "who", "Landroid/os/IBinder;", "contextThread", "token", "Landroid/app/Activity;", "target", "Landroid/content/Intent;", "intent", "", "requestCode", "Landroid/os/Bundle;", "options", "Landroid/app/Instrumentation$ActivityResult;", "execStartActivity", "compat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginguard.ActivityHookInstrumentation */
/* loaded from: classes12.dex */
public final class InstrumentationC19579x517e141c extends android.app.Instrumentation {
    @Override // android.app.Instrumentation
    public android.os.TestLooperManager acquireLooperManager(android.os.Looper looper) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void addMonitor(android.app.Instrumentation.ActivityMonitor activityMonitor) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void addResults(android.os.Bundle bundle) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnDestroy(android.app.Activity activity) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnNewIntent(android.app.Activity activity, android.content.Intent intent) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPause(android.app.Activity activity) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPictureInPictureRequested(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestart(android.app.Activity activity) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(android.app.Activity activity, android.os.Bundle savedInstanceState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(savedInstanceState, "savedInstanceState");
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnResume(android.app.Activity activity) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStart(android.app.Activity activity) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnStop(android.app.Activity activity) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnUserLeaving(android.app.Activity activity) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callApplicationOnCreate(android.app.Application application) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public boolean checkMonitorHit(android.app.Instrumentation.ActivityMonitor activityMonitor, int i17) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void endPerformanceSnapshot() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r0 == false) goto L19;
     */
    /* renamed from: execStartActivity */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Instrumentation.ActivityResult m75107x30394480(android.content.Context r19, android.os.IBinder r20, android.os.IBinder r21, android.app.Activity r22, android.content.Intent r23, int r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2469x35ef3752.InstrumentationC19579x517e141c.m75107x30394480(android.content.Context, android.os.IBinder, android.os.IBinder, android.app.Activity, android.content.Intent, int, android.os.Bundle):android.app.Instrumentation$ActivityResult");
    }

    @Override // android.app.Instrumentation
    public void finish(int i17, android.os.Bundle bundle) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.os.Bundle getAllocCounts() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.os.Bundle getBinderCounts() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.content.ComponentName getComponentName() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.content.Context getContext() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public java.lang.String getProcessName() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.content.Context getTargetContext() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.UiAutomation getUiAutomation() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public boolean invokeContextMenuAction(android.app.Activity activity, int i17, int i18) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public boolean invokeMenuActionSync(android.app.Activity activity, int i17, int i18) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public boolean isProfiling() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.Activity newActivity(java.lang.Class cls, android.content.Context context, android.os.IBinder iBinder, android.app.Application application, android.content.Intent intent, android.content.pm.ActivityInfo activityInfo, java.lang.CharSequence charSequence, android.app.Activity activity, java.lang.String str, java.lang.Object obj) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.Application newApplication(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Context context) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void onCreate(android.os.Bundle bundle) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void onDestroy() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public boolean onException(java.lang.Object obj, java.lang.Throwable th6) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void onStart() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void removeMonitor(android.app.Instrumentation.ActivityMonitor activityMonitor) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void runOnMainSync(java.lang.Runnable runnable) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void sendCharacterSync(int i17) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void sendKeyDownUpSync(int i17) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void sendKeySync(android.view.KeyEvent keyEvent) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void sendPointerSync(android.view.MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void sendStatus(int i17, android.os.Bundle bundle) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void sendStringSync(java.lang.String str) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void sendTrackballEventSync(android.view.MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void setAutomaticPerformanceSnapshots() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void setInTouchMode(boolean z17) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void start() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.Activity startActivitySync(android.content.Intent intent) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void startAllocCounting() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void startPerformanceSnapshot() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void startProfiling() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void stopAllocCounting() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void stopProfiling() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void waitForIdle(java.lang.Runnable runnable) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void waitForIdleSync() {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.Activity waitForMonitor(android.app.Instrumentation.ActivityMonitor activityMonitor) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.Activity waitForMonitorWithTimeout(android.app.Instrumentation.ActivityMonitor activityMonitor, long j17) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.Instrumentation.ActivityMonitor addMonitor(android.content.IntentFilter intentFilter, android.app.Instrumentation.ActivityResult activityResult, boolean z17) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnCreate(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnPostCreate(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnRestoreInstanceState(android.app.Activity activity, android.os.Bundle bundle, android.os.PersistableBundle persistableBundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        throw null;
    }

    @Override // android.app.Instrumentation
    public void callActivityOnSaveInstanceState(android.app.Activity activity, android.os.Bundle outState, android.os.PersistableBundle outPersistentState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outPersistentState, "outPersistentState");
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.UiAutomation getUiAutomation(int i17) {
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.Activity newActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) {
        kz5.n0.O(null, str);
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.Activity startActivitySync(android.content.Intent intent, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        throw null;
    }

    @Override // android.app.Instrumentation
    public android.app.Instrumentation.ActivityMonitor addMonitor(java.lang.String str, android.app.Instrumentation.ActivityResult activityResult, boolean z17) {
        throw null;
    }
}
