package g20;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g20.g f349298d;

    public b(g20.g gVar) {
        this.f349298d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g20.g gVar = this.f349298d;
        if (gVar.f349309g != null) {
            boolean Vi = gVar.Vi();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.valueOf(Vi), gVar.f349309g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "notifyInitCmdCardHolderUpdate nativeDataManagerSwitchOn " + Vi);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsOrderService", "notifyInitCmdCardHolderUpdate modify nativeDataManagerSwitchOn from " + gVar.f349309g + " to " + Vi);
            gVar.f349309g = java.lang.Boolean.valueOf(Vi);
            x02.h Bi = gVar.Bi();
            if (Bi != null) {
                p3380x6a61f93.p3384xf5161200.C30567x21b1f1a0.m169975x21b8999a(((x02.i) Bi).m105978x2737f10(), Vi);
            }
        }
    }
}
