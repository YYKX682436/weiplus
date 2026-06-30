package dq0;

/* loaded from: classes7.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f323869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dq0.a0 f323870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yz5.l lVar, dq0.a0 a0Var) {
        super(1);
        this.f323869d = lVar;
        this.f323870e = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(value)) {
            value = null;
        }
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297 c23981x400ee297 = (com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297) value;
        yz5.l lVar = this.f323869d;
        if (c23981x400ee297 != null) {
            if (lVar != null) {
                lVar.mo146xb9724478(c23981x400ee297);
            }
        } else if (lVar != null) {
            this.f323870e.getClass();
            lVar.mo146xb9724478(new com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297(4096, "", null, 4, null));
        }
        return jz5.f0.f384359a;
    }
}
