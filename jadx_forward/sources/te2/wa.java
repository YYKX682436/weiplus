package te2;

/* loaded from: classes3.dex */
public final class wa implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.hc f500048a;

    public wa(te2.hc hcVar) {
        this.f500048a = hcVar;
    }

    @Override // i50.n
    public void a(boolean z17) {
        r45.q65 q65Var;
        te2.hc hcVar = this.f500048a;
        r45.h32 h32Var = hcVar.f499601J;
        boolean z18 = false;
        if (h32Var != null && (q65Var = (r45.q65) h32Var.m75936x14adae67(10)) != null && q65Var.m75933x41a8a7f2(0)) {
            z18 = true;
        }
        java.lang.String string = z18 ? hcVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0k) : hcVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        db5.t7.m(hcVar.m158354x19263085(), string);
    }
}
