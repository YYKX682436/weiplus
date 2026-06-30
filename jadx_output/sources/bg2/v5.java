package bg2;

/* loaded from: classes2.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f20579d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView f20580e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20581f;

    public v5(bg2.q6 q6Var, com.tencent.mm.plugin.finder.live.convert.view.FinderLiveFeedToastView finderLiveFeedToastView, android.content.Context context) {
        this.f20579d = q6Var;
        this.f20580e = finderLiveFeedToastView;
        this.f20581f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveNotInterestedController$genToastView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.t1 t1Var = ml2.t1.K2;
        bg2.q6 q6Var = this.f20579d;
        zy2.zb.T8((zy2.zb) c17, t1Var, kz5.c1.l(new jz5.l("liveId", bg2.q6.Z6(q6Var)), new jz5.l("feedId", bg2.q6.Y6(q6Var)), new jz5.l("panel_sence", "1")), null, null, null, null, false, 124, null);
        bg2.a5 a5Var = (bg2.a5) q6Var.N6(bg2.a5.class);
        if ((a5Var == null || a5Var.a7(this.f20580e)) ? false : true) {
            if (q6Var.f20415g == null) {
                android.content.Context context = this.f20581f;
                dg2.m mVar = new dg2.m(context);
                q6Var.f20415g = mVar;
                java.lang.String string = context.getString(com.tencent.mm.R.string.llt);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                mVar.f232309d = string;
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.lmb);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                mVar.f232308c = string2;
                r45.vw0 vw0Var = q6Var.f20414f;
                java.util.LinkedList list2 = vw0Var != null ? vw0Var.getList(2) : null;
                java.util.LinkedList linkedList = mVar.f232307b;
                linkedList.clear();
                if (list2 != null) {
                    linkedList.addAll(list2);
                }
                mVar.f232311f = new bg2.n6(q6Var, context);
                mVar.f232310e = new bg2.o6(q6Var);
                mVar.f232312g = bg2.p6.f20387d;
                mVar.c();
            } else {
                r45.vw0 vw0Var2 = q6Var.f20414f;
                if (vw0Var2 != null && (list = vw0Var2.getList(2)) != null) {
                    dg2.m mVar2 = q6Var.f20415g;
                    if (mVar2 != null) {
                        mVar2.b(list);
                    }
                    dg2.m mVar3 = q6Var.f20415g;
                    if (mVar3 != null) {
                        mVar3.c();
                    }
                }
            }
            bg2.a5 a5Var2 = (bg2.a5) q6Var.N6(bg2.a5.class);
            if (a5Var2 != null) {
                a5Var2.d7();
            }
        } else {
            com.tencent.mars.xlog.Log.i(q6Var.f20413e, "toast already runing dismiss anim, can not open bottom sheet");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveNotInterestedController$genToastView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
