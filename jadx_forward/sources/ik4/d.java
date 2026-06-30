package ik4;

/* loaded from: classes4.dex */
public final class d implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f373449d;

    public d(ik4.g gVar) {
        this.f373449d = gVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public final void mo53282x4799dc42(int i17, int i18) {
        java.util.Iterator it = this.f373449d.f373461w.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener) it.next()).mo53282x4799dc42(i17, i18);
        }
    }
}
