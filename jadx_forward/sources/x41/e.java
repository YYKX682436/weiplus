package x41;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de f533304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f533305e;

    public e(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p986x373aa5.AbstractC11221xf21fe5de abstractC11221xf21fe5de, int i17) {
        this.f533304d = abstractC11221xf21fe5de;
        this.f533305e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x41.b bVar = this.f533304d.f153842i;
        if (bVar != null) {
            bVar.mo173204xf0b10c72(this.f533305e);
        }
    }
}
