package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public final class ww extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f186443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f186444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f186445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f186446g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f186447h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f186448i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f186449m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(com.p314xaae8f345.mm.p944x882e457a.f fVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, android.view.View view, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, java.util.ArrayList arrayList) {
        super(0);
        this.f186443d = fVar;
        this.f186444e = h0Var;
        this.f186445f = c22801x87cbdc00;
        this.f186446g = view;
        this.f186447h = context;
        this.f186448i = y1Var;
        this.f186449m = arrayList;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.util.LinkedList<r45.pg2> m75941xfb8219143;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f186443d;
        int i17 = fVar.f152148a;
        android.content.Context context = this.f186447h;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.n81 n81Var = (r45.n81) fVar.f152151d;
            this.f186444e.f391656d = n81Var.m75934xbce7f2f(2);
            r45.wg2 wg2Var = (r45.wg2) ((r45.n81) fVar.f152151d).m75936x14adae67(1);
            int i18 = 0;
            if (wg2Var != null && (m75941xfb8219143 = wg2Var.m75941xfb821914(0)) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (r45.pg2 pg2Var : m75941xfb8219143) {
                    cu2.a0 a0Var = cu2.b0.f303904a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pg2Var);
                    arrayList.add(a0Var.k(1, pg2Var, xy2.c.e(context)));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new so2.y((dm.pd) it.next()));
                }
                this.f186449m.addAll(arrayList2);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh mentionList: ");
            r45.wg2 wg2Var2 = (r45.wg2) ((r45.n81) fVar.f152151d).m75936x14adae67(1);
            sb6.append((wg2Var2 == null || (m75941xfb8219142 = wg2Var2.m75941xfb821914(0)) == null) ? null : java.lang.Integer.valueOf(m75941xfb8219142.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSupportAggregatedMsgConvert", sb6.toString());
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f186445f;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22801x87cbdc00.m82555x4905e9fa().mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            android.view.View view = this.f186446g;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert$showAggregatedMentionList$1$5$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert$showAggregatedMentionList$1$5$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            db5.t7.m(context, fVar.f152150c);
            this.f186448i.q();
        }
        return jz5.f0.f384359a;
    }
}
