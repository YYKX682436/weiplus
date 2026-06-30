package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036;

/* loaded from: classes8.dex */
public class c0 implements qf.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 f221076a;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var) {
        this.f221076a = b0Var;
    }

    @Override // qf.c
    public android.webkit.WebResourceResponse a(java.lang.String str) {
        java.lang.String replaceFirst;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameJsResourceProvider", "onResourceRequest, url = %s", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var = this.f221076a;
        boolean z17 = b0Var.m64580x8eda3bb() != null ? b0Var.m64580x8eda3bb().f523289d : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameScriptManager", "getGameScriptResponse");
        java.lang.String e17 = ik1.f.e("game.js");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            java.lang.String replaceFirst2 = e17.replaceFirst("#__usewepkg__#", java.lang.String.valueOf(z17));
            android.os.PowerManager powerManager = (android.os.PowerManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("power");
            java.lang.String replaceFirst3 = replaceFirst2.replaceFirst("#__lowPowerMode__#", java.lang.String.valueOf(powerManager != null ? powerManager.isPowerSaveMode() : false)).replaceFirst("#__lowPower__#", java.lang.String.valueOf(false));
            if (h53.j.d() != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\"");
                int ordinal = h53.j.d().f360591h.ordinal();
                sb6.append(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc : "destroyed" : "stopped" : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d : "inited" : "initing");
                sb6.append("\"");
                replaceFirst = replaceFirst3.replaceFirst("#__jscore_state__#", sb6.toString());
            } else {
                replaceFirst = replaceFirst3.replaceFirst("#__jscore_state__#", "\"none\"");
            }
            try {
                android.webkit.WebResourceResponse webResourceResponse = new android.webkit.WebResourceResponse("application/javascript", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, new java.io.ByteArrayInputStream(replaceFirst.getBytes(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("Cache-Control", "no-cache, no-store, must-revalidate");
                hashMap.put("Pragma", "no-cache");
                hashMap.put("Expires", "0");
                webResourceResponse.setResponseHeaders(hashMap);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameScriptManager", "getGameScriptResponse end");
                return webResourceResponse;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.GameScriptManager", "", e18);
            }
        }
        return null;
    }

    @Override // qf.c
    public java.lang.String b() {
        return "weixin://game.js";
    }
}
