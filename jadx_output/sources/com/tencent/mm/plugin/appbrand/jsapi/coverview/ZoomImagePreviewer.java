package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes13.dex */
public class ZoomImagePreviewer extends com.tencent.mm.ui.tools.MMGestureGallery implements com.tencent.mm.plugin.appbrand.jsapi.coverview.i {
    public final java.util.HashSet A1;
    public int B1;
    public final com.tencent.mm.plugin.appbrand.jsapi.coverview.a1 C1;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.v5 f80662l1;

    /* renamed from: p1, reason: collision with root package name */
    public int f80663p1;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.coverview.z0 f80664x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f80665x1;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.ArrayList f80666y0;

    /* renamed from: y1, reason: collision with root package name */
    public float f80667y1;

    /* renamed from: z1, reason: collision with root package name */
    public final java.util.HashMap f80668z1;

    public ZoomImagePreviewer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f80666y0 = new java.util.ArrayList();
        this.f80663p1 = 0;
        this.f80665x1 = 0;
        this.f80667y1 = 1.0f;
        this.f80668z1 = new java.util.HashMap();
        this.A1 = new java.util.HashSet();
        this.B1 = 0;
        this.C1 = new com.tencent.mm.plugin.appbrand.jsapi.coverview.a1(this, null);
        this.f80664x0 = new com.tencent.mm.plugin.appbrand.jsapi.coverview.z0(this, null);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter((android.widget.SpinnerAdapter) this.f80664x0);
        setSelection(0);
    }

    public void e(java.lang.String str, java.lang.String str2) {
        java.util.HashSet hashSet = this.A1;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        com.tencent.mm.plugin.appbrand.jsapi.coverview.a1 a1Var = this.C1;
        a1Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, str2);
        com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer zoomImagePreviewer = a1Var.f80671i;
        hashMap.put("viewId", java.lang.Integer.valueOf(zoomImagePreviewer.B1));
        a1Var.t(hashMap);
        a1Var.p(zoomImagePreviewer.f80662l1.v3());
        a1Var.m();
    }

    public void f(java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "updateDataView");
        if (this.f80662l1 == null || arrayList == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "updateDataView url is empty or component is null");
            return;
        }
        java.util.ArrayList arrayList2 = this.f80666y0;
        if (arrayList2.isEmpty() && !arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
            this.f80664x0.notifyDataSetChanged();
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!arrayList2.contains(str)) {
                arrayList3.add(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "new url is added, url:%s", str);
            }
        }
        if (!arrayList3.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "add new Data");
            arrayList2.addAll(arrayList3);
            this.f80664x0.notifyDataSetChanged();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "update Data");
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) this.f80668z1.get(str2);
            if (softReference == null || softReference.get() == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "update Data url with view is recycle or not exist, url:%s", str2);
            } else {
                com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) softReference.get();
                com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "update Data width:%d, height:%d, scale:%f", java.lang.Integer.valueOf(this.f80663p1), java.lang.Integer.valueOf(this.f80665x1), java.lang.Float.valueOf(this.f80667y1));
                multiTouchImageView.postDelayed(new com.tencent.mm.plugin.appbrand.jsapi.coverview.w0(this, multiTouchImageView), 100L);
            }
        }
    }

    public void setComponent(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f80662l1 = v5Var;
    }

    public void setData(java.util.ArrayList<java.lang.String> arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "setData");
        if (this.f80662l1 == null || arrayList == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "url is empty or component is null");
            return;
        }
        java.util.ArrayList arrayList2 = this.f80666y0;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f80664x0.notifyDataSetChanged();
    }

    public void setScale(float f17) {
        this.f80667y1 = f17;
    }

    public void setViewId(int i17) {
        this.B1 = i17;
    }

    public ZoomImagePreviewer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f80666y0 = new java.util.ArrayList();
        this.f80663p1 = 0;
        this.f80665x1 = 0;
        this.f80667y1 = 1.0f;
        this.f80668z1 = new java.util.HashMap();
        this.A1 = new java.util.HashSet();
        this.B1 = 0;
        this.C1 = new com.tencent.mm.plugin.appbrand.jsapi.coverview.a1(this, null);
        this.f80664x0 = new com.tencent.mm.plugin.appbrand.jsapi.coverview.z0(this, null);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter((android.widget.SpinnerAdapter) this.f80664x0);
        setSelection(0);
    }
}
