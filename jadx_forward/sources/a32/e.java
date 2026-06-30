package a32;

/* loaded from: classes10.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb f82544a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb) {
        this.f82544a = c13392x8bacb7fb;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f82544a;
        c13392x8bacb7fb.f180178h.i(0, 100, t22.o.f496635c * 1000, y22.n.c(c13392x8bacb7fb), new a32.b(c13392x8bacb7fb));
        c13392x8bacb7fb.f180181n.m54917x76500a7f(false);
        r22.a aVar = c13392x8bacb7fb.presenter;
        if (aVar != null) {
            w22.g gVar = (w22.g) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CapturePresenter", "start record " + gVar.f524067e);
            u22.b bVar = gVar.f524072j;
            bVar.getClass();
            bVar.f505509c = "";
            bVar.f505510d = "";
            r22.b bVar2 = gVar.f524064b;
            gVar.f524071i = bVar2.getF180183p().m54908xfb85ada3();
            bVar2.getF180183p().getClass();
            java.lang.String str = gVar.f524071i;
            gVar.f524069g = str == null || str.length() == 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CapturePresenter", "startRecord: useVoiceInput " + gVar.f524069g);
            if (gVar.f524069g && (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("NON_NETWORK", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40070xdc68a9b2(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)))) {
                x22.f fVar = gVar.f524074l;
                if (fVar != null) {
                    z21.w wVar = new z21.w(1, 9, new x22.e(fVar));
                    x22.f.f533097b = wVar;
                    wVar.mo48296x68ac462();
                }
                gVar.f524075m.c(50L, 50L);
            }
            gVar.f524070h = false;
            gVar.f524067e = w22.b.f524056f;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            gVar.f524068f = android.os.SystemClock.elapsedRealtime();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d8141 = gVar.f524066d;
            c13384x547d8141.f180117e = currentTimeMillis;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15982, 3, java.lang.Long.valueOf(c13384x547d8141.f180116d), 0, 0, 0, 0, 0, 0, 0, java.lang.Integer.valueOf(c13384x547d8141.G), c13384x547d8141.A, java.lang.Integer.valueOf(c13384x547d8141.B), 0, java.lang.Integer.valueOf(c13384x547d8141.C), c13384x547d8141.D, java.lang.Integer.valueOf(c13384x547d8141.E), java.lang.Integer.valueOf(c13384x547d8141.F));
        }
        if (!c13392x8bacb7fb.f180192y.j(false, 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.c(33, 1);
        }
        c13392x8bacb7fb.f180179i.setEnabled(false);
        c13392x8bacb7fb.f180179i.animate().alpha(0.0f).start();
        c13392x8bacb7fb.e(false, 0);
        android.view.View view = c13392x8bacb7fb.f180180m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$1", if1.m.f69928x24728b, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer$1", if1.m.f69928x24728b, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f82544a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13392x8bacb7fb.f180174d, "onPressDown");
        int[] iArr = new int[2];
        c13392x8bacb7fb.f180178h.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        at0.n nVar = c13392x8bacb7fb.f180192y;
        if (nVar.f95137l == 0) {
            nVar.f95127b.u(i17, 10);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.h0
    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = this.f82544a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13392x8bacb7fb.f180174d, "onLongPressFinish");
        a32.c cVar = new a32.c(c13392x8bacb7fb);
        c13392x8bacb7fb.f180176f.l(new a32.t(c13392x8bacb7fb));
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb.b(c13392x8bacb7fb, c13392x8bacb7fb.f180192y.l(cVar));
    }
}
