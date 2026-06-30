package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "componentName", "Landroid/content/ComponentName;", "intentAction", "", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "getComponentName", "()Landroid/content/ComponentName;", "getIntentAction", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "matchesActivity", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroid/app/Activity;", "matchesIntent", "intent", "Landroid/content/Intent;", "toString", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class ActivityFilter {
    private final android.content.ComponentName componentName;
    private final java.lang.String intentAction;

    public ActivityFilter(android.content.ComponentName componentName, java.lang.String str) {
        kotlin.jvm.internal.o.g(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        java.lang.String packageName = componentName.getPackageName();
        kotlin.jvm.internal.o.f(packageName, "componentName.packageName");
        java.lang.String className = componentName.getClassName();
        kotlin.jvm.internal.o.f(className, "componentName.className");
        boolean z17 = true;
        if (!(packageName.length() > 0)) {
            throw new java.lang.IllegalArgumentException("Package name must not be empty".toString());
        }
        if (!(className.length() > 0)) {
            throw new java.lang.IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (!(!r26.n0.B(packageName, "*", false) || r26.n0.L(packageName, "*", 0, false, 6, null) == packageName.length() - 1)) {
            throw new java.lang.IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (r26.n0.B(className, "*", false) && r26.n0.L(className, "*", 0, false, 6, null) != className.length() - 1) {
            z17 = false;
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.window.embedding.ActivityFilter)) {
            return false;
        }
        androidx.window.embedding.ActivityFilter activityFilter = (androidx.window.embedding.ActivityFilter) other;
        return kotlin.jvm.internal.o.b(this.componentName, activityFilter.componentName) && kotlin.jvm.internal.o.b(this.intentAction, activityFilter.intentAction);
    }

    public final android.content.ComponentName getComponentName() {
        return this.componentName;
    }

    public final java.lang.String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int hashCode = this.componentName.hashCode() * 31;
        java.lang.String str = this.intentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivity(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (androidx.window.embedding.MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            java.lang.String str = this.intentAction;
            if (str != null) {
                android.content.Intent intent = activity.getIntent();
                if (kotlin.jvm.internal.o.b(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        if (!androidx.window.embedding.MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        java.lang.String str = this.intentAction;
        return str == null || kotlin.jvm.internal.o.b(str, intent.getAction());
    }

    public java.lang.String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((java.lang.Object) this.intentAction) + ')';
    }
}
