package fp;

/* loaded from: classes5.dex */
public abstract class a {
    public static int a(android.app.Activity activity) {
        if (activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity;
            if (activityC0065xcd7aa112.mo2533x106ab264() != null) {
                return activityC0065xcd7aa112.mo2533x106ab264().l();
            }
        } else if (activity.getActionBar() != null) {
            return activity.getActionBar().getHeight();
        }
        return c(activity);
    }

    public static int b(android.app.Activity activity, int i17) {
        int height;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ActionBarCompatHelper", "[getActionBarHeight] activity is null!");
            return i17;
        }
        if (activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity;
            if (activityC0065xcd7aa112.mo2533x106ab264() != null) {
                height = activityC0065xcd7aa112.mo2533x106ab264().l();
            }
            height = 0;
        } else {
            if (activity.getActionBar() != null) {
                height = activity.getActionBar().getHeight();
            }
            height = 0;
        }
        if (height <= 0) {
            height = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarCompatHelper", "[getActionBarHeight] real:%s defaultVal:%s", java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(i17));
        return height;
    }

    public static int c(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(com.p314xaae8f345.mm.R.C30857x2dd9f1.f559595m, typedValue, true) || context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            return android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }
}
