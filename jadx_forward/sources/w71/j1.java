package w71;

/* loaded from: classes8.dex */
public final class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f524944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f524945e;

    public j1(int i17, yz5.l lVar) {
        this.f524944d = i17;
        this.f524945e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] c17 = w71.l1.c(this.f524944d);
        yz5.l lVar = this.f524945e;
        if (lVar != null) {
            lVar.mo146xb9724478(c17);
        }
    }
}
