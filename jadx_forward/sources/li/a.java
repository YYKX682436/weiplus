package li;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li.d f400273d;

    public a(li.d dVar) {
        this.f400273d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        li.d dVar = this.f400273d;
        dVar.getClass();
        com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41159x9cf0d20b().m41203x316510();
        com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41161x413fe3e7();
        android.content.Context context = dVar.f400278h;
        try {
            z17 = context.bindService(new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.ServiceC4699xac97184c.class), new li.c(dVar), 1);
        } catch (java.lang.Exception e17) {
            oj.j.a("matrix.OpenglLeakPlugin", "bindService error = " + e17.getCause(), new java.lang.Object[0]);
            z17 = false;
        }
        oj.j.a("matrix.OpenglLeakPlugin", "bindService result = " + z17, new java.lang.Object[0]);
        if (z17) {
            if (li.d.f400277m != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1403L, 36L, 1L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenglLeakPlugin.TAG", "onExpProcessSuccess call & report");
                return;
            }
            return;
        }
        if (li.d.f400277m != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1403L, 37L, 1L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenglLeakPlugin.TAG", "onExpProcessFail call & report");
        }
    }
}
