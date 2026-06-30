package ab5;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab5.i f2925d;

    public d(ab5.i iVar) {
        this.f2925d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/appbrand/AppBrandNoticeMoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        ab5.g gVar = this.f2925d.f2949u;
        if (gVar != null) {
            if (id6 == com.tencent.mm.R.id.bi7) {
                com.tencent.mm.ui.chatting.viewitems.g1 g1Var = (com.tencent.mm.ui.chatting.viewitems.g1) gVar;
                ab5.i iVar = g1Var.f204001a;
                iVar.dismiss();
                java.util.List list = iVar.f2948t;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    ab5.h hVar = (ab5.h) it.next();
                    if (hVar.f2934c) {
                        sb6.append(hVar.f2932a);
                        sb6.append(":");
                    }
                }
                if (sb6.length() > 0) {
                    sb6.setLength(sb6.length() - 1);
                }
                com.tencent.mm.ui.chatting.viewitems.i1 i1Var = g1Var.f204009i.f204071d;
                java.lang.String str = g1Var.f204003c;
                java.lang.String str2 = g1Var.f204004d;
                java.lang.String str3 = g1Var.f204005e;
                java.lang.String sb7 = sb6.toString();
                int i17 = g1Var.f204006f;
                java.lang.String str4 = com.tencent.mm.ui.chatting.viewitems.i1.D;
                i1Var.getClass();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) i1Var.f204150t.g(), 1, true);
                k0Var.e(true);
                android.content.res.Resources resources = i1Var.f204150t.g().getResources();
                android.view.View inflate = android.view.LayoutInflater.from(i1Var.f204150t.g()).inflate(com.tencent.mm.R.layout.f488425sy, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odb);
                textView.setText(java.lang.String.format(resources.getString(com.tencent.mm.R.string.b0m), g1Var.f204002b));
                textView.setTextSize(1, 14.0f);
                k0Var.s(inflate, true);
                android.view.View inflate2 = android.view.LayoutInflater.from(i1Var.f204150t.g()).inflate(com.tencent.mm.R.layout.f488424sx, (android.view.ViewGroup) null);
                inflate2.setOnClickListener(new com.tencent.mm.ui.chatting.viewitems.d1(i1Var, k0Var));
                k0Var.o(inflate2);
                k0Var.f211872n = new com.tencent.mm.ui.chatting.viewitems.e1(i1Var);
                k0Var.f211881s = new com.tencent.mm.ui.chatting.viewitems.u0(i1Var, str, i17, str2, str3, sb7);
                k0Var.v();
            } else if (id6 == com.tencent.mm.R.id.bhx || id6 == com.tencent.mm.R.id.f483631bi2) {
                com.tencent.mm.ui.chatting.viewitems.g1 g1Var2 = (com.tencent.mm.ui.chatting.viewitems.g1) gVar;
                g1Var2.f204001a.dismiss();
                com.tencent.mm.ui.chatting.viewitems.h1 h1Var = g1Var2.f204009i;
                com.tencent.mm.ui.chatting.viewitems.i1 i1Var2 = h1Var.f204071d;
                java.lang.String str5 = com.tencent.mm.ui.chatting.viewitems.i1.D;
                i1Var2.getClass();
                com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
                java.lang.String str6 = g1Var2.f204003c;
                android.view.View view2 = g1Var2.f204007g;
                e17.a(1198, new com.tencent.mm.ui.chatting.viewitems.y0(i1Var2, view2, str6));
                k01.n0 n0Var = (k01.n0) i95.n0.c(k01.n0.class);
                java.lang.String j17 = g1Var2.f204008h.j();
                ((k01.a) n0Var).getClass();
                k01.b1 b1Var = new k01.b1(j17);
                com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(view2.getContext(), view2.getResources().getString(com.tencent.mm.R.string.f490573yv), view2.getResources().getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.chatting.viewitems.f1(g1Var2, b1Var));
                com.tencent.mm.ui.chatting.viewitems.i1 i1Var3 = h1Var.f204071d;
                i1Var3.f204151u = Q;
                c01.d9.e().g(b1Var);
                h1Var.f204071d.e0(3, g1Var2.f204003c, g1Var2.f204004d, g1Var2.f204005e, null, com.tencent.mm.ui.chatting.viewitems.i1.d0(i1Var3, g1Var2.f204006f));
            } else if (id6 == com.tencent.mm.R.id.bhy || id6 == com.tencent.mm.R.id.f483632bi3) {
                com.tencent.mm.ui.chatting.viewitems.g1 g1Var3 = (com.tencent.mm.ui.chatting.viewitems.g1) gVar;
                g1Var3.f204001a.dismiss();
                com.tencent.mm.storage.f9 f9Var = g1Var3.f204008h;
                pt0.f0.P7(f9Var.Q0(), f9Var.getMsgId());
            } else if (id6 == com.tencent.mm.R.id.f483633bi4) {
                com.tencent.mm.ui.chatting.viewitems.g1 g1Var4 = (com.tencent.mm.ui.chatting.viewitems.g1) gVar;
                g1Var4.f204001a.dismiss();
                tt0.a a17 = tt0.a.a(g1Var4.f204008h.j());
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "on app brand(%s) name click", a17.f421778d);
                j45.l.j(g1Var4.f204007g.getContext(), "appbrand", ".ui.AppBrandAuthorizeUI", new android.content.Intent().putExtra("key_username", a17.f421778d), null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/appbrand/AppBrandNoticeMoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
