package pp1;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f438940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438941f;

    public f(pp1.z zVar, boolean z17, yz5.a aVar) {
        this.f438939d = zVar;
        this.f438940e = z17;
        this.f438941f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pp1.z zVar = this.f438939d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar.f438981f;
        if (c12917x19ac03e7 != null) {
            c12917x19ac03e7.U(0.0f);
        }
        pp1.z.c(zVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e72 = zVar.f438981f;
        if (c12917x19ac03e72 != null) {
            boolean z17 = this.f438940e;
            c12917x19ac03e72.R(z17 ? 1 : 2, z17);
        }
        yz5.a aVar = this.f438941f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        zVar.f438988p = false;
    }
}
