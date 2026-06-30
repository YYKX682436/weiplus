package k14;

/* loaded from: classes2.dex */
public abstract class k0 {
    public static final void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 appNameTextView, android.widget.TextView appTypeTextView, int i17, int i18, int i19, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appNameTextView, "appNameTextView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appTypeTextView, "appTypeTextView");
        if (z17) {
            appNameTextView.m84176x8e6ff544(Integer.MAX_VALUE);
            appTypeTextView.setMaxWidth(Integer.MAX_VALUE);
        }
        appNameTextView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        appTypeTextView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = appNameTextView.getMeasuredWidth();
        int measuredWidth2 = appTypeTextView.getMeasuredWidth();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthViewUtils", "updateAuthInfoViewMaxWidth appTypeWidth: " + measuredWidth2 + ", appNameTextViewWidth: " + measuredWidth);
        if (measuredWidth + measuredWidth2 <= i17) {
            appNameTextView.m84176x8e6ff544(Integer.MAX_VALUE);
            appTypeTextView.setMaxWidth(Integer.MAX_VALUE);
        } else if (measuredWidth2 < i19) {
            appNameTextView.m84176x8e6ff544(i17 - measuredWidth2);
            appTypeTextView.setMaxWidth(Integer.MAX_VALUE);
        } else if (measuredWidth <= i18) {
            appNameTextView.m84176x8e6ff544(Integer.MAX_VALUE);
            appTypeTextView.setMaxWidth(i17 - measuredWidth);
        } else {
            appNameTextView.m84176x8e6ff544(i18);
            appTypeTextView.setMaxWidth(i19);
        }
    }
}
