package dl;

/* loaded from: classes10.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f316679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f316680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl.y f316682g;

    public w(dl.y yVar, boolean z17, boolean z18, java.lang.String str) {
        this.f316682g = yVar;
        this.f316679d = z17;
        this.f316680e = z18;
        this.f316681f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        hk0.n g17;
        hk0.n g18;
        dl.y yVar = this.f316682g;
        if (yVar.l() != null && ((this.f316679d || this.f316680e) && (g17 = yVar.l().f363351i.g(this.f316681f)) != null && (g18 = yVar.l().f363351i.g(g17.c())) != null && g18.a() != null)) {
            g18.a().w(false);
            ((um.g) yVar.d()).add(g18.a());
        }
        yVar.E(true);
        yVar.r();
        yVar.f316581j = null;
    }
}
