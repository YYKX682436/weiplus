package com.tencent.mm.feature.ecs.nirvana.input;

/* loaded from: classes15.dex */
public class e implements com.tencent.mm.feature.ecs.nirvana.input.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.input.h f65759a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.input.j f65760b = new com.tencent.mm.feature.ecs.nirvana.input.j();

    public e(com.tencent.mm.feature.ecs.nirvana.input.h hVar) {
        this.f65759a = hVar;
    }

    @Override // com.tencent.mm.feature.ecs.nirvana.input.n
    public void a(android.view.KeyEvent keyEvent, com.tencent.mm.feature.ecs.nirvana.input.m mVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            ((com.tencent.mm.feature.ecs.nirvana.input.k) mVar).a(false);
            return;
        }
        java.lang.Character a17 = this.f65760b.a(keyEvent.getUnicodeChar());
        boolean z17 = action != 0;
        com.tencent.mm.feature.ecs.nirvana.input.h hVar = this.f65759a;
        hVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", z17 ? "keyup" : "keydown");
        hashMap.put("keymap", com.eclipsesource.mmv8.Platform.ANDROID);
        hashMap.put("flags", java.lang.Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", java.lang.Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", java.lang.Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", java.lang.Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put(com.tencent.mm.plugin.appbrand.jsapi.scanner.p.NAME, java.lang.Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", java.lang.Integer.valueOf(keyEvent.getMetaState()));
        if (a17 != null) {
            hashMap.put(ya.b.CHARACTER, a17.toString());
        }
        hashMap.put(ya.b.SOURCE, java.lang.Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", java.lang.Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", java.lang.Integer.valueOf(keyEvent.getRepeatCount()));
        com.tencent.mm.feature.ecs.nirvana.input.w wVar = hVar.f65775a;
        wVar.getClass();
        com.tencent.mars.xlog.Log.i("TextInputMethodDispatcher", "sendFlutterKeyEvent");
        com.tencent.mm.feature.ecs.nirvana.input.t tVar = wVar.f65802b;
        if (tVar != null) {
            java.lang.String obj = new lc3.a0(kz5.c1.k(new jz5.l(ya.b.METHOD, "sendKeyEvent"), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, hashMap))).toString();
            kotlin.jvm.internal.o.f(obj, "toString(...)");
            ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ui(((com.tencent.mm.feature.ecs.nirvana.input.u) tVar).f65799a, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase("keyBoardEvent", obj));
        }
        ((com.tencent.mm.feature.ecs.nirvana.input.k) mVar).a(true);
    }
}
