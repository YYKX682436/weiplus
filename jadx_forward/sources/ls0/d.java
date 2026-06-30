package ls0;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f402347d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ls0.k kVar) {
        super(0);
        this.f402347d = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ls0.k kVar = this.f402347d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.f402381b, kVar.hashCode() + " do release resources");
        ms0.c.o(kVar.f402380a, false, 1, null);
        android.view.Surface surface = kVar.f402386g;
        if (surface != null) {
            surface.release();
        }
        rs0.h hVar = kVar.f402384e;
        if (hVar != null) {
            rs0.i.f480829a.u(hVar);
        }
        kVar.f402383d.mo50302x6b17ad39(null);
        kVar.f402382c.quitSafely();
        return jz5.f0.f384359a;
    }
}
