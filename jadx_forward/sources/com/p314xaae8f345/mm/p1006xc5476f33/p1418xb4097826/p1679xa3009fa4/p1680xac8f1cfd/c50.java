package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class c50 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f215493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f215494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f215495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f215496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f215497h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f215498i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f215499m;

    public c50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var, int i17, int i18, int i19, int i27) {
        this.f215493d = jbVar;
        this.f215494e = f03Var;
        this.f215495f = f50Var;
        this.f215496g = i17;
        this.f215497h = i18;
        this.f215498i = i19;
        this.f215499m = i27;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.f03 f03Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$updateFinderMemberMentionRedDot$memberMsgAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f215495f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f215493d;
        if (jbVar != null && (f03Var = this.f215494e) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = f50Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(x2Var, "4", jbVar, f03Var, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().X("AuthorProfileMemberNotify", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.b50.f215371d, false, f50Var.f215871d);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("vipCnt", this.f215497h);
        jSONObject.put("commentCnt", this.f215498i);
        jSONObject.put("likeCnt", this.f215499m);
        int i17 = this.f215496g;
        jSONObject.put("totalCnt", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = f50Var.m158354x19263085();
        long j17 = f50Var.G;
        boolean z17 = f50Var.E;
        boolean z18 = i17 > 0;
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        o3Var.Jj(m158354x19263085, j17, z17, 2L, 12L, z18, i17, r26.i0.t(jSONObject2, ",", ";", false), f50Var.f215871d);
        android.content.Intent intent = new android.content.Intent();
        ya2.b2 b17 = ya2.h.f542017a.b(xy2.c.e(f50Var.m80379x76847179()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
        if (b17.G0()) {
            intent.setClass(f50Var.m158354x19263085(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15028x68e5fbe.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = f50Var.m158354x19263085();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m158354x192630852, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$updateFinderMemberMentionRedDot$memberMsgAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            m158354x192630852.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(m158354x192630852, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$updateFinderMemberMentionRedDot$memberMsgAreaClickListener$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, f50Var.m158354x19263085(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).Rj(f50Var.m158354x19263085(), intent);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$updateFinderMemberMentionRedDot$memberMsgAreaClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
