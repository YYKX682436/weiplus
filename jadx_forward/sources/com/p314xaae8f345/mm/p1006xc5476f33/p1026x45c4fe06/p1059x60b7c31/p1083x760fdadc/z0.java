package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc;

/* loaded from: classes13.dex */
public class z0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d f162262d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d c12076x94c2ea2d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.w0 w0Var) {
        this.f162262d = c12076x94c2ea2d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f162262d.f162199y0.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f162262d.f162199y0.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d c12076x94c2ea2d = this.f162262d;
        if (view == null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(c12076x94c2ea2d.getContext(), 0, 0);
            c21524xecd57b9a2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.y0(this);
            y0Var.f162259a = c21524xecd57b9a2;
            c21524xecd57b9a2.setTag(y0Var);
            c21524xecd57b9a = c21524xecd57b9a2;
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.y0) view.getTag()).f162259a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "getView from holder");
            c21524xecd57b9a = c21524xecd57b9a3;
        }
        c21524xecd57b9a.m79203xc020a6f8(0.5f);
        c21524xecd57b9a.m79201x4cf4f0ef(true);
        c21524xecd57b9a.m79205xd6a7ac02(c12076x94c2ea2d.f162200y1);
        c21524xecd57b9a.m79195x464b3146(false);
        java.lang.String str = (java.lang.String) getItem(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.appbrand.ZoomImagePreviewer", "getView url:%s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12076x94c2ea2d c12076x94c2ea2d2 = this.f162262d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = c12076x94c2ea2d2.f162195l1;
        float f17 = c12076x94c2ea2d2.f162200y1;
        if (str == null) {
            if (c12076x94c2ea2d2 != null) {
                c12076x94c2ea2d2.e(str, "invalid imageView or url");
            }
        } else if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.String T0 = ((o91.e) v5Var.q(o91.e.class)).T0(v5Var, str);
            ((qd.b) ((o91.d) v5Var.q(o91.d.class))).c(T0, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.h(c12076x94c2ea2d2, str, T0, c21524xecd57b9a, f17));
        }
        c21524xecd57b9a.setTag(c21524xecd57b9a);
        c12076x94c2ea2d.f162201z1.put(str, new java.lang.ref.SoftReference(c21524xecd57b9a));
        return c21524xecd57b9a;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.f162262d.f162195l1.T0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.x0(this));
        super.notifyDataSetChanged();
    }
}
