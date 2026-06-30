package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes13.dex */
public class s extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: m, reason: collision with root package name */
    public static final android.widget.FrameLayout.LayoutParams f290757m = new android.widget.FrameLayout.LayoutParams(-1, -1);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f290758d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k f290759e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f290760f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f290761g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f290762h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f290763i;

    public s(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.ui.p2722x33325c.sdk.k kVar) {
        super(context, android.R.style.Theme.Translucent.NoTitleBar);
        this.f290758d = str;
        this.f290759e = kVar;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.app.ProgressDialog progressDialog = new android.app.ProgressDialog(getContext());
        this.f290760f = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f290760f.setMessage(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c8o));
        requestWindowFeature(1);
        this.f290763i = new android.widget.FrameLayout(getContext());
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f290761g = imageView;
        imageView.setOnClickListener(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.p(this));
        this.f290761g.setImageDrawable(getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bhj));
        this.f290761g.setVisibility(4);
        int intrinsicWidth = this.f290761g.getDrawable().getIntrinsicWidth() / 2;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = new com.p314xaae8f345.p3210x3857dc.C27816xac2547f9(getContext(), null);
        this.f290762h = c27816xac2547f9;
        c27816xac2547f9.mo120520x57c53c73(false);
        this.f290762h.mo120519x347eaca1(false);
        this.f290762h.mo74800x23d27c02(new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.r(this, null));
        this.f290762h.mo120153xd15cf999().E(true);
        this.f290762h.mo32265x141096a9(this.f290758d);
        this.f290762h.setLayoutParams(f290757m);
        this.f290762h.setVisibility(4);
        linearLayout.setPadding(intrinsicWidth, intrinsicWidth, intrinsicWidth, intrinsicWidth);
        linearLayout.addView(this.f290762h);
        this.f290763i.addView(linearLayout);
        this.f290763i.addView(this.f290761g, new android.view.ViewGroup.LayoutParams(-2, -2));
        addContentView(this.f290763i, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        this.f290759e.mo48702x3d6f0539();
        dismiss();
        return true;
    }
}
