package ft0;

/* loaded from: classes14.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms0.c f348002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ft0.h f348003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ms0.c cVar, ft0.h hVar) {
        super(1);
        this.f348002d = cVar;
        this.f348003e = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ms0.c cVar = this.f348002d;
        is0.c j17 = cVar.j();
        int i17 = j17 != null ? j17.f375928e : -1;
        cVar.f412490m = i17;
        os0.a aVar = cVar.f412484g;
        if (aVar != null) {
            aVar.r(i17);
        }
        this.f348003e.f347993a.mo46859x511cb905();
        return jz5.f0.f384359a;
    }
}
