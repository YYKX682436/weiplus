package z63;

/* loaded from: classes5.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.f1 f551982d;

    public x0(z63.f1 f1Var) {
        this.f551982d = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.util.Pair pair;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/groupsolitaire/ui/SuggestSolitatireTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.groupsolitaire.SuggestSolitatireTips", "click Tips");
        z63.f1 f1Var = this.f551982d;
        if (f1Var.f551924l == null && !x63.g.B(f1Var.f551914b, f1Var.f551934v)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.groupsolitaire.SuggestSolitatireTips", "why here???");
            yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/SuggestSolitatireTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        y63.a aVar = f1Var.f551924l;
        if (aVar == null) {
            f1Var.f551924l = new y63.a();
            f1Var.f551924l.H = f1Var.f551925m + "\n";
            y63.a aVar2 = f1Var.f551924l;
            aVar2.f66138x4b6e619a = x63.g.o(aVar2);
            y63.a aVar3 = f1Var.f551924l;
            aVar3.K = ".";
            aVar3.Q = 1;
            intent.putExtra("key_group_solitatire_create", true);
            intent.putExtra("key_group_solitatire_scene", 4);
        } else {
            aVar.f66138x4b6e619a = x63.g.o(aVar);
            java.lang.String str = f1Var.f551923k;
            java.lang.String str2 = f1Var.f551924l.f66138x4b6e619a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                pair = new android.util.Pair(java.lang.Boolean.FALSE, null);
            } else {
                y63.a f17 = ((t63.e) i95.n0.c(t63.e.class)).wi().f(str, str2);
                pair = f17 == null ? new android.util.Pair(java.lang.Boolean.FALSE, null) : new android.util.Pair(java.lang.Boolean.TRUE, f17);
            }
            if (!((java.lang.Boolean) pair.first).booleanValue()) {
                if (!x63.g.D(f1Var.f551914b, f1Var.f551934v)) {
                    f1Var.f551924l.H = f1Var.f551914b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsk) + "\n" + f1Var.f551924l.H;
                    y63.a aVar4 = f1Var.f551924l;
                    aVar4.f66138x4b6e619a = x63.g.o(aVar4);
                }
                intent.putExtra("key_group_solitatire_create", true);
            } else if (f1Var.f551937y) {
                intent.putExtra("key_group_solitatire_create", true);
                if (!x63.g.D(f1Var.f551914b, f1Var.f551934v)) {
                    f1Var.f551924l.H = f1Var.f551914b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fsk) + "\n" + f1Var.f551924l.H;
                    y63.a aVar5 = f1Var.f551924l;
                    aVar5.f66138x4b6e619a = x63.g.o(aVar5);
                }
            } else {
                intent.putExtra("key_group_solitatire_create", false);
                f1Var.f551924l = x63.g.J(f1Var.f551924l, f1Var.f551930r, (y63.a) pair.second);
            }
            intent.putExtra("key_group_solitatire_scene", 3);
        }
        intent.putExtra("key_group_solitatire_key", f1Var.f551924l.f66138x4b6e619a);
        intent.putExtra("key_group_solitatire_chatroom_username", f1Var.f551923k);
        x63.g.e(f1Var.f551923k, f1Var.f551924l);
        ((t63.e) i95.n0.c(t63.e.class)).wi().k(f1Var.f551923k, f1Var.f551924l);
        j45.l.r(f1Var.f551915c, "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, 3001, new z63.w0(this));
        f1Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/groupsolitaire/ui/SuggestSolitatireTips$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
