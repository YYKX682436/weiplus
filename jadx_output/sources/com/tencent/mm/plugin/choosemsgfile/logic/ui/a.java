package com.tencent.mm.plugin.choosemsgfile.logic.ui;

/* loaded from: classes12.dex */
public abstract class a extends androidx.recyclerview.widget.f2 implements com.tencent.mm.plugin.choosemsgfile.logic.ui.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.choosemsgfile.ui.f0 f95523d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f95524e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95525f = gm0.j1.u().l();

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.choosemsgfile.logic.ui.v f95526g;

    public a(com.tencent.mm.plugin.choosemsgfile.ui.f0 f0Var, java.util.List list) {
        this.f95523d = f0Var;
        this.f95524e = list;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f95524e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return x(i17).h();
    }

    @Override // com.tencent.mm.plugin.choosemsgfile.logic.ui.w
    public boolean o() {
        return false;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        x(i17).getClass();
        super.onBindViewHolder(k3Var, i17, list);
    }

    public wv1.a x(int i17) {
        java.util.List list = this.f95524e;
        if (list == null || list.size() <= i17) {
            return null;
        }
        return (wv1.a) list.get(i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        boolean z17 = this.f95525f;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseChooseFileAdapter", "[onBindViewHolder] isSDCardAvailable:%b", java.lang.Boolean.valueOf(z17));
        } else {
            x(i17).j(k3Var, i17, x(i17 + 1));
        }
    }
}
