package xj1;

/* loaded from: classes7.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 f536341d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12708x81c12732 c12708x81c12732) {
        this.f536341d = c12708x81c12732;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p013x9d4bf30f.k mo7430x19263085 = this.f536341d.mo7430x19263085();
        zj1.a aVar = mo7430x19263085 instanceof zj1.a ? (zj1.a) mo7430x19263085 : null;
        if (aVar != null) {
            aVar.H3(false);
        }
    }
}
