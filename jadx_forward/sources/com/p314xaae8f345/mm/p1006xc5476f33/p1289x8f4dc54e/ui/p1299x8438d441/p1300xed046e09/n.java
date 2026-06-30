package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f175898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f175899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f175900f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f175899e = str;
        this.f175900f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n(this.f175899e, this.f175900f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String PROCESS_MAIN;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f175898d;
        java.lang.String str = this.f175899e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c)) {
                PROCESS_MAIN = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            } else {
                PROCESS_MAIN = str;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[TRACE_VIDEO_PRELOAD] doCacheVideo  url:");
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f175900f;
            android.os.Bundle bundle = (android.os.Bundle) h0Var.f391656d;
            sb6.append(bundle != null ? bundle.getString("url") : null);
            sb6.append("  length:");
            android.os.Bundle bundle2 = (android.os.Bundle) h0Var.f391656d;
            sb6.append(bundle2 != null ? new java.lang.Long(bundle2.getLong("length")) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizVideoPreloadLogic", sb6.toString());
            com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(PROCESS_MAIN, (android.os.Parcelable) h0Var.f391656d, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.m.f175889d, null);
            this.f175898d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175984a.c(str);
        return jz5.f0.f384359a;
    }
}
