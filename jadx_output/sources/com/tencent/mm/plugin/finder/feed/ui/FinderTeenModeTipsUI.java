package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTeenModeTipsUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes.dex */
public final class FinderTeenModeTipsUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: t, reason: collision with root package name */
    public boolean f109559t;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 268;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_0;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.o0m);
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.ul(this));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(findViewById, "teen_mode_set_url");
            ((cy1.a) aVar.ik(findViewById, 8, 25496)).Ai(findViewById, new com.tencent.mm.plugin.finder.feed.ui.vl(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0o);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.aaw));
        this.f109559t = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai();
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.backBtn);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.wl(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        super.onResume();
        pf5.u uVar = pf5.u.f353936a;
        r45.kz2 O6 = ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) ((iz2.c) uVar.e(zy2.b6.class).c(iz2.c.class))).O6();
        int P6 = ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) uVar.e(zy2.b6.class).a(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class)).P6();
        if (P6 < 0) {
            P6 = 10;
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0n);
        if (textView != null) {
            if (O6.getList(2).size() == 0) {
                textView.setText(com.tencent.mm.R.string.f7i);
            } else {
                java.util.ArrayList<r45.mz2> arrayList = new java.util.ArrayList();
                java.util.LinkedList<r45.lz2> list = O6.getList(2);
                kotlin.jvm.internal.o.f(list, "getVisible_info(...)");
                for (r45.lz2 lz2Var : list) {
                    if (P6 >= lz2Var.getInteger(0) && P6 <= lz2Var.getInteger(1)) {
                        arrayList.addAll(lz2Var.getList(2));
                    }
                }
                if (arrayList.isEmpty()) {
                    java.util.LinkedList list2 = O6.getList(2);
                    kotlin.jvm.internal.o.f(list2, "getVisible_info(...)");
                    r45.lz2 lz2Var2 = (r45.lz2) kz5.n0.Z(list2);
                    if (lz2Var2 != null) {
                        arrayList.addAll(lz2Var2.getList(2));
                    }
                }
                java.lang.String str = "";
                if (O6.getLong(3) == 0) {
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    r45.mz2 mz2Var = (r45.mz2) kz5.n0.Z(arrayList);
                    if (mz2Var != null && (string4 = mz2Var.getString(1)) != null) {
                        str = string4;
                    }
                    objArr[0] = str;
                    objArr[1] = java.lang.Integer.valueOf(arrayList.size());
                    textView.setText(getString(com.tencent.mm.R.string.f7h, objArr));
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (r45.mz2 mz2Var2 : arrayList) {
                        if ((O6.getLong(3) & mz2Var2.getLong(0)) > 0) {
                            arrayList2.add(mz2Var2);
                        }
                    }
                    if (arrayList2.size() == 1) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        r45.mz2 mz2Var3 = (r45.mz2) kz5.n0.Z(arrayList2);
                        if (mz2Var3 != null && (string3 = mz2Var3.getString(1)) != null) {
                            str = string3;
                        }
                        objArr2[0] = str;
                        string = getString(com.tencent.mm.R.string.f7j, objArr2);
                    } else if (arrayList2.size() > 1) {
                        java.lang.Object[] objArr3 = new java.lang.Object[2];
                        r45.mz2 mz2Var4 = (r45.mz2) kz5.n0.Z(arrayList2);
                        if (mz2Var4 != null && (string2 = mz2Var4.getString(1)) != null) {
                            str = string2;
                        }
                        objArr3[0] = str;
                        objArr3[1] = java.lang.Integer.valueOf(arrayList2.size());
                        string = getString(com.tencent.mm.R.string.f7h, objArr3);
                    } else {
                        string = getString(com.tencent.mm.R.string.f7i);
                    }
                    textView.setText(string);
                }
            }
        }
        if (this.f109559t || !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderTeenModeTipsUI", "onResume: isTeenModeAndViewNothing finish, isInFinderTask=" + ((com.tencent.mm.plugin.finder.service.l3) i95.n0.c(com.tencent.mm.plugin.finder.service.l3.class)).Di(this));
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("preferred_tab", 2);
        j45.l.u(this, ".ui.LauncherUI", intent, null);
        ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Ni(true);
        db5.t7.makeText(this, com.tencent.mm.R.string.f7t, 0).show();
    }
}
