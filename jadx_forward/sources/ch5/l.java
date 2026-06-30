package ch5;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 f123132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2) {
        super(1);
        this.f123132d = c22419xb3ed8ff2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2 = this.f123132d;
        c22419xb3ed8ff2.R = floatValue;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.C0(c22419xb3ed8ff2);
        if (C0 != null) {
            C0.a(1.0f - floatValue);
        }
        return jz5.f0.f384359a;
    }
}
