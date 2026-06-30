package sj3;

/* loaded from: classes14.dex */
public class q4 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sj3.d f490248c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f490249d;

    public q4(sj3.a5 a5Var, sj3.d dVar) {
        this.f490249d = a5Var;
        this.f490248c = dVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.t0
    public int c(int i17) {
        sj3.d dVar = this.f490248c;
        if (i17 < dVar.f489999n || i17 > (dVar.mo1894x7e414b06() - dVar.f490000o) - 1) {
            return this.f490249d.f489954h.f93394w;
        }
        return 1;
    }
}
