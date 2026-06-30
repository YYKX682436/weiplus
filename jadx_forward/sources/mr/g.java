package mr;

/* loaded from: classes10.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mr.i f412349a;

    public g(mr.i iVar) {
        this.f412349a = iVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        mr.i iVar = this.f412349a;
        if (iVar.f412358m != -1 || (c1163xf1deaba4 = iVar.f412353h) == null) {
            return;
        }
        c1163xf1deaba4.post(new mr.e(iVar));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        mr.i iVar = this.f412349a;
        if (iVar.f412358m != -1 || (c1163xf1deaba4 = iVar.f412353h) == null) {
            return;
        }
        c1163xf1deaba4.post(new mr.f(iVar));
    }
}
