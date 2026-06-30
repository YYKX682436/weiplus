package ls0;

/* loaded from: classes10.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f402370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ls0.r0 r0Var) {
        super(1);
        this.f402370d = r0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.media.MediaFormat mediaFormat = (android.media.MediaFormat) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        ls0.r0 r0Var = this.f402370d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0Var.f402449t, "onFormatChanged, format:" + mediaFormat);
        ls0.k kVar = r0Var.F;
        if (kVar != null) {
            kVar.j(mediaFormat);
        }
        return jz5.f0.f384359a;
    }
}
