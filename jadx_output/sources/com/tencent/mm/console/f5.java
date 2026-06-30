package com.tencent.mm.console;

/* loaded from: classes10.dex */
public class f5 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        com.tencent.mm.autogen.events.HotPatchApplyEvent hotPatchApplyEvent = new com.tencent.mm.autogen.events.HotPatchApplyEvent();
        java.lang.String string = intent.getExtras().getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "/data/local/tmp/test.apk");
        am.oh ohVar = hotPatchApplyEvent.f54439g;
        ohVar.f7537e = string;
        com.tencent.mars.xlog.Log.w("MicroMsg.Shell", "hotpatch test [%s]", ohVar.f7537e);
        hotPatchApplyEvent.e();
    }
}
