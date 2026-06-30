package i95;

/* loaded from: classes10.dex */
public enum k0 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final byte[] f371339d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f371340e = new java.util.ArrayList(2);

    /* renamed from: f, reason: collision with root package name */
    public int f371341f = 0;

    k0() {
    }

    public android.os.Looper h() {
        android.os.Handler handler;
        synchronized (this.f371339d) {
            if (((java.util.ArrayList) this.f371340e).size() < 2) {
                android.os.HandlerThread handlerThread = new android.os.HandlerThread("wc_lp_srvinit_" + ((java.util.ArrayList) this.f371340e).size(), -8);
                handlerThread.start();
                handler = new android.os.Handler(handlerThread.getLooper());
                ((java.util.ArrayList) this.f371340e).add(handler);
            } else {
                if (this.f371341f >= ((java.util.ArrayList) this.f371340e).size()) {
                    this.f371341f = 0;
                }
                java.util.List list = this.f371340e;
                int i17 = this.f371341f;
                this.f371341f = i17 + 1;
                handler = (android.os.Handler) ((java.util.ArrayList) list).get(i17);
            }
        }
        return handler.getLooper();
    }
}
