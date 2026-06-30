package y22;

/* loaded from: classes10.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 f540640d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7) {
        super(1);
        this.f540640d = c13390xb12545d7;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.C13390xb12545d7 c13390xb12545d7 = this.f540640d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13390xb12545d7.f180155h, "previewCallback: " + surfaceTexture);
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        c13390xb12545d7.f180164t = surface;
        ph3.k kVar = c13390xb12545d7.f180159o;
        if (kVar == null || !c13390xb12545d7.f180162r) {
            c13390xb12545d7.E();
        } else {
            kVar.k(surface);
            if (c13390xb12545d7.f180167w) {
                ph3.k kVar2 = c13390xb12545d7.f180159o;
                if (kVar2 != null) {
                    kVar2.mo158546x68ac462();
                }
            } else {
                c13390xb12545d7.f180168x = true;
                ph3.k kVar3 = c13390xb12545d7.f180159o;
                if (kVar3 != null) {
                    kVar3.mo158544x764d819b(true);
                }
                ph3.k kVar4 = c13390xb12545d7.f180159o;
                if (kVar4 != null) {
                    kVar4.mo158546x68ac462();
                }
            }
            c13390xb12545d7.f180167w = false;
        }
        return jz5.f0.f384359a;
    }
}
