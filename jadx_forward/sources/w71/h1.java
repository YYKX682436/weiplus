package w71;

/* loaded from: classes8.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f524935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f524936e;

    public h1(int i17, yz5.l lVar) {
        this.f524935d = i17;
        this.f524936e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] a17 = w71.l1.a(this.f524935d);
        yz5.l lVar = this.f524936e;
        if (lVar != null) {
            lVar.mo146xb9724478(a17);
        }
    }
}
