package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class qf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.h1 f104377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104379g;

    public qf(in5.s0 s0Var, so2.h1 h1Var, java.lang.String str, java.lang.String str2) {
        this.f104376d = s0Var;
        this.f104377e = h1Var;
        this.f104378f = str;
        this.f104379g = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f104376d.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.pt) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.pt.class)).S6();
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f327966m3;
        jz5.l[] lVarArr = new jz5.l[2];
        so2.h1 h1Var = this.f104377e;
        r45.nw1 liveInfo = h1Var.getFeedObject().getLiveInfo();
        lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
        ml2.a3[] a3VarArr = ml2.a3.f327203d;
        lVarArr[1] = new jz5.l("button_status", java.lang.String.valueOf(0));
        zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), this.f104378f, this.f104379g, h1Var.g0(), null, false, 96, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullLiveConvert$onBindViewHolder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
