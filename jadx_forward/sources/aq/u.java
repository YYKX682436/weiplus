package aq;

/* loaded from: classes4.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.nio.Buffer f94504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f94505f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f94506g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.C4988x89c61bdd f94507h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.nio.Buffer buffer, int i17, int i18, com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94504e = buffer;
        this.f94505f = i17;
        this.f94506g = i18;
        this.f94507h = c4988x89c61bdd;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq.u(this.f94504e, this.f94505f, this.f94506g, this.f94507h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.ArrayList<java.lang.String> arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f94503d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", java.lang.Thread.currentThread().getName() + ", label start");
            ny4.e eVar = aq.r0.f94475c;
            if (eVar != null) {
                java.nio.Buffer dataBuffer = this.f94504e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataBuffer, "dataBuffer");
                long j17 = eVar.f422990a;
                if (j17 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeChatClsManager", "applyReq >> weChatClsHandle no init");
                    arrayList = new java.util.ArrayList<>();
                } else {
                    arrayList = com.p314xaae8f345.mm.p2825x7e128009.C22967xee5e9be4.m83701xbf7da7a0(j17, dataBuffer, this.f94505f, this.f94506g);
                }
            } else {
                arrayList = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(", applyLabel result: ");
            sb6.append(arrayList != null ? new java.lang.Integer(arrayList.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append("#");
            com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd = this.f94507h;
            boolean z17 = false;
            if (arrayList != null) {
                for (java.lang.String str : arrayList) {
                    java.lang.String str2 = (java.lang.String) kz5.n0.i0(r26.n0.f0(str, new java.lang.String[]{"#"}, false, 0, 6, null));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", str + "||" + c4988x89c61bdd.f134739g + "||" + str2);
                    sb7.append(str2);
                    sb7.append("#");
                    if (aq.r0.f94474b.contains(str2)) {
                        z17 = true;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", sb7.toString());
            if (z17) {
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                aq.s sVar = new aq.s(c4988x89c61bdd, sb7, null);
                this.f94503d = 1;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, sVar, this) == aVar) {
                    return aVar;
                }
            } else {
                p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
                aq.t tVar = new aq.t(c4988x89c61bdd, sb7, null);
                this.f94503d = 2;
                if (p3325xe03a0797.p3326xc267989b.l.g(g3Var2, tVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
