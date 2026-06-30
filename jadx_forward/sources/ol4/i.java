package ol4;

/* loaded from: classes14.dex */
public final class i implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427690d;

    public i(ol4.q qVar) {
        this.f427690d = qVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public final void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        java.lang.String str = "errorType:" + i17 + "|errorCode:" + i18 + "|arg1:" + j17 + "|arg2:" + j18;
        ol4.q qVar = this.f427690d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(qVar.f427730s, "tp OnError:" + str);
        if (1220 == i17) {
            return;
        }
        qVar.r(true);
        ll4.a aVar = qVar.f427715d;
        if (aVar != null) {
            ((kl4.n) aVar).b(12, str);
        }
    }
}
