package ab5;

/* loaded from: classes9.dex */
public class i0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f84484d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f84485e;

    /* renamed from: f, reason: collision with root package name */
    public db5.d5 f84486f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f84487g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f84488h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f84489i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f84490m;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f84492o;

    /* renamed from: q, reason: collision with root package name */
    public ab5.h0 f84494q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f84495r;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f84491n = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f84493p = true;

    public i0(android.content.Context context, android.view.View view, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f84484d = null;
        this.f84487g = null;
        this.f84488h = null;
        this.f84489i = null;
        this.f84490m = null;
        this.f84495r = null;
        this.f84485e = view;
        this.f84492o = c19666xfd6e2f33;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569969t9, null);
        this.f84484d = inflate;
        this.f84487g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h_x);
        this.f84488h = (android.widget.ImageView) this.f84484d.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        this.f84489i = (android.widget.ImageView) this.f84484d.findViewById(com.p314xaae8f345.mm.R.id.dhh);
        this.f84490m = (android.widget.ProgressBar) this.f84484d.findViewById(com.p314xaae8f345.mm.R.id.h_6);
        db5.d5 d5Var = new db5.d5(this.f84484d, -2, -2, true);
        this.f84486f = d5Var;
        d5Var.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.f84486f.setOutsideTouchable(true);
        this.f84486f.setFocusable(false);
        this.f84484d.setOnClickListener(new ab5.d0(this));
        this.f84495r = new ab5.e0(this, context.getMainLooper());
    }

    @Override // l01.u
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceImageBubble", "onLoadFailed");
        this.f84489i.setVisibility(0);
        this.f84490m.setVisibility(8);
        this.f84488h.setVisibility(8);
    }

    @Override // l01.u
    public void d() {
        this.f84490m.setVisibility(0);
        this.f84488h.setVisibility(8);
        this.f84489i.setVisibility(8);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return ik1.i0.a(this);
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandServiceImageBubble", "bitmap is null");
            return;
        }
        this.f84491n = bitmap;
        this.f84490m.setVisibility(8);
        if (bitmap.isRecycled()) {
            this.f84489i.setVisibility(0);
            this.f84488h.setVisibility(8);
        } else {
            this.f84488h.setVisibility(0);
            this.f84488h.setImageBitmap(bitmap);
            this.f84489i.setVisibility(8);
        }
    }
}
