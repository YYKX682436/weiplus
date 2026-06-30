package ev0;

/* loaded from: classes5.dex */
public final class a extends kk4.i {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ev0.b f338367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ev0.b bVar) {
        super(bVar);
        this.f338367e = bVar;
    }

    @Override // kk4.i, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        yz5.a aVar;
        super.mo53278xc39adf2d(interfaceC26164x73fc6bc6, i17, j17, j18, obj);
        if (i17 != 105 || (aVar = this.f338367e.f338369b0) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }
}
