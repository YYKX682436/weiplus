package c01;

/* loaded from: classes9.dex */
public class m1 extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c01.l1 f37321g;

    public m1(c01.l1 l1Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f37321g = l1Var;
        this.f37318d = str;
        this.f37319e = str2;
        this.f37320f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.a3 z07;
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        if (a17 == null || (z07 = a17.z0(this.f37318d)) == null) {
            return;
        }
        if (this.f37320f.equals(z07.z0(this.f37319e))) {
            return;
        }
        com.tencent.mars.xlog.Log.w("ChatroomDisplayNameCache", "Cache mismatch, clear all");
        kk.t tVar = this.f37321g.f37300e;
        synchronized (tVar) {
            tVar.f308477d = 0;
            tVar.f308476c.clear();
        }
        this.f37321g.f37299d.d();
    }
}
