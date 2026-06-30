package ro5;

/* loaded from: classes12.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ro5.m1 f479757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f479759f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ro5.m1 m1Var, java.lang.String str, yz5.p pVar) {
        super(2);
        this.f479757d = m1Var;
        this.f479758e = str;
        this.f479759f = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var = jz5.f0.f384359a;
        int intValue = ((java.lang.Number) obj).intValue();
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            surfaceTexture.updateTexImage();
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        java.lang.String str = this.f479758e;
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MVR.VoIPMPRenderLogic", str + " updateTexImage error", surfaceTexture);
        }
        ro5.m1 m1Var = this.f479757d;
        if (m1Var.f479781j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MVR.VoIPMPRenderLogic", str + " onFrameAvailable skip, released");
        } else {
            m1Var.f479780i.a(str, ((java.lang.Boolean) this.f479759f.mo149xb9724478(java.lang.Integer.valueOf(intValue), java.lang.Long.valueOf(surfaceTexture.getTimestamp()))).booleanValue());
        }
        return f0Var;
    }
}
