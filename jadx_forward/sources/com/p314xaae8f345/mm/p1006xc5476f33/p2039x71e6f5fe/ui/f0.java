package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public final class f0 extends android.widget.BaseAdapter implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f241074d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f241075e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f241076f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final android.view.LayoutInflater f241077g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.g0 f241078h;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.g0 g0Var) {
        this.f241078h = g0Var;
        this.f241077g = null;
        this.f241077g = android.view.LayoutInflater.from(g0Var.M);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
        this.f241074d = g0Var.M.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560754t9);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView;
        if (bitmap == null || bitmap.isRecycled() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.Map map = this.f241076f;
        if (((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(str)) == null || (imageView = (android.widget.ImageView) ((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(str)).get()) == null || !str.equals((java.lang.String) imageView.getTag())) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.d0(this, imageView, bitmap));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f241075e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f241075e.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.e0 e0Var;
        if (view == null) {
            view = this.f241077g.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ca_, viewGroup, false);
            e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.e0(this);
            e0Var.f241068a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.gtm);
            e0Var.f241069b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gtl);
            view.setTag(e0Var);
        } else {
            e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.e0) view.getTag();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a) this.f241075e.get(i17);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b0 b0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b0(aVar.f240336w);
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(b0Var);
        if (d17 == null || d17.isRecycled()) {
            e0Var.f241068a.setBackgroundColor(this.f241074d);
            e0Var.f241068a.setImageBitmap(null);
        } else {
            e0Var.f241068a.setImageBitmap(d17);
            e0Var.f241068a.setBackgroundColor(0);
        }
        e0Var.f241068a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.c0(this, aVar.f240328o, aVar));
        e0Var.f241068a.setTag(aVar.f240336w);
        ((java.util.HashMap) this.f241076f).put(aVar.f240336w, new java.lang.ref.WeakReference(e0Var.f241068a));
        e0Var.f241069b.setText(aVar.f240315b);
        return view;
    }
}
