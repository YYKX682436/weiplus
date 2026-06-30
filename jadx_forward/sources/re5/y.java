package re5;

/* loaded from: classes12.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.d0 f476137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(re5.d0 d0Var) {
        super(2);
        this.f476137d = d0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        re5.d0 d0Var = this.f476137d;
        if (str == null || str2 == null) {
            em.s1 s1Var = d0Var.f476097t;
            if (s1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            s1Var.a().setVisibility(8);
        } else {
            em.s1 s1Var2 = d0Var.f476097t;
            if (s1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            s1Var2.a().setVisibility(0);
            em.s1 s1Var3 = d0Var.f476097t;
            if (s1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            if (s1Var3.f336310f == null) {
                s1Var3.f336310f = (android.widget.TextView) s1Var3.f336305a.findViewById(com.p314xaae8f345.mm.R.id.vht);
            }
            s1Var3.f336310f.setText(str);
            em.s1 s1Var4 = d0Var.f476097t;
            if (s1Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootVB");
                throw null;
            }
            if (s1Var4.f336307c == null) {
                s1Var4.f336307c = (android.widget.TextView) s1Var4.f336305a.findViewById(com.p314xaae8f345.mm.R.id.vhu);
            }
            s1Var4.f336307c.setText(str2);
        }
        return jz5.f0.f384359a;
    }
}
