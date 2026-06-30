package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes13.dex */
public class z0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer f80729d;

    public z0(com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer zoomImagePreviewer, com.tencent.mm.plugin.appbrand.jsapi.coverview.w0 w0Var) {
        this.f80729d = zoomImagePreviewer;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f80729d.f80666y0.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f80729d.f80666y0.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView;
        com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer zoomImagePreviewer = this.f80729d;
        if (view == null) {
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = new com.tencent.mm.ui.base.MultiTouchImageView(zoomImagePreviewer.getContext(), 0, 0);
            multiTouchImageView2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            com.tencent.mm.plugin.appbrand.jsapi.coverview.y0 y0Var = new com.tencent.mm.plugin.appbrand.jsapi.coverview.y0(this);
            y0Var.f80726a = multiTouchImageView2;
            multiTouchImageView2.setTag(y0Var);
            multiTouchImageView = multiTouchImageView2;
        } else {
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView3 = ((com.tencent.mm.plugin.appbrand.jsapi.coverview.y0) view.getTag()).f80726a;
            com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "getView from holder");
            multiTouchImageView = multiTouchImageView3;
        }
        multiTouchImageView.setMinZoomLimit(0.5f);
        multiTouchImageView.setMaxZoomDoubleTab(true);
        multiTouchImageView.setOriginScale(zoomImagePreviewer.f80667y1);
        multiTouchImageView.setEnableHorLongBmpMode(false);
        java.lang.String str = (java.lang.String) getItem(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "getView url:%s", str);
        com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer zoomImagePreviewer2 = this.f80729d;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = zoomImagePreviewer2.f80662l1;
        float f17 = zoomImagePreviewer2.f80667y1;
        if (str == null) {
            if (zoomImagePreviewer2 != null) {
                zoomImagePreviewer2.e(str, "invalid imageView or url");
            }
        } else if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.String T0 = ((o91.e) v5Var.q(o91.e.class)).T0(v5Var, str);
            ((qd.b) ((o91.d) v5Var.q(o91.d.class))).c(T0, null, new com.tencent.mm.plugin.appbrand.jsapi.coverview.h(zoomImagePreviewer2, str, T0, multiTouchImageView, f17));
        }
        multiTouchImageView.setTag(multiTouchImageView);
        zoomImagePreviewer.f80668z1.put(str, new java.lang.ref.SoftReference(multiTouchImageView));
        return multiTouchImageView;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.f80729d.f80662l1.T0(new com.tencent.mm.plugin.appbrand.jsapi.coverview.x0(this));
        super.notifyDataSetChanged();
    }
}
