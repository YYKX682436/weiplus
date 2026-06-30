package ih1;

/* loaded from: classes7.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih1.u f373034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373037g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f373038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ih1.m mVar, ih1.u uVar, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l lVar) {
        super(1);
        this.f373034d = uVar;
        this.f373035e = str;
        this.f373036f = str2;
        this.f373037g = str3;
        this.f373038h = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        ih1.u uVar = this.f373034d;
        if (view != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdMiniProgramInstaller", "appId[" + uVar.f373063a + "], bindFrameSetView ok, frameSetName: " + this.f373035e + ", frameSetRootPath: " + this.f373036f + ", frameSetData.len: " + this.f373037g.length());
            this.f373038h.mo146xb9724478(view);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicAdMiniProgramInstaller", "appId[" + uVar.f373063a + "], in starterBiz case, onRequestInsertCoverView, frameSetView is null");
        }
        return jz5.f0.f384359a;
    }
}
