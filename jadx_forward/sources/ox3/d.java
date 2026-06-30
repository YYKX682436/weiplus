package ox3;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.e f431266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox3.a f431267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ox3.c f431268f;

    public d(ox3.e eVar, ox3.a aVar, ox3.c cVar) {
        this.f431266d = eVar;
        this.f431267e = aVar;
        this.f431268f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/data/ExclusiveConverter$initUserLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ox3.b bVar = this.f431266d.f431271e;
        if (bVar != null) {
            ox3.a ringback = this.f431267e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ringback, "ringback");
            ox3.c holder = this.f431268f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = holder.f374655f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(f2Var, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.ringtone.data.ExclusiveConvertData>");
            ox3.a aVar = (ox3.a) ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) f2Var).m82898xfb7e5820().get(holder.m8186xceeefb69());
            com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v0 v0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.o0) bVar).f239985a;
            v0Var.getClass();
            java.lang.String str = aVar.f431254d.f497121d;
            if (str != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) v0Var.m80379x76847179(), 1, true);
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.t0(v0Var);
                k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.u0(str, v0Var, aVar);
                k0Var.t(false);
                k0Var.e(false);
                k0Var.v();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/data/ExclusiveConverter$initUserLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
