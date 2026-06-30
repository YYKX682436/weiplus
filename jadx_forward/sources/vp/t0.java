package vp;

/* loaded from: classes13.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.v0 f520368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(vp.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520368d = v0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vp.t0(this.f520368d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vp.t0 t0Var = (vp.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        t0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List S0;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f520368d.f520375d.writeLock().lock();
        try {
            vp.v0 v0Var = this.f520368d;
            synchronized (v0Var.f520373b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "recalculateDrawList: starting recalculation with " + v0Var.f520373b.size() + " danmaku");
                S0 = kz5.n0.S0(v0Var.f520373b);
            }
            int i17 = this.f520368d.f520372a;
            java.util.ArrayList arrayList = new java.util.ArrayList(i17);
            int i18 = 0;
            for (int i19 = 0; i19 < i17; i19++) {
                arrayList.add(new java.util.ArrayList());
            }
            java.util.Iterator it = S0.iterator();
            while (it.hasNext()) {
                vp.v0.a(this.f520368d, (wp.a) it.next(), arrayList);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("recalculateDrawList: completed calculation, new structure has ");
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                i18 += ((java.util.List) it6.next()).size();
            }
            sb6.append(i18);
            sb6.append(" danmaku");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", sb6.toString());
            ((java.util.ArrayList) this.f520368d.f520374c).clear();
            ((java.util.ArrayList) this.f520368d.f520374c).addAll(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "recalculateDrawList: successfully replaced structure with new layout");
            this.f520368d.f520375d.writeLock().unlock();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "recalculateDrawList: resumed task processing");
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            this.f520368d.f520375d.writeLock().unlock();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "recalculateDrawList: resumed task processing");
            throw th6;
        }
    }
}
