package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.StoreBannerEmojiView */
/* loaded from: classes3.dex */
public class C19697x5d42833e extends com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 {
    public C19697x5d42833e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i17, int i18) {
        android.content.Context context = getContext();
        int[] iArr = new int[2];
        if (context instanceof android.app.Activity) {
            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics.widthPixels;
            iArr[1] = displayMetrics.heightPixels;
        } else {
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            iArr[0] = defaultDisplay.getWidth();
            iArr[1] = defaultDisplay.getHeight();
        }
        int i19 = iArr[0];
        int i27 = ((i19 * 3) / 8) + 1;
        if (i19 <= 0 || i27 <= 0) {
            super.onMeasure(i17, i18);
        } else {
            setMeasuredDimension(i19, i27);
        }
    }

    public C19697x5d42833e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
