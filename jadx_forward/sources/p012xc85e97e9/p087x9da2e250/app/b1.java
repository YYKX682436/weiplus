package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class b1 implements p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f92795a;

    public b1(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        this.f92795a = abstractC1104xc1ad431d;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
    public void a(java.lang.Object obj) {
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var;
        java.util.Map map = (java.util.Map) obj;
        java.lang.String[] strArr = (java.lang.String[]) map.keySet().toArray(new java.lang.String[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr[i17] = ((java.lang.Boolean) arrayList.get(i17)).booleanValue() ? 0 : -1;
        }
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f92795a;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.LaunchedFragmentInfo pollFirst = abstractC1104xc1ad431d.f3495x515163c4.pollFirst();
        if (pollFirst == null) {
            return;
        }
        f2Var = abstractC1104xc1ad431d.f3490x27342104;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 c17 = f2Var.c(pollFirst.f92746d);
        if (c17 == null) {
            return;
        }
        c17.mo7516x953457f1(pollFirst.f92747e, strArr, iArr);
    }
}
