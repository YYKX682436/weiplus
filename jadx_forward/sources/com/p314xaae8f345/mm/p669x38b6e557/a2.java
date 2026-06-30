package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class a2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
        } else {
            tp3.a.INSTANCE.d("<cmd><diagnostic><MemoryHook enable='1' source='push' process='all' duration='24' hook='.*com\\.tencent\\.mm.*\\.so$;.*libhwui\\.so$;.*libEGL\\.so$;.*libGLES.*\\.so$;.*libstagefright_foundation\\.so$;.*libstagefright\\.so$;.*libandroidfw\\.so$' stack='1' min='0' max='0' force='1' enableExpt='0' sampling='1' mmap='0'/></diagnostic></cmd>");
            dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "Hook MM so", 0).show();
        }
    }
}
