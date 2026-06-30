package f41;

/* loaded from: classes11.dex */
public final class b extends p012xc85e97e9.p013x9d4bf30f.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af f341001a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af activityC11198x400818af) {
        super(true);
        this.f341001a = activityC11198x400818af;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.g
    /* renamed from: handleOnBackPressed */
    public void mo2523xc0eac894() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.A2AActivity", "handleOnBackPressed");
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.ActivityC11198x400818af activityC11198x400818af = this.f341001a;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7664x6f4c869b = activityC11198x400818af.mo7595x9cdc264().m7664x6f4c869b(com.p314xaae8f345.mm.R.id.gd9);
        if (m7664x6f4c869b instanceof com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094) {
            yz5.a aVar = ((com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094) m7664x6f4c869b).f153775o;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        if (m7664x6f4c869b instanceof com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569) {
            yz5.a aVar2 = ((com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569) m7664x6f4c869b).f153788s;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
                return;
            }
            return;
        }
        if (m7664x6f4c869b instanceof com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c) {
            yz5.a aVar3 = ((com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11200x558f7a4c) m7664x6f4c869b).X1;
            if (aVar3 != null) {
                aVar3.mo152xb9724478();
                return;
            }
            return;
        }
        if (m7664x6f4c869b instanceof com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11201x6771ccd0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.A2AActivity", "PermissionRequestCard: back press ignored");
        } else {
            activityC11198x400818af.finish();
        }
    }
}
