package b30;

/* loaded from: classes.dex */
public final class j implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.da f17566d;

    public j(com.tencent.mm.ui.da daVar) {
        this.f17566d = daVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsAddressFeatureService", "onActivityResult: " + i17 + ' ' + i18 + ' ' + intent);
        com.tencent.mm.ui.da daVar = this.f17566d;
        if (daVar != null) {
            daVar.mmOnActivityResult(i17, i18, intent);
        }
    }
}
