package gk5;

/* loaded from: classes.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk5.j f354201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gk5.j jVar) {
        super(1);
        this.f354201d = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        gk5.j jVar = this.f354201d;
        if (c0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SelectConfirmAction usernameList:");
            java.util.List list = c0Var.f527815b;
            sb6.append(list);
            sb6.append(": ");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardFinderFeedUIC", sb6.toString());
            jVar.f354208t.clear();
            jVar.f354208t.addAll(list);
        }
        wi5.t0 t0Var = (wi5.t0) state.a(wi5.t0.class);
        if (t0Var != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SelectUserAction usernameList:");
            ri5.j jVar2 = t0Var.f527874b;
            sb7.append(jVar2);
            sb7.append(": ");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardFinderFeedUIC", sb7.toString());
            boolean contains = jVar.f354208t.contains(jVar2.f477644f);
            java.util.Set set = jVar.f354208t;
            java.lang.String str = jVar2.f477644f;
            if (contains) {
                set.remove(str);
            } else if (state.f527849i <= 0 || state.f527852o.size() < state.f527849i) {
                set.add(str);
            }
        }
        wi5.x0 x0Var = (wi5.x0) state.a(wi5.x0.class);
        if (x0Var != null) {
            jVar.f354208t.remove(x0Var.f527894b);
        }
        return jz5.f0.f384359a;
    }
}
