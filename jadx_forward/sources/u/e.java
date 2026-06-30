package u;

/* loaded from: classes16.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376 f504925d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376 c13151x881fe376) {
        this.f504925d = c13151x881fe376;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/combine/uic/CombineFooterBarUIC$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bw5.nk0 nk0Var = new bw5.nk0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376 c13151x881fe376 = this.f504925d;
        int i17 = c13151x881fe376.J6;
        cj0.a aVar = cj0.a.f123386a;
        boolean[] zArr = nk0Var.f112255r;
        if (i17 == 1) {
            nk0Var.i(bw5.qk0.SNS_VISIBILITY_VISIBLE);
            java.util.LinkedList e17 = aVar.e(c13151x881fe376.H6);
            nk0Var.f112247g = e17;
            zArr[4] = true;
            nk0Var.h(e17.size());
            java.util.ArrayList arrayList2 = c13151x881fe376.G6;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next())));
            }
            java.util.LinkedList j17 = aVar.j(new java.util.LinkedList(arrayList3));
            nk0Var.f112245e = j17;
            zArr[2] = true;
            nk0Var.f112246f = j17.size();
            zArr[3] = true;
            java.util.ArrayList<java.lang.String> userNameList = c13151x881fe376.I6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (java.lang.String str : userNameList) {
                bw5.ok0 ok0Var = new bw5.ok0();
                ok0Var.f112671d = str;
                boolean[] zArr2 = ok0Var.f112673f;
                zArr2[1] = true;
                ok0Var.f112672e = aVar.m(str);
                zArr2[2] = true;
                linkedList.add(ok0Var);
            }
            nk0Var.f112253p = linkedList;
            zArr[10] = true;
            nk0Var.a(linkedList.size());
        } else {
            nk0Var.i(bw5.qk0.SNS_VISIBILITY_INVISIBLE);
            java.util.LinkedList e18 = aVar.e(c13151x881fe376.H6);
            nk0Var.f112253p = e18;
            zArr[10] = true;
            nk0Var.a(e18.size());
            java.util.ArrayList arrayList4 = c13151x881fe376.G6;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
            java.util.Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                arrayList5.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it6.next())));
            }
            java.util.LinkedList j18 = aVar.j(new java.util.LinkedList(arrayList5));
            nk0Var.f112251n = j18;
            zArr[8] = true;
            nk0Var.f112252o = j18.size();
            zArr[9] = true;
            java.util.ArrayList<java.lang.String> userNameList2 = c13151x881fe376.I6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList2, "userNameList");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            for (java.lang.String str2 : userNameList2) {
                bw5.ok0 ok0Var2 = new bw5.ok0();
                ok0Var2.f112671d = str2;
                boolean[] zArr3 = ok0Var2.f112673f;
                zArr3[1] = true;
                ok0Var2.f112672e = aVar.m(str2);
                zArr3[2] = true;
                linkedList2.add(ok0Var2);
            }
            nk0Var.f112247g = linkedList2;
            zArr[4] = true;
            nk0Var.h(nk0Var.f112253p.size());
        }
        android.app.Activity context = c13151x881fe376.m80379x76847179();
        u.d dVar = new u.d(c13151x881fe376);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new n.n(null, nk0Var, 0L, 1, context, dVar, null), 3, null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("button_50479", "view_clk", kz5.c1.k(new jz5.l("post_session_id", ca4.z0.l()), new jz5.l("50479_btn_type", 3)), 36244);
        yj0.a.h(this, "com/tencent/mm/plugin/combine/uic/CombineFooterBarUIC$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
