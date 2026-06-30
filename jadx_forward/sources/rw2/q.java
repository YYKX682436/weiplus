package rw2;

/* loaded from: classes10.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.t f482154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(rw2.t tVar) {
        super(0);
        this.f482154d = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rw2.t tVar = this.f482154d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.f482159c, "release");
        is0.c cVar = tVar.f482166j;
        if (cVar != null) {
            cVar.close();
        }
        android.view.Surface surface = tVar.f482164h;
        if (surface != null) {
            surface.release();
        }
        tVar.f482167k.b();
        is0.c cVar2 = tVar.f482169m;
        if (cVar2 != null) {
            cVar2.close();
        }
        rs0.h hVar = tVar.f482160d;
        if (hVar != null) {
            rs0.i.f480829a.u(hVar);
        }
        android.os.HandlerThread handlerThread = tVar.f482161e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        tVar.f482161e = null;
        tVar.f482162f = null;
        return jz5.f0.f384359a;
    }
}
