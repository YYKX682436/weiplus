package up0;

/* loaded from: classes13.dex */
public final class j {
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 fileSystem, org.json.JSONObject data, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b pagView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileSystem, "fileSystem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        pagView.n();
        org.json.JSONObject optJSONObject = data.optJSONObject("pagPara");
        java.lang.String optString = optJSONObject != null ? optJSONObject.optString("pagFilePath") : null;
        if (optString == null) {
            optString = "";
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        int i17 = 0;
        if (!K0) {
            ik1.b0 b0Var = new ik1.b0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832 = fileSystem.mo49307xcc440832(optString, b0Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49307xcc440832, "readFile(...)");
            if (mo49307xcc440832 != j1Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBBootsPlayPagManager", "fileSystem readPAGFile function fail");
                return false;
            }
            if (pagView.getUseRfx()) {
                com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77392x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77392x243906(ik1.f.a((java.nio.ByteBuffer) b0Var.f373357a));
                if (m77392x243906 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBBootsPlayPagManager", "pagFile null");
                    return false;
                }
                pagView.mo82566x3e3ac3e8(m77392x243906);
            } else {
                org.p3363xbe4143f1.C29690xfae77312 m154717x243906 = org.p3363xbe4143f1.C29690xfae77312.m154717x243906(ik1.f.a((java.nio.ByteBuffer) b0Var.f373357a));
                if (m154717x243906 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBBootsPlayPagManager", "pagFile null");
                    return false;
                }
                pagView.mo82568x3e3ac3e8(m154717x243906);
            }
        }
        java.lang.Integer valueOf = optJSONObject != null ? java.lang.Integer.valueOf(optJSONObject.optInt("count", 1)) : null;
        org.json.JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("textArray") : null;
        org.json.JSONArray optJSONArray2 = optJSONObject != null ? optJSONObject.optJSONArray("imageArray") : null;
        org.json.JSONArray optJSONArray3 = optJSONObject != null ? optJSONObject.optJSONArray("fontArray") : null;
        pagView.m82583xcde73672(valueOf != null ? valueOf.intValue() : 1);
        pagView.a(new up0.f(pagView));
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i18 = 0;
            while (i18 < length) {
                org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i18);
                if (pagView.getUseRfx()) {
                    com.p314xaae8f345.mm.rfx.C20942x379cf5ee m82578x583e633c = pagView.m82578x583e633c();
                    if (m82578x583e633c != null) {
                        com.p314xaae8f345.mm.rfx.C20952x37a3459f m77401x400087ed = m82578x583e633c.m77401x400087ed(optJSONObject2.optInt(ya.b.f77479x42930b2, 0));
                        m77401x400087ed.f39122x36452d = optJSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "");
                        m82578x583e633c.m77408x19a3f201(optJSONObject2.optInt(ya.b.f77479x42930b2, 0), m77401x400087ed);
                    }
                } else {
                    int i19 = i17;
                    org.p3363xbe4143f1.C29687x78413754 m82574xa7d55074 = pagView.m82574xa7d55074();
                    org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312 = m82574xa7d55074 instanceof org.p3363xbe4143f1.C29690xfae77312 ? (org.p3363xbe4143f1.C29690xfae77312) m82574xa7d55074 : null;
                    if (c29690xfae77312 != null) {
                        org.p3363xbe4143f1.C29704xfaedc2c3 m154727x400087ed = c29690xfae77312.m154727x400087ed(optJSONObject2.optInt(ya.b.f77479x42930b2, i19));
                        m154727x400087ed.f75052x36452d = optJSONObject2.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "");
                        c29690xfae77312.m154736x19a3f201(optJSONObject2.optInt(ya.b.f77479x42930b2, i19), m154727x400087ed);
                    }
                }
                i18++;
                i17 = 0;
            }
        }
        if (optJSONArray3 != null) {
            boolean useRfx = pagView.getUseRfx();
            if (optJSONArray3.length() > 0) {
                java.lang.String optString2 = optJSONArray3.optString(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                if (optString2.length() > 0) {
                    ik1.b0 b0Var2 = new ik1.b0();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc4408322 = fileSystem.mo49307xcc440832(optString2, b0Var2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49307xcc4408322, "readFile(...)");
                    if (mo49307xcc4408322 != j1Var) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBBootsPlayPagManager", "fileSystem readFontFile function fail");
                    } else {
                        byte[] a17 = ik1.f.a((java.nio.ByteBuffer) b0Var2.f373357a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "arrayOfByteBuffer(...)");
                        if (useRfx) {
                            if (!(a17.length == 0)) {
                                com.p314xaae8f345.mm.rfx.C20943x379d0cc1.m77422xe29215d9(a17, a17.length, 0);
                            }
                        } else {
                            if (!(a17.length == 0)) {
                                org.p3363xbe4143f1.C29692xfae789e5.m154750xe29215d9(a17, a17.length, 0);
                            }
                        }
                    }
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var.f391645d = true;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new up0.i(pagView, data, optJSONArray2, fileSystem, c0Var, null), 3, null);
        return c0Var.f391645d;
    }
}
