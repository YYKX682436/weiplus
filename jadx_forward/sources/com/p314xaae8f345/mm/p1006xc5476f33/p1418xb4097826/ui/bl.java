package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class bl extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f210491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f210492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f210493f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210494g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15084x4121bf5 f210495h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(com.p314xaae8f345.mm.p944x882e457a.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15084x4121bf5 activityC15084x4121bf5) {
        super(0);
        this.f210491d = fVar;
        this.f210492e = h0Var;
        this.f210493f = c22801x87cbdc00;
        this.f210494g = view;
        this.f210495h = activityC15084x4121bf5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList<r45.pg2> m75941xfb8219143;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f210491d;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15084x4121bf5 activityC15084x4121bf5 = this.f210495h;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.n81 n81Var = (r45.n81) fVar.f152151d;
            this.f210492e.f391656d = n81Var.m75934xbce7f2f(2);
            r45.wg2 wg2Var = (r45.wg2) ((r45.n81) fVar.f152151d).m75936x14adae67(1);
            int i18 = 0;
            if (wg2Var != null && (m75941xfb8219143 = wg2Var.m75941xfb821914(0)) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (r45.pg2 pg2Var : m75941xfb8219143) {
                    cu2.a0 a0Var = cu2.b0.f303904a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pg2Var);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15084x4121bf5.mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    arrayList.add(a0Var.k(1, pg2Var, xy2.c.e(mo55332x76847179)));
                }
                java.util.ArrayList arrayList2 = activityC15084x4121bf5.f210332t;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new so2.o3((dm.pd) it.next()));
                }
                arrayList2.addAll(arrayList3);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh mentionList: ");
            r45.wg2 wg2Var2 = (r45.wg2) ((r45.n81) fVar.f152151d).m75936x14adae67(1);
            sb6.append((wg2Var2 == null || (m75941xfb8219142 = wg2Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWxProfileJumpDetailUI", sb6.toString());
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f210493f;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22801x87cbdc00.m82555x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            android.view.View view = this.f210494g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/ui/FinderWxProfileJumpDetailUI$onCreate$5$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderWxProfileJumpDetailUI$onCreate$5$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (n81Var.m75939xb282bd08(6) == 1) {
                r45.wg2 wg2Var3 = (r45.wg2) n81Var.m75936x14adae67(1);
                if (wg2Var3 != null && (m75941xfb821914 = wg2Var3.m75941xfb821914(0)) != null) {
                    i18 = m75941xfb821914.size();
                }
                c22801x87cbdc00.P(i18);
            } else {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.I(c22801x87cbdc00, null, 1, null);
            }
        } else {
            db5.t7.m(activityC15084x4121bf5.mo55332x76847179(), fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
