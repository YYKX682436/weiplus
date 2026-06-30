package com.tencent.mm.app;

/* loaded from: classes16.dex */
public interface v6 extends fs.n {
    void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle);

    void onActivityDestroyed(android.app.Activity activity);

    void onActivityPaused(android.app.Activity activity);

    default void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    default void onActivityPostDestroyed(android.app.Activity activity) {
    }

    default void onActivityPostPaused(android.app.Activity activity) {
    }

    default void onActivityPostResumed(android.app.Activity activity) {
    }

    default void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    default void onActivityPostStarted(android.app.Activity activity) {
    }

    default void onActivityPostStopped(android.app.Activity activity) {
    }

    default void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    default void onActivityPreDestroyed(android.app.Activity activity) {
    }

    default void onActivityPrePaused(android.app.Activity activity) {
    }

    default void onActivityPreResumed(android.app.Activity activity) {
    }

    default void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    default void onActivityPreStarted(android.app.Activity activity) {
    }

    default void onActivityPreStopped(android.app.Activity activity) {
    }

    void onActivityResumed(android.app.Activity activity);

    void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle);

    void onActivityStarted(android.app.Activity activity);

    void onActivityStopped(android.app.Activity activity);
}
