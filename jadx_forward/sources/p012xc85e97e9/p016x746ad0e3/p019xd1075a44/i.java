package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class i extends o.e0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q f91138m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar, android.content.Context context, o.o0 o0Var, android.view.View view) {
        super(context, o0Var, view, false, com.p314xaae8f345.mm.R.C30857x2dd9f1.a_);
        this.f91138m = qVar;
        if (!((o0Var.G.D & 32) == 32)) {
            android.view.View view2 = qVar.f91204p;
            this.f423240f = view2 == null ? (android.view.View) qVar.f423230n : view2;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.o oVar = qVar.E;
        this.f423243i = oVar;
        o.c0 c0Var = this.f423244j;
        if (c0Var != null) {
            c0Var.g(oVar);
        }
    }

    @Override // o.e0
    public void c() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar = this.f91138m;
        qVar.B = null;
        qVar.F = 0;
        super.c();
    }
}
