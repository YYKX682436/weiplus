package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/IPCUpdateStateNotifier$UpdateStateArgsParcelized;", "kotlin.jvm.PlatformType", "args", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/launching/IPCUpdateStateNotifier$UpdateStateArgsParcelized;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class o7<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o7 f166392d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o7();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c c12345xe3f1206c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c) obj;
        java.lang.String str = c12345xe3f1206c.f165969d;
        final int i17 = c12345xe3f1206c.f165970e;
        final java.lang.String str2 = c12345xe3f1206c.f165971f;
        final ne1.j jVar = c12345xe3f1206c.f165972g;
        final java.lang.String str3 = c12345xe3f1206c.f165973h;
        final java.lang.String str4 = c12345xe3f1206c.f165974i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6 = c12345xe3f1206c.f165975m;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
        if (b17 != null) {
            b17.K("notifyUpdateState(%s) enqueue", jVar);
            final u65.a aVar = new u65.a(2, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$z
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str5 = str2;
                    java.lang.String str6 = str3;
                    java.lang.String str7 = str4;
                    boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.f167695n3;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.this;
                    boolean N0 = o6Var.N0();
                    ne1.j jVar2 = jVar;
                    if (N0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandRuntimeWC", "notifyUpdateState(%s) skip, when enableWxAssistant", jVar2);
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = o6Var.C0();
                    if (C0 == null) {
                        jVar2.getClass();
                    } else {
                        java.lang.String str8 = jVar2.f418058d;
                        java.lang.String mo48798x74292566 = C0.mo48798x74292566();
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(C0.hashCode());
                        int i18 = i17;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Version.UpdateState[appversion]", "dispatch(%s), appId:%s, service:%d, intVersion:%d, stringVersion:%s, passThroughInfo:%s, stablePassThroughInfo:%s", str8, mo48798x74292566, valueOf, java.lang.Integer.valueOf(i18), str5, str6, str7);
                        java.util.HashMap hashMap = new java.util.HashMap(1);
                        java.lang.String str9 = jVar2.f418058d;
                        hashMap.put("state", str9);
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            if (!android.text.TextUtils.isEmpty(str6)) {
                                jSONObject.put("passThroughInfo", new org.json.JSONObject(str6));
                            }
                            if (!android.text.TextUtils.isEmpty(str7)) {
                                jSONObject.put("stablePassThroughInfo", new org.json.JSONObject(str7));
                            }
                            if (jSONObject.length() > 0) {
                                hashMap.put("appContactInfo", jSONObject);
                            }
                        } catch (org.json.JSONException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Version.UpdateState[appversion]", "dispatch(%s), appId:%s, service:%d, put passThroughInfo get Exception:%s", str9, C0.mo48798x74292566(), java.lang.Integer.valueOf(C0.hashCode()), e17);
                        }
                        hashMap.put("appVersion", java.lang.Integer.valueOf(i18));
                        hashMap.put("customVersion", str5);
                        ne1.i iVar = new ne1.i(null);
                        iVar.u(C0);
                        iVar.t(hashMap);
                        iVar.m();
                    }
                    if (ne1.j.UPDATE_READY == jVar2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n6 n6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n6) o6Var.O2.b();
                        if (n6Var.f167561b.getAndSet(true) || !n6Var.f167560a.get()) {
                            return;
                        }
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.RunnableC12433x6273159) n6Var.f167563d).run();
                    }
                }
            });
            b17.I1(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$a0
                @Override // java.lang.Runnable
                public final void run() {
                    u65.a.this.b();
                }
            });
            if (ne1.j.UPDATE_READY == jVar && c11667xc7e59dd6 != null && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h1.a(false)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i.a(b17.f156336n, c11667xc7e59dd6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.f171948a, new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.o6$$a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u65.a.this.b();
                    }
                });
            } else {
                aVar.b();
            }
        }
        if (rVar != null) {
            uk0.a.a(rVar);
        }
    }
}
