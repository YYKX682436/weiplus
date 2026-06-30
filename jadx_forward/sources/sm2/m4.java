package sm2;

/* loaded from: classes3.dex */
public final class m4 implements ek2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v65.n f491100b;

    public m4(sm2.o4 o4Var, v65.n nVar) {
        this.f491099a = o4Var;
        this.f491100b = nVar;
    }

    @Override // ek2.l
    public void a(int i17, int i18, java.lang.String str, r45.tn1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        sm2.o4 o4Var = this.f491099a;
        java.lang.String str2 = o4Var.f491143f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("suspendPostCloseLinkMsg errCode:");
        sb6.append(i18);
        sb6.append(", errType:");
        sb6.append(i17);
        sb6.append(", errMsg:");
        sb6.append(str);
        sb6.append(", audienceMode:");
        sb6.append(((mm2.c1) o4Var.c(mm2.c1.class)).P6());
        sb6.append(", micType:");
        km2.q l76 = ((mm2.o4) o4Var.c(mm2.o4.class)).l7();
        sb6.append(l76 != null ? java.lang.Integer.valueOf(l76.f390707e) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        v65.n nVar = this.f491100b;
        if (i18 == 0 && i17 == 0) {
            if (nVar != null) {
                nVar.a(resp);
            }
        } else {
            dk2.ua.f315742a.a(true, i18, i17, ((mm2.e1) o4Var.c(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
            if (nVar != null) {
                nVar.a(null);
            }
        }
    }
}
