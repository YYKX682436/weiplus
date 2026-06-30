package qg5;

/* loaded from: classes8.dex */
public final class h implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qg5.p f444538a;

    public h(qg5.p pVar) {
        this.f444538a = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3
    /* renamed from: dismiss */
    public final void mo2069x63a3b28a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "Dialog is dismissed");
        qg5.p pVar = this.f444538a;
        if (pVar.f444662k) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsAnalyzeStagingDialog", "User cancelled by dismissing");
        qg5.p.a(pVar, 1, pVar.b());
        yz5.a aVar = pVar.f444654c;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
