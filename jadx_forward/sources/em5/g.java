package em5;

/* loaded from: classes9.dex */
public class g extends android.os.Handler {
    public g(em5.h hVar, android.os.Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        em5.f fVar = (em5.f) message.obj;
        int i17 = message.what;
        if (i17 == 1) {
            fVar.getClass();
            fVar.b();
            synchronized (fVar.f336753g) {
                fVar.f336753g.notify();
            }
            return;
        }
        if (i17 == 2) {
            fVar.getClass();
        } else if (i17 == 3) {
            fVar.getClass();
        } else {
            if (i17 != 4) {
                return;
            }
            fVar.c();
        }
    }
}
