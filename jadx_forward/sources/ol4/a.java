package ol4;

/* loaded from: classes14.dex */
public final class a implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427682d;

    public a(ol4.q qVar) {
        this.f427682d = qVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public final void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        ol4.q qVar = this.f427682d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f427730s, "onSeekEnd");
        qVar.f427729r = false;
        ll4.a aVar = qVar.f427715d;
        if (aVar != null) {
            ll4.a.a(aVar, 10, null, 2, null);
        }
    }
}
