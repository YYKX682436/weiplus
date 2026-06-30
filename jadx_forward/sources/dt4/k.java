package dt4;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt4.p f324777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f324778e;

    public k(dt4.p pVar, int i17) {
        this.f324777d = pVar;
        this.f324778e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dt4.p pVar = this.f324777d;
        int i17 = this.f324778e;
        pVar.f324802b = i17;
        dt4.i iVar = pVar.f324805e;
        if (iVar != null) {
            iVar.a(i17);
        }
    }
}
