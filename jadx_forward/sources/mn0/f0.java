package mn0;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411265d;

    public f0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mn0.f0(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new mn0.f0((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f411265d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlayerCountReport", "start report create wait");
            this.f411265d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(300000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        mn0.g0 g0Var = mn0.i0.H;
        java.util.Map map = mn0.i0.f411273J;
        synchronized (map) {
            hashMap.putAll(map);
            map.clear();
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Map map2 = mn0.i0.K;
        synchronized (map2) {
            hashMap2.putAll(map2);
            map2.clear();
        }
        mn0.e0 e0Var = mn0.e0.f411263d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlayerCountReport", "start createReportMap sum: " + hashMap.size() + " leakReportMap sum: " + hashMap2.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            e0Var.mo147xb9724478(entry.getKey(), new java.lang.Integer(10), java.lang.String.valueOf(((java.lang.Number) entry.getValue()).intValue()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlayerCountReport", "report create count playScene: " + entry.getKey() + " sum: " + ((java.lang.Number) entry.getValue()).intValue());
        }
        for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
            e0Var.mo147xb9724478(entry2.getKey(), new java.lang.Integer(11), java.lang.String.valueOf(((java.lang.Number) entry2.getValue()).intValue()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlayerCountReport", "report leak count playScene: " + entry2.getKey() + " sum: " + ((java.lang.Number) entry2.getValue()).intValue());
        }
        return jz5.f0.f384359a;
    }
}
