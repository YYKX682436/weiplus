package wo4;

/* loaded from: classes8.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.l f529803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f529804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(wo4.l lVar, yz5.p pVar) {
        super(1);
        this.f529803d = lVar;
        this.f529804e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.nio.IntBuffer it = (java.nio.IntBuffer) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDecoder", "on Snapshot callback, frameCount:" + this.f529803d.f529809e);
        yz5.p pVar = this.f529804e;
        if (pVar != null) {
            pVar.mo149xb9724478(it, java.lang.Integer.valueOf(this.f529803d.f529809e));
        }
        return jz5.f0.f384359a;
    }
}
