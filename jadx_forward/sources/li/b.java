package li;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.IBinder f400274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ li.c f400275e;

    public b(li.c cVar, android.os.IBinder iBinder) {
        this.f400275e = cVar;
        this.f400274d = iBinder;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.c aVar;
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.c cVar;
        li.d dVar = this.f400275e.f400276d;
        dVar.getClass();
        ?? r37 = "destory test process";
        java.lang.String str3 = "";
        oj.j.b("matrix.OpenglLeakPlugin", "onServiceConnected", new java.lang.Object[0]);
        if (dVar.f400279i) {
            return;
        }
        int i17 = com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.b.f134452d;
        android.os.IBinder iBinder = this.f400274d;
        if (iBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.c)) ? new com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.a(iBinder) : (com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.c) queryLocalInterface;
        }
        try {
            java.util.Map Sh = aVar.Sh();
            if (Sh == null) {
                oj.j.b("matrix.OpenglLeakPlugin", "indexMap null", new java.lang.Object[0]);
                try {
                    dVar.f400279i = true;
                    oj.j.c("matrix.OpenglLeakPlugin", "destory test process", new java.lang.Object[0]);
                    aVar.Vi();
                    r37 = r37;
                } catch (android.os.RemoteException e17) {
                    oj.j.d("matrix.OpenglLeakPlugin", e17, "", new java.lang.Object[0]);
                    r37 = r37;
                }
            } else {
                try {
                    oj.j.b("matrix.OpenglLeakPlugin", "indexMap:" + Sh, new java.lang.Object[0]);
                    com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p579x6a710b1.AbstractC4701xfaddf038.a();
                    oj.j.b("matrix.OpenglLeakPlugin", "init env", new java.lang.Object[0]);
                    str3 = "glTexImage2D";
                    cVar = aVar;
                    try {
                        try {
                            try {
                                int intValue = ((java.lang.Integer) Sh.get("glGenTextures")).intValue() * ((java.lang.Integer) Sh.get("glDeleteTextures")).intValue() * ((java.lang.Integer) Sh.get("glGenBuffers")).intValue() * ((java.lang.Integer) Sh.get("glDeleteBuffers")).intValue() * ((java.lang.Integer) Sh.get("glGenFramebuffers")).intValue() * ((java.lang.Integer) Sh.get("glDeleteFramebuffers")).intValue() * ((java.lang.Integer) Sh.get("glGenRenderbuffers")).intValue() * ((java.lang.Integer) Sh.get("glDeleteRenderbuffers")).intValue() * ((java.lang.Integer) Sh.get(str3)).intValue() * ((java.lang.Integer) Sh.get("glBindTexture")).intValue() * ((java.lang.Integer) Sh.get("glBindBuffer")).intValue() * ((java.lang.Integer) Sh.get("glBindFramebuffer")).intValue() * ((java.lang.Integer) Sh.get("glBindRenderbuffer")).intValue() * ((java.lang.Integer) Sh.get("glTexImage3D")).intValue() * ((java.lang.Integer) Sh.get("glRenderbufferStorage")).intValue() * ((java.lang.Integer) Sh.get("glBufferData")).intValue();
                                aVar = null;
                                oj.j.b("matrix.OpenglLeakPlugin", "hookResult = " + intValue, new java.lang.Object[0]);
                                if (intValue != 0) {
                                    li.e eVar = li.d.f400277m;
                                    if (eVar != null) {
                                        ((com.p314xaae8f345.mm.p849xbf8d97c1.b0) eVar).a();
                                    }
                                } else if (li.d.f400277m != null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1403L, 39L, 1L);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenglLeakPlugin.TAG", "onHookFail call & report");
                                }
                                oj.j.c("matrix.OpenglLeakPlugin", "hook genTexture = %s", java.lang.Boolean.valueOf(com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glGenTextures", ((java.lang.Integer) Sh.get("glGenTextures")).intValue())));
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glDeleteTextures", ((java.lang.Integer) Sh.get("glDeleteTextures")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glGenBuffers", ((java.lang.Integer) Sh.get("glGenBuffers")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glDeleteBuffers", ((java.lang.Integer) Sh.get("glDeleteBuffers")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glGenFramebuffers", ((java.lang.Integer) Sh.get("glGenFramebuffers")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glDeleteFramebuffers", ((java.lang.Integer) Sh.get("glDeleteFramebuffers")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glGenRenderbuffers", ((java.lang.Integer) Sh.get("glGenRenderbuffers")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glDeleteRenderbuffers", ((java.lang.Integer) Sh.get("glDeleteRenderbuffers")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523(str3, ((java.lang.Integer) Sh.get(str3)).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glTexImage3D", ((java.lang.Integer) Sh.get("glTexImage3D")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glBindTexture", ((java.lang.Integer) Sh.get("glBindTexture")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glBindBuffer", ((java.lang.Integer) Sh.get("glBindBuffer")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glBindRenderbuffer", ((java.lang.Integer) Sh.get("glBindRenderbuffer")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glBufferData", ((java.lang.Integer) Sh.get("glBufferData")).intValue());
                                com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41202x30f523("glRenderbufferStorage", ((java.lang.Integer) Sh.get("glRenderbufferStorage")).intValue());
                                oj.j.b("matrix.OpenglLeakPlugin", "hook finish", new java.lang.Object[0]);
                                dVar = dVar;
                                r37 = 1;
                                try {
                                    dVar.f400279i = true;
                                    oj.j.c("matrix.OpenglLeakPlugin", "destory test process", new java.lang.Object[0]);
                                    cVar.Vi();
                                } catch (android.os.RemoteException e18) {
                                    java.lang.String str4 = "";
                                    oj.j.d("matrix.OpenglLeakPlugin", e18, str4, new java.lang.Object[0]);
                                    r37 = str4;
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                dVar = dVar;
                                str = "destory test process";
                                str2 = "";
                                try {
                                    oj.j.d("matrix.OpenglLeakPlugin", th, str2, new java.lang.Object[0]);
                                    try {
                                        dVar.f400279i = true;
                                        oj.j.c("matrix.OpenglLeakPlugin", str, new java.lang.Object[0]);
                                        cVar.Vi();
                                    } catch (android.os.RemoteException e19) {
                                        oj.j.d("matrix.OpenglLeakPlugin", e19, str2, new java.lang.Object[0]);
                                    }
                                } catch (java.lang.Throwable th7) {
                                    try {
                                        dVar.f400279i = true;
                                        oj.j.c("matrix.OpenglLeakPlugin", str, new java.lang.Object[0]);
                                        cVar.Vi();
                                        throw th7;
                                    } catch (android.os.RemoteException e27) {
                                        oj.j.d("matrix.OpenglLeakPlugin", e27, str2, new java.lang.Object[0]);
                                        throw th7;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        str = "destory test process";
                    }
                } catch (java.lang.Throwable th10) {
                    th = th10;
                    str = "destory test process";
                    cVar = aVar;
                }
            }
        } catch (java.lang.Throwable th11) {
            th = th11;
            str = r37;
            str2 = str3;
            cVar = aVar;
        }
    }
}
