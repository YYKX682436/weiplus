package ir1;

/* loaded from: classes11.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.u f375477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir1.e0 f375478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f375479f;

    public c0(ir1.u uVar, ir1.e0 e0Var, android.view.View view) {
        this.f375477d = uVar;
        this.f375478e = e0Var;
        this.f375479f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hr1.e eVar = (hr1.e) this.f375477d.f374658i;
        ir1.v vVar = this.f375478e.f375499p;
        if (vVar != null) {
            android.content.Context context = this.f375479f.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
            ir1.r rVar = (ir1.r) vVar;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f66326xbed8694c, "bizfansnofiticationholder@bizfansmsg");
            int i17 = rVar.f375572a;
            boolean z17 = false;
            if (b17) {
                yq1.u0.Di().m("bizfansnofiticationholder@bizfansmsg", false);
                ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).getClass();
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vw.d2(i17, context, null), 3, null);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f66326xbed8694c, "bizphotofansnofiticationholder@picfansmsg")) {
                yq1.u0.Vi().m("bizphotofansnofiticationholder@picfansmsg", false);
                ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).getClass();
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new vw.d2(i17, context, null), 3, null);
            } else {
                java.lang.String str = eVar.f66326xbed8694c;
                if (!(str == null || str.length() == 0) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizfansgreetholder@bizfansmsg") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizphotofansgreetholder@picfansmsg"))) {
                    z17 = true;
                }
                if (z17) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("serviceType", i17);
                    j45.l.j(context, "brandservice", ".conversation.ui.BizFansGreetBoxUI", intent, null);
                } else {
                    wn.t tVar = rVar.f375573b;
                    if (tVar != null) {
                        java.lang.String str2 = eVar.f66326xbed8694c;
                        java.lang.String str3 = eVar.f66325xea7a0fe2;
                        rb5.l lVar = (rb5.l) tVar;
                        lVar.f475432z = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1292x55bb7a46.p1293xac8f1cfd.C12987xa57b7d50.class;
                        lVar.l(str2, str3, null, null);
                    }
                    yz5.l lVar2 = rVar.f375574c;
                    if (lVar2 != null) {
                        lVar2.mo146xb9724478(eVar);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
