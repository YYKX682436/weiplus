package et0;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea f338059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ javax.microedition.khronos.opengles.GL10 f338060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f338061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f338062g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea, javax.microedition.khronos.opengles.GL10 gl10, int i17, int i18) {
        super(0);
        this.f338059d = c10905xfb961aea;
        this.f338060e = gl10;
        this.f338061f = i17;
        this.f338062g = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        is0.c c17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("previewController initRender  ");
        com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea = this.f338059d;
        sb6.append(c10905xfb961aea.f150471d == null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewGLSurfaceView", sb6.toString(), new java.lang.Object[0]);
        ft0.d dVar = c10905xfb961aea.f150472e;
        int i17 = this.f338062g;
        int i18 = this.f338061f;
        if (dVar != null) {
            dVar.e(this.f338060e, i18, i17);
        }
        ft0.d dVar2 = c10905xfb961aea.f150472e;
        if (dVar2 != null && (c17 = dVar2.c()) != null) {
            c17.f375933m = i18;
            c17.f375934n = i17;
        }
        c10905xfb961aea.f150473f = true;
        if (c10905xfb961aea.f150471d != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("callback.invoke  ");
            ft0.d dVar3 = c10905xfb961aea.f150472e;
            sb7.append(dVar3 != null ? dVar3.b() : null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewGLSurfaceView", sb7.toString(), new java.lang.Object[0]);
            yz5.l lVar = c10905xfb961aea.f150471d;
            if (lVar != null) {
                ft0.d dVar4 = c10905xfb961aea.f150472e;
                lVar.mo146xb9724478(dVar4 != null ? dVar4.b() : null);
            }
        }
        return jz5.f0.f384359a;
    }
}
