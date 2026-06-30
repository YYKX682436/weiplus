package q10;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final q10.k f441053a = new q10.k();

    /* renamed from: b, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f441054b = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));

    /* renamed from: c, reason: collision with root package name */
    public static volatile p3325xe03a0797.p3326xc267989b.r2 f441055c;

    public static final void a(q10.k kVar, java.lang.String str) {
        kVar.getClass();
        ((ku5.t0) ku5.t0.f394148d).B(new q10.e(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlinx.coroutines.r] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.tencent.mars.cdn.CronetLogic$CronetRequestParams] */
    public static final java.lang.Object b(q10.k kVar, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar;
        q10.k kVar2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = str;
        kVar.getClass();
        q10.k kVar3 = f441053a;
        java.lang.String str6 = "\r\n--";
        ?? rVar2 = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar2.k();
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBProfileUtil", "uploadFile start: file=" + r6Var.m82467xfb82e301() + ", size=" + k17 + " bytes, url=" + str2);
                    java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                    try {
                        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("--");
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\r\n--");
                        sb6.append(valueOf);
                        sb6.append(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
                        sb6.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + r6Var.m82467xfb82e301() + '\"');
                        sb6.append("\r\nContent-Type: application/octet-stream\r\n\r\n");
                        sb7.append(valueOf);
                        sb7.append("--\r\n");
                        java.lang.String sb8 = sb6.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
                        java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
                        byte[] bytes = sb8.getBytes(forName);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                        java.lang.String sb9 = sb7.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
                        java.nio.charset.Charset forName2 = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName2, "forName(...)");
                        byte[] bytes2 = sb9.getBytes(forName2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                        long length = bytes.length + k17 + bytes2.length;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBProfileUtil", "uploadFile contentLength=" + length);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        java.lang.String a17 = ik1.l0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "", (ik1.k0) nd.f.a(ik1.k0.class));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "appendUserAgent(...)");
                        hashMap.put("User-Agent", a17);
                        hashMap.put("Accept-Encoding", "gzip, deflate");
                        hashMap.put("Content-Type", "multipart/form-data; boundary=" + valueOf);
                        hashMap.put("Content-Length", java.lang.String.valueOf(length));
                        ?? cronetRequestParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetRequestParams();
                        cronetRequestParams.url = str2;
                        cronetRequestParams.f18174xbfc5d0e1 = "POST";
                        cronetRequestParams.f18166x25da56ad = true;
                        cronetRequestParams.f18185xf72c4065 = false;
                        cronetRequestParams.f18183xeddcaf63 = false;
                        cronetRequestParams.f18184x1eb6f2fa = false;
                        cronetRequestParams.f18181xe78dee5f = 7;
                        cronetRequestParams.m37968xeb7416ae(hashMap);
                        com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.UploadParams uploadParams = new com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.UploadParams();
                        str6 = str;
                        try {
                            uploadParams.f18228xd426afc1 = str6;
                            uploadParams.f18233x16a80688 = true;
                            uploadParams.f18231x93c419f4 = 0L;
                            uploadParams.f18232x3ebad3bc = length;
                            uploadParams.f18229x1c346e8e = bytes;
                            uploadParams.f18227xa02c0725 = bytes2;
                            cronetRequestParams.f18182x9537aee7 = uploadParams;
                            rVar = rVar2;
                            str4 = str;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            kVar2 = kVar3;
                            str3 = "\nURL: ";
                            rVar = rVar2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBProfileUtil", "uploadFile init error: " + e.getMessage());
                            a(kVar2, "Upload Init Error:\nFile: " + str6 + str3 + str2 + "\nError: " + e.getClass().getSimpleName() + " - " + e.getMessage());
                            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
                            java.lang.Object j17 = rVar.j();
                            pz5.a aVar = pz5.a.f440719d;
                            return j17;
                        }
                        try {
                            q10.j jVar = new q10.j(currentTimeMillis, c0Var, str4, str2, rVar);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBProfileUtil", "uploadFile starting Cronet upload...");
                            com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetHttpsCreateResult m37964x2ef4345 = com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37964x2ef4345(cronetRequestParams, jVar);
                            if (m37964x2ef4345 != null && m37964x2ef4345.f18157x23aa2e05 == 0) {
                                h0Var.f391656d = m37964x2ef4345.f18158xcb7ef180;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBProfileUtil", "uploadFile Cronet task started: taskId=" + ((java.lang.String) h0Var.f391656d));
                                rVar.m(new q10.i(h0Var, c0Var));
                                rVar2 = str4;
                                str5 = cronetRequestParams;
                            }
                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Upload Error:\nFile: ");
                            sb10.append(str6);
                            str3 = "\nURL: ";
                            try {
                                sb10.append(str3);
                                sb10.append(str2);
                                sb10.append("\nError: Failed to create Cronet task, createRet=");
                                sb10.append(m37964x2ef4345 != null ? new java.lang.Integer(m37964x2ef4345.f18157x23aa2e05) : null);
                                kVar2 = kVar3;
                            } catch (java.lang.Exception e18) {
                                e = e18;
                                kVar2 = kVar3;
                            }
                            try {
                                a(kVar2, sb10.toString());
                                java.lang.String str7 = "uploadFile failed: createRet=";
                                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(str7);
                                sb11.append(m37964x2ef4345 != null ? new java.lang.Integer(m37964x2ef4345.f18157x23aa2e05) : null);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBProfileUtil", sb11.toString());
                                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
                                rVar2 = str7;
                                str5 = cronetRequestParams;
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBProfileUtil", "uploadFile init error: " + e.getMessage());
                                a(kVar2, "Upload Init Error:\nFile: " + str6 + str3 + str2 + "\nError: " + e.getClass().getSimpleName() + " - " + e.getMessage());
                                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
                                java.lang.Object j172 = rVar.j();
                                pz5.a aVar2 = pz5.a.f440719d;
                                return j172;
                            }
                        } catch (java.lang.Exception e27) {
                            e = e27;
                            kVar2 = kVar3;
                            str3 = "\nURL: ";
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBProfileUtil", "uploadFile init error: " + e.getMessage());
                            a(kVar2, "Upload Init Error:\nFile: " + str6 + str3 + str2 + "\nError: " + e.getClass().getSimpleName() + " - " + e.getMessage());
                            rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
                            java.lang.Object j1722 = rVar.j();
                            pz5.a aVar22 = pz5.a.f440719d;
                            return j1722;
                        }
                    } catch (java.lang.Exception e28) {
                        e = e28;
                        str6 = str;
                    }
                } catch (java.lang.Exception e29) {
                    e = e29;
                    str6 = str5;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBProfileUtil", "uploadFile failed: file not exist, path=".concat(str5));
                rVar2.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
                rVar = rVar2;
                rVar2 = rVar2;
                str5 = str5;
            }
        } catch (java.lang.Exception e37) {
            e = e37;
            rVar = rVar2;
            str6 = str5;
        }
        java.lang.Object j17222 = rVar.j();
        pz5.a aVar222 = pz5.a.f440719d;
        return j17222;
    }
}
