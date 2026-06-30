package pc;

/* loaded from: classes14.dex */
public final class n extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pc.o f434746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pc.o oVar, android.os.Looper looper) {
        super(looper);
        this.f434746a = oVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            final pc.o oVar = this.f434746a;
            if (oVar.f434749c != null) {
                java.util.LinkedList linkedList = oVar.f434751e;
                if (linkedList.size() > 0) {
                    final java.lang.String str = (java.lang.String) linkedList.poll();
                    oVar.f434749c.post(new java.lang.Runnable() { // from class: pc.o$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            pc.o.this.f434749c.setText(str);
                        }
                    });
                }
            }
            pc.o oVar2 = this.f434746a;
            if (oVar2.f434748b == null) {
                return;
            }
            try {
                android.os.Message obtainMessage = oVar2.f434748b.obtainMessage();
                obtainMessage.what = 1;
                oVar2.f434748b.sendMessageDelayed(obtainMessage, 1000L);
            } catch (java.lang.Exception e17) {
                mc.p.f407064a.e("ShowTipsHelper", "failed to send wait extra tips event" + e17.getLocalizedMessage());
            }
        }
    }
}
