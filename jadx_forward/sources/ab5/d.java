package ab5;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ab5.i f84458d;

    public d(ab5.i iVar) {
        this.f84458d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/appbrand/AppBrandNoticeMoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        ab5.g gVar = this.f84458d.f84482u;
        if (gVar != null) {
            if (id6 == com.p314xaae8f345.mm.R.id.bi7) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g1 g1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g1) gVar;
                ab5.i iVar = g1Var.f285534a;
                iVar.dismiss();
                java.util.List list = iVar.f84481t;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    ab5.h hVar = (ab5.h) it.next();
                    if (hVar.f84467c) {
                        sb6.append(hVar.f84465a);
                        sb6.append(":");
                    }
                }
                if (sb6.length() > 0) {
                    sb6.setLength(sb6.length() - 1);
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var = g1Var.f285542i.f285604d;
                java.lang.String str = g1Var.f285536c;
                java.lang.String str2 = g1Var.f285537d;
                java.lang.String str3 = g1Var.f285538e;
                java.lang.String sb7 = sb6.toString();
                int i17 = g1Var.f285539f;
                java.lang.String str4 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1.D;
                i1Var.getClass();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) i1Var.f285683t.g(), 1, true);
                k0Var.e(true);
                android.content.res.Resources resources = i1Var.f285683t.g().getResources();
                android.view.View inflate = android.view.LayoutInflater.from(i1Var.f285683t.g()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569958sy, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odb);
                textView.setText(java.lang.String.format(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b0m), g1Var.f285535b));
                textView.setTextSize(1, 14.0f);
                k0Var.s(inflate, true);
                android.view.View inflate2 = android.view.LayoutInflater.from(i1Var.f285683t.g()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569957sx, (android.view.ViewGroup) null);
                inflate2.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d1(i1Var, k0Var));
                k0Var.o(inflate2);
                k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.e1(i1Var);
                k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.u0(i1Var, str, i17, str2, str3, sb7);
                k0Var.v();
            } else if (id6 == com.p314xaae8f345.mm.R.id.bhx || id6 == com.p314xaae8f345.mm.R.id.f565164bi2) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g1 g1Var2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g1) gVar;
                g1Var2.f285534a.dismiss();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.h1 h1Var = g1Var2.f285542i;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var2 = h1Var.f285604d;
                java.lang.String str5 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1.D;
                i1Var2.getClass();
                com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
                java.lang.String str6 = g1Var2.f285536c;
                android.view.View view2 = g1Var2.f285540g;
                e17.a(1198, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y0(i1Var2, view2, str6));
                k01.n0 n0Var = (k01.n0) i95.n0.c(k01.n0.class);
                java.lang.String j17 = g1Var2.f285541h.j();
                ((k01.a) n0Var).getClass();
                k01.b1 b1Var = new k01.b1(j17);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(view2.getContext(), view2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), view2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.f1(g1Var2, b1Var));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1 i1Var3 = h1Var.f285604d;
                i1Var3.f285684u = Q;
                c01.d9.e().g(b1Var);
                h1Var.f285604d.e0(3, g1Var2.f285536c, g1Var2.f285537d, g1Var2.f285538e, null, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i1.d0(i1Var3, g1Var2.f285539f));
            } else if (id6 == com.p314xaae8f345.mm.R.id.bhy || id6 == com.p314xaae8f345.mm.R.id.f565165bi3) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g1 g1Var3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g1) gVar;
                g1Var3.f285534a.dismiss();
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = g1Var3.f285541h;
                pt0.f0.P7(f9Var.Q0(), f9Var.m124847x74d37ac6());
            } else if (id6 == com.p314xaae8f345.mm.R.id.f565166bi4) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g1 g1Var4 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g1) gVar;
                g1Var4.f285534a.dismiss();
                tt0.a a17 = tt0.a.a(g1Var4.f285541h.j());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppBrandNotifyMsg", "on app brand(%s) name click", a17.f503311d);
                j45.l.j(g1Var4.f285540g.getContext(), "appbrand", ".ui.AppBrandAuthorizeUI", new android.content.Intent().putExtra("key_username", a17.f503311d), null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/appbrand/AppBrandNoticeMoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
