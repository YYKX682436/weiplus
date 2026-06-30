package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805;

/* loaded from: classes12.dex */
public class i implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f237046d;

    /* renamed from: e, reason: collision with root package name */
    public et3.b f237047e;

    /* renamed from: f, reason: collision with root package name */
    public o72.r2 f237048f;

    /* renamed from: g, reason: collision with root package name */
    public r45.gp0 f237049g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f237050h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m f237051i;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar) {
        this.f237051i = mVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view != null) {
            this.f237046d = view.getContext();
            et3.b bVar = (et3.b) view.getTag();
            this.f237047e = bVar;
            this.f237048f = bVar.f338124b;
            this.f237049g = bVar.f338123a;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 2;
        z9Var.f90066f = this.f237047e.f338123a;
        c5432x35bb364f.e();
        java.lang.String str = c5432x35bb364f.f135777h.f87669c;
        this.f237050h = str;
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageViewWrapper", "file not exists");
            yj0.a.i(true, this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.m mVar = this.f237051i;
        if (mVar.f237072c == null) {
            mVar.f237072c = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(this.f237046d, 1, false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = mVar.f237072c;
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.d(this);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.g(this);
        k0Var.p(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.p1982x726a3805.h(this));
        mVar.f237072c.v();
        yj0.a.i(true, this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
