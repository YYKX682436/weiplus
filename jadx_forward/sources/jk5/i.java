package jk5;

/* loaded from: classes13.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f381699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jk5.j f381700e;

    public i(jk5.j jVar, android.os.Bundle bundle) {
        this.f381700e = jVar;
        this.f381699d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        jk5.j jVar = this.f381700e;
        if (jVar.f381703c == null) {
            return;
        }
        jVar.d(true);
        java.lang.String string = this.f381699d.getString("oauth_verifier");
        l56.i iVar = null;
        if (string != null) {
            l56.k kVar = new l56.k(string);
            try {
                iVar = ((m56.a) jVar.f381701a).c(jVar.f381703c, kVar);
            } catch (j56.a unused) {
            }
        }
        if (iVar == null) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new jk5.h(this));
            return;
        }
        jVar.f381702b = iVar;
        jVar.e(iVar);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new jk5.g(this));
    }

    /* renamed from: toString */
    public java.lang.String m141077x9616526c() {
        return super.toString() + "|onComplete";
    }
}
