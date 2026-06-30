package sz4;

/* loaded from: classes12.dex */
public class d extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sz4.e f495721a;

    public d(sz4.e eVar) {
        this.f495721a = eVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        sz4.e eVar = this.f495721a;
        if (eVar.E.f377667r) {
            eVar.F.mo50303x856b99f0(4096);
            return;
        }
        eVar.D.setText(" " + ((java.lang.String) c31.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, eVar.E.f377693u)).toString());
        mo50307xb9e94560(4096, 500L);
    }
}
