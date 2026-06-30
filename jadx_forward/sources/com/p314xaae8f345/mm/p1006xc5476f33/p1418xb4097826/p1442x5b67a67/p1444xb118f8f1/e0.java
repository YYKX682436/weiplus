package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class e0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public r45.qj2 f186750d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f186751e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f186752f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f186753g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f186754h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f186755i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f186756m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f186757n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f186758o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f186759p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f186760q;

    /* renamed from: r, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f186761r;

    /* renamed from: s, reason: collision with root package name */
    public int f186762s;

    /* renamed from: t, reason: collision with root package name */
    public long f186763t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f186764u;

    /* renamed from: v, reason: collision with root package name */
    public long f186765v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f186766w;

    /* renamed from: x, reason: collision with root package name */
    public int f186767x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f186758o = new java.util.ArrayList();
        this.f186759p = new java.util.ArrayList();
        this.f186760q = new java.util.ArrayList();
        this.f186766w = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.b0.f186733d);
    }

    public final void O6(r45.qj2 qj2Var) {
        android.widget.FrameLayout frameLayout = this.f186751e;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f186752f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f186753g;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        android.app.Activity m80379x76847179 = m80379x76847179();
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = m80379x76847179 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m80379x76847179 : null;
        boolean z17 = (abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.m81193x1252e2cf() : null) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f;
        long longExtra = m158359x1e885992().getLongExtra("native_drama_enter_object_id", 0L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("native_drama_enter_dupflag");
        int intExtra = m158359x1e885992().getIntExtra("native_drama_enter_promotion_comment_scene", -1);
        km5.d T = pm0.v.T(new bq.s0(V6, qj2Var.m75942xfb822ef2(0), this.f186763t, z17 ? longExtra : 0L, (!z17 || intExtra == -1) ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(longExtra, stringExtra, intExtra), m158359x1e885992().getStringExtra("native_drama_session_buffer")).l(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.x(this, qj2Var, longExtra, stringExtra));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        T.f(m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null);
    }

    public final void P6(int i17) {
        java.util.ArrayList arrayList = this.f186759p;
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            r45.bn2 bn2Var = (r45.bn2) ((zb2.b) it.next()).f552791d.m75936x14adae67(1);
            if (bn2Var != null && bn2Var.m75939xb282bd08(2) == i17) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 >= 0) {
            this.f186765v = ((zb2.b) arrayList.get(i18)).f552791d.m75942xfb822ef2(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c0(m80379x76847179());
            c0Var.f93582a = i18;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f186755i;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("episodeRv");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.m8099x6305639d(c0Var);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f567620uk2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f186751e = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.oai);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f186752f = findViewById2;
        android.view.View findViewById3 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.oav);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f186753g = findViewById3;
        android.view.View findViewById4 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.t8f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f186755i = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById4;
        android.view.View findViewById5 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.uwh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f186761r = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById5;
        android.view.View findViewById6 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.uxe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f186756m = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById6;
        android.view.View findViewById7 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f565663t53);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f186754h = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f565666t56);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f186757n = (android.view.ViewGroup) findViewById8;
        com.p314xaae8f345.mm.ui.bk.s0(((android.widget.TextView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.f565664t54)).getPaint());
        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.qj2().mo11468x92b714fd(m158359x1e885992().getByteArrayExtra("native_drama_info"));
        r45.qj2 qj2Var = mo11468x92b714fd instanceof r45.qj2 ? (r45.qj2) mo11468x92b714fd : null;
        this.f186750d = qj2Var;
        if (qj2Var != null) {
            this.f186763t = m158359x1e885992().getLongExtra("native_drama_object_id", 0L);
            this.f186764u = m158359x1e885992().getStringExtra("native_drama_object_dup_flag");
            this.f186765v = this.f186763t;
            O6(qj2Var);
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            long m75942xfb822ef2 = qj2Var.m75942xfb822ef2(0);
            long j17 = this.f186763t;
            java.lang.String str = this.f186764u;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.z zVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.z(this, qj2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.a0 a0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.a0.f186731d;
            pq5.g l17 = new bq.c1(V6, m75942xfb822ef2, 0, null, j17, str).l();
            l17.f(abstractActivityC21394xb3d2c0cf);
            pm0.v.T(l17, new cq.b1(zVar2, a0Var));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f186758o = new java.util.ArrayList();
        this.f186759p = new java.util.ArrayList();
        this.f186760q = new java.util.ArrayList();
        this.f186766w = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.b0.f186733d);
    }
}
