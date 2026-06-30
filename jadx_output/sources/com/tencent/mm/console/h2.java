package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class h2 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (!z65.c.a() && !com.tencent.mm.sdk.platformtools.s9.f192974b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Shell", "Environment denied: not coolassist or monkey env");
            return;
        }
        java.lang.String str = "<cmd><diagnostic><MemoryHook enable='" + com.tencent.mm.console.p0.a(intent.getStringExtra("enable"), "0") + "' source='push' process='all' duration='" + com.tencent.mm.console.p0.a(intent.getStringExtra("duration"), "1") + "' hook='" + com.tencent.mm.console.p0.a(intent.getStringExtra("hook"), ".*com\\.tencent\\.mm.*\\.so$") + "' ignore='" + com.tencent.mm.console.p0.a(intent.getStringExtra("ignore"), "") + "' stack='" + com.tencent.mm.console.p0.a(intent.getStringExtra("stack"), "0") + "' min='" + com.tencent.mm.console.p0.a(intent.getStringExtra("min"), "0") + "' max='" + com.tencent.mm.console.p0.a(intent.getStringExtra("max"), "0") + "' force='" + com.tencent.mm.console.p0.a(intent.getStringExtra("force"), "0") + "' sampling='" + com.tencent.mm.console.p0.a(intent.getStringExtra("sampling"), "1") + "' extreme='" + com.tencent.mm.console.p0.a(intent.getStringExtra("extreme"), "0") + "' mmap='" + com.tencent.mm.console.p0.a(intent.getStringExtra("mmap"), "0") + "'/></diagnostic></cmd>";
        tp3.a.INSTANCE.d(str);
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, str, 0).show();
    }
}
