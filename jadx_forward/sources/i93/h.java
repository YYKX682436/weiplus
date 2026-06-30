package i93;

/* loaded from: classes11.dex */
public class h implements com.p314xaae8f345.mm.ui.p2740x696c9db.b9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 f371283d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 activityC16176xdf6c8530) {
        this.f371283d = activityC16176xdf6c8530;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void H0() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void P4(java.lang.String str) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelSearchUI", "onSearchChange: %s", str);
        boolean isEmpty = android.text.TextUtils.isEmpty(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1792xdec7722c.ActivityC16176xdf6c8530 activity = this.f371283d;
        if (isEmpty) {
            activity.f224919d.setVisibility(4);
        } else {
            activity.f224919d.setVisibility(0);
        }
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2559xed8e89a9.C20615x8ee66c89()) == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            i93.d dVar = (i93.d) pf5.z.f435481a.a(activity).a(i93.d.class);
            dVar.getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(dVar.f371258e);
            p13.c cVar = dVar.f371258e;
            if (cVar != null) {
                cVar.n();
            }
            p13.u uVar = new p13.u();
            uVar.f432673b = 100;
            uVar.f432674c = str;
            uVar.f432678g = o13.d.f423759l;
            uVar.f432684m = dVar;
            uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) dVar.f371257d).mo141623x754a37bb();
            dVar.f371258e = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSLabelSearchUIC", "SearchLabelByContact searchLabel: %s", str);
        } else {
            i93.e eVar = activity.f224927o;
            android.util.SparseArray sparseArray = eVar.f371276w;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = str == null ? "" : str;
            eVar.f371271r = str2;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                eVar.z(eVar.f371269p);
            } else {
                eVar.z(b93.r.wi().K1(str));
            }
        }
        if (activity.f224922g == 1) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (arrayList = activity.f224927o.f371260d) != null && arrayList.size() != 0) {
                android.view.View view = activity.f224929q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$3", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$3", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            activity.f224926n.setText(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572026wm));
            activity.f224925m = false;
            android.view.View view2 = activity.f224929q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$3", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/searchLabel/LabelSearchUI$3", "onSearchChange", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void V5() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void Z2() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f371283d.f224930r;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public boolean n5(java.lang.String str) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.b9
    public void v() {
    }
}
