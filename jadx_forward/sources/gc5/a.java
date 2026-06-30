package gc5;

/* loaded from: classes8.dex */
public class a extends dp1.a {
    @Override // dp1.u, dp1.x
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo50328x12501425() {
        return super.mo50328x12501425();
    }

    @Override // dp1.u, dp1.x
    /* renamed from: getContentView */
    public android.view.View mo50329xc2a54588() {
        android.view.View mo50329xc2a54588 = super.mo50329xc2a54588();
        if (mo50329xc2a54588 != null) {
            return mo50329xc2a54588;
        }
        android.view.ViewGroup a17 = a();
        int i17 = 1;
        android.view.View view = null;
        int i18 = 1;
        for (int i19 = 0; i19 < a17.getChildCount(); i19++) {
            android.view.View childAt = a17.getChildAt(i19);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i17 * i18) {
                i17 = childAt.getWidth();
                i18 = childAt.getHeight();
                view = childAt;
            }
        }
        return view;
    }

    @Override // dp1.u, dp1.x
    /* renamed from: getMaskView */
    public android.view.View mo50330x8c409d27() {
        android.view.ViewGroup a17 = a();
        int i17 = 1;
        android.view.View view = null;
        int i18 = 1;
        for (int i19 = 0; i19 < a17.getChildCount(); i19++) {
            android.view.View childAt = a17.getChildAt(i19);
            if (childAt != null && childAt.getHeight() * childAt.getWidth() > i17 * i18) {
                i17 = childAt.getWidth();
                i18 = childAt.getHeight();
                view = childAt;
            }
        }
        return view;
    }

    @Override // dp1.u, dp1.x
    public boolean p() {
        return true;
    }
}
