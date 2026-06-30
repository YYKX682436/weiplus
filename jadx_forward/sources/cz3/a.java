package cz3;

/* loaded from: classes15.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f306550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(3);
        this.f306550d = h0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        ((java.lang.Number) obj3).longValue();
        if (booleanValue) {
            cz3.b.f306551a.c(true, longValue);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = cz3.b.f306553c;
            if (o4Var != null) {
                o4Var.remove("key_crash_info");
            }
        } else {
            cz3.b.f306551a.c(false, 0L);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = cz3.b.f306553c;
            if (o4Var2 != null) {
                o4Var2.H("key_crash_info", ((r45.tu5) this.f306550d.f391656d).mo14344x5f01b1f6());
            }
        }
        return jz5.f0.f384359a;
    }
}
