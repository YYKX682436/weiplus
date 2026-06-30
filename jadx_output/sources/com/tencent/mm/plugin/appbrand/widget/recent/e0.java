package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class e0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView f91971d;

    public e0(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandRecentTaskView appBrandRecentTaskView) {
        this.f91971d = appBrandRecentTaskView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f91971d.f91877g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r22, int r23) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.recent.e0.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.plugin.appbrand.widget.recent.g0(com.tencent.mm.ui.id.b(this.f91971d.getContext()).inflate(com.tencent.mm.R.layout.f488101dz1, viewGroup, false));
    }
}
