package z2;

/* loaded from: classes8.dex */
public abstract class j {
    public static android.app.ActivityOptions a(android.content.Context context, int i17, int i18) {
        return android.app.ActivityOptions.makeCustomAnimation(context, i17, i18);
    }

    public static android.app.ActivityOptions b(android.view.View view, int i17, int i18, int i19, int i27) {
        return android.app.ActivityOptions.makeScaleUpAnimation(view, i17, i18, i19, i27);
    }

    public static android.app.ActivityOptions c(android.view.View view, android.graphics.Bitmap bitmap, int i17, int i18) {
        return android.app.ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i17, i18);
    }
}
