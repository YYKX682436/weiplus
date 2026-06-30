package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes12.dex */
public class a3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f241036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 f241037e;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6 textureViewSurfaceTextureListenerC17306x32f4bae6, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.TextureViewSurfaceTextureListenerC17306x32f4bae6.AnonymousClass1 anonymousClass1) {
        this.f241037e = textureViewSurfaceTextureListenerC17306x32f4bae6;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a;
        if (view == null) {
            c21524xecd57b9a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(this.f241037e, 0, 0);
            c21524xecd57b9a.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        } else {
            c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view;
        }
        android.graphics.Bitmap bitmap = this.f241036d;
        if (bitmap != null) {
            c21524xecd57b9a.setImageBitmap(bitmap);
            int width = this.f241036d.getWidth();
            int height = this.f241036d.getHeight();
            c21524xecd57b9a.f279184o = width;
            c21524xecd57b9a.f279185p = height;
            c21524xecd57b9a.i();
        }
        return c21524xecd57b9a;
    }
}
