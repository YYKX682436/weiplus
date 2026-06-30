package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class e2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f90070d = new android.util.SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f90071e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.LayoutInflater f90072f;

    public e2(java.util.ArrayList arrayList) {
        this.f90071e = arrayList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.ArrayList arrayList = this.f90071e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        java.lang.Object x17 = x(i17);
        com.tencent.mm.plugin.appbrand.ui.recents.f2 f2Var = (com.tencent.mm.plugin.appbrand.ui.recents.f2) this.f90070d.get(getItemViewType(i17));
        if (x17 == null || f2Var == null) {
            return 0L;
        }
        ((com.tencent.mm.plugin.appbrand.ui.recents.v0) f2Var).getClass();
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo = (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) x17;
        return (appBrandRecentTaskInfo.f76355w + appBrandRecentTaskInfo.A).hashCode();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.lang.Object x17 = x(i17);
        if (x17 == null) {
            return 0;
        }
        return x17.getClass().hashCode();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.appbrand.ui.recents.f2 f2Var = (com.tencent.mm.plugin.appbrand.ui.recents.f2) this.f90070d.get(getItemViewType(i17));
        if (f2Var != null) {
            f2Var.a(k3Var, x(i17));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.appbrand.ui.recents.f2 f2Var = (com.tencent.mm.plugin.appbrand.ui.recents.f2) this.f90070d.get(i17);
        if (f2Var == null) {
            return null;
        }
        android.content.Context context = viewGroup.getContext();
        if (this.f90072f == null) {
            this.f90072f = android.view.LayoutInflater.from(context);
        }
        android.view.LayoutInflater layoutInflater = this.f90072f;
        com.tencent.mm.plugin.appbrand.ui.recents.v0 v0Var = (com.tencent.mm.plugin.appbrand.ui.recents.v0) f2Var;
        v0Var.getClass();
        return new com.tencent.mm.plugin.appbrand.ui.recents.c1(v0Var.f90163b, layoutInflater.inflate(com.tencent.mm.R.layout.f488049fg, viewGroup, false));
    }

    public java.lang.Object x(int i17) {
        if (i17 < 0 || i17 >= getItemCount()) {
            return null;
        }
        return this.f90071e.get(i17);
    }

    public boolean y() {
        java.util.ArrayList arrayList = this.f90071e;
        return arrayList == null || com.tencent.mm.sdk.platformtools.t8.L0(arrayList);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        com.tencent.mm.plugin.appbrand.ui.recents.f2 f2Var = (com.tencent.mm.plugin.appbrand.ui.recents.f2) this.f90070d.get(getItemViewType(i17));
        if (f2Var == null) {
            super.onBindViewHolder(k3Var, i17, list);
            return;
        }
        if (list.size() > 0) {
            java.lang.Object x17 = x(i17);
            boolean z17 = false;
            java.lang.Object obj = list.get(0);
            com.tencent.mm.plugin.appbrand.ui.recents.v0 v0Var = (com.tencent.mm.plugin.appbrand.ui.recents.v0) f2Var;
            v0Var.getClass();
            com.tencent.mm.plugin.appbrand.ui.recents.c1 c1Var = (com.tencent.mm.plugin.appbrand.ui.recents.c1) k3Var;
            if (obj != null && (obj instanceof android.os.Bundle)) {
                android.os.Bundle bundle = (android.os.Bundle) obj;
                if (bundle.size() > 0) {
                    if (bundle.containsKey("nick_name")) {
                        c1Var.f90046e.setText(bundle.getString("nick_name"));
                    }
                    int i18 = bundle.getInt("used_in_third_party_app", -1);
                    if (bundle.get("running_flag") != null || bundle.get("third_party_app_using_desc") != null || i18 != -1) {
                        v0Var.d(c1Var, ((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) x17).A, bundle.getLong("running_flag", 0L), i18 == 0 ? "" : bundle.getString("third_party_app_using_desc"));
                    }
                    if (bundle.get("icon") != null) {
                        v0Var.b(c1Var, bundle.getString("icon"));
                    }
                    if (!v0Var.f90163b.I.f90029u) {
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
