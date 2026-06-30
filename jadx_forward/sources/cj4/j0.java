package cj4;

/* loaded from: classes11.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.i1 f123505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f123506f;

    public j0(java.lang.String str, cj4.i1 i1Var, mj4.h hVar) {
        this.f123504d = str;
        this.f123505e = i1Var;
        this.f123506f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String a17 = en1.a.a();
        java.lang.String str = this.f123504d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, str);
        qj4.s sVar = qj4.s.f445491a;
        mj4.h hVar = this.f123506f;
        cj4.i1 i1Var = this.f123505e;
        if (b17) {
            qj4.s.m(sVar, i1Var.w(), 14L, i1Var.A().getText().toString(), this.f123506f, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
            sVar.x(i1Var.w(), ((mj4.k) hVar).l(), this.f123504d, false, i1Var.g(), i1Var.f123475d.f102600g);
            bi4.m0 m0Var = i1Var.A1;
            if (m0Var != null) {
                m0Var.a(3, null);
            }
            android.content.Context w17 = i1Var.w();
            pf5.z zVar = pf5.z.f435481a;
            if (!(w17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) w17).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).f255321v = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18646xfde55447.f255159i.a(i1Var.w(), ((mj4.k) hVar).l());
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!i1Var.P(((mj4.k) hVar).o(), ((mj4.k) hVar).f408600b.f76512x81959a6e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "handleLike: content invisible, username=" + str);
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", "localIsLike:" + bool);
        boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) ^ true;
        sVar.x(i1Var.w(), ((mj4.k) hVar).l(), this.f123504d, b18, i1Var.g(), i1Var.f123475d.f102600g);
        i1Var.k(b18, false);
        bi4.m0 m0Var2 = i1Var.A1;
        if (m0Var2 != null && m0Var2 != null) {
            m0Var2.a(2, java.lang.Boolean.valueOf(b18));
        }
        if (bi4.v1.i()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6129x8f5ebd6d c6129x8f5ebd6d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6129x8f5ebd6d();
            am.yx yxVar = c6129x8f5ebd6d.f136401g;
            yxVar.f90021a = b18;
            yxVar.f90022b = ((mj4.k) hVar).o();
            yxVar.f90023c = ((mj4.k) hVar).l();
            c6129x8f5ebd6d.e();
        }
        i1Var.H();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
