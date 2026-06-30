package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0019\"\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000f0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/k;", "", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "owner", "Ljz5/f0;", "register", "unregister", "onStateChanged", "addSourceOwner", "Landroidx/lifecycle/y;", "removeSourceOwner", "on", "off", "", "active", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "sourceOwners", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Function1;", "", "Lcom/tencent/matrix/lifecycle/l;", "reduceOperator", "Lyz5/l;", "", "statefulOwners", "<init>", "(Lyz5/l;[Lcom/tencent/matrix/lifecycle/IStatefulOwner;)V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.MultiSourceStatefulOwner */
/* loaded from: classes12.dex */
public class C4665xfc64bc93 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k {
    private final yz5.l reduceOperator;
    private final java.util.concurrent.ConcurrentLinkedQueue<com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe> sourceOwners;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4665xfc64bc93(yz5.l reduceOperator, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe... statefulOwners) {
        super(true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reduceOperator, "reduceOperator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statefulOwners, "statefulOwners");
        this.reduceOperator = reduceOperator;
        this.sourceOwners = new java.util.concurrent.ConcurrentLinkedQueue<>();
        for (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe interfaceC4662x21f4acfe : statefulOwners) {
            m40987xd6dc2ea3(interfaceC4662x21f4acfe);
        }
    }

    /* renamed from: onStateChanged */
    private final void m40986xaba1ac62() {
        if (((java.lang.Boolean) this.reduceOperator.mo146xb9724478(this.sourceOwners)).booleanValue()) {
            m40993xcc985f3c();
        } else {
            m40992xc67387b2();
        }
    }

    /* renamed from: register */
    private final void m40987xd6dc2ea3(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe interfaceC4662x21f4acfe) {
        if (interfaceC4662x21f4acfe instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4665xfc64bc93) {
            throw new java.lang.IllegalArgumentException("NOT allow to add MultiSourceStatefulOwner as source, consider to add its shadow owner");
        }
        this.sourceOwners.add(interfaceC4662x21f4acfe);
        interfaceC4662x21f4acfe.mo40966xc74540ab(this);
    }

    /* renamed from: unregister */
    private final void m40988x31d4943c(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 c4666xb9b62ea7) {
        this.sourceOwners.remove(c4666xb9b62ea7);
        c4666xb9b62ea7.mo40970xb5bdeb7a(this);
        m40986xaba1ac62();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l
    /* renamed from: active */
    public boolean mo40960xab2f7f06() {
        if (this.sourceOwners.isEmpty()) {
            return super.mo40960xab2f7f06();
        }
        java.lang.Boolean bool = (java.lang.Boolean) this.reduceOperator.mo146xb9724478(this.sourceOwners);
        if (bool.booleanValue()) {
            m40993xcc985f3c();
        } else {
            m40992xc67387b2();
        }
        return bool.booleanValue();
    }

    /* renamed from: addSourceOwner */
    public void mo40979x1f1aa3f7(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        m40987xd6dc2ea3(owner);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        m40986xaba1ac62();
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        m40986xaba1ac62();
    }

    /* renamed from: removeSourceOwner */
    public void mo40980x72c16834(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        m40988x31d4943c(owner);
    }

    /* renamed from: addSourceOwner */
    public com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4666xb9b62ea7 mo40978x1f1aa3f7(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4664x429fcc18.f19926x233c02ec.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4664x429fcc18 c4664x429fcc18 = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4664x429fcc18(owner, false, 2, null);
        mo40979x1f1aa3f7(c4664x429fcc18);
        return c4664x429fcc18;
    }
}
