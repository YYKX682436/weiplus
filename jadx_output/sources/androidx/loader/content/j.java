package androidx.loader.content;

/* loaded from: classes13.dex */
public class j extends android.os.Handler {
    public j() {
        super(android.os.Looper.getMainLooper());
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.util.concurrent.CountDownLatch countDownLatch;
        androidx.loader.content.i iVar = (androidx.loader.content.i) message.obj;
        int i17 = message.what;
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            iVar.f11679a.getClass();
            return;
        }
        androidx.loader.content.m mVar = iVar.f11679a;
        java.lang.Object obj = iVar.f11680b[0];
        if (mVar.f11691g.get()) {
            androidx.loader.content.a aVar = (androidx.loader.content.a) mVar;
            countDownLatch = aVar.f11673n;
            try {
                aVar.f11675p.dispatchOnCancelled(aVar, obj);
                countDownLatch.countDown();
            } finally {
            }
        } else {
            androidx.loader.content.a aVar2 = (androidx.loader.content.a) mVar;
            countDownLatch = aVar2.f11673n;
            try {
                aVar2.f11675p.dispatchOnLoadComplete(aVar2, obj);
            } finally {
            }
        }
        mVar.f11690f = androidx.loader.content.k.FINISHED;
    }
}
