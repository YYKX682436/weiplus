package dn0;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f323363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn0.j f323364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f323365f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f323366g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dn0.j jVar, long j17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f323364e = jVar;
        this.f323365f = j17;
        this.f323366g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        dn0.f fVar = new dn0.f(this.f323364e, this.f323365f, this.f323366g, interfaceC29045xdcb5ca57);
        fVar.f323363d = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f323363d;
        dn0.j jVar = this.f323364e;
        long j17 = this.f323365f;
        yz5.l lVar = this.f323366g;
        synchronized (jVar) {
            if (!jVar.f323378e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(jVar.f323374a, "ScoreHandleInit is false");
                return jz5.f0.f384359a;
            }
            int m46466x863fee90 = jVar.f323375b.m46466x863fee90(j17);
            if (m46466x863fee90 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(jVar.f323374a, "GetNoteNums error: " + m46466x863fee90);
                if (lVar != null) {
                    lVar.mo146xb9724478(null);
                }
                return jz5.f0.f384359a;
            }
            int[] iArr = new int[m46466x863fee90];
            int[] iArr2 = new int[m46466x863fee90];
            int[] iArr3 = new int[m46466x863fee90];
            int[] iArr4 = new int[1];
            int m46465x3d7d2516 = jVar.f323375b.m46465x3d7d2516(j17, iArr, iArr2, new int[m46466x863fee90], iArr3, iArr4);
            java.lang.String str = jVar.f323374a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GetNoteInfo res: ");
            sb6.append(m46465x3d7d2516);
            sb6.append(" numArray: ");
            sb6.append(iArr4[0]);
            sb6.append(" num: ");
            sb6.append(m46466x863fee90);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (m46465x3d7d2516 != 0) {
                if (lVar != null) {
                    lVar.mo146xb9724478(null);
                }
                return jz5.f0.f384359a;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(m46466x863fee90);
            for (int i17 = 0; i17 < m46466x863fee90; i17++) {
                arrayList.add(new jh2.b());
            }
            for (int i18 = 0; i18 < m46466x863fee90; i18++) {
                ((jh2.b) arrayList.get(i18)).f381336a = iArr[i18];
                ((jh2.b) arrayList.get(i18)).f381337b = iArr2[i18];
                ((jh2.b) arrayList.get(i18)).f381338c = iArr[i18] + iArr2[i18];
                ((jh2.b) arrayList.get(i18)).f381339d = iArr3[i18];
            }
            if (p3325xe03a0797.p3326xc267989b.z0.h(y0Var) && lVar != null) {
                lVar.mo146xb9724478(arrayList);
            }
            return jz5.f0.f384359a;
        }
    }
}
