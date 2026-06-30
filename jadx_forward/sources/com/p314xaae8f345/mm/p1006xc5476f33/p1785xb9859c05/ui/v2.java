package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes2.dex */
public class v2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f224574d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16140x55b9c685 f224575e;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16140x55b9c685 activityC16140x55b9c685) {
        this.f224575e = null;
        iz5.a.g(null, activityC16140x55b9c685 != null);
        this.f224575e = activityC16140x55b9c685;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f224574d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.List list = this.f224574d;
        if (list != null) {
            return list.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u2 u2Var;
        if (view == null) {
            view = ((android.view.LayoutInflater) this.f224575e.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570719bm2, viewGroup, false);
            u2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u2(this, null);
            u2Var.f224552a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ckd);
            u2Var.f224553b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cqh);
            u2Var.f224554c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dki);
            u2Var.f224555d = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) view.findViewById(com.p314xaae8f345.mm.R.id.gyk);
            u2Var.f224556e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.cro);
            view.setTag(u2Var);
        } else {
            u2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.u2) view.getTag();
        }
        r45.n57 n57Var = (r45.n57) getItem(i17);
        if (n57Var == null) {
            return view;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n57Var.f462632h)) {
            u2Var.f224552a.setVisibility(0);
            u2Var.f224553b.setVisibility(0);
            u2Var.f224554c.setVisibility(8);
            u2Var.f224552a.setText(n57Var.f462628d);
            u2Var.f224553b.setText(n57Var.f462629e);
        } else {
            u2Var.f224552a.setVisibility(8);
            u2Var.f224553b.setVisibility(8);
            u2Var.f224554c.setVisibility(0);
            u2Var.f224554c.setText(n57Var.f462632h);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(u2Var.f224556e, "", 0.5f);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n57Var.f462631g)) {
            u2Var.f224556e.setVisibility(0);
            u2Var.f224555d.setVisibility(4);
        } else {
            u2Var.f224555d.setVisibility(0);
            u2Var.f224555d.m75396xca029dad(n57Var.f462631g);
            u2Var.f224556e.setVisibility(4);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
