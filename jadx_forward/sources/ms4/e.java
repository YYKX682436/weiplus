package ms4;

/* loaded from: classes8.dex */
public final class e implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms4.h f412546a;

    public e(ms4.h hVar) {
        this.f412546a = hVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        ms4.h hVar = this.f412546a;
        hVar.f412564g.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        js4.o oVar = hVar.f412561d.f383079d;
        if (oVar != null) {
            if (str == null) {
                str = "";
            }
            oVar.a(i17, i18, str);
        }
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        java.lang.Void r47 = (java.lang.Void) obj;
        ms4.h hVar = this.f412546a;
        hVar.f412564g.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        js4.o oVar = hVar.f412561d.f383079d;
        if (oVar != null) {
            oVar.mo14245xe05b4124(r47);
        }
    }
}
