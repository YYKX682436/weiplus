package zu0;

/* loaded from: classes5.dex */
public abstract class g {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
    
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa r11) {
        /*
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.d0 r1 = e42.d0.clicfg_album_device_configuration
            h62.d r0 = (h62.d) r0
            java.lang.String r2 = ""
            r3 = 1
            java.lang.String r0 = r0.Zi(r1, r2, r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L1d
        L1a:
            r3 = r2
            goto L93
        L1d:
            kotlin.Result$Companion r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L88
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L88
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r0 = "devices"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = "maxsize"
            int r1 = r1.optInt(r4)     // Catch: java.lang.Throwable -> L88
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L88
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L88
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L88
            r5 = r2
        L3a:
            if (r5 >= r0) goto L82
            org.json.JSONObject r6 = r4.optJSONObject(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = "brand"
            java.lang.String r8 = r6.optString(r8)     // Catch: java.lang.Throwable -> L88
            boolean r7 = r26.i0.p(r7, r8, r3)     // Catch: java.lang.Throwable -> L88
            if (r7 == 0) goto L7f
            java.lang.String r7 = wo.w0.m()     // Catch: java.lang.Throwable -> L88
            java.lang.String r8 = "model"
            java.lang.String r8 = r6.optString(r8)     // Catch: java.lang.Throwable -> L88
            boolean r7 = r26.i0.p(r7, r8, r3)     // Catch: java.lang.Throwable -> L88
            if (r7 == 0) goto L7f
            java.lang.String r7 = r11.f150173f     // Catch: java.lang.Throwable -> L88
            long r7 = com.p314xaae8f345.mm.vfs.w6.k(r7)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L70
            int r9 = r1 * 1024
            int r9 = r9 * 1024
            long r9 = (long) r9     // Catch: java.lang.Throwable -> L88
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L70
            goto L1a
        L70:
            java.lang.String r7 = "androidVersion"
            int r6 = r6.optInt(r7)     // Catch: java.lang.Throwable -> L88
            r7 = -1
            if (r7 != r6) goto L7a
            goto L93
        L7a:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L88
            if (r7 != r6) goto L7f
            goto L93
        L7f:
            int r5 = r5 + 1
            goto L3a
        L82:
            jz5.f0 r11 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L88
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)     // Catch: java.lang.Throwable -> L88
            goto L1a
        L88:
            r11 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r11 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r11)
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r11)
            goto L1a
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.g.a(com.tencent.mm.maas_api.MJMediaItem):boolean");
    }

    public static final zu0.a b(com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa c10858x5d0663fa, int i17, int i18, qg.c cVar, boolean z17) {
        if (i17 <= 0 || i18 <= 0) {
            return null;
        }
        qg.a aVar = qg.a.Filepath;
        return z17 ? new zu0.a(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(aVar, c10858x5d0663fa.f150172e, cVar), i18, i17) : new zu0.a(new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1(aVar, c10858x5d0663fa.f150172e, cVar), i17, i18);
    }

    public static final void c(com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa c10858x5d0663fa) {
        java.lang.String string;
        gp.c cVar = new gp.c();
        cVar.k(c10858x5d0663fa.f150173f);
        int d17 = cVar.d();
        android.media.MediaFormat mediaFormat = null;
        android.media.MediaFormat mediaFormat2 = null;
        for (int i17 = 0; i17 < d17; i17++) {
            android.media.MediaFormat e17 = cVar.e(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTrackFormat(...)");
            if (e17.containsKey("mime") && (string = e17.getString("mime")) != null) {
                if (r26.i0.y(string, "video/", false)) {
                    if (mediaFormat == null) {
                        mediaFormat = e17;
                    }
                } else if (r26.i0.y(string, "audio/", false) && mediaFormat2 == null) {
                    mediaFormat2 = e17;
                }
                if (mediaFormat2 != null && mediaFormat != null) {
                    break;
                }
            }
        }
        if (mediaFormat != null) {
            c10858x5d0663fa.f150175h = !mediaFormat.containsKey("height") ? 0 : mediaFormat.getInteger("height");
            c10858x5d0663fa.f150174g = mediaFormat.containsKey("width") ? mediaFormat.getInteger("width") : 0;
            c10858x5d0663fa.f150176i = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(c10858x5d0663fa.f150173f);
        }
        cVar.g();
    }

    public static final void d(com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa c10858x5d0663fa) {
        java.lang.String str = c10858x5d0663fa.f150173f;
        org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69182xa23d6ecc(str));
        c10858x5d0663fa.f150175h = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15529x1f26b122);
        c10858x5d0663fa.f150174g = jSONObject.getInt(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15530xe0ce1e4b);
        c10858x5d0663fa.f150176i = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69179x9787f6ed(str);
    }

    public static final java.lang.Object e(zu0.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (aVar.f557194a.m33754xb600079() != qg.a.Filepath) {
            return java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 c4094x2bd762a1 = aVar.f557194a;
        qg.c m33759x7f025288 = c4094x2bd762a1.m33759x7f025288();
        int i17 = m33759x7f025288 == null ? -1 : zu0.b.f557197a[m33759x7f025288.ordinal()];
        if (i17 == 1) {
            java.lang.String m33753x8dc9649f = c4094x2bd762a1.m33753x8dc9649f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33753x8dc9649f, "getIdentifier(...)");
            return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new zu0.d(m33753x8dc9649f, null), interfaceC29045xdcb5ca57);
        }
        if (i17 != 2) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.String m33753x8dc9649f2 = c4094x2bd762a1.m33753x8dc9649f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33753x8dc9649f2, "getIdentifier(...)");
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new zu0.c(m33753x8dc9649f2, null), interfaceC29045xdcb5ca57);
    }

    public static final java.lang.Object f(com.p314xaae8f345.mm.p839xf223db21.C10858x5d0663fa c10858x5d0663fa, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int ordinal = c10858x5d0663fa.f150171d.ordinal();
        if (ordinal == 0) {
            return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new zu0.f(c10858x5d0663fa, null), interfaceC29045xdcb5ca57);
        }
        if (ordinal != 1) {
            return null;
        }
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new zu0.e(c10858x5d0663fa, null), interfaceC29045xdcb5ca57);
    }
}
