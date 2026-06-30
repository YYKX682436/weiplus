package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTeenModeTipsUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeTipsUI */
/* loaded from: classes.dex */
public final class ActivityC14096xb222a3af extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {

    /* renamed from: t, reason: collision with root package name */
    public boolean f191092t;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 268;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b_0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.o0m);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ul(this));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(findViewById, "teen_mode_set_url");
            ((cy1.a) aVar.ik(findViewById, 8, 25496)).Ai(findViewById, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vl(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o0o);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f191092t = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai();
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f78240xeb4d83f5);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wl(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        java.lang.String string;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        super.onResume();
        pf5.u uVar = pf5.u.f435469a;
        r45.kz2 O6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) ((iz2.c) uVar.e(zy2.b6.class).c(iz2.c.class))).O6();
        int P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f) uVar.e(zy2.b6.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1681xa3787f7d.C15485xead19c2f.class)).P6();
        if (P6 < 0) {
            P6 = 10;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.o0n);
        if (textView != null) {
            if (O6.m75941xfb821914(2).size() == 0) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f7i);
            } else {
                java.util.ArrayList<r45.mz2> arrayList = new java.util.ArrayList();
                java.util.LinkedList<r45.lz2> m75941xfb821914 = O6.m75941xfb821914(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getVisible_info(...)");
                for (r45.lz2 lz2Var : m75941xfb821914) {
                    if (P6 >= lz2Var.m75939xb282bd08(0) && P6 <= lz2Var.m75939xb282bd08(1)) {
                        arrayList.addAll(lz2Var.m75941xfb821914(2));
                    }
                }
                if (arrayList.isEmpty()) {
                    java.util.LinkedList m75941xfb8219142 = O6.m75941xfb821914(2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getVisible_info(...)");
                    r45.lz2 lz2Var2 = (r45.lz2) kz5.n0.Z(m75941xfb8219142);
                    if (lz2Var2 != null) {
                        arrayList.addAll(lz2Var2.m75941xfb821914(2));
                    }
                }
                java.lang.String str = "";
                if (O6.m75942xfb822ef2(3) == 0) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    r45.mz2 mz2Var = (r45.mz2) kz5.n0.Z(arrayList);
                    if (mz2Var != null && (m75945x2fec83073 = mz2Var.m75945x2fec8307(1)) != null) {
                        str = m75945x2fec83073;
                    }
                    objArr[0] = str;
                    objArr[1] = java.lang.Integer.valueOf(arrayList.size());
                    textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7h, objArr));
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (r45.mz2 mz2Var2 : arrayList) {
                        if ((O6.m75942xfb822ef2(3) & mz2Var2.m75942xfb822ef2(0)) > 0) {
                            arrayList2.add(mz2Var2);
                        }
                    }
                    if (arrayList2.size() == 1) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        r45.mz2 mz2Var3 = (r45.mz2) kz5.n0.Z(arrayList2);
                        if (mz2Var3 != null && (m75945x2fec83072 = mz2Var3.m75945x2fec8307(1)) != null) {
                            str = m75945x2fec83072;
                        }
                        objArr2[0] = str;
                        string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7j, objArr2);
                    } else if (arrayList2.size() > 1) {
                        java.lang.Object[] objArr3 = new java.lang.Object[2];
                        r45.mz2 mz2Var4 = (r45.mz2) kz5.n0.Z(arrayList2);
                        if (mz2Var4 != null && (m75945x2fec8307 = mz2Var4.m75945x2fec8307(1)) != null) {
                            str = m75945x2fec8307;
                        }
                        objArr3[0] = str;
                        objArr3[1] = java.lang.Integer.valueOf(arrayList2.size());
                        string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7h, objArr3);
                    } else {
                        string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f7i);
                    }
                    textView.setText(string);
                }
            }
        }
        if (this.f191092t || !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTeenModeTipsUI", "onResume: isTeenModeAndViewNothing finish, isInFinderTask=" + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3.class)).Di(this));
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("preferred_tab", 2);
        j45.l.u(this, ".ui.LauncherUI", intent, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ni(true);
        db5.t7.m123882x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f7t, 0).show();
    }
}
