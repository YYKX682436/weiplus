package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ta extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa f190582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f190583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f190584f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f190585g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa xaVar, so2.j5 j5Var, android.view.View view, long j17) {
        super(2);
        this.f190582d = xaVar;
        this.f190583e = j5Var;
        this.f190584f = view;
        this.f190585g = j17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String m59273x80025a04;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) this.f190583e;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = intent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xa xaVar = this.f190582d;
        xaVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c(), xy2.c.e(xaVar.f187707d))) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = xaVar.f187707d;
            long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
            java.lang.String m59276x6c285d75 = abstractC14490x69736cb5.getFeedObject().m59276x6c285d75();
            r45.nw1 m59258xd0557130 = abstractC14490x69736cb5.getFeedObject().m59258xd0557130();
            if (m59258xd0557130 == null) {
                m59258xd0557130 = new r45.nw1();
            }
            c61.ub.Rf(ubVar, abstractActivityC21394xb3d2c0cf, m59251x5db1b11, m59276x6c285d75, m59258xd0557130, null, null, null, null, abstractC14490x69736cb5.g0(), null, null, 1776, null);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(abstractC14490x69736cb5);
            intent2.putExtra("CURRENT_FEED_ID", abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11());
            intent2.putExtra("LAUNCH_WITH_ANIM", booleanValue);
            jz5.l Ai = ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ai(arrayList, abstractC14490x69736cb5);
            java.util.List list = (java.util.List) Ai.f384366d;
            int intValue = ((java.lang.Number) Ai.f384367e).intValue();
            r45.wk0 wk0Var = new r45.wk0();
            java.lang.String str = "";
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            y74Var.set(1, java.lang.Integer.valueOf(xaVar.f187708e));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
            if (feedObject != null && (m59273x80025a04 = feedObject.m59273x80025a04()) != null) {
                str = m59273x80025a04;
            }
            y74Var.set(2, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2 = abstractC14490x69736cb5.getFeedObject();
            y74Var.set(5, feedObject2 != null ? feedObject2.getFeedObject() : null);
            wk0Var.set(6, y74Var);
            r45.ta4 ta4Var = new r45.ta4();
            java.util.LinkedList m75941xfb821914 = ta4Var.m75941xfb821914(20);
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "UserClick");
            qa4Var.set(1, java.lang.Long.valueOf(this.f190585g));
            m75941xfb821914.add(qa4Var);
            wk0Var.set(7, ta4Var);
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(xaVar.f187707d, intent2, list, intValue, wk0Var, null);
        }
        return jz5.f0.f384359a;
    }
}
