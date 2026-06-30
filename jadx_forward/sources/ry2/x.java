package ry2;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.y f483033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f483035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f483036g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f483037h;

    public x(ry2.y yVar, java.lang.String str, boolean z17, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        this.f483033d = yVar;
        this.f483034e = str;
        this.f483035f = z17;
        this.f483036g = bitmap;
        this.f483037h = bitmap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry2.y yVar = this.f483033d;
        yVar.f483046x.add(this.f483034e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.PostMixMediaWidget", "add thumb file");
        if (this.f483035f) {
            mv2.f0 f0Var = mv2.f0.f413094a;
            android.graphics.Bitmap bitmap = this.f483036g;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(android.widget.ImageView.ScaleType.FIT_XY.ordinal());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(f0Var.l());
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf((int) (f0Var.l() * ((bitmap.getHeight() * 1.0f) / bitmap.getWidth())));
            yVar.p().getLayoutParams().width = valueOf2.intValue();
            yVar.p().getLayoutParams().height = valueOf3.intValue();
            yVar.p().setScaleType(android.widget.ImageView.ScaleType.values()[valueOf.intValue()]);
            yVar.p().requestLayout();
            yVar.p().post(new ry2.v(yVar, this.f483037h));
            yVar.p().setOnClickListener(new ry2.w(yVar));
        }
    }
}
