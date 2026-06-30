package hg;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 f362820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hg.g f362821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hg.h f362822f;

    public e(hg.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u3 u3Var, hg.g gVar) {
        this.f362822f = hVar;
        this.f362820d = u3Var;
        this.f362821e = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hg.h hVar = this.f362822f;
        if (hVar.f362836g) {
            this.f362820d.a(this.f362821e.f362825b);
            if (android.os.Build.VERSION.SDK_INT < 33) {
                sf.c cVar = sf.c.f488472a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t a17 = hVar.f362830a.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l b17 = hVar.f362830a.b();
                int i17 = hVar.f362835f;
                cVar.a(a17, b17, new sf.b(i17, hVar.c(i17), java.lang.Integer.valueOf(hVar.f362837h), new yz5.a() { // from class: hg.e$$a
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        hg.h hVar2 = hg.e.this.f362822f;
                        hVar2.m120231x88a99e47(true, hVar2.f362836g ? hVar2.f362835f : 0, false);
                        return null;
                    }
                }));
            }
        }
    }
}
