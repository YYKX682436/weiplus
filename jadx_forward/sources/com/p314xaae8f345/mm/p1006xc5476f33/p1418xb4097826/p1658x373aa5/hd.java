package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class hd implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kd f213766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.id f213767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd f213768c;

    public hd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kd kdVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.id idVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd ddVar) {
        this.f213766a = kdVar;
        this.f213767b = idVar;
        this.f213768c = ddVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.nd
    public void a(cm2.k0 item, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15317x5870b165 view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (item.f124893v.m75939xb282bd08(21) != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeSuccessView", "#refreshView ops, click_button_action=" + item.f124893v.m75939xb282bd08(21) + ". can not do anything.");
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.kd kdVar = this.f213766a;
        java.lang.String str = kdVar.f214028q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.id idVar = this.f213767b;
        java.lang.String e17 = xy2.c.e(idVar.f213833d);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String str2 = item.f124895x;
        if (str2 == null) {
            str2 = "";
        }
        linkedList.add(str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dd ddVar = this.f213768c;
        s40.w0.Fa(w0Var, 0L, 0L, str, e17, null, linkedList, ddVar.f213423b, idVar.f213833d, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gd(item, view, kdVar, ddVar), 256, null);
    }
}
