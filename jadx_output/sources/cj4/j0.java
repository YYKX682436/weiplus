package cj4;

/* loaded from: classes11.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f41971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f41972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f41973f;

    public j0(java.lang.String str, cj4.i1 i1Var, mj4.h hVar) {
        this.f41971d = str;
        this.f41972e = i1Var;
        this.f41973f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String a17 = en1.a.a();
        java.lang.String str = this.f41971d;
        boolean b17 = kotlin.jvm.internal.o.b(a17, str);
        qj4.s sVar = qj4.s.f363958a;
        mj4.h hVar = this.f41973f;
        cj4.i1 i1Var = this.f41972e;
        if (b17) {
            qj4.s.m(sVar, i1Var.w(), 14L, i1Var.A().getText().toString(), this.f41973f, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
            sVar.x(i1Var.w(), ((mj4.k) hVar).l(), this.f41971d, false, i1Var.g(), i1Var.f41942d.f21067g);
            bi4.m0 m0Var = i1Var.A1;
            if (m0Var != null) {
                m0Var.a(3, null);
            }
            android.content.Context w17 = i1Var.w();
            pf5.z zVar = pf5.z.f353948a;
            if (!(w17 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) w17).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class)).f173788v = true;
            com.tencent.mm.plugin.textstatus.ui.TextStatusHalfScreenLikeListUI.f173626i.a(i1Var.w(), ((mj4.k) hVar).l());
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!i1Var.P(((mj4.k) hVar).o(), ((mj4.k) hVar).f327067b.field_CreateTime)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "handleLike: content invisible, username=" + str);
            i1Var.U();
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        i1Var.getClass();
        if (java.lang.Math.abs(currentTimeMillis - 0) < 500) {
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Object tag = i1Var.v().getTag();
        java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "localIsLike:" + bool);
        boolean b18 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE) ^ true;
        sVar.x(i1Var.w(), ((mj4.k) hVar).l(), this.f41971d, b18, i1Var.g(), i1Var.f41942d.f21067g);
        i1Var.k(b18, false);
        bi4.m0 m0Var2 = i1Var.A1;
        if (m0Var2 != null && m0Var2 != null) {
            m0Var2.a(2, java.lang.Boolean.valueOf(b18));
        }
        if (bi4.v1.i()) {
            com.tencent.mm.autogen.events.StatusLikeUIChangeEvent statusLikeUIChangeEvent = new com.tencent.mm.autogen.events.StatusLikeUIChangeEvent();
            am.yx yxVar = statusLikeUIChangeEvent.f54868g;
            yxVar.f8488a = b18;
            yxVar.f8489b = ((mj4.k) hVar).o();
            yxVar.f8490c = ((mj4.k) hVar).l();
            statusLikeUIChangeEvent.e();
        }
        i1Var.H();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
