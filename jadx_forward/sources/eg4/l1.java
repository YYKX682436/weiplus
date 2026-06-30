package eg4;

/* loaded from: classes11.dex */
public class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f334287d;

    public l1(eg4.t1 t1Var) {
        this.f334287d = t1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof y35.r) {
            final y35.r rVar = (y35.r) view.getTag();
            if (rVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f540765a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FMessageConversationUI", "cpan add contact failed. username is null.");
                yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(this.f334287d.f334344o, new ns.j() { // from class: eg4.l1$$a
                    @Override // ns.j
                    public final void a(boolean z17) {
                        eg4.l1 l1Var = eg4.l1.this;
                        eg4.t1 t1Var = l1Var.f334287d;
                        y35.r rVar2 = rVar;
                        if (!z17) {
                            eg4.t1.t(t1Var, rVar2);
                            return;
                        }
                        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(t1Var.f334344o, 1, rVar2.f540765a, new eg4.m1(l1Var, rVar2));
                    }
                });
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
