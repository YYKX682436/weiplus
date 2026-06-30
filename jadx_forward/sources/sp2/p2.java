package sp2;

/* loaded from: classes3.dex */
public final class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f492713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f492714e;

    public p2(yz5.a aVar, sp2.d3 d3Var) {
        this.f492713d = aVar;
        this.f492714e = d3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a aVar = this.f492713d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        this.f492714e.f492547h = null;
    }
}
