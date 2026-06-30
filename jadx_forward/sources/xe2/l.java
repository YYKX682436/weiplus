package xe2;

/* loaded from: classes3.dex */
public final class l implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xe2.n f535410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f535411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f535412c;

    public l(xe2.n nVar, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, dk2.zf zfVar) {
        this.f535410a = nVar;
        this.f535411b = interfaceC4987x84e327cb;
        this.f535412c = zfVar;
    }

    @Override // dr.q
    public void a(boolean z17) {
        xe2.n nVar = this.f535410a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f535417b, "[addMsgAfterEmojiLoaded] md5 = " + this.f535411b.mo42933xb5885648() + ", success = " + z17);
        if (z17) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(this.f535412c);
            nVar.e(linkedList);
        }
    }
}
