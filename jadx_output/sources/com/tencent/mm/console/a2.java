package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class a2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        } else {
            tp3.a.INSTANCE.d("<cmd><diagnostic><MemoryHook enable='1' source='push' process='all' duration='24' hook='.*com\\.tencent\\.mm.*\\.so$;.*libhwui\\.so$;.*libEGL\\.so$;.*libGLES.*\\.so$;.*libstagefright_foundation\\.so$;.*libstagefright\\.so$;.*libandroidfw\\.so$' stack='1' min='0' max='0' force='1' enableExpt='0' sampling='1' mmap='0'/></diagnostic></cmd>");
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "Hook MM so", 0).show();
        }
    }
}
