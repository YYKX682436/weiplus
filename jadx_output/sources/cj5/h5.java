package cj5;

/* loaded from: classes.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k5 f42139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(cj5.k5 k5Var) {
        super(1);
        this.f42139d = k5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<ri5.j> it = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        for (ri5.j jVar : it) {
            cj5.k5 k5Var = this.f42139d;
            java.util.ArrayList arrayList = (java.util.ArrayList) k5Var.f42174e.get(jVar.f396111f);
            int size = arrayList != null ? arrayList.size() : 0;
            jVar.H = size;
            jVar.A = true;
            java.lang.Integer num = (java.lang.Integer) k5Var.f42176g.get(jVar.f396111f);
            if (num != null && num.intValue() == 0) {
                jVar.n(k5Var.getActivity().getString(com.tencent.mm.R.string.nj8));
            } else {
                java.lang.String string = k5Var.getActivity().getString(com.tencent.mm.R.string.nj7);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size)}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
                jVar.n(format);
            }
        }
        return jz5.f0.f302826a;
    }
}
