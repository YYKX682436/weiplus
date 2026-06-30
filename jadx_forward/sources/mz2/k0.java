package mz2;

/* loaded from: classes9.dex */
public class k0 implements nz2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz2.c f414677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mz2.l0 f414678b;

    public k0(mz2.l0 l0Var, pz2.c cVar) {
        this.f414678b = l0Var;
        this.f414677a = cVar;
    }

    @Override // nz2.b
    public void a(nz2.c cVar) {
        int i17 = cVar.f423076a;
        if (i17 == 0) {
            java.lang.String str = cVar.f423078c;
            mz2.l0 l0Var = this.f414678b;
            l0Var.f414683e = str;
            l0Var.f414684f = cVar.f423079d;
        }
        this.f414677a.a(i17, cVar.f423077b, -1, -1);
    }
}
