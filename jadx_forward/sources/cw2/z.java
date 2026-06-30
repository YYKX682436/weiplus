package cw2;

/* loaded from: classes2.dex */
public final class z implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.b0 f305658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener f305659e;

    public z(cw2.b0 b0Var, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.f305658d = b0Var;
        this.f305659e = iOnSeekCompleteListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener
    /* renamed from: onSeekComplete */
    public void mo53284xe1fdf750(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f305658d.f305111a.y("onSeekComplete");
        com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnSeekCompleteListener iOnSeekCompleteListener = this.f305659e;
        if (iOnSeekCompleteListener != null) {
            iOnSeekCompleteListener.mo53284xe1fdf750(interfaceC26164x73fc6bc6);
        }
    }
}
