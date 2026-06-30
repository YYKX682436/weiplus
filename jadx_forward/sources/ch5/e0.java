package ch5;

/* loaded from: classes14.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 f123094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7) {
        super(1);
        this.f123094d = c22421x5301a0d7;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7 = this.f123094d;
        c22421x5301a0d7.Q = floatValue;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.C0(c22421x5301a0d7);
        if (C0 != null) {
            C0.a(1.0f - floatValue);
        }
        return jz5.f0.f384359a;
    }
}
