package qb2;

/* loaded from: classes8.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f442725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f442727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.p0 f442728g;

    public d1(qb2.r1 r1Var, java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        this.f442725d = r1Var;
        this.f442726e = str;
        this.f442727f = map;
        this.f442728g = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f442725d.k(this.f442726e, this.f442727f, this.f442728g, "4");
    }
}
