package dn0;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn0.j f323368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f323369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f323370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f323371g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f323372h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dn0.j jVar, long j17, byte[] bArr, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f323368d = jVar;
        this.f323369e = j17;
        this.f323370f = bArr;
        this.f323371g = i17;
        this.f323372h = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dn0.h(this.f323368d, this.f323369e, this.f323370f, this.f323371g, this.f323372h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn0.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dn0.j jVar = this.f323368d;
        long j17 = this.f323369e;
        byte[] bArr = this.f323370f;
        int i17 = this.f323371g;
        int i18 = this.f323372h;
        synchronized (jVar) {
            if (!jVar.f323378e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(jVar.f323374a, "ScoreHandleInit is false");
                return jz5.f0.f384359a;
            }
            boolean z17 = true;
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            jVar.f323375b.m46469x50c5b64f(j17, bArr, i17, i18, iArr, new int[1], iArr2, iArr3);
            int i19 = iArr3[0];
            if (i19 != -1) {
                int i27 = jVar.f323380g + i19;
                jVar.f323380g = i27;
                int i28 = jVar.f323379f + 1;
                jVar.f323379f = i28;
                dn0.e eVar = jVar.f323377d;
                if (eVar != null) {
                    float f17 = i27 / i28;
                    float f18 = i18;
                    kh2.m mVar = (kh2.m) eVar;
                    jh2.a aVar2 = mVar.f389555a.f389562b;
                    if (aVar2 != null) {
                        aVar2.v1(mVar.f389556b.f427916a, i19, i27, f17, i28, f18);
                    }
                }
            }
            dn0.e eVar2 = jVar.f323377d;
            if (eVar2 != null) {
                if (iArr[0] != 1) {
                    z17 = false;
                }
                int i29 = iArr2[0];
                float f19 = i18;
                kh2.m mVar2 = (kh2.m) eVar2;
                jh2.a aVar3 = mVar2.f389555a.f389562b;
                if (aVar3 != null) {
                    aVar3.M4(mVar2.f389556b.f427916a, i29, z17, f19);
                }
            }
            return jz5.f0.f384359a;
        }
    }
}
