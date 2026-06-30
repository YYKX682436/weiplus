package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class n1 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f77804m;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.x1 f77805a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.a1 f77806b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.debugger.l2 f77807c;

    /* renamed from: h, reason: collision with root package name */
    public long f77812h;

    /* renamed from: l, reason: collision with root package name */
    public java.util.concurrent.Future f77816l;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f77808d = new com.tencent.mm.sdk.platformtools.r2(100);

    /* renamed from: e, reason: collision with root package name */
    public boolean f77809e = false;

    /* renamed from: f, reason: collision with root package name */
    public final android.util.ArraySet f77810f = new android.util.ArraySet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f77811g = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f77813i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public int f77814j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f77815k = 0;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f77804m = hashMap;
        hashMap.put("publishHandler", new java.lang.String[]{"String", "String", "String"});
        hashMap.put("invokeHandler", new java.lang.String[]{"String", "String", "Number"});
    }

    public final void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this.f77806b.f77619u) {
            if (!this.f77811g || currentTimeMillis - this.f77812h >= 32) {
                this.f77812h = currentTimeMillis;
                if (com.tencent.mm.sdk.platformtools.t8.L0(this.f77813i)) {
                    return;
                }
                this.f77811g = true;
                int currentTimeMillis2 = (int) (16 - (java.lang.System.currentTimeMillis() - this.f77806b.f77607i));
                if (currentTimeMillis2 <= 0) {
                    currentTimeMillis2 = 16;
                }
                java.util.Set set = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
                ik1.h0.a().b(new com.tencent.mm.plugin.appbrand.debugger.q1(this), currentTimeMillis2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.webkit.ValueCallback, int[]] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v20 */
    public final void b(java.util.LinkedList linkedList) {
        ?? r37;
        ?? r47;
        java.util.LinkedList linkedList2;
        char c17;
        java.lang.String str;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar;
        boolean z17;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar2;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugMsgMrg", "handleMsg list is null");
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
                this.f77806b.f77617s.addAll(linkedList);
                java.util.Collections.sort(this.f77806b.f77617s, new com.tencent.mm.plugin.appbrand.debugger.p1(this));
                int a17 = this.f77806b.a();
                java.util.Iterator it = this.f77806b.f77617s.iterator();
                while (it.hasNext()) {
                    r45.l47 l47Var = (r45.l47) it.next();
                    if (l47Var != null) {
                        int i17 = l47Var.f379129d;
                        if (i17 > a17) {
                            if (i17 - a17 != 1) {
                                break;
                            }
                            linkedList2.add(l47Var);
                            a17 = l47Var.f379129d;
                        } else {
                            linkedList3.add(l47Var);
                        }
                    }
                }
                com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77806b;
                synchronized (a1Var) {
                    a1Var.f77602d = a17;
                }
                this.f77806b.f77617s.removeAll(linkedList2);
                this.f77806b.f77617s.removeAll(linkedList3);
                linkedList2.size();
            }
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            r45.l47 l47Var2 = (r45.l47) it6.next();
            byte[] c18 = (l47Var2.f379133h & r47) != 0 ? r47 : false ? kk.y.c(l47Var2.f379132g.f192156a) : l47Var2.f379132g.f192156a;
            java.lang.String str2 = l47Var2.f379131f;
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
                    r45.d47 d47Var = (r45.d47) new r45.d47().parseFrom(c18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, method: %s, call_id %d", d47Var.f372115e, java.lang.Integer.valueOf(d47Var.f372117g));
                    java.lang.String str3 = d47Var.f372115e;
                    java.util.LinkedList linkedList4 = d47Var.f372116f;
                    java.util.HashMap hashMap = (java.util.HashMap) f77804m;
                    if (hashMap.containsKey(str3)) {
                        java.lang.String[] strArr = (java.lang.String[]) hashMap.get(str3);
                        if (linkedList4.size() < strArr.length) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, methodArgValueList.size() < methodArgList.size()");
                            break;
                        } else {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (int i18 = 0; i18 < strArr.length; i18++) {
                                if ("Number".equals(strArr[i18])) {
                                    arrayList.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) linkedList4.get(i18), 0)));
                                } else if ("Boolean".equals(strArr[i18])) {
                                    arrayList.add(java.lang.Boolean.valueOf((java.lang.String) linkedList4.get(i18)));
                                } else {
                                    arrayList.add(linkedList4.get(i18));
                                }
                            }
                            long currentTimeMillis = java.lang.System.currentTimeMillis();
                            str3.getClass();
                            if (str3.equals("publishHandler")) {
                                com.tencent.luggage.sdk.jsapi.component.service.y yVar3 = this.f77806b.f77599a;
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
                                    com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugMsgMrg", e17.getMessage());
                                }
                                yVar3.d(str4, str5, iArr);
                                str = null;
                            } else if (!str3.equals("invokeHandler")) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface callMethod is null");
                                break;
                            } else {
                                str = this.f77806b.f77599a.p0((java.lang.String) java.lang.String.class.cast(arrayList.get(0)), (java.lang.String) java.lang.String.class.cast(arrayList.get(1)), arrayList.size() >= 4 ? (java.lang.String) java.lang.String.class.cast(arrayList.get(3)) : "", ((java.lang.Integer) java.lang.Integer.class.cast(arrayList.get(2))).intValue());
                            }
                            if (str == null) {
                                str = "";
                            }
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                int i27 = d47Var.f372117g;
                                r45.e47 e47Var = new r45.e47();
                                e47Var.f373018e = i27;
                                e47Var.f373017d = str;
                                g(com.tencent.mm.plugin.appbrand.debugger.y1.e(e47Var, this.f77806b, "callInterfaceResult"));
                            }
                            int computeSize = d47Var.computeSize();
                            int length = str.length();
                            java.lang.String str6 = ((str3.equals("invokeHandler") || str3.equals("publishHandler")) && linkedList4.size() > 0) ? (java.lang.String) linkedList4.get(0) : "";
                            int currentTimeMillis2 = (int) (java.lang.System.currentTimeMillis() - currentTimeMillis);
                            com.tencent.mm.plugin.appbrand.profile.c cVar = (com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true);
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(currentTimeMillis2);
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(computeSize);
                            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(length);
                            int i28 = com.tencent.mm.plugin.appbrand.debugger.s1.f77830a;
                            if (i28 < 0) {
                                i28 = com.tencent.mars.comm.NetStatusUtil.getISPCode(com.tencent.mm.sdk.platformtools.x2.f193071a);
                                com.tencent.mm.plugin.appbrand.debugger.s1.f77830a = i28;
                            }
                            ((ch1.d) cVar).c(15190, valueOf, valueOf2, valueOf3, 2, str3, str6, java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.debugger.s1.a()));
                            break;
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugMsgMrg", "onCallInterface, methodWithArgs is null");
                        break;
                    }
                case 1:
                    r45.q47 q47Var = (r45.q47) new r45.q47().parseFrom(c18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onEvaluateCallback %d", java.lang.Integer.valueOf(q47Var.f383681e));
                    int i29 = q47Var.f383681e;
                    java.lang.String str7 = q47Var.f383680d;
                    com.tencent.mm.plugin.appbrand.debugger.g gVar = (com.tencent.mm.plugin.appbrand.debugger.g) this.f77806b.f77618t.remove(java.lang.Integer.valueOf(i29));
                    if (gVar != null) {
                        android.webkit.ValueCallback valueCallback = gVar.f77743a;
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(str7);
                        }
                        int computeSize2 = q47Var.computeSize();
                        int currentTimeMillis3 = (int) (java.lang.System.currentTimeMillis() - gVar.f77744b);
                        com.tencent.mm.plugin.appbrand.profile.c cVar2 = (com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, r47);
                        java.lang.Object[] objArr = new java.lang.Object[8];
                        objArr[0] = java.lang.Integer.valueOf(currentTimeMillis3);
                        objArr[r47] = java.lang.Integer.valueOf(gVar.f77746d);
                        objArr[2] = java.lang.Integer.valueOf(computeSize2);
                        objArr[3] = java.lang.Integer.valueOf((int) r47);
                        objArr[4] = "";
                        java.lang.String str8 = gVar.f77745c;
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        objArr[5] = str8 != null ? str8 : "";
                        int i37 = com.tencent.mm.plugin.appbrand.debugger.s1.f77830a;
                        if (i37 < 0) {
                            i37 = com.tencent.mars.comm.NetStatusUtil.getISPCode(com.tencent.mm.sdk.platformtools.x2.f193071a);
                            com.tencent.mm.plugin.appbrand.debugger.s1.f77830a = i37;
                        }
                        objArr[6] = java.lang.Integer.valueOf(i37);
                        objArr[7] = java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.debugger.s1.a());
                        ((ch1.d) cVar2).c(15190, objArr);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    r45.u47 u47Var = (r45.u47) new r45.u47().parseFrom(c18);
                    r45.v47 v47Var = new r45.v47();
                    v47Var.f387890d = u47Var.f387028d;
                    int a18 = com.tencent.mm.plugin.appbrand.debugger.s1.a();
                    v47Var.f387891e = a18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onPing netType %d", java.lang.Integer.valueOf(a18));
                    g(com.tencent.mm.plugin.appbrand.debugger.y1.e(v47Var, this.f77806b, "pong"));
                    break;
                case 3:
                    r45.f47 f47Var = (r45.f47) new r45.f47().parseFrom(c18);
                    long j17 = f47Var.f374011d;
                    if (f47Var.f374012e.contains("Tracing.")) {
                        java.lang.String str9 = f47Var.f374012e;
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onExternalInspectMessage data:%s", str9);
                        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ProfileGlobal.onExternalInspectMessage('%s')", com.tencent.mm.plugin.appbrand.utils.w2.a(str9));
                        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var2 = this.f77806b;
                        if (a1Var2 != null && (yVar = a1Var2.f77599a) != null && yVar.getJsRuntime() != null) {
                            this.f77806b.f77599a.getJsRuntime().evaluateJavascript(format, r37);
                            break;
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugMsgMrg", "onExternalInspectMessage null");
                            break;
                        }
                    } else {
                        com.eclipsesource.mmv8.V8Inspector.onReceiveData(f47Var.f374011d, f47Var.f374012e);
                        break;
                    }
                    break;
                case 4:
                    r45.o47 o47Var = (r45.o47) new r45.o47().parseFrom(c18);
                    java.lang.String str10 = o47Var.f381910d;
                    int componentId = this.f77806b.f77599a.t3().x0().getCurrentPage().getCurrentPageView().getComponentId();
                    int i38 = o47Var.f381911e;
                    if (i38 != componentId && this.f77806b.f77605g.f77634g != r47) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugMsgMrg", "onDomOp id not current webViewId %d/%d", java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(componentId));
                        break;
                    } else {
                        this.f77806b.f77599a.d(yb1.a.NAME, o47Var.f381910d, r37);
                        break;
                    }
                    break;
                case 5:
                    r45.h47 h47Var = (r45.h47) new r45.h47().parseFrom(c18);
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "onClientNavigator method %s", h47Var.f375834d);
                    if (this.f77809e && "relaunchForProfile".equals(h47Var.f375834d)) {
                        ik1.h0.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.debugger.n1$$a
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.luggage.sdk.jsapi.component.service.y yVar4;
                                com.tencent.mm.plugin.appbrand.debugger.n1 n1Var = com.tencent.mm.plugin.appbrand.debugger.n1.this;
                                com.tencent.mm.plugin.appbrand.debugger.a1 a1Var3 = n1Var.f77806b;
                                if (a1Var3 == null || (yVar4 = a1Var3.f77599a) == null || yVar4.t3() == null || n1Var.f77806b.f77599a.t3().A) {
                                    return;
                                }
                                n1Var.f77806b.f77599a.t3().A = true;
                                n1Var.f77806b.f77599a.t3().z1(null, "");
                            }
                        });
                        break;
                    }
                    break;
                case 6:
                    r45.c47 c47Var = (r45.c47) new r45.c47().parseFrom(c18);
                    com.tencent.mm.plugin.appbrand.debugger.a1 a1Var3 = this.f77806b;
                    synchronized (a1Var3) {
                        z17 = a1Var3.f77613o;
                    }
                    boolean z19 = c47Var.f371291d;
                    if (z17 != z19) {
                        if (z19) {
                            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var4 = this.f77806b;
                            synchronized (a1Var4) {
                                a1Var4.f77613o = r47;
                            }
                        } else {
                            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var5 = this.f77806b;
                            synchronized (a1Var5) {
                                a1Var5.f77613o = false;
                            }
                        }
                        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = this.f77807c;
                        l2Var.getClass();
                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.c2(l2Var));
                        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var2 = this.f77807c;
                        l2Var2.getClass();
                        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.debugger.f2(l2Var2));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    r45.j47 j47Var = (r45.j47) new r45.j47().parseFrom(c18);
                    java.lang.String str11 = j47Var.f377581d;
                    java.lang.String str12 = "typeof DebuggerConnection.onCustomMessage === 'function' && DebuggerConnection.onCustomMessage('" + j47Var.f377581d + "', '" + com.tencent.mm.plugin.appbrand.utils.w2.a(j47Var.f377582e) + "')";
                    com.tencent.mm.plugin.appbrand.debugger.a1 a1Var6 = this.f77806b;
                    if (a1Var6 != null && (yVar2 = a1Var6.f77599a) != null && yVar2.getJsRuntime() != null) {
                        this.f77806b.f77599a.getJsRuntime().evaluateJavascript(str12, r37);
                        break;
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugMsgMrg", "onCustomMsg null");
                        break;
                    }
            }
            r37 = 0;
            r47 = 1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "handleMsg size %d, ack %d", java.lang.Integer.valueOf(linkedList.size()), java.lang.Integer.valueOf(this.f77806b.a()));
        this.f77806b.f77621w += linkedList.size();
        synchronized (this) {
            int i39 = 0;
            while (i39 < this.f77806b.f77617s.size()) {
                int a19 = i39 == 0 ? this.f77806b.a() : ((r45.l47) this.f77806b.f77617s.get(i39 - 1)).f379129d;
                int i47 = ((r45.l47) this.f77806b.f77617s.get(i39)).f379129d;
                if (a19 - i47 != 1) {
                    i(a19 + 1, i47 - 1);
                }
                i39++;
            }
        }
    }

    public void c(long j17, java.lang.String str) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar;
        android.util.ArraySet arraySet = this.f77810f;
        boolean z17 = false;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(dm.i4.COL_ID)) {
                int i17 = jSONObject.getInt(dm.i4.COL_ID);
                if (arraySet.contains(java.lang.Integer.valueOf(i17))) {
                    java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ProfileGlobal.onInspectMessage('%s')", com.tencent.mm.plugin.appbrand.utils.w2.a(str));
                    arraySet.remove(java.lang.Integer.valueOf(i17));
                    com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77806b;
                    if (a1Var != null && (yVar = a1Var.f77599a) != null && yVar.getJsRuntime() != null) {
                        this.f77806b.f77599a.getJsRuntime().evaluateJavascript(format, null);
                        z17 = true;
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.RemoteDebugMsgMrg", "onInspectorMsg null");
                }
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoteDebugMsgMrg", "sendInspectorMsg  e:%s", e17);
        }
        if (z17) {
            return;
        }
        r45.g47 g47Var = new r45.g47();
        g47Var.f374883d = j17;
        g47Var.f374884e = str;
        g(com.tencent.mm.plugin.appbrand.debugger.y1.e(g47Var, this.f77806b, "chromeDevtoolsResult"));
    }

    public void d(r45.z47 z47Var, r45.k47 k47Var) {
        if (com.tencent.mm.plugin.appbrand.debugger.y1.c(this.f77806b, k47Var, z47Var.f391714d, this.f77807c, this)) {
            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77806b;
            int i17 = z47Var.f391715e;
            int i18 = z47Var.f391716f;
            synchronized (a1Var) {
                int i19 = a1Var.f77603e;
                if (i19 >= i17 && i19 <= i18) {
                    a1Var.f77603e = i18;
                }
            }
            int i27 = z47Var.f391715e;
            int i28 = z47Var.f391716f;
            synchronized (this) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it = this.f77806b.f77615q.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.debugger.i1 i1Var = (com.tencent.mm.plugin.appbrand.debugger.i1) it.next();
                    r45.l47 l47Var = i1Var.f77770b;
                    if (l47Var == null) {
                        linkedList.add(i1Var);
                    } else {
                        int i29 = l47Var.f379129d;
                        if (i29 >= i27 && i29 <= i28) {
                            linkedList.add(i1Var);
                        }
                    }
                }
                this.f77806b.f77615q.removeAll(linkedList);
            }
        }
    }

    public void e(r45.j57 j57Var, r45.k47 k47Var) {
        int i17;
        if (com.tencent.mm.plugin.appbrand.debugger.y1.c(this.f77806b, k47Var, j57Var.f377597d, this.f77807c, this)) {
            b(j57Var.f377598e);
            com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77806b;
            int i18 = j57Var.f377599f;
            synchronized (a1Var) {
                if (a1Var.f77603e < i18) {
                    a1Var.f77603e = i18;
                }
            }
            synchronized (this) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it = this.f77806b.f77615q.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.debugger.i1 i1Var = (com.tencent.mm.plugin.appbrand.debugger.i1) it.next();
                    r45.l47 l47Var = i1Var.f77770b;
                    if (l47Var == null) {
                        linkedList.add(i1Var);
                    } else {
                        int i19 = l47Var.f379129d;
                        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var2 = this.f77806b;
                        synchronized (a1Var2) {
                            i17 = a1Var2.f77603e;
                        }
                        if (i19 <= i17) {
                            linkedList.add(i1Var);
                        }
                    }
                }
                this.f77806b.f77615q.removeAll(linkedList);
            }
        }
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "quit");
        r45.h57 h57Var = new r45.h57();
        h57Var.f375865d = this.f77806b.f77600b;
        this.f77805a.b(com.tencent.mm.plugin.appbrand.debugger.y1.b(1004, h57Var));
    }

    public void g(java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77806b;
        if (!(a1Var.f77605g.f77630c == 3)) {
            synchronized (a1Var.f77619u) {
                if (java.lang.System.currentTimeMillis() - this.f77806b.f77607i > 16 && !this.f77811g) {
                }
                this.f77813i.addAll(linkedList);
                a();
                return;
            }
        }
        synchronized (this) {
            h(linkedList, true, false);
        }
    }

    public final synchronized void h(java.util.LinkedList linkedList, boolean z17, boolean z18) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        r45.y47 y47Var = new r45.y47();
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77806b;
        y47Var.f390787d = a1Var.f77600b;
        y47Var.f390789f = a1Var.a();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            y47Var.f390788e.add(((com.tencent.mm.plugin.appbrand.debugger.i1) it.next()).f77770b);
        }
        r45.k47 b17 = com.tencent.mm.plugin.appbrand.debugger.y1.b(1006, y47Var);
        if (!this.f77806b.c() || z18) {
            linkedList.size();
            this.f77805a.b(b17);
        }
        if (z17) {
            synchronized (this) {
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                    this.f77806b.f77615q.addAll(linkedList);
                }
            }
        }
        this.f77807c.getClass();
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var2 = this.f77806b;
        a1Var2.getClass();
        a1Var2.f77607i = java.lang.System.currentTimeMillis();
        a1Var2.f();
        if (!this.f77806b.c()) {
            this.f77814j = 0;
        }
        com.tencent.mm.plugin.appbrand.debugger.z0 z0Var = new com.tencent.mm.plugin.appbrand.debugger.z0();
        z0Var.f77852a = b17.computeSize();
        z0Var.f77853b = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f77806b.f77616r).put(b17.f378375e, z0Var);
    }

    public void i(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "sync minSeq %d, maxSeq %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 > i18) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f77808d;
        if (r2Var.get(java.lang.Integer.valueOf(i17)) != null && currentTimeMillis - ((java.lang.Long) r2Var.get(java.lang.Integer.valueOf(i17))).longValue() < 3000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "sync too fast!");
            return;
        }
        r2Var.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis));
        r45.i57 i57Var = new r45.i57();
        i57Var.f376748d = this.f77806b.f77600b;
        i57Var.f376749e = i17;
        i57Var.f376750f = i18;
        this.f77805a.b(com.tencent.mm.plugin.appbrand.debugger.y1.b(1005, i57Var));
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = this.f77806b;
        a1Var.getClass();
        a1Var.f77610l = java.lang.System.currentTimeMillis();
    }

    public synchronized void j() {
        if (this.f77806b.c()) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f77806b.f77615q.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.debugger.i1 i1Var = (com.tencent.mm.plugin.appbrand.debugger.i1) it.next();
            if (currentTimeMillis - i1Var.f77769a > 5000) {
                i1Var.f77769a = java.lang.System.currentTimeMillis();
                linkedList.add(i1Var);
                i17 += i1Var.f77771c;
                if (i17 >= 65536 || linkedList.size() > 800) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "try2ReSendMsg size %d", java.lang.Integer.valueOf(linkedList.size()));
                    synchronized (this) {
                        h(linkedList, false, false);
                        linkedList.clear();
                        break;
                    }
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemoteDebugMsgMrg", "try2ReSendMsg size %d", java.lang.Integer.valueOf(linkedList.size()));
            synchronized (this) {
                h(linkedList, false, false);
            }
        }
    }
}
