package mi5;

/* loaded from: classes9.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oe5.c f408350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f408351e;

    public d1(oe5.c cVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f408350d = cVar;
        this.f408351e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ForwardTingMusicView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        oe5.c cVar = this.f408350d;
        if (cVar.m75933x41a8a7f2(cVar.f125235d + 6)) {
            yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingMusicView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.o6 o6Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.o6.f283598a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        l15.c j18 = cVar.j();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f408351e;
        if (j18 == null || (j17 = j18.m126747x696739c()) == null) {
            j17 = f9Var != null ? f9Var.j() : null;
        }
        o6Var.d(context, f9Var, ot0.q.v(j17));
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingMusicView$onUpdateViewModel$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
