package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class h2 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String str = "<cmd><diagnostic><MemoryHook enable='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("enable"), "0") + "' source='push' process='all' duration='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("duration"), "1") + "' hook='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("hook"), ".*com\\.tencent\\.mm.*\\.so$") + "' ignore='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("ignore"), "") + "' stack='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("stack"), "0") + "' min='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("min"), "0") + "' max='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("max"), "0") + "' force='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("force"), "0") + "' sampling='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("sampling"), "1") + "' extreme='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("extreme"), "0") + "' mmap='" + com.p314xaae8f345.mm.p669x38b6e557.p0.a(intent.getStringExtra("mmap"), "0") + "'/></diagnostic></cmd>";
        tp3.a.INSTANCE.d(str);
        dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str, 0).show();
    }
}
