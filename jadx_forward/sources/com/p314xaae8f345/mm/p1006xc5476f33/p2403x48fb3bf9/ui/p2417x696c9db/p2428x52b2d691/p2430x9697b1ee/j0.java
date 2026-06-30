package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee;

/* loaded from: classes8.dex */
public final class j0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267722e;

    public j0(nw4.k kVar, nw4.y2 y2Var) {
        this.f267721d = kVar;
        this.f267722e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19471x4b33ba9 c19471x4b33ba9 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19471x4b33ba9) obj;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        boolean z17 = c19471x4b33ba9.f267689e;
        nw4.y2 y2Var = this.f267722e;
        nw4.k kVar = this.f267721d;
        java.lang.String str = c19471x4b33ba9.f267690f;
        if (!z17) {
            kVar.f422396d.e(y2Var.f422546c, "gamelifeManager:fail " + str, null);
            return;
        }
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19465x658e4e73> list = c19471x4b33ba9.f267688d;
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2430x9697b1ee.C19465x658e4e73 c19465x658e4e73 : list) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("toUsername", c19465x658e4e73.f267658d);
                hashMap2.put("fromUsername", c19465x658e4e73.f267659e);
                hashMap2.put("messageTime", java.lang.Double.valueOf(c19465x658e4e73.f267660f));
                hashMap2.put("content", c19465x658e4e73.f267661g);
                hashMap2.put("localMsgId", java.lang.Integer.valueOf(c19465x658e4e73.f267662h));
                hashMap2.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, c19465x658e4e73.f267663i);
                hashMap2.put("uiSendingStatus", java.lang.Integer.valueOf(c19465x658e4e73.f267664m));
                hashMap2.put("msgSource", c19465x658e4e73.f267665n);
                hashMap2.put("appId", c19465x658e4e73.f267666o);
                hashMap2.put("messageType", java.lang.Integer.valueOf(c19465x658e4e73.f267667p));
                hashMap2.put("rawMsgType", java.lang.Integer.valueOf(c19465x658e4e73.f267668q));
                arrayList.add(java.lang.Boolean.valueOf(linkedList.add(nw4.x2.b(hashMap2))));
            }
            hashMap.put("messageList", linkedList);
        }
        kVar.f422396d.e(y2Var.f422546c, "gamelifeManager:ok " + str, hashMap);
    }
}
