package zx2;

/* loaded from: classes13.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f558564a = {android.R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f558565b = {android.R.attr.state_selected, android.R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f558566c = {android.R.attr.state_selected};

    public static int a(android.content.res.ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return e3.b.i(colorForState, java.lang.Math.min(android.graphics.Color.alpha(colorForState) * 2, 255));
    }
}
