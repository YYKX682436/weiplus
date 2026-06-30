package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB1\u0012\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00170\u0014\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/DispatcherStateOwner;", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/j;", "Ljz5/f0;", "dispatchOn", "dispatchOff", "", "toString", "Lcom/tencent/matrix/lifecycle/k;", "attachedObserver", "Lcom/tencent/matrix/lifecycle/k;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "attachedSource", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "getAttachedSource", "()Lcom/tencent/matrix/lifecycle/IStatefulOwner;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lkotlin/Function1;", "", "Lcom/tencent/matrix/lifecycle/l;", "", "reduceOperator", "<init>", "(Lyz5/l;Lcom/tencent/matrix/lifecycle/IStatefulOwner;Ljava/lang/String;)V", "Companion", "com/tencent/matrix/lifecycle/supervisor/c", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.supervisor.DispatcherStateOwner */
/* loaded from: classes12.dex */
public class C4684xa6b8b6c9 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4665xfc64bc93 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j {

    /* renamed from: Companion */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.c f19976x233c02ec = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.c(null);

    /* renamed from: dispatchOwners */
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9> f19977x9d3dd13a = new java.util.concurrent.ConcurrentHashMap<>();
    private com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k attachedObserver;
    private final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe attachedSource;
    private final java.lang.String name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4684xa6b8b6c9(yz5.l reduceOperator, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe attachedSource, java.lang.String name) {
        super(reduceOperator, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reduceOperator, "reduceOperator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attachedSource, "attachedSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.attachedSource = attachedSource;
        this.name = name;
        f19977x9d3dd13a.put(name, this);
    }

    /* renamed from: access$dispatchOff */
    public static final /* synthetic */ void m41087x4bf2e755(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9 c4684xa6b8b6c9) {
        c4684xa6b8b6c9.m41092x3f88e695();
    }

    /* renamed from: access$dispatchOn */
    public static final /* synthetic */ void m41088xe9acff39(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4684xa6b8b6c9 c4684xa6b8b6c9) {
        c4684xa6b8b6c9.m41093xb7ba17f9();
    }

    /* renamed from: access$getDispatchOwners$cp */
    public static final /* synthetic */ java.util.concurrent.ConcurrentHashMap m41090x31dedea1() {
        return f19977x9d3dd13a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dispatchOff */
    public final void m41092x3f88e695() {
        m40992xc67387b2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dispatchOn */
    public final void m41093xb7ba17f9() {
        m40993xcc985f3c();
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe getAttachedSource() {
        return this.attachedSource;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j
    /* renamed from: serial */
    public boolean mo40995xca01fdf4() {
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m41096x9616526c() {
        return "DispatcherStateOwner_" + this.name;
    }
}
