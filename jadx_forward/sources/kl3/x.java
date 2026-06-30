package kl3;

/* loaded from: classes11.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl3.z f390384d;

    public x(kl3.z zVar, kl3.v vVar) {
        this.f390384d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        kl3.z zVar = this.f390384d;
        zVar.f390398n = true;
        b21.r o17 = zVar.o();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "musicWrapper.MusicType:%d", java.lang.Integer.valueOf(o17.f98878d));
        int i17 = o17.f98878d;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf();
            c5720xee9b9abf.f136042g.f88303a = -5;
            c5720xee9b9abf.e();
            list = c5720xee9b9abf.f136043h.f88372c;
        } else if (i17 == 4) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf();
            c5720xee9b9abf2.f136042g.f88303a = -4;
            c5720xee9b9abf2.e();
            list = c5720xee9b9abf2.f136043h.f88372c;
        } else if (i17 == 6) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
            c5432x35bb364f.f135776g.f90061a = 18;
            c5432x35bb364f.e();
            list = c5432x35bb364f.f135777h.f87674h;
        } else if (i17 != 8) {
            list = null;
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf c5720xee9b9abf3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5720xee9b9abf();
            am.gk gkVar = c5720xee9b9abf3.f136042g;
            gkVar.f88303a = -6;
            gkVar.f88304b = o17;
            c5720xee9b9abf3.e();
            list = c5720xee9b9abf3.f136043h.f88372c;
        }
        if (list != null) {
            for (int i18 = 0; i18 < list.size(); i18++) {
                b21.r rVar = (b21.r) list.get(i18);
                if (rVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicWechatPrivateLogic", "wrapper is null, continue");
                } else {
                    ll3.o2.Ai().J0(rVar);
                    arrayList.add(xl3.c.a(rVar));
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "GetMusicWrapperListTask run time %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        zVar.f390398n = false;
        kl3.y yVar = new kl3.y(zVar, null);
        yVar.f390385d = arrayList;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(yVar);
    }
}
