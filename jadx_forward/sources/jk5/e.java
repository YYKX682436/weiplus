package jk5;

/* loaded from: classes13.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk5.j f381695d;

    public e(jk5.j jVar) {
        this.f381695d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jk5.j jVar = this.f381695d;
        java.lang.String str = null;
        try {
            jVar.f381703c = ((m56.a) jVar.f381701a).d();
            m56.b bVar = jVar.f381701a;
            l56.i iVar = jVar.f381703c;
            ((i56.d) ((m56.a) bVar).f405870b).getClass();
            str = java.lang.String.format("https://api.twitter.com/oauth/authorize?oauth_token=%s", iVar.f398225d);
        } catch (j56.a | j56.b unused) {
        }
        jVar.f381709i.mo50308x2936bf5f(jVar.f381709i.mo50292x733c63a2(1000, str));
    }
}
