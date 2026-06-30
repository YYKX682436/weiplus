package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class t5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 f211394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078) {
        super(2);
        this.f211394d = activityC15029x292078;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078 = this.f211394d;
        if (!activityC15029x292078.f210101v.getItem(intValue).m75933x41a8a7f2(3)) {
            r45.q21 item = activityC15029x292078.f210101v.getItem(intValue);
            rl5.r rVar = activityC15029x292078.f210104y;
            if (rVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
                throw null;
            }
            rVar.a();
            rl5.r rVar2 = activityC15029x292078.f210104y;
            if (rVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("popupMenu");
                throw null;
            }
            rVar2.h(view, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.x5(activityC15029x292078), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.z5(item, activityC15029x292078), com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
        }
        return jz5.f0.f384359a;
    }
}
