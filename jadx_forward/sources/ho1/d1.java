package ho1;

/* loaded from: classes9.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364184e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364185f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f364186g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f364187h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f364188i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f364189m;

    public d1(java.lang.String str, long j17, long j18, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, ho1.q1 q1Var) {
        this.f364183d = str;
        this.f364184e = j17;
        this.f364185f = j18;
        this.f364186g = arrayList;
        this.f364187h = arrayList2;
        this.f364188i = arrayList3;
        this.f364189m = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm5.v1.a("filterRestoreMediaAsync " + this.f364183d, new ho1.c1(this.f364184e, this.f364183d, this.f364185f, this.f364186g, this.f364187h, this.f364188i, this.f364189m));
    }
}
