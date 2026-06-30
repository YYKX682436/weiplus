package zl1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555124f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555125g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zl1.t f555126h;

    public g(zl1.t tVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f555126h = tVar;
        this.f555122d = str;
        this.f555123e = str2;
        this.f555124f = str3;
        this.f555125g = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str = this.f555122d;
        java.lang.String str2 = this.f555123e;
        int i18 = zl1.t.f555147q;
        zl1.t tVar = this.f555126h;
        tVar.getClass();
        int parseColor = android.graphics.Color.parseColor("#E6000000");
        try {
            parseColor = ik1.w.l(str);
        } catch (java.lang.Exception unused) {
        }
        tVar.f555151g = parseColor;
        int parseColor2 = android.graphics.Color.parseColor("#07C160");
        try {
            parseColor2 = ik1.w.l(str2);
        } catch (java.lang.Exception unused2) {
        }
        tVar.f555152h = parseColor2;
        java.lang.String str3 = this.f555124f;
        float c17 = zl1.t.c(tVar.getContext(), 1) / 2.0f;
        int i19 = c17 > 1.0f ? (int) c17 : 1;
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        try {
            i17 = ik1.w.l(str3);
        } catch (java.lang.Exception unused3) {
            i17 = -1;
        }
        gradientDrawable.setColor(i17);
        android.graphics.drawable.GradientDrawable gradientDrawable2 = new android.graphics.drawable.GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(0);
        if ("white".equals(this.f555125g)) {
            gradientDrawable2.setStroke(i19, 872415231);
        } else {
            gradientDrawable2.setStroke(i19, 855638016);
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{gradientDrawable, gradientDrawable2});
        if ("top".equals(tVar.f555150f)) {
            int i27 = -i19;
            layerDrawable.setLayerInset(1, i27, i27, i27, i27);
        } else {
            int i28 = -i19;
            layerDrawable.setLayerInset(1, i28, 0, i28, i28);
        }
        tVar.setBackground(layerDrawable);
        tVar.e(new zl1.b(tVar));
    }
}
