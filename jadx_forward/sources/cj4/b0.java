package cj4;

/* loaded from: classes11.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f123440f;

    public b0(java.lang.String str, cj4.i1 i1Var, mj4.h hVar) {
        this.f123438d = str;
        this.f123439e = i1Var;
        this.f123440f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleCommentLayout$commentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String userName = this.f123438d;
        boolean b17 = userName == null ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, en1.a.a());
        mj4.h hVar = this.f123440f;
        cj4.i1 i1Var = this.f123439e;
        if (!b17 && !i1Var.P(((mj4.k) hVar).o(), ((mj4.k) hVar).f408600b.f76512x81959a6e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "handleCommentLayout: content invisible, username=" + userName);
            i1Var.U();
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleCommentLayout$commentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(i1Var.w(), 9, pj4.p0.class);
        int i17 = p0Var != null ? p0Var.f436775m : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "handleCommentLayout: currScene=" + i17);
        android.content.Context w17 = i1Var.w();
        pf5.z zVar = pf5.z.f435481a;
        if (!(w17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) w17).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).f255321v = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i5.a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18628xf43ab4a1.f255034d, i1Var.w(), 1, this.f123438d, ((mj4.k) hVar).l(), java.lang.Boolean.valueOf(((mj4.k) hVar).w()), null, i17, 0, 160, null);
        boolean b18 = userName != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(userName, en1.a.a()) : false;
        qj4.s sVar = qj4.s.f445491a;
        if (b18) {
            qj4.s.m(sVar, i1Var.w(), 17L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        } else {
            qj4.s.m(sVar, i1Var.w(), 16L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
        android.content.Context w18 = i1Var.w();
        java.lang.String l17 = ((mj4.k) hVar).l();
        cj4.q1 g17 = i1Var.g();
        int i18 = i1Var.f123475d.f102600g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        sVar.w(w18, "textstatus_cmt_box", "view_clk", l17, userName, g17, i18, kz5.q0.f395534d);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleCommentLayout$commentClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
