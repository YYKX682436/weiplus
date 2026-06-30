package z2;

/* loaded from: classes12.dex */
public abstract class k {
    public static android.app.ActivityOptions a(android.app.Activity activity, android.view.View view, java.lang.String str) {
        return android.app.ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
    }

    @java.lang.SafeVarargs
    public static android.app.ActivityOptions b(android.app.Activity activity, android.util.Pair<android.view.View, java.lang.String>... pairArr) {
        return android.app.ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
    }

    public static android.app.ActivityOptions c() {
        return android.app.ActivityOptions.makeTaskLaunchBehind();
    }
}
