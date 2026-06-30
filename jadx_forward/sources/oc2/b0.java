package oc2;

/* loaded from: classes2.dex */
public final class b0 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, int i17, int i18, float f17) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i18 > 0) {
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setColor(i17);
            gradientDrawable.setCornerRadius(f17);
            setPadding(i18, i18, i18, i18);
            setBackgroundDrawable(gradientDrawable);
        }
    }
}
