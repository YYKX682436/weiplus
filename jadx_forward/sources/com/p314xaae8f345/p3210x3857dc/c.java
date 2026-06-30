package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class c extends com.p314xaae8f345.p3210x3857dc.b {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.c f301750d;

    public static synchronized com.p314xaae8f345.p3210x3857dc.c z() {
        com.p314xaae8f345.p3210x3857dc.c cVar;
        synchronized (com.p314xaae8f345.p3210x3857dc.c.class) {
            if (f301750d == null) {
                com.p314xaae8f345.p3210x3857dc.c cVar2 = new com.p314xaae8f345.p3210x3857dc.c();
                f301750d = cVar2;
                cVar2.q();
            }
            cVar = f301750d;
        }
        return cVar;
    }

    public final java.lang.String A() {
        if ("appbrand".equalsIgnoreCase(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m("tools"))) {
            by5.c4.f("CommandCfgPlugin", "getSafeModuleForFileReader, use module appbrand");
            return "appbrand";
        }
        by5.c4.f("CommandCfgPlugin", "getSafeModuleForFileReader, use module tools");
        return "tools";
    }

    @Override // com.p314xaae8f345.p3210x3857dc.b
    public void b(by5.h[] hVarArr, java.lang.String str, boolean z17) {
        java.lang.String str2;
        if (str == null) {
            by5.c4.f("CommandCfgPlugin", "applyCommandInternal, invalid configVersion");
            return;
        }
        by5.c4.f("CommandCfgPlugin", "applyCommandInternal, configVersion:" + str + ", isRecheck:" + z17);
        e();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (hVarArr == null || hVarArr.length == 0) {
            by5.c4.g("CommandCfgPlugin", "applyCommandInternal, empty new command configs");
            t(str, hashMap);
            return;
        }
        for (int i17 = 0; i17 < hVarArr.length; i17++) {
            by5.h hVar = hVarArr[i17];
            if (hVar != null && (!z17 || !"revertToVersion".equals(hVar.f118005b))) {
                by5.c4.f("CommandCfgPlugin", ">>> applyCommand, command[" + i17 + "]:" + hVarArr[i17]);
                if (!hVarArr[i17].f118004a.a(false, false, "CommandCfgPlugin")) {
                    by5.c4.g("CommandCfgPlugin", "<<< applyCommand, command[" + i17 + "] not match");
                } else if (by5.f.a(hVarArr[i17]).f301738a) {
                    by5.c4.f("CommandCfgPlugin", "<<< applyCommand, command[" + i17 + "] handled");
                } else {
                    by5.h hVar2 = hVarArr[i17];
                    if (hVar2.f118006c != null && (str2 = hVar2.f118007d) != null && !str2.isEmpty()) {
                        by5.c4.g("CommandCfgPlugin", "<<< applyCommand, apply command[" + i17 + "]:" + a(hVarArr[i17], hashMap, hVarArr[i17].f118007d.split(",")));
                    }
                }
            }
        }
        t(str, hashMap);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.b
    public java.lang.String n() {
        return "CommandCfgPlugin";
    }

    @Override // com.p314xaae8f345.p3210x3857dc.b
    public android.content.SharedPreferences o() {
        return by5.d4.a("XWEB.CMDCFG.PLUGIN", false);
    }

    @Override // com.p314xaae8f345.p3210x3857dc.b
    public android.content.SharedPreferences p() {
        return by5.d4.a("XWEB.CMDCFG.PLUGIN.LATEST", false);
    }

    public boolean v(boolean z17) {
        try {
            java.lang.String g17 = g("download_when_not_install", A());
            if (g17 != null && !g17.isEmpty()) {
                return java.lang.Boolean.parseBoolean(g17);
            }
            by5.c4.f("CommandCfgPlugin", "canDownloadWhenNotInstall cmd is empty, return defValue = " + z17);
            return z17;
        } catch (java.lang.Throwable th6) {
            by5.c4.c("CommandCfgPlugin", "canDownloadWhenNotInstall error, return defValue = " + z17 + ", errorMsg = " + th6.getMessage());
            return z17;
        }
    }

    public com.p314xaae8f345.p3210x3857dc.i w(java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.i iVar = com.p314xaae8f345.p3210x3857dc.i.auto;
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    java.lang.String g17 = g("audio_player_strategy_" + str.toLowerCase(), A());
                    if (g17 != null && !g17.isEmpty()) {
                        return com.p314xaae8f345.p3210x3857dc.i.m120259xdce0328(g17);
                    }
                    return iVar;
                }
            } catch (java.lang.Throwable th6) {
                by5.c4.c("CommandCfgPlugin", "getAudioPlayerStrategy error:" + th6.getMessage());
            }
        }
        return iVar;
    }

    public com.p314xaae8f345.p3210x3857dc.m x(java.lang.String str, java.lang.String str2) {
        java.lang.String g17 = g("use_office_reader_" + str.toLowerCase(), str2);
        com.p314xaae8f345.p3210x3857dc.m mVar = com.p314xaae8f345.p3210x3857dc.m.none;
        if (g17 == null) {
            return mVar;
        }
        if (!g17.isEmpty()) {
            try {
            } catch (java.lang.Throwable unused) {
                return mVar;
            }
        }
        return com.p314xaae8f345.p3210x3857dc.m.m120276xdce0328(g17);
    }

    public com.p314xaae8f345.p3210x3857dc.k y(java.lang.String str, java.lang.String str2) {
        java.lang.String g17 = g("fr_" + str.toLowerCase(), str2);
        com.p314xaae8f345.p3210x3857dc.k kVar = com.p314xaae8f345.p3210x3857dc.k.NONE;
        if (g17 == null) {
            return kVar;
        }
        if (!g17.isEmpty()) {
            try {
            } catch (java.lang.Throwable unused) {
                return kVar;
            }
        }
        return com.p314xaae8f345.p3210x3857dc.k.m120272xdce0328(g17);
    }
}
