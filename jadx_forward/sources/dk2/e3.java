package dk2;

/* loaded from: classes3.dex */
public final class e3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f314881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(dk2.r4 r4Var, yz5.p pVar) {
        super(2);
        this.f314881d = r4Var;
        this.f314882e = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.q62 q62Var = (r45.q62) obj2;
        if (booleanValue) {
            dk2.r4 r4Var = this.f314881d;
            db5.t7.h(r4Var.M(), i65.a.r(r4Var.M(), com.p314xaae8f345.mm.R.C30867xcad56011.edk));
        }
        yz5.p pVar = this.f314882e;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(booleanValue), q62Var);
        }
        return jz5.f0.f384359a;
    }
}
