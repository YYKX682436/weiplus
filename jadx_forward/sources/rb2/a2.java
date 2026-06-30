package rb2;

/* loaded from: classes2.dex */
public final class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rb2.z2 f475102g;

    public a2(in5.s0 s0Var, java.lang.String str, so2.y0 y0Var, rb2.z2 z2Var) {
        this.f475099d = s0Var;
        this.f475100e = str;
        this.f475101f = y0Var;
        this.f475102g = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        in5.s0 s0Var = this.f475099d;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String str = this.f475100e;
        so2.y0 y0Var = this.f475101f;
        rb2.z2 z2Var = this.f475102g;
        i0Var.ql(context, str, y0Var, z2Var.f475219e.a0(), z2Var.f475219e.k0());
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context2 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17).Gk(context2, this.f475101f.f492236d.f68959xf9a02e3e, (r18 & 4) != 0 ? false : true, (r18 & 8) != 0 ? false : false, 2, (r18 & 32) != 0 ? false : false);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
