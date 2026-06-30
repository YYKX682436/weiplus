package nu0;

/* loaded from: classes5.dex */
public final class e0 implements com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h f421451a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421452b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f421453c;

    public e0(com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h hVar, nu0.q0 q0Var, int i17) {
        this.f421451a = hVar;
        this.f421452b = q0Var;
        this.f421453c = i17;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h
    public final void a(java.lang.String str) {
        this.f421451a.a(str);
        if (str == null || str.length() == 0) {
            nu0.q0 q0Var = this.f421452b;
            ((java.util.ArrayList) q0Var.f421610t).remove(this.f421453c);
            nu0.q0.W6(q0Var);
        }
    }
}
