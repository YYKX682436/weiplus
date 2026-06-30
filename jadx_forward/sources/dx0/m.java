package dx0;

/* loaded from: classes5.dex */
public final class m implements com.p314xaae8f345.p457x3304c6.p479x4179489f.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dx0.n f325986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dx0.r f325987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f325988c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a f325989d;

    public m(dx0.n nVar, dx0.r rVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a c4176xaeba704a) {
        this.f325986a = nVar;
        this.f325987b = rVar;
        this.f325988c = c3971x241f78;
        this.f325989d = c4176xaeba704a;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.l0
    public final void a(com.p314xaae8f345.p457x3304c6.p479x4179489f.m0 task, int i17, com.p314xaae8f345.p457x3304c6.p479x4179489f.n0 n0Var) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        dx0.n nVar = this.f325986a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f325998i;
        dx0.r rVar = this.f325987b;
        boolean containsKey = concurrentHashMap.containsKey(rVar);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = nVar.f325998i;
        if (containsKey) {
            if ((n0Var != null ? n0Var.f130047a : null) != null) {
                dx0.q qVar = (dx0.q) concurrentHashMap2.get(rVar);
                if (qVar != null) {
                    qVar.f326002a = task;
                }
                android.graphics.Bitmap bitmap3 = n0Var.f130047a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap3, "bitmap");
                android.graphics.Bitmap b17 = dx0.o.b(bitmap3, nVar.b());
                dx0.q qVar2 = (dx0.q) concurrentHashMap2.get(rVar);
                if (qVar2 != null) {
                    qVar2.f326004c = new dx0.p(b17, n0Var.f130049c);
                }
                dx0.q qVar3 = (dx0.q) concurrentHashMap2.get(rVar);
                if (qVar3 != null) {
                    qVar3.f326005d = n0Var.f130048b;
                }
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p480xbddafb2a.C4176xaeba704a offsetRange = this.f325989d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(offsetRange, "$offsetRange");
                fy0.h hVar = (fy0.h) nVar.f325990a;
                hVar.getClass();
                com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = this.f325988c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
                hVar.f348719a.f(segmentID, offsetRange);
            }
        }
        task.m34364x9616526c();
        dx0.q qVar4 = (dx0.q) concurrentHashMap2.get(rVar);
        if (qVar4 != null && (c4129xdee64553 = qVar4.f326003b) != null) {
            dx0.o.c(c4129xdee64553);
        }
        if (n0Var != null && (bitmap2 = n0Var.f130047a) != null) {
            bitmap2.getWidth();
        }
        if (n0Var == null || (bitmap = n0Var.f130047a) == null) {
            return;
        }
        bitmap.getHeight();
    }
}
