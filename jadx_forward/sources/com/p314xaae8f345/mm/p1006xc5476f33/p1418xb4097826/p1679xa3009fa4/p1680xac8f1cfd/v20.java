package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class v20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f217731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f217732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f217733f;

    public v20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var) {
        this.f217731d = f50Var;
        this.f217732e = jbVar;
        this.f217733f = f03Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.f03 f03Var;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f217731d;
        zy2.zb.qd(zbVar, 2, ((im2.p4) f50Var.e7()).f374030q.f544542b, ((im2.p4) f50Var.e7()).f374030q.f544543c, null, 8, null);
        zy2.m8 e76 = f50Var.e7();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("POST_BTN_CLICK_SCENE_KEY", 1);
        ((im2.p4) e76).R6(intent);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.j0.f409116i.m(ml2.y3.f409803e);
        i95.m c18 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        zy2.zb zbVar2 = (zy2.zb) c18;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar2, 2L, "", null, 4, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f217732e;
        if (jbVar != null && (f03Var = this.f217733f) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = f50Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "4", jbVar, f03Var, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("finderprofile.startlive");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("FinderEntrance", new int[]{1010});
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("TLPersonalCenter", new int[]{1010});
            c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
            ml2.c1 c1Var2 = ml2.c1.f408858e;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            r45.vs2 vs2Var = jbVar.f65874xb5f7102a;
            if (vs2Var == null || (str = vs2Var.f470023h) == null) {
                str = "";
            }
            jSONObject.put("reddot_id", str);
            jSONObject.put(ya.b.f77502x92235c1b, 1);
            ((b92.g1) acVar).Ni(60L, jSONObject);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
