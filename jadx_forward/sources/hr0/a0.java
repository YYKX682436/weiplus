package hr0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhr0/a0;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "<init>", "()V", "plugin-performance_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class a0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0 data = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            throw new java.lang.RuntimeException("Not in push proc!");
        }
        jz5.l lastNetworkState = dr0.t0.f324073k.i().getLastNetworkState();
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(lastNetworkState == null ? -1 : ((java.lang.Boolean) lastNetworkState.f384366d).booleanValue() ? 1 : 0);
    }
}
