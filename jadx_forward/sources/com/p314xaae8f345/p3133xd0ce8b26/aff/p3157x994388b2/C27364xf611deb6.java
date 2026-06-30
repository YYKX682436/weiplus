package com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2;

/* renamed from: com.tencent.wechat.aff.mm_foundation.ZIDL_JhX8rYMLB */
/* loaded from: classes.dex */
class C27364xf611deb6 extends com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.d f298929a;

    /* renamed from: ZIDL_A */
    public byte[] m113662x9db8edf9(byte[] bArr) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.d dVar = this.f298929a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((e50.w) dVar).getClass();
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(str, "");
        return (aj6 != null ? aj6 : "").getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    /* renamed from: ZIDL_B */
    public byte[] m113663x9db8edfa(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        java.lang.Object h17;
        java.lang.String str;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.d dVar = this.f298929a;
        java.lang.String str2 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str3 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str4 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
        ((e50.w) dVar).getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            if (str3.length() > 0) {
                bm5.o1 o1Var = bm5.o1.f104252a;
                java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(str2, str4);
                java.lang.String str5 = aj6 != null ? aj6 : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "safeDefaultValue: " + str3 + ", " + str5);
                java.util.List f07 = r26.n0.f0(str3, new java.lang.String[]{"_"}, false, 0, 6, null);
                java.lang.String str6 = (java.lang.String) f07.get(f07.size() - 1);
                java.lang.Object obj = str5;
                switch (str6.hashCode()) {
                    case -1808118735:
                        str6.equals("String");
                        obj = str5;
                        break;
                    case 73679:
                        obj = str5;
                        if (str6.equals("Int")) {
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, "false")) {
                                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, "true")) {
                                    h17 = r26.h0.h(str5);
                                    if (h17 == null) {
                                        h17 = 0;
                                    }
                                    obj = h17;
                                    break;
                                } else {
                                    obj = 1;
                                    break;
                                }
                            } else {
                                obj = 0;
                                break;
                            }
                        }
                        break;
                    case 2374300:
                        obj = str5;
                        if (str6.equals("Long")) {
                            h17 = r26.h0.j(str5);
                            if (h17 == null) {
                                h17 = 0L;
                            }
                            obj = h17;
                            break;
                        }
                        break;
                    case 67973692:
                        obj = str5;
                        if (str6.equals("Float")) {
                            h17 = r26.g0.f(str5);
                            if (h17 == null) {
                                h17 = java.lang.Float.valueOf(0.0f);
                            }
                            obj = h17;
                            break;
                        }
                        break;
                }
                str = o1Var.c(str3, obj).toString();
                return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            }
        } else {
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        java.lang.String aj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(str2, str4);
        str = "";
        if (aj7 != null) {
            str = aj7;
        }
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3173x6e8731b.C27692x3687e131
    /* renamed from: attachStub */
    public void mo73242x8aebc093(java.lang.Object obj) {
        this.f298929a = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3157x994388b2.d) obj;
    }
}
