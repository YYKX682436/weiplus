package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class u3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f181222d = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s3(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13472xa1fc2044 f181223e;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13472xa1fc2044 c13472xa1fc2044, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.p3 p3Var) {
        this.f181223e = c13472xa1fc2044;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f181223e.f180834h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f181223e.f180834h.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t3 t3Var;
        com.p314xaae8f345.mm.p943x351df9c2.r0 n07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13472xa1fc2044 c13472xa1fc2044 = this.f181223e;
        java.lang.String str = (java.lang.String) c13472xa1fc2044.f180834h.get(i17);
        if (view == null) {
            view = android.view.LayoutInflater.from(c13472xa1fc2044.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_8, viewGroup, false);
            t3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t3(this);
            t3Var.f181210a = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a9m);
            view.setTag(t3Var);
        } else {
            t3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t3) view.getTag();
        }
        java.lang.Runnable runnable = this.f181222d;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
        if (Ni != null && ((n07 = Ni.n0(str)) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n07.d()))) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            ((c01.k7) c01.n8.a()).b(str, 21, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p0(java.lang.System.currentTimeMillis(), runnable));
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = t3Var.f181210a;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u.b(imageView, str, 0.5f, true);
        return view;
    }
}
