package w71;

/* loaded from: classes8.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f524939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f524940e;

    public i1(int i17, yz5.l lVar) {
        this.f524939d = i17;
        this.f524940e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] b17 = w71.l1.b(this.f524939d);
        yz5.l lVar = this.f524940e;
        if (lVar != null) {
            lVar.mo146xb9724478(b17);
        }
    }
}
