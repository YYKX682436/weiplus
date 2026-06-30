package ig3;

/* loaded from: classes3.dex */
public final class h implements ig3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ig3.i f372960d;

    public h(ig3.i iVar) {
        this.f372960d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
        ig3.i iVar = this.f372960d;
        iVar.d("onGetVideoSize, width: " + i17 + ", height:" + i18, new java.lang.Object[0]);
        ig3.d dVar = iVar.f372963c;
        if (dVar != null) {
            dVar.C(iVar.f372962b, i17, i18);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        ig3.i iVar = this.f372960d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.TPVideoStateController", iVar.c("throwError {" + i17 + ", " + i18 + '}'), java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        iVar.i(ig3.c.f372955m);
    }

    @Override // ig3.b, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        ig3.i iVar = this.f372960d;
        iVar.d("tryStart again, video is prepared", new java.lang.Object[0]);
        iVar.g();
    }
}
