package mi5;

/* loaded from: classes9.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc5.a f408407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l15.c f408409f;

    public l0(dc5.a aVar, android.content.Context context, l15.c cVar) {
        this.f408407d = aVar;
        this.f408408e = context;
        this.f408409f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingNoteView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dc5.a aVar = this.f408407d;
        long m75942xfb822ef2 = aVar.m75942xfb822ef2(aVar.f125235d + 0);
        android.content.Context context = this.f408408e;
        if (m75942xfb822ef2 > 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
            am.sn snVar = c5824x69fbb00a.f136132g;
            snVar.f89439c = context;
            snVar.f89437a = aVar.m75942xfb822ef2(aVar.f125235d + 0);
            c5824x69fbb00a.f136132g.f89442f = aVar.m75945x2fec8307(aVar.f125235d + 1);
            am.sn snVar2 = c5824x69fbb00a.f136132g;
            snVar2.f89440d = false;
            v05.b k17 = this.f408409f.k();
            snVar2.f89438b = k17 != null ? k17.m75945x2fec8307(k17.f513848e + 44) : null;
            c5824x69fbb00a.f136132g.f89443g = 6;
            c5824x69fbb00a.e();
        } else if (aVar.j() > 0) {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(aVar.j());
            o72.l4 l4Var = (o72.l4) i95.n0.c(o72.l4.class);
            r45.dq0 dq0Var = new r45.dq0();
            ((x82.i) l4Var).getClass();
            x82.k0.d(context, F, true, 1, dq0Var);
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingNoteView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
