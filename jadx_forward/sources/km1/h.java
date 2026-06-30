package km1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f390533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f390534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f390535f;

    public h(km1.s sVar, android.util.Size size, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        this.f390533d = sVar;
        this.f390534e = size;
        this.f390535f = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.nio.ByteBuffer m07;
        km1.s sVar = this.f390533d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = sVar.f390578y;
        int i17 = atomicInteger.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 r17 = sVar.r();
        java.lang.Integer valueOf = (r17 == null || (m07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) r17).m0(i17)) == null) ? null : java.lang.Integer.valueOf(m07.capacity());
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        int i18 = sVar.f390560d.f334030d;
        android.util.Size size = this.f390534e;
        int width = size.getWidth();
        int height = size.getHeight();
        int i19 = (int) (width * 1.5f * height);
        java.lang.String str = sVar.f390562f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "doCreateSharedBufferAndNotifyIfNeed, existBufferSize: " + intValue + ", expectBufferSize: " + i19);
        if (i19 != intValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 r18 = sVar.r();
            if (r18 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "createSharedBufferThenNotify, bufferId is null");
                return;
            }
            int T = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) r18).T(i19);
            atomicInteger.set(T);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 component = this.f390535f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
            km1.c cVar = new km1.c();
            cVar.t(kz5.c1.k(new jz5.l("livePusherId", java.lang.Integer.valueOf(i18)), new jz5.l("bufferId", java.lang.Integer.valueOf(T)), new jz5.l("width", java.lang.Integer.valueOf(width)), new jz5.l("height", java.lang.Integer.valueOf(height))));
            component.i(cVar, null);
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "createSharedBufferThenNotify, release the existBuffer");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.h0 r19 = sVar.r();
                if (r19 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) r19).a0(i17);
                }
            }
        }
    }
}
