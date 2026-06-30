package vp;

/* loaded from: classes13.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.v0 f520371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(vp.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520371d = v0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vp.u0(this.f520371d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vp.u0 u0Var = (vp.u0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        u0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vp.v0 v0Var = this.f520371d;
        v0Var.f520377f.writeLock().lock();
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "recalculateFollowDrawList: clearing follow danmaku (fake insert danmaku)");
            java.util.Iterator it = v0Var.f520376e.iterator();
            while (it.hasNext()) {
                ((java.util.List) it.next()).clear();
            }
            ((java.util.ArrayList) v0Var.f520376e).clear();
            int i17 = v0Var.f520372a;
            if (i17 > 0) {
                java.util.List list = v0Var.f520376e;
                java.util.ArrayList arrayList = new java.util.ArrayList(i17);
                for (int i18 = 0; i18 < i17; i18++) {
                    arrayList.add(new java.util.ArrayList());
                }
                ((java.util.ArrayList) list).addAll(arrayList);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "recalculateFollowDrawList: successfully cleared and reinitialized follow structure");
            v0Var.f520377f.writeLock().unlock();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "recalculateFollowDrawList: resumed task processing");
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            v0Var.f520377f.writeLock().unlock();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "recalculateFollowDrawList: resumed task processing");
            throw th6;
        }
    }
}
