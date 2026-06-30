package w22;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f524092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f524093e;

    public j(yz5.l lVar, boolean z17) {
        this.f524092d = lVar;
        this.f524093e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar = this.f524092d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(this.f524093e));
        }
    }
}
