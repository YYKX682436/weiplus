package qd1;

/* loaded from: classes7.dex */
public class c implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f443146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f443147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f443148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qd1.f f443149g;

    public c(qd1.f fVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, java.util.Map map, int i17) {
        this.f443149g = fVar;
        this.f443146d = k0Var;
        this.f443147e = map;
        this.f443148f = i17;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        this.f443146d.o(null);
        g4Var.clear();
        int i17 = 0;
        while (true) {
            qd1.f fVar = this.f443149g;
            if (i17 >= fVar.f443165i.size()) {
                return;
            }
            if (this.f443147e.containsKey(java.lang.Integer.valueOf(i17))) {
                g4Var.u(i17, (java.lang.CharSequence) fVar.f443165i.get(i17), true, false);
            } else {
                g4Var.d(i17, this.f443148f, (java.lang.CharSequence) fVar.f443165i.get(i17));
            }
            i17++;
        }
    }
}
