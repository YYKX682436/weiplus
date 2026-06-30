package ik4;

/* loaded from: classes4.dex */
public final class a implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f373446d;

    public a(ik4.g gVar) {
        this.f373446d = gVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public final void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        java.util.Iterator it = this.f373446d.f373459u.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener) it.next()).mo53280xa6db431b(interfaceC26164x73fc6bc6);
        }
    }
}
