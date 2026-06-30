package nd1;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nd1.j f417847f;

    public i(nd1.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17) {
        this.f417847f = jVar;
        this.f417845d = yVar;
        this.f417846e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417845d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(yVar);
        nd1.j jVar = this.f417847f;
        int i17 = this.f417846e;
        if (a17 == null) {
            yVar.a(i17, jVar.o("fail:page don't exist"));
        } else {
            a17.d3(false);
            yVar.a(i17, jVar.o("ok"));
        }
    }
}
