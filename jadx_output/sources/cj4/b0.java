package cj4;

/* loaded from: classes11.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f41906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f41907f;

    public b0(java.lang.String str, cj4.i1 i1Var, mj4.h hVar) {
        this.f41905d = str;
        this.f41906e = i1Var;
        this.f41907f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleCommentLayout$commentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String userName = this.f41905d;
        boolean b17 = userName == null ? false : kotlin.jvm.internal.o.b(userName, en1.a.a());
        mj4.h hVar = this.f41907f;
        cj4.i1 i1Var = this.f41906e;
        if (!b17 && !i1Var.P(((mj4.k) hVar).o(), ((mj4.k) hVar).f327067b.field_CreateTime)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "handleCommentLayout: content invisible, username=" + userName);
            i1Var.U();
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleCommentLayout$commentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(i1Var.w(), 9, pj4.p0.class);
        int i17 = p0Var != null ? p0Var.f355242m : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "handleCommentLayout: currScene=" + i17);
        android.content.Context w17 = i1Var.w();
        pf5.z zVar = pf5.z.f353948a;
        if (!(w17 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) w17).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173788v = true;
        com.tencent.mm.plugin.textstatus.ui.i5.a(com.tencent.mm.plugin.textstatus.ui.TextStatusCommentTransparentActivity.f173501d, i1Var.w(), 1, this.f41905d, ((mj4.k) hVar).l(), java.lang.Boolean.valueOf(((mj4.k) hVar).w()), null, i17, 0, 160, null);
        boolean b18 = userName != null ? kotlin.jvm.internal.o.b(userName, en1.a.a()) : false;
        qj4.s sVar = qj4.s.f363958a;
        if (b18) {
            qj4.s.m(sVar, i1Var.w(), 17L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        } else {
            qj4.s.m(sVar, i1Var.w(), 16L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
        android.content.Context w18 = i1Var.w();
        java.lang.String l17 = ((mj4.k) hVar).l();
        cj4.q1 g17 = i1Var.g();
        int i18 = i1Var.f41942d.f21067g;
        kotlin.jvm.internal.o.g(userName, "userName");
        sVar.w(w18, "textstatus_cmt_box", "view_clk", l17, userName, g17, i18, kz5.q0.f314001d);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleCommentLayout$commentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
