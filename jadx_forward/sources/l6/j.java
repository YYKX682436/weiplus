package l6;

/* loaded from: classes16.dex */
public class j extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l6.l f398264a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l6.l lVar, android.os.Looper looper) {
        super(looper);
        this.f398264a = lVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        int i17;
        try {
            int i18 = message.what;
            l6.l lVar = this.f398264a;
            if (i18 != 101) {
                if (i18 != 102) {
                    return;
                }
                int i19 = lVar.f398266b - 1;
                lVar.f398266b = i19;
                if (i19 > 0) {
                    lVar.f398270f.sendEmptyMessageDelayed(101, lVar.f398265a);
                    return;
                }
                return;
            }
            p6.b bVar = (p6.b) lVar.f398271g;
            p6.d dVar = bVar.f433653d;
            l6.l lVar2 = dVar.f433665h;
            if (lVar2 != null) {
                synchronized (lVar2) {
                    i17 = lVar2.f398267c;
                }
            } else {
                i17 = bVar.f433651b;
            }
            dVar.e(bVar.f433650a, i17, bVar.f433652c, null);
            lVar.f398270f.sendEmptyMessageDelayed(102, lVar.f398268d);
        } catch (java.lang.Throwable unused) {
        }
    }
}
