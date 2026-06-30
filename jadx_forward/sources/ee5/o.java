package ee5;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.z f333516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f333517e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ee5.z zVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333516d = zVar;
        this.f333517e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ee5.o(this.f333516d, this.f333517e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        int size;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        new java.util.ArrayList();
        nc5.a aVar2 = nc5.a.f417721a;
        ee5.z zVar = this.f333516d;
        long d17 = aVar2.d(zVar.f333632f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> timestamp: " + d17);
        boolean z18 = this.f333517e;
        if (d17 == -1) {
            android.database.Cursor A6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).A6(zVar.f333632f, 500);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(A6, "getLimitImage(...)");
            java.util.ArrayList c17 = aVar2.c(A6, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> imageDataListResult: " + c17.size() + ", " + z18);
            if (!z18 && (!c17.isEmpty())) {
                zVar.W6();
            }
            return new jz5.l(c17, new java.util.ArrayList());
        }
        android.database.Cursor J3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).J3(zVar.f333632f, d17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J3, "getImageLargeThanTime(...)");
        java.util.ArrayList c18 = aVar2.c(J3, false);
        int size2 = c18.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> latestSize: " + size2 + ", " + z18);
        if (size2 > 0 && !z18) {
            zVar.W6();
            z18 = true;
        }
        long e17 = aVar2.e(zVar.f333632f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldest timeStamp: " + e17);
        if (e17 != -1 && e17 != d17) {
            android.database.Cursor K3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).K3(zVar.f333632f, e17, 50);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K3, "getImageSmallThanTime(...)");
            java.util.ArrayList c19 = aVar2.c(K3, false);
            int size3 = c19.size();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldestSize: " + size3 + ", " + z18);
            c18.addAll(c19);
            if (size3 > 0 && !z18) {
                zVar.W6();
                z17 = true;
                java.util.ArrayList d18 = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.d(zVar.f333632f, "0");
                size = d18.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldDataInIdentifyDBSize: " + size + ", " + z17);
                if (size > 0 && !z17) {
                    zVar.W6();
                }
                if (c18.isEmpty() && d18.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "show image done when get data");
                    pm0.v.X(new ee5.n(zVar));
                }
                return new jz5.l(c18, d18);
            }
        }
        z17 = z18;
        java.util.ArrayList d182 = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.d(zVar.f333632f, "0");
        size = d182.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "getToIdentifyData >> oldDataInIdentifyDBSize: " + size + ", " + z17);
        if (size > 0) {
            zVar.W6();
        }
        if (c18.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiImageUIC", "show image done when get data");
            pm0.v.X(new ee5.n(zVar));
        }
        return new jz5.l(c18, d182);
    }
}
