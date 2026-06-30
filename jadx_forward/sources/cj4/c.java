package cj4;

/* loaded from: classes11.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.k f123446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj4.h f123447f;

    public c(java.lang.String str, cj4.k kVar, mj4.h hVar) {
        this.f123445d = str;
        this.f123446e = kVar;
        this.f123447f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123445d, en1.a.a());
        cj4.k kVar = this.f123446e;
        if (b17) {
            bi4.m0 m0Var = kVar.V;
            if (m0Var != null && m0Var != null) {
                m0Var.a(6, kVar.f123525x);
            }
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            kVar.getClass();
            if (java.lang.Math.abs(currentTimeMillis - 0) < 500) {
                yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.lang.Object tag = kVar.e().getTag();
            java.lang.Boolean bool = tag instanceof java.lang.Boolean ? (java.lang.Boolean) tag : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.BaseMiniStatusLoadLogic", "localIsLike:" + bool);
            boolean b18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.TRUE) ^ true;
            kVar.k(b18, false);
            bi4.m0 m0Var2 = kVar.V;
            if (m0Var2 != null && m0Var2 != null) {
                m0Var2.a(2, java.lang.Boolean.valueOf(b18));
            }
            mj4.h hVar = this.f123447f;
            if (b18) {
                android.content.Context j17 = kVar.j();
                pf5.z zVar = pf5.z.f435481a;
                if (!(j17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) j17).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd.class)).O6(((mj4.k) hVar).l());
            } else {
                android.content.Context j18 = kVar.j();
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(j18 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) j18).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.kd.class)).P6(((mj4.k) hVar).l());
            }
        }
        kVar.r();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/logic/BaseMiniStatusLoadLogic$handleLike$likeClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
