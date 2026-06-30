package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f175856d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f175857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f175858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175859g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 f175860h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f175858f = j17;
        this.f175859g = str;
        this.f175860h = t2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.j2 j2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.j2(this.f175858f, this.f175859g, interfaceC29045xdcb5ca57, this.f175860h);
        j2Var.f175857e = obj;
        return j2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.j2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f175856d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f175857e;
            long j17 = this.f175858f;
            this.f175857e = y0Var2;
            this.f175856d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f175857e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.ca caVar = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274039a;
        java.lang.String str = this.f175859g;
        synchronized (caVar) {
            java.util.HashMap hashMap = com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274041c;
            java.lang.Object obj2 = hashMap.get(str);
            java.util.Queue queue = obj2 instanceof java.util.Queue ? (java.util.Queue) obj2 : null;
            if (queue != null) {
                hashMap.remove(str);
                arrayList = new java.util.ArrayList(queue);
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var = this.f175860h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a;
            t2Var.o(arrayList, 0L, null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.ca.f274040b.remove(this.f175859g);
        return jz5.f0.f384359a;
    }
}
