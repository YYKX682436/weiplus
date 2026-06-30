package yd2;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f542591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd2.b f542592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yd2.n f542593f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yd2.a f542594g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f542595h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yd2.j f542596i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542597m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yd2.b bVar, yd2.n nVar, yd2.a aVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, yd2.j jVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f542592e = bVar;
        this.f542593f = nVar;
        this.f542594g = aVar;
        this.f542595h = concurrentHashMap;
        this.f542596i = jVar;
        this.f542597m = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yd2.f(this.f542592e, this.f542593f, this.f542594g, this.f542595h, this.f542596i, this.f542597m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yd2.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [yd2.j] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1, types: [yd2.j] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [yd2.j] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.Object c17;
        yd2.a aVar = this.f542594g;
        java.lang.String str = this.f542597m;
        ?? r47 = "{\"error\":\"tool cast failed: ";
        java.lang.String str2 = "handleToolCalls: params class not registered for ";
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f542591d;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        ?? r122 = this.f542596i;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f542595h;
        yd2.n nVar = this.f542593f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.lang.String toolCallId = nVar.f542611a;
                yd2.b bVar = this.f542592e;
                long j17 = bVar.f542562a;
                long j18 = bVar.f542563b;
                java.lang.String sessionId = bVar.f542564c;
                f0Var = f0Var2;
                long j19 = bVar.f542565d;
                java.lang.String anchorUsername = bVar.f542567f;
                bVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toolCallId, "toolCallId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUsername, "anchorUsername");
                yd2.b bVar2 = new yd2.b(j17, j18, sessionId, j19, toolCallId, anchorUsername);
                try {
                    if (!aVar.c(bVar2)) {
                        java.lang.String str3 = nVar.f542611a;
                        concurrentHashMap.put(str3, this.f542596i.c(this.f542592e, str3, false, "{\"error\":\"tool unavailable\"}", 1002));
                        return f0Var;
                    }
                    r47 = r122;
                    try {
                        java.lang.Class cls = (java.lang.Class) r47.f542608c.get(str);
                        if (cls == null) {
                            yd2.j.a(r47);
                            str2 = "Finder.Live.AiAssistant.ToolManager";
                            try {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "handleToolCalls: params class not registered for " + str);
                                java.lang.String str4 = nVar.f542611a;
                                yd2.j jVar = this.f542596i;
                                yd2.b bVar3 = this.f542592e;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"error\":\"params not registered: ");
                                sb6.append(str);
                                sb6.append("\"}");
                                concurrentHashMap.put(str4, jVar.c(bVar3, str4, false, sb6.toString(), 1003));
                                return f0Var;
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                r122 = "\"}";
                                yd2.j.a(r47);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "handleToolCalls: error for " + nVar.f542611a + ": " + e.getMessage());
                                java.lang.String str5 = nVar.f542611a;
                                concurrentHashMap.put(str5, this.f542596i.c(this.f542592e, str5, false, "{\"error\":\"" + e.getMessage() + r122, 1006));
                                return f0Var;
                            }
                        }
                        yd2.l b17 = yd2.j.b(r47, cls, nVar.f542614d);
                        yd2.a aVar3 = aVar instanceof yd2.a ? aVar : null;
                        if (aVar3 == null) {
                            java.lang.String str6 = nVar.f542611a;
                            concurrentHashMap.put(str6, this.f542596i.c(this.f542592e, str6, false, "{\"error\":\"tool cast failed: " + str + "\"}", 1004));
                            return f0Var;
                        }
                        long a17 = aVar.a();
                        yd2.e eVar = new yd2.e(aVar3, b17, bVar2, this.f542596i, this.f542592e, this.f542593f, null);
                        this.f542591d = 1;
                        c17 = p3325xe03a0797.p3326xc267989b.a4.c(a17, eVar, this);
                        if (c17 == aVar2) {
                            return aVar2;
                        }
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        r122 = "\"}";
                        r47 = r47;
                        str2 = "Finder.Live.AiAssistant.ToolManager";
                        yd2.j.a(r47);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "handleToolCalls: error for " + nVar.f542611a + ": " + e.getMessage());
                        java.lang.String str52 = nVar.f542611a;
                        concurrentHashMap.put(str52, this.f542596i.c(this.f542592e, str52, false, "{\"error\":\"" + e.getMessage() + r122, 1006));
                        return f0Var;
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    r122 = "\"}";
                    r47 = r122;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                    c17 = obj;
                    f0Var = f0Var2;
                } catch (java.lang.Exception e27) {
                    e = e27;
                    str2 = "Finder.Live.AiAssistant.ToolManager";
                    f0Var = f0Var2;
                    r47 = r122;
                    r122 = "\"}";
                    yd2.j.a(r47);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "handleToolCalls: error for " + nVar.f542611a + ": " + e.getMessage());
                    java.lang.String str522 = nVar.f542611a;
                    concurrentHashMap.put(str522, this.f542596i.c(this.f542592e, str522, false, "{\"error\":\"" + e.getMessage() + r122, 1006));
                    return f0Var;
                }
            }
            r45.mf1 mf1Var = (r45.mf1) c17;
            java.lang.String str7 = nVar.f542611a;
            if (mf1Var == null) {
                mf1Var = this.f542596i.c(this.f542592e, str7, false, "{\"error\":\"timeout\"}", 1004);
            }
            concurrentHashMap.put(str7, mf1Var);
        } catch (java.lang.Exception e28) {
            e = e28;
        }
        return f0Var;
    }
}
