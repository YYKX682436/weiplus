package w71;

/* loaded from: classes8.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f524948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f524949e;

    public k1(int i17, yz5.l lVar) {
        this.f524948d = i17;
        this.f524949e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] d17 = w71.l1.d(this.f524948d);
        yz5.l lVar = this.f524949e;
        if (lVar != null) {
            lVar.mo146xb9724478(d17);
        }
    }
}
