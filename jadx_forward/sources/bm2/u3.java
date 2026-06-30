package bm2;

/* loaded from: classes3.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f103875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f103876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f103877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ce2.i f103878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f103879h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bm2.n3 f103880i;

    public u3(bm2.a4 a4Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, ce2.i iVar, boolean z18, bm2.n3 n3Var) {
        this.f103875d = a4Var;
        this.f103876e = z17;
        this.f103877f = c0Var;
        this.f103878g = iVar;
        this.f103879h = z18;
        this.f103880i = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.a4 a4Var = this.f103875d;
        boolean z17 = a4Var.f103299f;
        android.content.Context context = a4Var.f103297d;
        if (z17) {
            if (this.f103876e) {
                db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.did), 0).show();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (this.f103877f.f391645d) {
                db5.t7.i(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e4o), com.p314xaae8f345.mm.R.raw.f79723x416541f0);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        ce2.i iVar = this.f103878g;
        if (pm0.v.z(iVar.f67799x225ba391, 256) && zl2.r4.f555483a.v(context, "FinderLiveLegalPromot2", new bm2.t3(this.f103880i))) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        tg2.h hVar = a4Var.f103301h;
        if (hVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            java.lang.String field_rewardProductId = iVar.f67814x2c488eb6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
            hVar.b((android.view.ViewGroup) view, field_rewardProductId, a4Var.f103299f, this.f103878g, this.f103879h);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
