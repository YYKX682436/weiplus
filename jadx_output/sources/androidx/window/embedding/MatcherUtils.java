package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u001f\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "()V", "sDebugMatchers", "", "sMatchersTag", "", "areActivityOrIntentComponentsMatching", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "Landroid/app/Activity;", "ruleComponent", "Landroid/content/ComponentName;", "areActivityOrIntentComponentsMatching$window_release", "areComponentsMatching", "activityComponent", "areComponentsMatching$window_release", "wildcardMatch", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "pattern", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class MatcherUtils {
    public static final androidx.window.embedding.MatcherUtils INSTANCE = new androidx.window.embedding.MatcherUtils();
    public static final boolean sDebugMatchers = false;
    public static final java.lang.String sMatchersTag = "SplitRuleResolution";

    private MatcherUtils() {
    }

    private final boolean wildcardMatch(java.lang.String name, java.lang.String pattern) {
        if (!r26.n0.D(pattern, "*", false, 2, null)) {
            return false;
        }
        if (kotlin.jvm.internal.o.b(pattern, "*")) {
            return true;
        }
        if (!(r26.n0.L(pattern, "*", 0, false, 6, null) == r26.n0.P(pattern, "*", 0, false, 6, null) && r26.i0.n(pattern, "*", false))) {
            throw new java.lang.IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        java.lang.String substring = pattern.substring(0, pattern.length() - 1);
        kotlin.jvm.internal.o.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return r26.i0.y(name, substring, false);
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(android.app.Activity activity, android.content.ComponentName ruleComponent) {
        android.content.ComponentName component;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(ruleComponent, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        android.content.Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName r6, android.content.ComponentName r7) {
        /*
            r5 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L22
            java.lang.String r6 = r7.getPackageName()
            boolean r6 = kotlin.jvm.internal.o.b(r6, r0)
            if (r6 == 0) goto L20
            java.lang.String r6 = r7.getClassName()
            boolean r6 = kotlin.jvm.internal.o.b(r6, r0)
            if (r6 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            return r1
        L22:
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.o.f(r3, r4)
            boolean r0 = r26.n0.B(r3, r0, r2)
            r0 = r0 ^ r1
            if (r0 == 0) goto L8d
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = r7.getPackageName()
            boolean r0 = kotlin.jvm.internal.o.b(r0, r3)
            if (r0 != 0) goto L5b
            java.lang.String r0 = r6.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.o.f(r0, r3)
            java.lang.String r3 = r7.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.o.f(r3, r4)
            boolean r0 = r5.wildcardMatch(r0, r3)
            if (r0 == 0) goto L59
            goto L5b
        L59:
            r0 = r2
            goto L5c
        L5b:
            r0 = r1
        L5c:
            java.lang.String r3 = r6.getClassName()
            java.lang.String r4 = r7.getClassName()
            boolean r3 = kotlin.jvm.internal.o.b(r3, r4)
            if (r3 != 0) goto L85
            java.lang.String r6 = r6.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.o.f(r6, r3)
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.o.f(r7, r3)
            boolean r6 = r5.wildcardMatch(r6, r7)
            if (r6 == 0) goto L83
            goto L85
        L83:
            r6 = r2
            goto L86
        L85:
            r6 = r1
        L86:
            if (r0 == 0) goto L8b
            if (r6 == 0) goto L8b
            goto L8c
        L8b:
            r1 = r2
        L8c:
            return r1
        L8d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Wildcard can only be part of the rule."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.MatcherUtils.areComponentsMatching$window_release(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
