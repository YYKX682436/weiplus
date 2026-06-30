package ke3;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f388549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f388550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f388551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f388552g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ke3.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l lVar2) {
        super(1);
        this.f388549d = str;
        this.f388550e = str2;
        this.f388551f = str3;
        this.f388552g = lVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        if (view != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclCommonStarterDemoUI", "bindFrameSetView ok, frameSetName: " + this.f388549d + ", frameSetRootPath: " + this.f388550e + ", frameSetData.len: " + this.f388551f.length());
            this.f388552g.mo146xb9724478(view);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclCommonStarterDemoUI", "in starterBiz case, onRequestInsertCoverView, frameSetView is null");
        }
        return jz5.f0.f384359a;
    }
}
