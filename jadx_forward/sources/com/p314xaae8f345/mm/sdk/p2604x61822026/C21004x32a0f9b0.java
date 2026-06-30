package com.p314xaae8f345.mm.sdk.p2604x61822026;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tencent/mm/sdk/statecenter/RootProcessor;", "Lj75/a;", "State", "Lj75/c;", "Landroidx/lifecycle/x;", "<init>", "()V", "LifecycleBoundProcessor", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sdk.statecenter.RootProcessor */
/* loaded from: classes10.dex */
public class C21004x32a0f9b0<State extends j75.a> implements j75.c, p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f274676d = new java.util.concurrent.ConcurrentHashMap();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\n"}, d2 = {"Lcom/tencent/mm/sdk/statecenter/RootProcessor$LifecycleBoundProcessor;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onLifecycleDestroy", "Landroidx/lifecycle/y;", "owner", "Lj75/c;", "processor", "<init>", "(Lcom/tencent/mm/sdk/statecenter/RootProcessor;Landroidx/lifecycle/y;Lj75/c;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.sdk.statecenter.RootProcessor$LifecycleBoundProcessor */
    /* loaded from: classes10.dex */
    public class LifecycleBoundProcessor implements p012xc85e97e9.p093xedfae76a.x {

        /* renamed from: d, reason: collision with root package name */
        public final p012xc85e97e9.p093xedfae76a.y f274677d;

        /* renamed from: e, reason: collision with root package name */
        public final j75.c f274678e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0 f274679f;

        public LifecycleBoundProcessor(com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0 c21004x32a0f9b0, p012xc85e97e9.p093xedfae76a.y owner, j75.c processor) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
            this.f274679f = c21004x32a0f9b0;
            this.f274677d = owner;
            this.f274678e = processor;
        }

        public final void a(j75.a state) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
            if (this.f274677d.mo273xed6858b4().b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
                this.f274678e.a(state);
            }
        }

        @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
        /* renamed from: onLifecycleDestroy */
        public void m77838xe98eb92f() {
            this.f274677d.hashCode();
            j75.c cVar = this.f274678e;
            cVar.hashCode();
            com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0.LifecycleBoundProcessor lifecycleBoundProcessor = (com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0.LifecycleBoundProcessor) this.f274679f.f274676d.remove(java.lang.Integer.valueOf(cVar.hashCode()));
            if (lifecycleBoundProcessor != null) {
                lifecycleBoundProcessor.f274677d.mo273xed6858b4().c(lifecycleBoundProcessor);
            }
        }
    }

    @Override // j75.c
    public void a(j75.a state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f274676d;
        java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0.LifecycleBoundProcessor) ((java.util.Map.Entry) it.next()).getValue());
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0.LifecycleBoundProcessor) it6.next()).a(state);
        }
    }

    public final void b(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, j75.c processor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processor, "processor");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f274676d;
        com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0.LifecycleBoundProcessor lifecycleBoundProcessor = (com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0.LifecycleBoundProcessor) concurrentHashMap.get(java.lang.Integer.valueOf(processor.hashCode()));
        if (lifecycleBoundProcessor != null) {
            p012xc85e97e9.p093xedfae76a.y yVar = lifecycleBoundProcessor.f274677d;
            if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar, lifecycleOwner))) {
                yVar = null;
            }
            if (yVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mvvm.RootProcessor", "Cannot add the same processor with different lifecycles");
                return;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(processor.hashCode());
        com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0.LifecycleBoundProcessor lifecycleBoundProcessor2 = new com.p314xaae8f345.mm.sdk.p2604x61822026.C21004x32a0f9b0.LifecycleBoundProcessor(this, lifecycleOwner, processor);
        p012xc85e97e9.p093xedfae76a.y yVar2 = lifecycleBoundProcessor2.f274677d;
        if (yVar2.mo273xed6858b4().b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            yVar2.mo273xed6858b4().a(lifecycleBoundProcessor2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Mvvm.RootProcessor", "attachObserver fail, lifecycle is destroyed owner:" + yVar2.hashCode() + " observer:" + lifecycleBoundProcessor2.f274678e.hashCode());
        }
        concurrentHashMap.put(valueOf, lifecycleBoundProcessor2);
    }
}
