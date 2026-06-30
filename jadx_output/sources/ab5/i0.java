package ab5;

/* loaded from: classes9.dex */
public class i0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f2951d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f2952e;

    /* renamed from: f, reason: collision with root package name */
    public db5.d5 f2953f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f2954g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f2955h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f2956i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f2957m;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.chat.ChatFooter f2959o;

    /* renamed from: q, reason: collision with root package name */
    public ab5.h0 f2961q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f2962r;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Bitmap f2958n = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2960p = true;

    public i0(android.content.Context context, android.view.View view, com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f2951d = null;
        this.f2954g = null;
        this.f2955h = null;
        this.f2956i = null;
        this.f2957m = null;
        this.f2962r = null;
        this.f2952e = view;
        this.f2959o = chatFooter;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488436t9, null);
        this.f2951d = inflate;
        this.f2954g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.h_x);
        this.f2955h = (android.widget.ImageView) this.f2951d.findViewById(com.tencent.mm.R.id.h9o);
        this.f2956i = (android.widget.ImageView) this.f2951d.findViewById(com.tencent.mm.R.id.dhh);
        this.f2957m = (android.widget.ProgressBar) this.f2951d.findViewById(com.tencent.mm.R.id.h_6);
        db5.d5 d5Var = new db5.d5(this.f2951d, -2, -2, true);
        this.f2953f = d5Var;
        d5Var.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.f2953f.setOutsideTouchable(true);
        this.f2953f.setFocusable(false);
        this.f2951d.setOnClickListener(new ab5.d0(this));
        this.f2962r = new ab5.e0(this, context.getMainLooper());
    }

    @Override // l01.u
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceImageBubble", "onLoadFailed");
        this.f2956i.setVisibility(0);
        this.f2957m.setVisibility(8);
        this.f2955h.setVisibility(8);
    }

    @Override // l01.u
    public void d() {
        this.f2957m.setVisibility(0);
        this.f2955h.setVisibility(8);
        this.f2956i.setVisibility(8);
    }

    @Override // l01.i0
    public java.lang.String key() {
        return ik1.i0.a(this);
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandServiceImageBubble", "bitmap is null");
            return;
        }
        this.f2958n = bitmap;
        this.f2957m.setVisibility(8);
        if (bitmap.isRecycled()) {
            this.f2956i.setVisibility(0);
            this.f2955h.setVisibility(8);
        } else {
            this.f2955h.setVisibility(0);
            this.f2955h.setImageBitmap(bitmap);
            this.f2956i.setVisibility(8);
        }
    }
}
