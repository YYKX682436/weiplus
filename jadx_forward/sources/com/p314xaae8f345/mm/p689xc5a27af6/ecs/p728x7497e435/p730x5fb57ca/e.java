package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca;

/* loaded from: classes15.dex */
public class e implements com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.h f147292a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.j f147293b = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.j();

    public e(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.h hVar) {
        this.f147292a = hVar;
    }

    @Override // com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.n
    public void a(android.view.KeyEvent keyEvent, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.m mVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.k) mVar).a(false);
            return;
        }
        java.lang.Character a17 = this.f147293b.a(keyEvent.getUnicodeChar());
        boolean z17 = action != 0;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.h hVar = this.f147292a;
        hVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", z17 ? "keyup" : "keydown");
        hashMap.put("keymap", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        hashMap.put("flags", java.lang.Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", java.lang.Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", java.lang.Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", java.lang.Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.p.f34754x24728b, java.lang.Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", java.lang.Integer.valueOf(keyEvent.getMetaState()));
        if (a17 != null) {
            hashMap.put(ya.b.f77466x353cb09, a17.toString());
        }
        hashMap.put(ya.b.f77502x92235c1b, java.lang.Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", java.lang.Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", java.lang.Integer.valueOf(keyEvent.getRepeatCount()));
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.w wVar = hVar.f147308a;
        wVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextInputMethodDispatcher", "sendFlutterKeyEvent");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.t tVar = wVar.f147335b;
        if (tVar != null) {
            java.lang.String obj = new lc3.a0(kz5.c1.k(new jz5.l(ya.b.f77491x8758c4e1, "sendKeyEvent"), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, hashMap))).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "toString(...)");
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.u) tVar).f147332a, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d("keyBoardEvent", obj));
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.p730x5fb57ca.k) mVar).a(true);
    }
}
