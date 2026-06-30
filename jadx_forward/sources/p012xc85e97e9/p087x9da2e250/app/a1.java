package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class a1 implements p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f92787a;

    public a1(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        this.f92787a = abstractC1104xc1ad431d;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
    public void a(java.lang.Object obj) {
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var;
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c c0059x32c0ac2c = (p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.C0059x32c0ac2c) obj;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f92787a;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.LaunchedFragmentInfo pollFirst = abstractC1104xc1ad431d.f3495x515163c4.pollFirst();
        if (pollFirst == null) {
            return;
        }
        f2Var = abstractC1104xc1ad431d.f3490x27342104;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 c17 = f2Var.c(pollFirst.f92746d);
        if (c17 == null) {
            return;
        }
        c17.mo7496x9d4787cb(pollFirst.f92747e, c0059x32c0ac2c.f90575d, c0059x32c0ac2c.f90576e);
    }
}
