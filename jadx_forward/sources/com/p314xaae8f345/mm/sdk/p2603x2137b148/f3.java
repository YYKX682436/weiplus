package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f274197d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f274198e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f274199f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f274200g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.g3 f274201h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.sdk.p2603x2137b148.g3 g3Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f274199f = j17;
        this.f274200g = str;
        this.f274201h = g3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.f3 f3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.f3(this.f274199f, this.f274200g, interfaceC29045xdcb5ca57, this.f274201h);
        f3Var.f274198e = obj;
        return f3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.sdk.p2603x2137b148.f3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.util.ArrayList<java.util.List> arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f274197d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f274198e;
            long j17 = this.f274199f;
            this.f274198e = y0Var2;
            this.f274197d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f274198e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.ca caVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274039a;
        java.lang.String str = this.f274200g;
        synchronized (caVar) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274041c;
            java.lang.Object obj2 = hashMap.get(str);
            arrayList = null;
            java.util.Queue queue = obj2 instanceof java.util.Queue ? (java.util.Queue) obj2 : null;
            if (queue != null) {
                hashMap.remove(str);
                arrayList = new java.util.ArrayList(queue);
            }
        }
        if (arrayList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.util.List list : arrayList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                kz5.h0.u(arrayList2, list);
            }
            if (!arrayList2.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f274201h.f274247f, "clear file slots:\n".concat(kz5.n0.g0(arrayList2, "\n", null, null, 0, null, null, 62, null)));
                ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.sdk.p2603x2137b148.e3(arrayList2));
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.ca caVar2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274039a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274040b.remove(this.f274200g);
        return jz5.f0.f384359a;
    }
}
