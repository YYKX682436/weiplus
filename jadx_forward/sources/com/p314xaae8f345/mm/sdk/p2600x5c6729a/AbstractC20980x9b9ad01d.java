package com.p314xaae8f345.mm.sdk.p2600x5c6729a;

/* renamed from: com.tencent.mm.sdk.event.IListener */
/* loaded from: classes12.dex */
public abstract class AbstractC20980x9b9ad01d<T extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1> implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: __eventId */
    protected int f39173x3fe91575;

    /* renamed from: lifecycleOwner */
    private final p012xc85e97e9.p093xedfae76a.y f39174xa7302d69;

    /* renamed from: mCallbackProperty */
    private fm5.b f39175xecce17c7;

    /* renamed from: priority */
    private final int f39176xba8879a4;

    public AbstractC20980x9b9ad01d(p012xc85e97e9.p093xedfae76a.y yVar) {
        this(yVar, 0);
    }

    public static /* synthetic */ void a(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d) {
        if (abstractC20980x9b9ad01d.f39174xa7302d69.mo273xed6858b4().b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            abstractC20980x9b9ad01d.f39174xa7302d69.mo273xed6858b4().a(abstractC20980x9b9ad01d);
        } else {
            abstractC20980x9b9ad01d.m77671xe98eb92f();
        }
    }

    /* renamed from: __getEventID */
    public int m77669x78c2cdf() {
        if (this.f39173x3fe91575 == 0) {
            java.lang.System.currentTimeMillis();
            java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
            if (!(genericSuperclass instanceof java.lang.reflect.ParameterizedType)) {
                genericSuperclass = getClass().getSuperclass().getGenericSuperclass();
            }
            this.f39173x3fe91575 = ((java.lang.Class) ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0]).getName().hashCode();
            java.lang.System.currentTimeMillis();
        }
        return this.f39173x3fe91575;
    }

    /* renamed from: alive */
    public synchronized void mo48813x58998cd() {
        if (this.f39175xecce17c7 == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.k2.b(this);
            this.f39175xecce17c7 = com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d.a(this);
        }
        if (!(this.f39174xa7302d69.mo273xed6858b4() instanceof i75.a)) {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.event.IListener$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d.a(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d.this);
                }
            });
        } else if (this.f39174xa7302d69.mo273xed6858b4().b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            this.f39174xa7302d69.mo273xed6858b4().a(this);
        } else {
            m77671xe98eb92f();
        }
    }

    /* renamed from: callback */
    public abstract boolean mo1xf5bc2045(T t17);

    /* renamed from: dead */
    public synchronized void mo48814x2efc64() {
        fm5.b bVar = this.f39175xecce17c7;
        if (bVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.k2.c((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) bVar.f345717e);
            this.f39175xecce17c7.mo10668x2efc64();
            this.f39175xecce17c7 = null;
        }
        if (this.f39174xa7302d69.mo273xed6858b4() instanceof i75.a) {
            this.f39174xa7302d69.mo273xed6858b4().c(this);
        } else {
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.sdk.event.IListener$$b
                @Override // java.lang.Runnable
                public final void run() {
                    r0.f39174xa7302d69.mo273xed6858b4().c(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: getPriority */
    public int m77670x3662b71a() {
        return this.f39176xba8879a4;
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: onLifecycleDestroy */
    public void m77671xe98eb92f() {
        fm5.b bVar = this.f39175xecce17c7;
        if (bVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.k2.c((com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) bVar.f345717e);
            this.f39175xecce17c7.mo10668x2efc64();
            this.f39175xecce17c7 = null;
        }
    }

    public AbstractC20980x9b9ad01d(p012xc85e97e9.p093xedfae76a.y yVar, int i17) {
        this.f39173x3fe91575 = 0;
        this.f39174xa7302d69 = yVar;
        this.f39176xba8879a4 = i17;
    }
}
