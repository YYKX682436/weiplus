package ec3;

/* loaded from: classes.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f332565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f332566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f332567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f332568g;

    public h1(boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f332565d = z17;
        this.f332566e = h0Var;
        this.f332567f = imageView;
        this.f332568g = imageView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f332566e;
        boolean z17 = this.f332565d;
        if (z17) {
            android.widget.ImageView imageView = (android.widget.ImageView) h0Var.f391656d;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyRecommendConvert", "[Load thumbView] Result : " + z17);
            android.widget.ImageView imageView2 = (android.widget.ImageView) h0Var.f391656d;
            if (imageView2 != null) {
                imageView2.setImageBitmap(null);
            }
            android.widget.ImageView imageView3 = this.f332567f;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
        }
        android.widget.ImageView imageView4 = this.f332568g;
        if (imageView4 != null && imageView4.getVisibility() == 4) {
            imageView4.setVisibility(0);
        }
    }
}
