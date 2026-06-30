package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class n1 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f159337m;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.x1 f159338a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 f159339b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 f159340c;

    /* renamed from: h, reason: collision with root package name */
    public long f159345h;

    /* renamed from: l, reason: collision with root package name */
    public java.util.concurrent.Future f159349l;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f159341d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(100);

    /* renamed from: e, reason: collision with root package name */
    public boolean f159342e = false;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.ArraySet f159343f = new android.util.ArraySet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f159344g = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f159346i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public int f159347j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f159348k = 0;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f159337m = hashMap;
        hashMap.put("publishHandler", new java.lang.String[]{"String", "String", "String"});
        hashMap.put("invokeHandler", new java.lang.String[]{"String", "String", "Number"});
    }

    public final void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f159339b.f159152u) {
            if (!this.f159344g || currentTimeMillis - this.f159345h >= 32) {
                this.f159345h = currentTimeMillis;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f159346i)) {
                    return;
                }
                this.f159344g = true;
                int currentTimeMillis2 = (int) (16 - (java.lang.System.currentTimeMillis() - this.f159339b.f159140i));
                if (currentTimeMillis2 <= 0) {
                    currentTimeMillis2 = 16;
                }
                java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a;
                ik1.h0.a().b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.q1(this), currentTimeMillis2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.webkit.ValueCallback, int[]] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    public final void b(java.util.LinkedList linkedList) {
        ?? r37;
        ?? r47;
        java.util.LinkedList linkedList2;
        char c17;
        java.lang.String str;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar;
        boolean z17;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugMsgMrg", "handleMsg list is null");
            return;
        }
        synchronized (this) {
            r37 = 0;
            r47 = 1;
            if (linkedList == null) {
                linkedList2 = null;
            } else {
                linkedList2 = new java.util.LinkedList();
                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                this.f159339b.f159150s.addAll(linkedList);
                java.util.Collections.sort(this.f159339b.f159150s, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.p1(this));
                int a17 = this.f159339b.a();
                java.util.Iterator it = this.f159339b.f159150s.iterator();
                while (it.hasNext()) {
                    r45.l47 l47Var = (r45.l47) it.next();
                    if (l47Var != null) {
                        int i17 = l47Var.f460662d;
                        if (i17 > a17) {
                            if (i17 - a17 != 1) {
                                break;
                            }
                            linkedList2.add(l47Var);
                            a17 = l47Var.f460662d;
                        } else {
                            linkedList3.add(l47Var);
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159339b;
                synchronized (a1Var) {
                    a1Var.f159135d = a17;
                }
                this.f159339b.f159150s.removeAll(linkedList2);
                this.f159339b.f159150s.removeAll(linkedList3);
                linkedList2.size();
            }
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            r45.l47 l47Var2 = (r45.l47) it6.next();
            byte[] c18 = (l47Var2.f460666h & r47) != 0 ? r47 : false ? kk.y.c(l47Var2.f460665g.f273689a) : l47Var2.f460665g.f273689a;
            java.lang.String str2 = l47Var2.f460664f;
            str2.getClass();
            switch (str2.hashCode()) {
                case -1680221061:
                    if (str2.equals("callInterface")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case -217209181:
                    if (str2.equals("evaluateJavascriptResult")) {
                        c17 = r47;
                        break;
                    }
                    break;
                case 3441010:
                    if (str2.equals("ping")) {
                        c17 = 2;
                        break;
                    }
                    break;
                case 52537216:
                    if (str2.equals("chromeDevtools")) {
                        c17 = 3;
                        break;
                    }
                    break;
                case 95766211:
                    if (str2.equals("domOp")) {
                        c17 = 4;
                        break;
                    }
                    break;
                case 907832012:
                    if (str2.equals("clientNavigator")) {
                        c17 = 5;
                        break;
                    }
                    break;
                case 1319027697:
                    if (str2.equals("breakpoint")) {
                        c17 = 6;
                        break;
                    }
                    break;
                case 1972337494:
                    if (str2.equals("customMessage")) {
                        c17 = 7;
                        break;
                    }
                    break;
            }
            c17 = 65535;
            switch (c17) {
                case 0:
                    r45.d47 d47Var = (r45.d47) new r45.d47().mo11468x92b714fd(c18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, method: %s, call_id %d", d47Var.f453648e, java.lang.Integer.valueOf(d47Var.f453650g));
                    java.lang.String str3 = d47Var.f453648e;
                    java.util.LinkedList linkedList4 = d47Var.f453649f;
                    java.util.HashMap hashMap = (java.util.HashMap) f159337m;
                    if (hashMap.containsKey(str3)) {
                        java.lang.String[] strArr = (java.lang.String[]) hashMap.get(str3);
                        if (linkedList4.size() < strArr.length) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, methodArgValueList.size() < methodArgList.size()");
                            break;
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (int i18 = 0; i18 < strArr.length; i18++) {
                                if ("Number".equals(strArr[i18])) {
                                    arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) linkedList4.get(i18), 0)));
                                } else if ("Boolean".equals(strArr[i18])) {
                                    arrayList.add(java.lang.Boolean.valueOf((java.lang.String) linkedList4.get(i18)));
                                } else {
                                    arrayList.add(linkedList4.get(i18));
                                }
                            }
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            str3.getClass();
                            if (str3.equals("publishHandler")) {
                                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar3 = this.f159339b.f159132a;
                                java.lang.String str4 = (java.lang.String) java.lang.String.class.cast(arrayList.get(0));
                                java.lang.String str5 = (java.lang.String) java.lang.String.class.cast(arrayList.get(1));
                                int[] iArr = new int[0];
                                try {
                                    org.json.JSONArray jSONArray = new org.json.JSONArray((java.lang.String) java.lang.String.class.cast(arrayList.get(2)));
                                    iArr = new int[jSONArray.length()];
                                    for (int i19 = 0; i19 < jSONArray.length(); i19++) {
                                        iArr[i19] = jSONArray.getInt(i19);
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugMsgMrg", e17.getMessage());
                                }
                                yVar3.d(str4, str5, iArr);
                                str = null;
                            } else if (!str3.equals("invokeHandler")) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface callMethod is null");
                                break;
                            } else {
                                str = this.f159339b.f159132a.p0((java.lang.String) java.lang.String.class.cast(arrayList.get(0)), (java.lang.String) java.lang.String.class.cast(arrayList.get(1)), arrayList.size() >= 4 ? (java.lang.String) java.lang.String.class.cast(arrayList.get(3)) : "", ((java.lang.Integer) java.lang.Integer.class.cast(arrayList.get(2))).intValue());
                            }
                            if (str == null) {
                                str = "";
                            }
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                int i27 = d47Var.f453650g;
                                r45.e47 e47Var = new r45.e47();
                                e47Var.f454551e = i27;
                                e47Var.f454550d = str;
                                g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.e(e47Var, this.f159339b, "callInterfaceResult"));
                            }
                            int mo75928xcd1e8d8 = d47Var.mo75928xcd1e8d8();
                            int length = str.length();
                            java.lang.String str6 = ((str3.equals("invokeHandler") || str3.equals("publishHandler")) && linkedList4.size() > 0) ? (java.lang.String) linkedList4.get(0) : "";
                            int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true);
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(currentTimeMillis2);
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(mo75928xcd1e8d8);
                            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(length);
                            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.s1.f159363a;
                            if (i28 < 0) {
                                i28 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40065x82653f5d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.s1.f159363a = i28;
                            }
                            ((ch1.d) cVar).c(15190, valueOf, valueOf2, valueOf3, 2, str3, str6, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.s1.a()));
                            break;
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, methodWithArgs is null");
                        break;
                    }
                case 1:
                    r45.q47 q47Var = (r45.q47) new r45.q47().mo11468x92b714fd(c18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onEvaluateCallback %d", java.lang.Integer.valueOf(q47Var.f465214e));
                    int i29 = q47Var.f465214e;
                    java.lang.String str7 = q47Var.f465213d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g gVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.g) this.f159339b.f159151t.remove(java.lang.Integer.valueOf(i29));
                    if (gVar != null) {
                        android.webkit.ValueCallback valueCallback = gVar.f159276a;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(str7);
                        }
                        int mo75928xcd1e8d82 = q47Var.mo75928xcd1e8d8();
                        int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - gVar.f159277b);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c cVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, r47);
                        java.lang.Object[] objArr = new java.lang.Object[8];
                        objArr[0] = java.lang.Integer.valueOf(currentTimeMillis3);
                        objArr[r47] = java.lang.Integer.valueOf(gVar.f159279d);
                        objArr[2] = java.lang.Integer.valueOf(mo75928xcd1e8d82);
                        objArr[3] = java.lang.Integer.valueOf((int) r47);
                        objArr[4] = "";
                        java.lang.String str8 = gVar.f159278c;
                        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        objArr[5] = str8 != null ? str8 : "";
                        int i37 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.s1.f159363a;
                        if (i37 < 0) {
                            i37 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40065x82653f5d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.s1.f159363a = i37;
                        }
                        objArr[6] = java.lang.Integer.valueOf(i37);
                        objArr[7] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.s1.a());
                        ((ch1.d) cVar2).c(15190, objArr);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    r45.u47 u47Var = (r45.u47) new r45.u47().mo11468x92b714fd(c18);
                    r45.v47 v47Var = new r45.v47();
                    v47Var.f469423d = u47Var.f468561d;
                    int a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.s1.a();
                    v47Var.f469424e = a18;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onPing netType %d", java.lang.Integer.valueOf(a18));
                    g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.e(v47Var, this.f159339b, "pong"));
                    break;
                case 3:
                    r45.f47 f47Var = (r45.f47) new r45.f47().mo11468x92b714fd(c18);
                    long j17 = f47Var.f455544d;
                    if (f47Var.f455545e.contains("Tracing.")) {
                        java.lang.String str9 = f47Var.f455545e;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onExternalInspectMessage data:%s", str9);
                        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ProfileGlobal.onExternalInspectMessage('%s')", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str9));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var2 = this.f159339b;
                        if (a1Var2 != null && (yVar = a1Var2.f159132a) != null && yVar.mo50357xcd94f799() != null) {
                            this.f159339b.f159132a.mo50357xcd94f799().mo14660x738236e6(format, r37);
                            break;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugMsgMrg", "onExternalInspectMessage null");
                            break;
                        }
                    } else {
                        com.p159x477cd522.p160x333422.C1475xe7732675.m16426x9f2735ce(f47Var.f455544d, f47Var.f455545e);
                        break;
                    }
                    break;
                case 4:
                    r45.o47 o47Var = (r45.o47) new r45.o47().mo11468x92b714fd(c18);
                    java.lang.String str10 = o47Var.f463443d;
                    int mo50260x9f1221c2 = this.f159339b.f159132a.t3().x0().m52169xfdaa7672().mo14682x9dee9c37().mo50260x9f1221c2();
                    int i38 = o47Var.f463444e;
                    if (i38 != mo50260x9f1221c2 && this.f159339b.f159138g.f159167g != r47) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugMsgMrg", "onDomOp id not current webViewId %d/%d", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(mo50260x9f1221c2));
                        break;
                    } else {
                        this.f159339b.f159132a.d(yb1.a.f77512x24728b, o47Var.f463443d, r37);
                        break;
                    }
                    break;
                case 5:
                    r45.h47 h47Var = (r45.h47) new r45.h47().mo11468x92b714fd(c18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "onClientNavigator method %s", h47Var.f457367d);
                    if (this.f159342e && "relaunchForProfile".equals(h47Var.f457367d)) {
                        ik1.h0.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.debugger.n1$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar4;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1 n1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.n1.this;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var3 = n1Var.f159339b;
                                if (a1Var3 == null || (yVar4 = a1Var3.f159132a) == null || yVar4.t3() == null || n1Var.f159339b.f159132a.t3().A) {
                                    return;
                                }
                                n1Var.f159339b.f159132a.t3().A = true;
                                n1Var.f159339b.f159132a.t3().z1(null, "");
                            }
                        });
                        break;
                    }
                    break;
                case 6:
                    r45.c47 c47Var = (r45.c47) new r45.c47().mo11468x92b714fd(c18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var3 = this.f159339b;
                    synchronized (a1Var3) {
                        z17 = a1Var3.f159146o;
                    }
                    boolean z19 = c47Var.f452824d;
                    if (z17 != z19) {
                        if (z19) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var4 = this.f159339b;
                            synchronized (a1Var4) {
                                a1Var4.f159146o = r47;
                            }
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var5 = this.f159339b;
                            synchronized (a1Var5) {
                                a1Var5.f159146o = false;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = this.f159340c;
                        l2Var.getClass();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.c2(l2Var));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var2 = this.f159340c;
                        l2Var2.getClass();
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.f2(l2Var2));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    r45.j47 j47Var = (r45.j47) new r45.j47().mo11468x92b714fd(c18);
                    java.lang.String str11 = j47Var.f459114d;
                    java.lang.String str12 = "typeof DebuggerConnection.onCustomMessage === 'function' && DebuggerConnection.onCustomMessage('" + j47Var.f459114d + "', '" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(j47Var.f459115e) + "')";
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var6 = this.f159339b;
                    if (a1Var6 != null && (yVar2 = a1Var6.f159132a) != null && yVar2.mo50357xcd94f799() != null) {
                        this.f159339b.f159132a.mo50357xcd94f799().mo14660x738236e6(str12, r37);
                        break;
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugMsgMrg", "onCustomMsg null");
                        break;
                    }
            }
            r37 = 0;
            r47 = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "handleMsg size %d, ack %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f159339b.a()));
        this.f159339b.f159154w += linkedList.size();
        synchronized (this) {
            int i39 = 0;
            while (i39 < this.f159339b.f159150s.size()) {
                int a19 = i39 == 0 ? this.f159339b.a() : ((r45.l47) this.f159339b.f159150s.get(i39 - 1)).f460662d;
                int i47 = ((r45.l47) this.f159339b.f159150s.get(i39)).f460662d;
                if (a19 - i47 != 1) {
                    i(a19 + 1, i47 - 1);
                }
                i39++;
            }
        }
    }

    public void c(long j17, java.lang.String str) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar;
        android.util.ArraySet arraySet = this.f159343f;
        boolean z17 = false;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(dm.i4.f66865x76d1ec5a)) {
                int i17 = jSONObject.getInt(dm.i4.f66865x76d1ec5a);
                if (arraySet.contains(java.lang.Integer.valueOf(i17))) {
                    java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ProfileGlobal.onInspectMessage('%s')", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.w2.a(str));
                    arraySet.remove(java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159339b;
                    if (a1Var != null && (yVar = a1Var.f159132a) != null && yVar.mo50357xcd94f799() != null) {
                        this.f159339b.f159132a.mo50357xcd94f799().mo14660x738236e6(format, null);
                        z17 = true;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugMsgMrg", "onInspectorMsg null");
                }
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemoteDebugMsgMrg", "sendInspectorMsg  e:%s", e17);
        }
        if (z17) {
            return;
        }
        r45.g47 g47Var = new r45.g47();
        g47Var.f456416d = j17;
        g47Var.f456417e = str;
        g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.e(g47Var, this.f159339b, "chromeDevtoolsResult"));
    }

    public void d(r45.z47 z47Var, r45.k47 k47Var) {
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.c(this.f159339b, k47Var, z47Var.f473247d, this.f159340c, this)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159339b;
            int i17 = z47Var.f473248e;
            int i18 = z47Var.f473249f;
            synchronized (a1Var) {
                int i19 = a1Var.f159136e;
                if (i19 >= i17 && i19 <= i18) {
                    a1Var.f159136e = i18;
                }
            }
            int i27 = z47Var.f473248e;
            int i28 = z47Var.f473249f;
            synchronized (this) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it = this.f159339b.f159148q.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1) it.next();
                    r45.l47 l47Var = i1Var.f159303b;
                    if (l47Var == null) {
                        linkedList.add(i1Var);
                    } else {
                        int i29 = l47Var.f460662d;
                        if (i29 >= i27 && i29 <= i28) {
                            linkedList.add(i1Var);
                        }
                    }
                }
                this.f159339b.f159148q.removeAll(linkedList);
            }
        }
    }

    public void e(r45.j57 j57Var, r45.k47 k47Var) {
        int i17;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.c(this.f159339b, k47Var, j57Var.f459130d, this.f159340c, this)) {
            b(j57Var.f459131e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159339b;
            int i18 = j57Var.f459132f;
            synchronized (a1Var) {
                if (a1Var.f159136e < i18) {
                    a1Var.f159136e = i18;
                }
            }
            synchronized (this) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it = this.f159339b.f159148q.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1) it.next();
                    r45.l47 l47Var = i1Var.f159303b;
                    if (l47Var == null) {
                        linkedList.add(i1Var);
                    } else {
                        int i19 = l47Var.f460662d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var2 = this.f159339b;
                        synchronized (a1Var2) {
                            i17 = a1Var2.f159136e;
                        }
                        if (i19 <= i17) {
                            linkedList.add(i1Var);
                        }
                    }
                }
                this.f159339b.f159148q.removeAll(linkedList);
            }
        }
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "quit");
        r45.h57 h57Var = new r45.h57();
        h57Var.f457398d = this.f159339b.f159133b;
        this.f159338a.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.b(1004, h57Var));
    }

    public void g(java.util.LinkedList linkedList) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159339b;
        if (!(a1Var.f159138g.f159163c == 3)) {
            synchronized (a1Var.f159152u) {
                if (java.lang.System.currentTimeMillis() - this.f159339b.f159140i > 16 && !this.f159344g) {
                }
                this.f159346i.addAll(linkedList);
                a();
                return;
            }
        }
        synchronized (this) {
            h(linkedList, true, false);
        }
    }

    public final synchronized void h(java.util.LinkedList linkedList, boolean z17, boolean z18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        r45.y47 y47Var = new r45.y47();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159339b;
        y47Var.f472320d = a1Var.f159133b;
        y47Var.f472322f = a1Var.a();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            y47Var.f472321e.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1) it.next()).f159303b);
        }
        r45.k47 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.b(1006, y47Var);
        if (!this.f159339b.c() || z18) {
            linkedList.size();
            this.f159338a.b(b17);
        }
        if (z17) {
            synchronized (this) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                    this.f159339b.f159148q.addAll(linkedList);
                }
            }
        }
        this.f159340c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var2 = this.f159339b;
        a1Var2.getClass();
        a1Var2.f159140i = java.lang.System.currentTimeMillis();
        a1Var2.f();
        if (!this.f159339b.c()) {
            this.f159347j = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.z0();
        z0Var.f159385a = b17.mo75928xcd1e8d8();
        z0Var.f159386b = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f159339b.f159149r).put(b17.f459908e, z0Var);
    }

    public void i(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "sync minSeq %d, maxSeq %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 > i18) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f159341d;
        if (r2Var.get(java.lang.Integer.valueOf(i17)) != null && currentTimeMillis - ((java.lang.Long) r2Var.get(java.lang.Integer.valueOf(i17))).longValue() < 3000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "sync too fast!");
            return;
        }
        r2Var.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis));
        r45.i57 i57Var = new r45.i57();
        i57Var.f458281d = this.f159339b.f159133b;
        i57Var.f458282e = i17;
        i57Var.f458283f = i18;
        this.f159338a.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.y1.b(1005, i57Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.a1 a1Var = this.f159339b;
        a1Var.getClass();
        a1Var.f159143l = java.lang.System.currentTimeMillis();
    }

    public synchronized void j() {
        if (this.f159339b.c()) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f159339b.f159148q.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.i1) it.next();
            if (currentTimeMillis - i1Var.f159302a > 5000) {
                i1Var.f159302a = java.lang.System.currentTimeMillis();
                linkedList.add(i1Var);
                i17 += i1Var.f159304c;
                if (i17 >= 65536 || linkedList.size() > 800) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "try2ReSendMsg size %d", java.lang.Integer.valueOf(linkedList.size()));
                    synchronized (this) {
                        h(linkedList, false, false);
                        linkedList.clear();
                        break;
                    }
                }
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemoteDebugMsgMrg", "try2ReSendMsg size %d", java.lang.Integer.valueOf(linkedList.size()));
            synchronized (this) {
                h(linkedList, false, false);
            }
        }
    }
}
