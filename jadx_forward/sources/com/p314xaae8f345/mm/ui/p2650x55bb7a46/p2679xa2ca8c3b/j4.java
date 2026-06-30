package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285758d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f285759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f285760f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f285761g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285762h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f285763i;

    public j4(java.lang.String str, android.view.View view, android.widget.ImageView imageView, android.widget.ImageView imageView2, java.lang.String str2, boolean z17) {
        this.f285758d = str;
        this.f285759e = view;
        this.f285760f = imageView;
        this.f285761g = imageView2;
        this.f285762h = str2;
        this.f285763i = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgC2CHoneyPay", "get background url: %s", this.f285758d);
        android.view.View view = this.f285759e;
        int height = view.getHeight();
        int width = view.getWidth();
        android.widget.ImageView imageView = this.f285760f;
        if (height > 0 && width > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = width;
            layoutParams.height = height;
            imageView.setLayoutParams(layoutParams);
            android.widget.ImageView imageView2 = this.f285761g;
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            layoutParams2.width = width;
            layoutParams2.height = height;
            imageView2.setLayoutParams(layoutParams2);
        }
        j70.e eVar = (j70.e) ((k70.v) i95.n0.c(k70.v.class));
        java.lang.String str = this.f285762h;
        android.graphics.Bitmap Bi = eVar.Bi(str);
        if (Bi != null) {
            imageView.setImageBitmap(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p4.f(Bi, height, width, !this.f285763i));
            return;
        }
        imageView.setTag(com.p314xaae8f345.mm.R.id.nvv, str);
        ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i4(this, height, width));
    }
}
