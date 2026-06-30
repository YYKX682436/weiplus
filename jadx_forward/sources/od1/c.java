package od1;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public long f426136b;

    /* renamed from: c, reason: collision with root package name */
    public long f426137c;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f426135a = "";

    /* renamed from: d, reason: collision with root package name */
    public final org.json.JSONObject f426138d = new org.json.JSONObject();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 receiver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "receiver");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.m48815xb9a3283c(receiver.mo32091x9a3f0ba2())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "game not need to trigger the callback");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 x17 = receiver.x();
        java.lang.Boolean bool = null;
        boolean z17 = false;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.y(x17 != null ? x17.qe("supportListenNewPerformanceMetric") : null, false)) {
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f426135a);
            jSONObject.put("startTime", this.f426136b);
            jSONObject.put("endTime", this.f426137c);
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, this.f426138d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "dispatch " + jSONObject);
            receiver.g("onNewPerformanceMetric", jSONObject.toString());
            return;
        }
        if (receiver.k(od1.i.class) == null) {
            synchronized (receiver) {
                if (receiver.k(od1.i.class) == null) {
                    receiver.l(new od1.i());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "support listen NewPerformanceMetric");
                }
            }
        }
        od1.i iVar = (od1.i) receiver.k(od1.i.class);
        if (iVar != null) {
            java.lang.String str = this.f426135a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NewPerformanceMetricStateManager", "checkIsListeningProvidedName: " + str);
            java.util.HashSet hashSet = iVar.f426139d;
            if (hashSet == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NewPerformanceMetricStateManager", "false");
            } else {
                z17 = hashSet.contains(str);
            }
            bool = java.lang.Boolean.valueOf(z17);
        }
        if (iVar != null) {
            java.lang.String str2 = this.f426135a;
            long j17 = this.f426136b;
            long j18 = this.f426137c;
            org.json.JSONObject jSONObject2 = this.f426138d;
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NewPerformanceMetricStateManager", "updateCachedData:" + str2);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, str2);
                jSONObject3.put("startTime", j17);
                jSONObject3.put("endTime", j18);
                jSONObject3.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, jSONObject2);
                iVar.f426140e.add(jSONObject3);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.NewPerformanceMetricStateManager", e17.getMessage());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "canUseProvidedName:" + bool);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, this.f426135a);
        jSONObject.put("startTime", this.f426136b);
        jSONObject.put("endTime", this.f426137c);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.LiveExKeys.f54518xa6accc96, this.f426138d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.EventOnNewPerformanceMetric", "dispatch after Listened " + jSONObject);
        receiver.g("onNewPerformanceMetric", jSONObject.toString());
    }

    public final void b(java.lang.String name, java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f426138d.put(name, value);
    }
}
