package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class d3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f260893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ys4.g f260894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 f260895c;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, ys4.g gVar) {
        this.f260895c = activityC19082x760c9ba5;
        this.f260893a = z2Var;
        this.f260894b = gVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        this.f260893a.B();
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5 = this.f260895c;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(22, 1, i17, activityC19082x760c9ba5.U);
        activityC19082x760c9ba5.getClass();
        android.content.Intent intent = new android.content.Intent(activityC19082x760c9ba5.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.class);
        ys4.g gVar = this.f260894b;
        intent.putExtra("under_age_session_id", gVar.f546774p);
        intent.putExtra("under_age_msg_preview_text", gVar.f546775q);
        activityC19082x760c9ba5.startActivityForResult(intent, 5);
    }
}
