package c01;

/* loaded from: classes9.dex */
public class m1 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c01.l1 f118854g;

    public m1(c01.l1 l1Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f118854g = l1Var;
        this.f118851d = str;
        this.f118852e = str2;
        this.f118853f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07;
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        if (a17 == null || (z07 = a17.z0(this.f118851d)) == null) {
            return;
        }
        if (this.f118853f.equals(z07.z0(this.f118852e))) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ChatroomDisplayNameCache", "Cache mismatch, clear all");
        kk.t tVar = this.f118854g.f118833e;
        synchronized (tVar) {
            tVar.f390010d = 0;
            tVar.f390009c.clear();
        }
        this.f118854g.f118832d.d();
    }
}
