package jk5;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk5.j f381696d;

    public f(jk5.j jVar) {
        this.f381696d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        jk5.c cVar = jk5.c.Finished;
        jk5.j jVar = this.f381696d;
        l56.i iVar = jVar.f381702b;
        jk5.c cVar2 = jk5.c.Failed;
        if (iVar != null) {
            l56.c cVar3 = new l56.c(l56.j.GET, "https://api.twitter.com/1.1/account/verify_credentials.json");
            m56.b bVar = jVar.f381701a;
            l56.i iVar2 = jVar.f381702b;
            m56.a aVar = (m56.a) bVar;
            aVar.getClass();
            java.lang.String str = "signing request: " + cVar3.b();
            l56.a aVar2 = aVar.f405869a;
            aVar2.a(str);
            if (!("".equals(iVar2.f398225d) && "".equals(iVar2.f398226e))) {
                cVar3.d("oauth_token", iVar2.f398225d);
            }
            aVar2.a("setting token to: " + iVar2);
            aVar.a(cVar3, iVar2);
            aVar.b(cVar3);
            try {
                if (cVar3.c().f398220a != 200) {
                    cVar = cVar2;
                }
                cVar2 = cVar;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Twitter", e17, "request error.", new java.lang.Object[0]);
            }
        }
        jVar.f381709i.mo50308x2936bf5f(jVar.f381709i.mo50292x733c63a2(1010, cVar2));
    }
}
