package zo1;

/* loaded from: classes5.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b f556299d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b activityC12870x21c4817b) {
        this.f556299d = activityC12870x21c4817b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.L);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 8L;
        c6839x89375b51.f141600e = 2L;
        c6839x89375b51.k();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b.f174370m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12870x21c4817b activityC12870x21c4817b = this.f556299d;
        activityC12870x21c4817b.getClass();
        wo1.i1 i1Var = new wo1.i1(activityC12870x21c4817b);
        android.view.View inflate = android.view.LayoutInflater.from(activityC12870x21c4817b.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570242dq0, (android.view.ViewGroup) null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12858x7cd09d75 c12858x7cd09d75 = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12858x7cd09d75) inflate.findViewById(com.p314xaae8f345.mm.R.id.rie);
        c12858x7cd09d75.m53996x53bfe316(com.p314xaae8f345.mm.R.C30867xcad56011.f574398my2);
        c12858x7cd09d75.m53992x110075dc(new zo1.m2(i1Var));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565136rf2);
        go1.d dVar = go1.d.f355477a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = activityC12870x21c4817b.f174372e;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        java.lang.String a17 = dVar.a(gVar);
        c21486x59d05a04.setHint(a17);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar2 = activityC12870x21c4817b.f174372e;
        if (gVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
            throw null;
        }
        java.lang.String str = gVar2.f297364f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPackageName(...)");
        if (!r26.i0.y(str, "WXGBACKUPPACKAGEPREFIX_", false)) {
            char[] charArray = a17.toCharArray();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray, "toCharArray(...)");
            c21486x59d05a04.setText(charArray, 0, charArray.length);
        }
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565135rf1)).setOnClickListener(new zo1.p2(c21486x59d05a04, activityC12870x21c4817b, i1Var));
        i1Var.setContentView(inflate);
        android.view.Window window = i1Var.getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window);
        window.setSoftInputMode(52);
        i1Var.show();
        c21486x59d05a04.requestFocus();
        c21486x59d05a04.setSelection(c21486x59d05a04.getText().length());
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/PackageManagerUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
