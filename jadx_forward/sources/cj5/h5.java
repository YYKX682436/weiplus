package cj5;

/* loaded from: classes.dex */
public final class h5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k5 f123672d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(cj5.k5 k5Var) {
        super(1);
        this.f123672d = k5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList<ri5.j> it = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        for (ri5.j jVar : it) {
            cj5.k5 k5Var = this.f123672d;
            java.util.ArrayList arrayList = (java.util.ArrayList) k5Var.f123707e.get(jVar.f477644f);
            int size = arrayList != null ? arrayList.size() : 0;
            jVar.H = size;
            jVar.A = true;
            java.lang.Integer num = (java.lang.Integer) k5Var.f123709g.get(jVar.f477644f);
            if (num != null && num.intValue() == 0) {
                jVar.n(k5Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nj8));
            } else {
                java.lang.String string = k5Var.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nj7);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size)}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                jVar.n(format);
            }
        }
        return jz5.f0.f384359a;
    }
}
