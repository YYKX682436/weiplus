package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public abstract class o {
    public static boolean a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9) {
        java.util.List wi6;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.c()) {
            return false;
        }
        java.lang.String str3 = null;
        try {
            wi6 = ((g60.e) ((h60.i) i95.n0.c(h60.i.class))).wi();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadChecker", "err: %s", e17.getMessage());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(wi6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "raw check url: [ %s ], no regex to intercept", str);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "raw check url: [ %s ], have (%d) regexes to intercept", str, java.lang.Integer.valueOf(wi6.size()));
        java.util.Iterator it = wi6.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str4 = (java.lang.String) it.next();
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(str4).matcher(str.trim());
            if (matcher.find()) {
                str3 = matcher.group();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "match the regex: %s", str4);
                break;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            return false;
        }
        if (!((qk.s6) gm0.j1.s(qk.s6.class)).mo13794x74219ae7()) {
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(c27816xac2547f9);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("download_url", str3);
            bundle.putString("main_url", c27816xac2547f9.mo120156xb5887639());
            bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, str2);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.p800x7643c6b5.ServiceC10768xcfd1c1ef.f149992e, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.n.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j(weakReference, str));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadChecker", "checkDownload isTeenMode and ignore downloadUrl: %s", str3);
        if (c27816xac2547f9 != null && c27816xac2547f9.getContext() != null) {
            te0.e eVar = (te0.e) i95.n0.c(te0.e.class);
            android.content.Context context = c27816xac2547f9.getContext();
            ((se0.e) eVar).getClass();
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
        }
        return true;
    }
}
