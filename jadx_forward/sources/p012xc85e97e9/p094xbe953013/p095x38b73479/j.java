package p012xc85e97e9.p094xbe953013.p095x38b73479;

/* loaded from: classes13.dex */
public class j extends android.os.Handler {
    public j() {
        super(android.os.Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.util.concurrent.CountDownLatch countDownLatch;
        p012xc85e97e9.p094xbe953013.p095x38b73479.i iVar = (p012xc85e97e9.p094xbe953013.p095x38b73479.i) message.obj;
        int i17 = message.what;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            iVar.f93212a.getClass();
            return;
        }
        p012xc85e97e9.p094xbe953013.p095x38b73479.m mVar = iVar.f93212a;
        java.lang.Object obj = iVar.f93213b[0];
        if (mVar.f93224g.get()) {
            p012xc85e97e9.p094xbe953013.p095x38b73479.a aVar = (p012xc85e97e9.p094xbe953013.p095x38b73479.a) mVar;
            countDownLatch = aVar.f93206n;
            try {
                aVar.f93208p.m7826x21f91958(aVar, obj);
                countDownLatch.countDown();
            } finally {
            }
        } else {
            p012xc85e97e9.p094xbe953013.p095x38b73479.a aVar2 = (p012xc85e97e9.p094xbe953013.p095x38b73479.a) mVar;
            countDownLatch = aVar2.f93206n;
            try {
                aVar2.f93208p.m7827xe65652d8(aVar2, obj);
            } finally {
            }
        }
        mVar.f93223f = p012xc85e97e9.p094xbe953013.p095x38b73479.k.FINISHED;
    }
}
