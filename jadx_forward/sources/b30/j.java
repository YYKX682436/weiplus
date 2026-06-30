package b30;

/* loaded from: classes.dex */
public final class j implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.da f99099d;

    public j(com.p314xaae8f345.mm.ui.da daVar) {
        this.f99099d = daVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsAddressFeatureService", "onActivityResult: " + i17 + ' ' + i18 + ' ' + intent);
        com.p314xaae8f345.mm.ui.da daVar = this.f99099d;
        if (daVar != null) {
            daVar.mo9729x757c998b(i17, i18, intent);
        }
    }
}
