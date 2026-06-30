package p61;

/* loaded from: classes11.dex */
public class f4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.g4 f433783d;

    public f4(p61.g4 g4Var, p61.h4 h4Var) {
        this.f433783d = g4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/MobileFriendAdapterCaseB$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p61.g4 g4Var = this.f433783d;
        p61.y3 y3Var = g4Var.f433808k.f433817q;
        if (y3Var != null) {
            int i17 = g4Var.f433798a;
            java.lang.String str = g4Var.f433799b;
            final p61.a4 a4Var = (p61.a4) y3Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MobileFriendAdapter", "[cpan] postion:%d md5:%s status:%d", java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(g4Var.f433800c));
            p61.h4 h4Var = a4Var.f433743a;
            final r61.a aVar = (r61.a) h4Var.getItem(i17);
            if (aVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MobileFriendAdapter", "[cpan] mobile Friend is null. mobile:%s", str);
            } else if (aVar.f474332o == 1) {
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(h4Var.f294141e, new ns.j() { // from class: p61.a4$$a
                    @Override // ns.j
                    public final void a(boolean z17) {
                        p61.a4 a4Var2 = p61.a4.this;
                        p61.h4 h4Var2 = a4Var2.f433743a;
                        r61.a aVar2 = aVar;
                        if (!z17) {
                            p61.h4.t(h4Var2, aVar2);
                            return;
                        }
                        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(h4Var2.f294141e, 1, aVar2.i(), new p61.b4(a4Var2, aVar2));
                    }
                });
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendAdapterCaseB$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
