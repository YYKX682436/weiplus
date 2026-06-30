package vp;

/* loaded from: classes13.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp.v0 f520356d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(vp.v0 v0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f520356d = v0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vp.p0(this.f520356d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vp.p0 p0Var = (vp.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        p0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vp.v0 v0Var = this.f520356d;
        synchronized (v0Var.f520373b) {
            v0Var.f520373b.clear();
        }
        vp.v0 v0Var2 = this.f520356d;
        v0Var2.c();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = v0Var2.f520375d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            java.util.Iterator it = ((java.util.ArrayList) v0Var2.f520374c).iterator();
            while (it.hasNext()) {
                ((java.util.List) it.next()).clear();
            }
            reentrantReadWriteLock.writeLock().unlock();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "Cleared all row data");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "Cleared all danmaku data (async)");
            vp.v0 v0Var3 = this.f520356d;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = v0Var3.f520377f;
            reentrantReadWriteLock2.writeLock().lock();
            try {
                java.util.Iterator it6 = ((java.util.ArrayList) v0Var3.f520376e).iterator();
                while (it6.hasNext()) {
                    ((java.util.List) it6.next()).clear();
                }
                reentrantReadWriteLock2.writeLock().unlock();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "Cleared all follow row data");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuAsyncDataSource", "Cleared all follow danmaku data (async)");
                return jz5.f0.f384359a;
            } catch (java.lang.Throwable th6) {
                reentrantReadWriteLock2.writeLock().unlock();
                throw th6;
            }
        } catch (java.lang.Throwable th7) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th7;
        }
    }
}
