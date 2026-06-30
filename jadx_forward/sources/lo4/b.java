package lo4;

/* loaded from: classes10.dex */
public final class b implements com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f401733a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f401734b;

    /* renamed from: c, reason: collision with root package name */
    public t21.d2 f401735c;

    /* renamed from: d, reason: collision with root package name */
    public int f401736d;

    public b(boolean z17, boolean z18, t21.d2 d2Var) {
        this.f401733a = z17;
        this.f401734b = z18;
        this.f401735c = d2Var;
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7
    /* renamed from: getAudioEncoder */
    public com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25752x15302b69 mo96243xa29636dc() {
        if (!this.f401734b) {
            try {
                return new com.p314xaae8f345.tav.p2959x5befac44.C25774x68f75838();
            } catch (java.lang.Exception unused) {
                this.f401736d = 2;
                return new lo4.a();
            }
        }
        try {
            this.f401736d = 1;
            return new lo4.a();
        } catch (com.p314xaae8f345.tav.p2947x2eaf9f.C25681xf4008f4b unused2) {
            this.f401736d = 3;
            return new com.p314xaae8f345.tav.p2959x5befac44.C25774x68f75838();
        }
    }

    @Override // com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25768xd59ba4f7
    /* renamed from: getVideoEncoder */
    public com.p314xaae8f345.tav.p2959x5befac44.InterfaceC25753x6af89f24 mo96246xf85eaa97() {
        return this.f401733a ? new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w(this.f401735c) : new com.p314xaae8f345.tav.p2959x5befac44.C25773x4e53dc32();
    }
}
