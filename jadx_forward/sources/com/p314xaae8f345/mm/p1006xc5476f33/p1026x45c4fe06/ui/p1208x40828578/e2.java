package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class e2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f171603d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f171604e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.LayoutInflater f171605f;

    public e2(java.util.ArrayList arrayList) {
        this.f171604e = arrayList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        java.util.ArrayList arrayList = this.f171604e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        java.lang.Object x17 = x(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2) this.f171603d.get(mo863xcdaf1228(i17));
        if (x17 == null || f2Var == null) {
            return 0L;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.v0) f2Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4 c11712x63ef1ef4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) x17;
        return (c11712x63ef1ef4.f157888w + c11712x63ef1ef4.A).hashCode();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        java.lang.Object x17 = x(i17);
        if (x17 == null) {
            return 0;
        }
        return x17.getClass().hashCode();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2) this.f171603d.get(mo863xcdaf1228(i17));
        if (f2Var != null) {
            f2Var.a(k3Var, x(i17));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2) this.f171603d.get(i17);
        if (f2Var == null) {
            return null;
        }
        android.content.Context context = viewGroup.getContext();
        if (this.f171605f == null) {
            this.f171605f = android.view.LayoutInflater.from(context);
        }
        android.view.LayoutInflater layoutInflater = this.f171605f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.v0) f2Var;
        v0Var.getClass();
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1(v0Var.f171696b, layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569582fg, viewGroup, false));
    }

    public java.lang.Object x(int i17) {
        if (i17 < 0 || i17 >= mo1894x7e414b06()) {
            return null;
        }
        return this.f171604e.get(i17);
    }

    public boolean y() {
        java.util.ArrayList arrayList = this.f171604e;
        return arrayList == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2 f2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.f2) this.f171603d.get(mo863xcdaf1228(i17));
        if (f2Var == null) {
            super.mo8157xe5e2e48d(k3Var, i17, list);
            return;
        }
        if (list.size() > 0) {
            java.lang.Object x17 = x(i17);
            boolean z17 = false;
            java.lang.Object obj = list.get(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.v0) f2Var;
            v0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c1) k3Var;
            if (obj != null && (obj instanceof android.os.Bundle)) {
                android.os.Bundle bundle = (android.os.Bundle) obj;
                if (bundle.size() > 0) {
                    if (bundle.containsKey("nick_name")) {
                        c1Var.f171579e.setText(bundle.getString("nick_name"));
                    }
                    int i18 = bundle.getInt("used_in_third_party_app", -1);
                    if (bundle.get("running_flag") != null || bundle.get("third_party_app_using_desc") != null || i18 != -1) {
                        v0Var.d(c1Var, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11712x63ef1ef4) x17).A, bundle.getLong("running_flag", 0L), i18 == 0 ? "" : bundle.getString("third_party_app_using_desc"));
                    }
                    if (bundle.get("icon") != null) {
                        v0Var.b(c1Var, bundle.getString("icon"));
                    }
                    if (!v0Var.f171696b.I.f171562u) {
                        bundle.containsKey("star");
                    }
                    v0Var.c(c1Var);
                    z17 = true;
                }
            }
            if (z17) {
                return;
            }
        }
        f2Var.a(k3Var, x(i17));
    }
}
