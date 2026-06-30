package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

/* loaded from: classes4.dex */
public final class h0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267718e;

    public h0(nw4.k kVar, nw4.y2 y2Var) {
        this.f267717d = kVar;
        this.f267718e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19469xc5d71a31 c19469xc5d71a31 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19469xc5d71a31) obj;
        boolean z17 = c19469xc5d71a31.f267684f;
        nw4.y2 y2Var = this.f267718e;
        nw4.k kVar = this.f267717d;
        java.lang.String str = c19469xc5d71a31.f267683e;
        if (!z17) {
            kVar.f422396d.e(y2Var.f422546c, "gamelifeManager:fail " + str, null);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19466x3fbac4fb> list = c19469xc5d71a31.f267682d;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19466x3fbac4fb c19466x3fbac4fb : list) {
                arrayList.add(java.lang.Boolean.valueOf(linkedList.add(nw4.x2.b(kz5.c1.k(new jz5.l(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, c19466x3fbac4fb.f267669d), new jz5.l("unreadCount", java.lang.Integer.valueOf(c19466x3fbac4fb.f267670e)), new jz5.l("lastMsgUpdateTime", java.lang.Integer.valueOf(c19466x3fbac4fb.f267671f)), new jz5.l("draftMsg", c19466x3fbac4fb.f267672g), new jz5.l("draftMsgTime", java.lang.Integer.valueOf(c19466x3fbac4fb.f267673h)), new jz5.l("selfUsername", c19466x3fbac4fb.f267674i), new jz5.l("talker", c19466x3fbac4fb.f267675m), new jz5.l("digest", c19466x3fbac4fb.f267676n))))));
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("conversationList", linkedList);
        kVar.f422396d.e(y2Var.f422546c, "gamelifeManager:ok " + str, hashMap);
    }
}
