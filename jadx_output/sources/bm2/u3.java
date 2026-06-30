package bm2;

/* loaded from: classes3.dex */
public final class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f22342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f22343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f22344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ce2.i f22345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f22346h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bm2.n3 f22347i;

    public u3(bm2.a4 a4Var, boolean z17, kotlin.jvm.internal.c0 c0Var, ce2.i iVar, boolean z18, bm2.n3 n3Var) {
        this.f22342d = a4Var;
        this.f22343e = z17;
        this.f22344f = c0Var;
        this.f22345g = iVar;
        this.f22346h = z18;
        this.f22347i = n3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.a4 a4Var = this.f22342d;
        boolean z17 = a4Var.f21766f;
        android.content.Context context = a4Var.f21764d;
        if (z17) {
            if (this.f22343e) {
                db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.did), 0).show();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (this.f22344f.f310112d) {
                db5.t7.i(context, context.getString(com.tencent.mm.R.string.e4o), com.tencent.mm.R.raw.icons_filled_error);
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        ce2.i iVar = this.f22345g;
        if (pm0.v.z(iVar.field_flag, 256) && zl2.r4.f473950a.v(context, "FinderLiveLegalPromot2", new bm2.t3(this.f22347i))) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        tg2.h hVar = a4Var.f21768h;
        if (hVar != null) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            java.lang.String field_rewardProductId = iVar.field_rewardProductId;
            kotlin.jvm.internal.o.f(field_rewardProductId, "field_rewardProductId");
            hVar.b((android.view.ViewGroup) view, field_rewardProductId, a4Var.f21766f, this.f22345g, this.f22346h);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveGiftGridAdapter$inflateGiftItem$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
