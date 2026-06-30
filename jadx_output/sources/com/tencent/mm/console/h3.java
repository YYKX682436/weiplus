package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class h3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        tp3.a.INSTANCE.d("<cmd><diagnostic><PthreadHook enable='1' source='push' multiprocess='0' duration='24' hook='.*\\.so$' force='1' thread='.*'/></diagnostic></cmd>");
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "PthreadHook enable", 1).show();
    }
}
