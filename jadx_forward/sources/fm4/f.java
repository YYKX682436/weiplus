package fm4;

@j95.b
/* loaded from: classes11.dex */
public class f extends i95.w implements qk.k8 {
    public static java.util.Map Ni(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (u46.l.e(str)) {
            return hashMap;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject.get(next);
                if (obj instanceof org.json.JSONObject) {
                    obj = Ni(obj.toString());
                }
                hashMap.put(next, obj);
            }
        } catch (java.lang.Exception unused) {
        }
        return hashMap;
    }

    public final int Ai(java.util.Map map, java.lang.String str, int i17) {
        java.lang.Object obj;
        return (map == null || android.text.TextUtils.isEmpty(str) || (obj = map.get(str)) == null || !(obj instanceof java.lang.Integer)) ? i17 : ((java.lang.Integer) obj).intValue();
    }

    public final java.lang.String Bi(java.util.Map map, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        return (map == null || android.text.TextUtils.isEmpty(str) || (obj = map.get(str)) == null || !(obj instanceof java.lang.String)) ? str2 : (java.lang.String) obj;
    }

    public java.util.Map Di(int i17) {
        jm4.n2 d17;
        jm4.i4 Zi = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Zi();
        if (i17 == 999) {
            qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
            bw5.eq0 eq0Var = bw5.eq0.AudioRadio;
            rk4.z8 z8Var = (rk4.z8) g9Var;
            z8Var.getClass();
            jm4.u2 a17 = jm4.w2.f381968d.a();
            jm4.i4 i4Var = (a17 == null || (d17 = ((jm4.w2) a17).d(eq0Var)) == null) ? null : (jm4.i4) p3380x6a61f93.p3381xf512d0a5.C30463x21b415b4.m169153x21ba58df(((jm4.p2) d17).m105978x2737f10());
            Zi = i4Var == null ? z8Var.Zi() : i4Var;
        }
        if (Zi != null) {
            return Ni(p3380x6a61f93.p3381xf512d0a5.C30432x21b2b547.m168814x21b11851(((jm4.k4) Zi).m105978x2737f10()));
        }
        return null;
    }

    public bw5.xa wi(int i17, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        long j17;
        long j18;
        bw5.xa xaVar = new bw5.xa();
        bw5.dj0 dj0Var = new bw5.dj0();
        java.lang.String f17 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).f306223m.f();
        if (f17 == null) {
            f17 = "";
        }
        java.lang.String str = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).f306223m.f495403y;
        if (str == null) {
            str = "";
        }
        dj0Var.f108039d = f17;
        boolean[] zArr = dj0Var.f108041f;
        zArr[1] = true;
        dj0Var.f108040e = str;
        zArr[2] = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i18 = i17 & 1;
        boolean[] zArr2 = xaVar.f116555i;
        if (i18 != 0) {
            bw5.s sVar = new bw5.s();
            sVar.f114251d = currentTimeMillis;
            boolean[] zArr3 = sVar.C;
            zArr3[1] = true;
            j17 = currentTimeMillis;
            sVar.f114252e = Ai(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            zArr3[2] = true;
            sVar.f114253f = dj0Var;
            zArr3[3] = true;
            java.lang.String Bi = Bi(map, "chat", "");
            if (!Bi.isEmpty()) {
                sVar.f114254g = Bi;
                zArr3[5] = true;
            }
            java.lang.String Bi2 = Bi(map, "sourceuser", "");
            if (!Bi2.isEmpty()) {
                sVar.f114267w = Bi2;
                zArr3[18] = true;
            }
            java.lang.String Bi3 = Bi(map, "msgid", "");
            if (!Bi3.isEmpty()) {
                sVar.f114255h = Bi3;
                zArr3[6] = true;
            }
            java.lang.String Bi4 = Bi(map, "sns", "");
            if (!Bi4.isEmpty()) {
                sVar.f114256i = Bi4;
                zArr3[7] = true;
            }
            java.lang.String Bi5 = Bi(map, "favid", "");
            if (!Bi5.isEmpty()) {
                sVar.f114266v = Bi5;
                zArr3[17] = true;
            }
            java.lang.String Bi6 = Bi(map, "textstatus", "");
            if (!Bi6.isEmpty()) {
                sVar.f114257m = Bi6;
                zArr3[8] = true;
            }
            java.lang.String Bi7 = Bi(map, "finderusername", "");
            if (!Bi7.isEmpty()) {
                sVar.f114258n = Bi7;
                zArr3[9] = true;
            }
            java.lang.String Bi8 = Bi(map, "bizusername", "");
            if (!Bi8.isEmpty()) {
                sVar.f114259o = Bi8;
                zArr3[10] = true;
            }
            java.lang.String Bi9 = Bi(map, "listenid", "");
            if (!Bi9.isEmpty()) {
                sVar.f114260p = Bi9;
                zArr3[11] = true;
            }
            java.lang.String Bi10 = Bi(map, "baseid", "");
            if (!Bi10.isEmpty()) {
                sVar.f114261q = Bi10;
                zArr3[12] = true;
            }
            if (map.containsKey("type")) {
                sVar.f114262r = Ai(map, "type", 0);
                zArr3[13] = true;
            }
            if (map.containsKey("listenidtype")) {
                sVar.A = Ai(map, "listenidtype", 0);
                zArr3[22] = true;
            }
            java.lang.String Bi11 = Bi(map, "controllersessionbuffer", "");
            if (!Bi11.isEmpty()) {
                sVar.f114263s = Bi11;
                zArr3[14] = true;
            }
            java.lang.String Bi12 = Bi(map, "localaudiofilemd5", "");
            if (!Bi12.isEmpty()) {
                sVar.f114264t = Bi12;
                zArr3[15] = true;
            }
            if (map.containsKey("baseidissharedfrom3rd")) {
                sVar.f114265u = Ai(map, "baseidissharedfrom3rd", 0);
                zArr3[16] = true;
            }
            java.lang.String Bi13 = Bi(map, "miniAppId", "");
            if (!Bi13.isEmpty()) {
                sVar.f114268x = Bi13;
                zArr3[19] = true;
            }
            if (map2 != null && map2.size() > 0) {
                for (java.lang.String str2 : map2.keySet()) {
                    bw5.gj0 gj0Var = new bw5.gj0();
                    gj0Var.f109410d = str2;
                    boolean[] zArr4 = gj0Var.f109412f;
                    zArr4[1] = true;
                    gj0Var.f109411e = (java.lang.String) map2.get(str2);
                    zArr4[2] = true;
                    sVar.f114269y.add(gj0Var);
                    zArr3[20] = true;
                }
            }
            if (map3 != null && map3.size() > 0) {
                for (java.lang.String str3 : map3.keySet()) {
                    bw5.gj0 gj0Var2 = new bw5.gj0();
                    gj0Var2.f109410d = str3;
                    boolean[] zArr5 = gj0Var2.f109412f;
                    zArr5[1] = true;
                    gj0Var2.f109411e = (java.lang.String) map3.get(str3);
                    zArr5[2] = true;
                    sVar.B.add(gj0Var2);
                    zArr3[23] = true;
                }
            }
            xaVar.f116550d = sVar;
            zArr2[1] = true;
        } else {
            j17 = currentTimeMillis;
        }
        if ((i17 & 2) != 0) {
            bw5.r1 r1Var = new bw5.r1();
            j18 = j17;
            r1Var.f113895d = j18;
            boolean[] zArr6 = r1Var.f113898g;
            zArr6[1] = true;
            r1Var.f113897f = Ai(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
            zArr6[3] = true;
            r1Var.f113896e = dj0Var;
            zArr6[2] = true;
            xaVar.f116551e = r1Var;
            zArr2[2] = true;
        } else {
            j18 = j17;
        }
        if ((i17 & 4) != 0) {
            bw5.xk0 xk0Var = new bw5.xk0();
            xk0Var.f116711d = j18;
            xk0Var.f116712e[1] = true;
            xaVar.f116552f = xk0Var;
            zArr2[3] = true;
        }
        if ((i17 & 8) != 0) {
            bw5.wk0 wk0Var = new bw5.wk0();
            wk0Var.f116289d = j18;
            boolean[] zArr7 = wk0Var.f116302t;
            zArr7[1] = true;
            wk0Var.f116290e = dj0Var;
            zArr7[2] = true;
            java.lang.String Bi14 = Bi(map, "lineid", "");
            if (!Bi14.isEmpty()) {
                wk0Var.f116291f = Bi14;
                zArr7[4] = true;
            }
            java.lang.String Bi15 = Bi(map, "linetitle", "");
            if (!Bi15.isEmpty()) {
                wk0Var.f116292g = Bi15;
                zArr7[5] = true;
            }
            if (map.containsKey("lineloc")) {
                wk0Var.f116293h = Ai(map, "lineloc", 0);
                zArr7[6] = true;
            }
            java.lang.String Bi16 = Bi(map, "itemrequestid", "");
            if (!Bi16.isEmpty()) {
                wk0Var.f116294i = Bi16;
                zArr7[7] = true;
            }
            xaVar.f116553g = wk0Var;
            zArr2[4] = true;
        }
        return xaVar;
    }
}
