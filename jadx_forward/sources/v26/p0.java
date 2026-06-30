package v26;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v26.m0 f514574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(v26.m0 m0Var) {
        super(2);
        this.f514574d = m0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        oz5.i iVar = (oz5.i) obj2;
        oz5.j mo7094xb5884f29 = iVar.mo7094xb5884f29();
        oz5.i iVar2 = this.f514574d.f514563e.get(mo7094xb5884f29);
        int i17 = p3325xe03a0797.p3326xc267989b.r2.O0;
        if (mo7094xb5884f29 != p3325xe03a0797.p3326xc267989b.q2.f392104d) {
            return java.lang.Integer.valueOf(iVar != iVar2 ? Integer.MIN_VALUE : intValue + 1);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = (p3325xe03a0797.p3326xc267989b.r2) iVar2;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = (p3325xe03a0797.p3326xc267989b.r2) iVar;
        while (true) {
            if (r2Var2 != null) {
                if (r2Var2 == r2Var || !(r2Var2 instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0)) {
                    break;
                }
                p3325xe03a0797.p3326xc267989b.w O = ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.h0) r2Var2).O();
                r2Var2 = O != null ? O.mo144067x29c22ba0() : null;
            } else {
                r2Var2 = null;
                break;
            }
        }
        if (r2Var2 == r2Var) {
            if (r2Var != null) {
                intValue++;
            }
            return java.lang.Integer.valueOf(intValue);
        }
        throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r2Var2 + ", expected child of " + r2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
