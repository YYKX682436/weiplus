package nu0;

/* loaded from: classes5.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.p f421546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 f421548f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(nu0.p pVar, java.lang.String str, com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4058x7a492233 c4058x7a492233) {
        super(1);
        this.f421546d = pVar;
        this.f421547e = str;
        this.f421548f = c4058x7a492233;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.ze2 ze2Var = (r45.ze2) obj;
        java.lang.String str = this.f421547e;
        nu0.p pVar = this.f421546d;
        if (ze2Var == null) {
            pVar.q7().f7(str);
        } else {
            this.f421548f.d(by0.h.b(ze2Var));
            nu0.q0.Y6(pVar.q7(), false, new nu0.j(null, pVar, str), 1, null);
            pVar.r7(str);
        }
        return jz5.f0.f384359a;
    }
}
