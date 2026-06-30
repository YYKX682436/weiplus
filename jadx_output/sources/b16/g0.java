package b16;

/* loaded from: classes15.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b16.i0 f17179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(b16.i0 i0Var) {
        super(0);
        this.f17179d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = new java.util.HashMap();
        b16.i0 i0Var = this.f17179d;
        for (java.util.Map.Entry entry : ((java.util.Map) e26.b0.a(i0Var.f17188o, i0Var, b16.i0.f17185s[0])).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            g16.q0 q0Var = (g16.q0) entry.getValue();
            w16.d d17 = w16.d.d(str);
            h16.c cVar = ((t06.g) q0Var).f414537b;
            int ordinal = cVar.f278229a.ordinal();
            if (ordinal == 2) {
                hashMap.put(d17, d17);
            } else if (ordinal == 5) {
                java.lang.String str2 = cVar.f278229a == h16.b.f278226o ? cVar.f278234f : null;
                if (str2 != null) {
                    hashMap.put(d17, w16.d.d(str2));
                }
            }
        }
        return hashMap;
    }
}
