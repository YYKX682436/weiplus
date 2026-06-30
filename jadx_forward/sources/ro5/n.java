package ro5;

/* loaded from: classes14.dex */
public final class n implements ro5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ro5.b0 f479798a;

    public n(ro5.b0 b0Var) {
        this.f479798a = b0Var;
    }

    public void a(int i17, int i18, int i19, int i27, boolean z17) {
        if (i18 == 0 || i19 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController", "updateMemberSize, new size is zero");
            return;
        }
        ro5.b0 b0Var = this.f479798a;
        ro5.j jVar = b0Var.f479677a;
        if (jVar != null) {
            jVar.d(i17, i18, i19, i27, z17, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoIPMPRenderController", "textureManager is null");
            b0Var.f479692p.put(i17, new ro5.e(i17, i18, i19, i27, z17));
        }
    }
}
