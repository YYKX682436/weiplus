package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class i3 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        tp3.a.INSTANCE.d("<cmd><diagnostic><report><pthread/></report></diagnostic></cmd>");
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "PthreadHook report", 1).show();
    }
}
