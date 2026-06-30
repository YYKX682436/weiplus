package gz0;

/* loaded from: classes13.dex */
public final class d implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener {
    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "onCompletion");
        ((ku5.t0) ku5.t0.f394148d).g(new gz0.b(interfaceC26164x73fc6bc6));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "onError errType:" + i17 + " errorCode:" + i18 + ", arg:" + j17 + ' ' + j18);
        ((ku5.t0) ku5.t0.f394148d).g(new gz0.c(interfaceC26164x73fc6bc6));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "onInfo, what:" + i17 + ' ' + j17 + ' ' + j18 + ' ' + obj);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "onPrepared");
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100975x68ac462();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "onStateChange " + i17 + ' ' + i18);
    }
}
