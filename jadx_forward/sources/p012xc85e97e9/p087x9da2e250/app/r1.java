package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class r1 implements p012xc85e97e9.p087x9da2e250.app.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f92996a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92997b;

    /* renamed from: c, reason: collision with root package name */
    public final int f92998c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f92999d;

    public r1(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, java.lang.String str, int i17, int i18) {
        this.f92999d = abstractC1104xc1ad431d;
        this.f92996a = str;
        this.f92997b = i17;
        this.f92998c = i18;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.q1
    public boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92999d.f3506x9034440e;
        if (componentCallbacksC1101xa17d4670 == null || this.f92997b >= 0 || this.f92996a != null || !componentCallbacksC1101xa17d4670.m7437x54c0aef7().m7705x96eafb01()) {
            return this.f92999d.m7708x28372fe1(arrayList, arrayList2, this.f92996a, this.f92997b, this.f92998c);
        }
        return false;
    }
}
