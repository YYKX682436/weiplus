package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b f210942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b activityC15013x60db486b) {
        super(2);
        this.f210942d = activityC15013x60db486b;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b activityC15013x60db486b = this.f210942d;
        r45.q21 item = activityC15013x60db486b.f210049v.getItem(intValue);
        rl5.r rVar = activityC15013x60db486b.f210052y;
        if (rVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
            throw null;
        }
        rVar.a();
        rl5.r rVar2 = activityC15013x60db486b.f210052y;
        if (rVar2 != null) {
            rVar2.h(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.n1(activityC15013x60db486b), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.o1(item, activityC15013x60db486b), com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
        throw null;
    }
}
