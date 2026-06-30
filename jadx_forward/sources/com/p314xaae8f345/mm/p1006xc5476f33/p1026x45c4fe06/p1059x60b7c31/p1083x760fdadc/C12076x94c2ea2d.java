package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.coverview.ZoomImagePreviewer */
/* loaded from: classes13.dex */
public class C12076x94c2ea2d extends com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.i {
    public final java.util.HashSet A1;
    public int B1;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.a1 C1;

    /* renamed from: l1, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f162195l1;

    /* renamed from: p1, reason: collision with root package name */
    public int f162196p1;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.z0 f162197x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f162198x1;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.ArrayList f162199y0;

    /* renamed from: y1, reason: collision with root package name */
    public float f162200y1;

    /* renamed from: z1, reason: collision with root package name */
    public final java.util.HashMap f162201z1;

    public C12076x94c2ea2d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f162199y0 = new java.util.ArrayList();
        this.f162196p1 = 0;
        this.f162198x1 = 0;
        this.f162200y1 = 1.0f;
        this.f162201z1 = new java.util.HashMap();
        this.A1 = new java.util.HashSet();
        this.B1 = 0;
        this.C1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.a1(this, null);
        this.f162197x0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.z0(this, null);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter((android.widget.SpinnerAdapter) this.f162197x0);
        setSelection(0);
    }

    public void e(java.lang.String str, java.lang.String str2) {
        java.util.HashSet hashSet = this.A1;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.a1 a1Var = this.C1;
        a1Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("url", str);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d c12076x94c2ea2d = a1Var.f162204i;
        hashMap.put("viewId", java.lang.Integer.valueOf(c12076x94c2ea2d.B1));
        a1Var.t(hashMap);
        a1Var.p(c12076x94c2ea2d.f162195l1.v3());
        a1Var.m();
    }

    public void f(java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "updateDataView");
        if (this.f162195l1 == null || arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "updateDataView url is empty or component is null");
            return;
        }
        java.util.ArrayList arrayList2 = this.f162199y0;
        if (arrayList2.isEmpty() && !arrayList.isEmpty()) {
            arrayList2.addAll(arrayList);
            this.f162197x0.notifyDataSetChanged();
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "new url is added, url:%s", str);
            }
        }
        if (!arrayList3.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "add new Data");
            arrayList2.addAll(arrayList3);
            this.f162197x0.notifyDataSetChanged();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "update Data");
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) this.f162201z1.get(str2);
            if (softReference == null || softReference.get() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "update Data url with view is recycle or not exist, url:%s", str2);
            } else {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a) softReference.get();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "update Data width:%d, height:%d, scale:%f", java.lang.Integer.valueOf(this.f162196p1), java.lang.Integer.valueOf(this.f162198x1), java.lang.Float.valueOf(this.f162200y1));
                c21524xecd57b9a.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.w0(this, c21524xecd57b9a), 100L);
            }
        }
    }

    /* renamed from: setComponent */
    public void m50869x8504ebb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f162195l1 = v5Var;
    }

    /* renamed from: setData */
    public void m50870x76491f2c(java.util.ArrayList<java.lang.String> arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "setData");
        if (this.f162195l1 == null || arrayList == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "url is empty or component is null");
            return;
        }
        java.util.ArrayList arrayList2 = this.f162199y0;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        this.f162197x0.notifyDataSetChanged();
    }

    /* renamed from: setScale */
    public void m50871x53aeca08(float f17) {
        this.f162200y1 = f17;
    }

    /* renamed from: setViewId */
    public void m50872x279f85a2(int i17) {
        this.B1 = i17;
    }

    public C12076x94c2ea2d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f162199y0 = new java.util.ArrayList();
        this.f162196p1 = 0;
        this.f162198x1 = 0;
        this.f162200y1 = 1.0f;
        this.f162201z1 = new java.util.HashMap();
        this.A1 = new java.util.HashSet();
        this.B1 = 0;
        this.C1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.a1(this, null);
        this.f162197x0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.z0(this, null);
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter((android.widget.SpinnerAdapter) this.f162197x0);
        setSelection(0);
    }
}
