package com.tencent.mm.feature.appmsg.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/appmsg/ui/RecordDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "feature-appmsg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class RecordDetailUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {
    public static final void U6(com.tencent.mm.feature.appmsg.ui.RecordDetailUI recordDetailUI, com.tencent.mm.storage.f9 f9Var) {
        recordDetailUI.getClass();
        if (f9Var == null) {
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        n13.r rVar = new n13.r();
        rVar.f334118b = 1001;
        xd5.a aVar = new xd5.a();
        long msgId = f9Var.getMsgId();
        int i17 = aVar.f43702d;
        aVar.set(i17 + 0, java.lang.Long.valueOf(msgId));
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        aVar.set(i17 + 1, Q0);
        l15.c cVar = new l15.c();
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar.fromXml(U1);
        aVar.n(cVar);
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(recordDetailUI, aVar, rVar);
        ((px.b0) ((qx.f0) i95.n0.c(qx.f0.class))).qc(5);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489381em3;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra = getIntent().getStringExtra("params");
        if (stringExtra == null) {
            finish();
            return;
        }
        hu.f fVar = new hu.f();
        fVar.fromJsonStr(stringExtra);
        java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
        java.lang.String stringExtra3 = intent != null ? intent.getStringExtra("custom_send_text") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordDetailUI", "want to send record msg, but toUser is null");
            return;
        }
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(fVar.q(), fVar.n());
        if (n17.getMsgId() != fVar.n()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecordDetailUI", "want to send record msg, but message info is null");
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.f490552yb), true, false, null);
        kotlin.jvm.internal.o.f(Q, "showProgressDlg(...)");
        ((ku5.t0) ku5.t0.f312615d).g(new tu.c(stringExtra2, stringExtra3, n17, Q));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        l15.c cVar;
        jz5.f0 f0Var;
        java.util.List list;
        v05.b k17;
        java.lang.String str;
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("params");
        if (stringExtra == null) {
            finish();
        } else {
            hu.f fVar = new hu.f();
            fVar.fromJsonStr(stringExtra);
            com.tencent.mm.storage.f9 k18 = pt0.f0.f358209b1.k(fVar.q(), fVar.n());
            java.lang.String str2 = "";
            java.lang.String str3 = null;
            if (k18 != null) {
                cVar = new l15.c();
                java.lang.String U1 = k18.U1();
                if (U1 == null) {
                    U1 = "";
                }
                cVar.fromXml(U1);
            } else {
                cVar = null;
            }
            s15.w wVar = new s15.w();
            hu.f fVar2 = r26.n0.N(fVar.r()) ^ true ? fVar : null;
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (fVar2 != null) {
                wVar.fromXml(fVar2.r());
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                if (cVar != null) {
                    v05.b k19 = cVar.k();
                    if (k19 == null || (str = k19.getString(k19.f432315e + 44)) == null) {
                        str = "";
                    }
                    wVar.fromXml(str);
                } else {
                    f0Var2 = null;
                }
                if (f0Var2 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailUI", "invalid input");
                    finish();
                }
            }
            java.lang.String title = fVar.getTitle();
            if (!(!r26.n0.N(title))) {
                title = null;
            }
            if (title == null) {
                if (cVar != null && (k17 = cVar.k()) != null) {
                    str3 = k17.getString(k17.f368365d + 2);
                }
                title = str3 == null ? "" : str3;
            }
            setMMTitle(title);
            java.text.SimpleDateFormat simpleDateFormat = vu.a.f440046a;
            s15.h hVar = (s15.h) kz5.n0.Z(wVar.j());
            s15.h hVar2 = (s15.h) kz5.n0.k0(wVar.j());
            java.lang.String e17 = vu.a.e(wVar, hVar != null ? hVar.Q() : 0L);
            java.lang.String e18 = vu.a.e(wVar, hVar2 != null ? hVar2.Q() : 0L);
            if (com.tencent.mm.sdk.platformtools.t8.K0(e17) && (hVar == null || (e17 = hVar.O()) == null)) {
                e17 = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(e18) && (hVar2 == null || (e18 = hVar2.O()) == null)) {
                e18 = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(e17) || com.tencent.mm.sdk.platformtools.t8.K0(e18)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RecordDetailItemEx", "subtitle time error!");
            } else {
                java.util.List g17 = new r26.t(" ").g(e17, 0);
                boolean isEmpty = g17.isEmpty();
                java.util.List list2 = kz5.p0.f313996d;
                if (!isEmpty) {
                    java.util.ListIterator listIterator = g17.listIterator(g17.size());
                    while (listIterator.hasPrevious()) {
                        if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                            list = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = list2;
                java.lang.String a17 = vu.a.a(((java.lang.String[]) list.toArray(new java.lang.String[0]))[0]);
                java.util.List g18 = new r26.t(" ").g(e18, 0);
                if (!g18.isEmpty()) {
                    java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            break;
                        }
                        if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                            list2 = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                java.lang.String a18 = vu.a.a(((java.lang.String[]) list2.toArray(new java.lang.String[0]))[0]);
                if (kotlin.jvm.internal.o.b(a17, a18)) {
                    str2 = a17;
                } else {
                    str2 = a17 + ' ' + com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jyc) + ' ' + a18;
                }
            }
            setMMSubTitle(str2);
            setMMSubTitleColor(getContext().getColor(com.tencent.mm.R.color.FG_1));
            setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
            setBackBtn(new tu.a(this));
        }
        hideActionbarLine();
        java.lang.String stringExtra2 = getIntent().getStringExtra("params");
        if (stringExtra2 == null) {
            finish();
            return;
        }
        hu.f fVar3 = new hu.f();
        fVar3.fromJsonStr(stringExtra2);
        boolean s17 = fVar3.s();
        if (s17) {
            addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new tu.g(this, pt0.f0.f358209b1.k(fVar3.q(), fVar3.n()), s17, fVar3));
        }
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(xu.k.class);
        set.add(xu.q.class);
        set.add(xu.p.class);
        set.add(xu.g.class);
    }
}
