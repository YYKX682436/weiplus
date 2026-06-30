package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes3.dex */
public class k4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f241113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 f241114e;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 activityC17318xa8131d22, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.c4 c4Var) {
        this.f241114e = activityC17318xa8131d22;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17318xa8131d22 activityC17318xa8131d22 = this.f241114e;
        if (activityC17318xa8131d22.f241011q == null) {
            activityC17318xa8131d22.f241011q = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(activityC17318xa8131d22, 0, 0);
            activityC17318xa8131d22.f241011q.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            activityC17318xa8131d22.f241011q.i();
        }
        android.graphics.Bitmap bitmap = this.f241113d;
        if (bitmap != null) {
            activityC17318xa8131d22.f241011q.setImageBitmap(bitmap);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = activityC17318xa8131d22.f241011q;
            int width = this.f241113d.getWidth();
            int height = this.f241113d.getHeight();
            c21524xecd57b9a.f279184o = width;
            c21524xecd57b9a.f279185p = height;
        }
        return activityC17318xa8131d22.f241011q;
    }
}
