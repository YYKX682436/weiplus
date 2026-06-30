package ik4;

/* loaded from: classes4.dex */
public final class b implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f373447d;

    public b(ik4.g gVar) {
        this.f373447d = gVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public final void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        java.util.Iterator it = this.f373447d.f373458t.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener) it.next()).mo53281xaf8aa769(interfaceC26164x73fc6bc6, i17, i18, j17, j18);
        }
    }
}
