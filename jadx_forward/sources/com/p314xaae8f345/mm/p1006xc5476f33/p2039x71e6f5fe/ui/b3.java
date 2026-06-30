package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes3.dex */
public final class b3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f241042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 f241043e;

    public b3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65) {
        this.f241043e = activityC17308x95e1b65;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        if (view == null) {
            c21524xecd57b9a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(this.f241043e.mo55332x76847179(), 0, 0);
            c21524xecd57b9a.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        } else {
            c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) view;
        }
        android.graphics.Bitmap bitmap = this.f241042d;
        if (bitmap != null) {
            c21524xecd57b9a.setImageBitmap(bitmap);
            android.graphics.Bitmap bitmap2 = this.f241042d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap2);
            int width = bitmap2.getWidth();
            android.graphics.Bitmap bitmap3 = this.f241042d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap3);
            int height = bitmap3.getHeight();
            c21524xecd57b9a.f279184o = width;
            c21524xecd57b9a.f279185p = height;
            c21524xecd57b9a.i();
        }
        return c21524xecd57b9a;
    }
}
