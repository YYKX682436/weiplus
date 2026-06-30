package l53;

/* loaded from: classes8.dex */
public final class g implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l53.i f398189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f398190e;

    public g(l53.i iVar, android.content.Context context) {
        this.f398189d = iVar;
        this.f398190e = context;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1002) {
            l53.i iVar = this.f398189d;
            if (i18 == -1) {
                l53.a aVar = iVar.f398195c;
                if (aVar != null) {
                    aVar.mo64832xe05b4124();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video ,shareToTimeline success");
            } else {
                l53.a aVar2 = iVar.f398195c;
                if (aVar2 != null) {
                    aVar2.mo64831x3d6f0539();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MiniGameVideoShareProcessor", "gamelog.share , share video , shareToTimeline cancel");
            }
            ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) this.f398190e).m78750xc5512edd(null);
        }
    }
}
