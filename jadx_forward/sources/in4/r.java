package in4;

/* loaded from: classes3.dex */
public abstract class r {
    public static int[] a(android.content.Context context, android.view.View view, android.view.View view2, boolean z17) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int i17 = com.p314xaae8f345.mm.ui.bk.h(context).x;
        view2.measure(0, 0);
        int measuredHeight = view2.getMeasuredHeight();
        int measuredWidth = view2.getMeasuredWidth();
        if (z17) {
            iArr[0] = i17 - measuredWidth;
            iArr[1] = iArr2[1] - measuredHeight;
        } else {
            iArr[0] = i17 - measuredWidth;
            iArr[1] = iArr2[1] + height;
        }
        return iArr;
    }
}
