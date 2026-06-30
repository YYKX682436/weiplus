package rt2;

/* loaded from: classes8.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt2.g f481035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rt2.g gVar) {
        super(1);
        this.f481035d = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.vs2 vs2Var;
        android.content.Intent intent = (android.content.Intent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f481035d.getClass();
        java.lang.String stringExtra = intent.getStringExtra("action");
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -1768624314:
                    if (stringExtra.equals("notifyCount")) {
                        java.lang.String stringExtra2 = intent.getStringExtra("redDotInfo");
                        byte[] decode = android.util.Base64.decode(stringExtra2 != null ? stringExtra2 : "", 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode);
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(decode, r26.c.f450398a));
                            nk6.H0(jSONObject.optInt("likeCount"), jSONObject.optInt("commentCount"), jSONObject.optInt("followCount"), jSONObject.optInt("systemCount"), g92.b.f351302e.T0());
                            break;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.Shell", e17, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
                case -1636480013:
                    if (stringExtra.equals("pushTabTips")) {
                        java.lang.String stringExtra3 = intent.getStringExtra("redDotInfo");
                        byte[] decode2 = android.util.Base64.decode(stringExtra3 != null ? stringExtra3 : "", 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode2);
                        java.lang.String str = new java.lang.String(decode2, r26.c.f450398a);
                        try {
                            if (((decode2.length == 0) ^ true ? decode2 : null) != null) {
                                r45.vs2 vs2Var2 = new r45.vs2();
                                vs2Var2.mo75930xb5cb93b2(str);
                                r45.dz2 dz2Var = new r45.dz2();
                                java.util.LinkedList m75941xfb821914 = dz2Var.m75941xfb821914(0);
                                r45.gz2 gz2Var = new r45.gz2();
                                gz2Var.set(0, vs2Var2);
                                m75941xfb821914.add(gz2Var);
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2) nk6).e1(dz2Var, "shellTest");
                                break;
                            }
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.Shell", e18, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
                case -934908847:
                    if (stringExtra.equals("record")) {
                        int intExtra = intent.getIntExtra("ctrlType", 0);
                        java.lang.String stringExtra4 = intent.getStringExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                        if (stringExtra4 == null) {
                            stringExtra4 = "";
                        }
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra4)) {
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) kz5.n0.Z(zy2.fa.O0(nk6, stringExtra4, xy2.c.e(context), false, false, 12, null));
                            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = jbVar != null ? jbVar.f65874xb5f7102a.f470021f : null;
                            if (gVar != null) {
                                byte[] decode3 = android.util.Base64.decode(android.util.Base64.encodeToString(gVar.f273689a, 0), 0);
                                byte[] bArr = gVar.f273689a;
                                if (bArr != null) {
                                    int length = bArr.length;
                                    for (int i17 = 0; i17 < length; i17++) {
                                        if (bArr[i17] != decode3[i17]) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Shell", "diff " + i17);
                                        }
                                    }
                                }
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("record path:");
                            sb6.append(stringExtra4);
                            sb6.append(" ctrlType:");
                            sb6.append(intExtra);
                            sb6.append(" ctrlInfo:");
                            if (jbVar != null && (vs2Var = jbVar.f65874xb5f7102a) != null) {
                                r9 = vs2Var.mo12245xcc313de3();
                            }
                            sb6.append(r9);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Shell", sb6.toString());
                            break;
                        }
                    }
                    break;
                case 3452698:
                    if (stringExtra.equals(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63)) {
                        java.lang.String stringExtra5 = intent.getStringExtra("redDotInfo");
                        byte[] decode4 = android.util.Base64.decode(stringExtra5 != null ? stringExtra5 : "", 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode4);
                        java.lang.String str2 = new java.lang.String(decode4, r26.c.f450398a);
                        try {
                            if (((decode4.length == 0) ^ true ? decode4 : null) != null) {
                                r45.vs2 vs2Var3 = new r45.vs2();
                                vs2Var3.mo75930xb5cb93b2(str2);
                                zy2.fa.D(nk6, vs2Var3, "FinderShell", null, false, null, 28, null);
                                break;
                            }
                        } catch (java.lang.Exception e19) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.Shell", e19, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
                case 1426876321:
                    if (stringExtra.equals("notifyRedDot")) {
                        java.lang.String stringExtra6 = intent.getStringExtra("redDotInfo");
                        byte[] decode5 = android.util.Base64.decode(stringExtra6 != null ? stringExtra6 : "", 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode5);
                        java.lang.String str3 = new java.lang.String(decode5, r26.c.f450398a);
                        try {
                            if (((decode5.length == 0) ^ true ? decode5 : null) != null) {
                                r45.vs2 vs2Var4 = new r45.vs2();
                                vs2Var4.mo75930xb5cb93b2(str3);
                                r45.ts2 ts2Var = new r45.ts2();
                                ts2Var.set(1, vs2Var4);
                                ts2Var.m75941xfb821914(2).add(vs2Var4);
                                nk6.D0(ts2Var);
                                break;
                            }
                        } catch (java.lang.Exception e27) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.Shell", e27, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
                case 1940808485:
                    if (stringExtra.equals("notifyWxCount")) {
                        java.lang.String stringExtra7 = intent.getStringExtra("redDotInfo");
                        byte[] decode6 = android.util.Base64.decode(stringExtra7 != null ? stringExtra7 : "", 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(decode6);
                        java.lang.String str4 = new java.lang.String(decode6, r26.c.f450398a);
                        try {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                                r45.vs2 vs2Var5 = new r45.vs2();
                                vs2Var5.mo75930xb5cb93b2(str4);
                                r45.d33 d33Var = new r45.d33();
                                d33Var.set(5, vs2Var5);
                                d33Var.set(0, 2);
                                nk6.l0(d33Var);
                                break;
                            }
                        } catch (java.lang.Exception e28) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.Shell", e28, "execRedDot push", new java.lang.Object[0]);
                            break;
                        }
                    }
                    break;
            }
        }
        return jz5.f0.f384359a;
    }
}
