package fi2;

/* loaded from: classes3.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 f344480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fi2.j1 f344481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f344482f;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950, fi2.j1 j1Var, zi2.w wVar) {
        this.f344480d = c14245x86828950;
        this.f344481e = j1Var;
        this.f344482f = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pf5.u uVar = pf5.u.f435469a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.C14245x86828950 c14245x86828950 = this.f344480d;
        android.content.Context context = c14245x86828950.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!((pl2.x) uVar.b(context).a(pl2.x.class)).f438216f) {
            this.f344481e.B().n(2);
            zh2.b m17 = this.f344482f.m();
            if (m17 != null) {
                fn2.u1 u1Var = fn2.u1.f345944f;
                sf2.d3 d3Var = (sf2.d3) ((ch2.o2) m17).m56789x25fe639c(sf2.d3.class);
                if (d3Var != null) {
                    d3Var.v7(u1Var, -1);
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Context context2 = c14245x86828950.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        ((pl2.x) uVar.b(context2).a(pl2.x.class)).f438220m.f438211h = 3;
        android.content.Context context3 = c14245x86828950.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        pl2.s sVar = ((pl2.x) uVar.b(context3).a(pl2.x.class)).f438217g;
        if (sVar != null) {
            pl2.s.e(sVar, 0L, null, 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/core/VoiceRoomCoverLogicCore$1$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
