package nd1;

/* loaded from: classes7.dex */
public class q1 extends zl1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zl1.t f417918a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nd1.s1 f417919b;

    public q1(nd1.s1 s1Var, zl1.t tVar) {
        this.f417919b = s1Var;
        this.f417918a = tVar;
    }

    @Override // zl1.w
    public void a(java.lang.String str, zl1.y yVar) {
        super.a(str, yVar);
        nd1.s1 s1Var = this.f417919b;
        int i17 = s1Var.f417925g;
        java.lang.String str2 = s1Var.f417926h;
        zl1.t tVar = this.f417918a;
        tVar.h(i17, str2, (zl1.y) ((android.util.Pair) tVar.f555154m.get(i17)).first, null, true);
    }
}
