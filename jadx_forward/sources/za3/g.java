package za3;

/* loaded from: classes13.dex */
public class g implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16282xac697352 f552444d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16282xac697352 c16282xac697352) {
        this.f552444d = c16282xac697352;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16282xac697352 c16282xac697352 = this.f552444d;
        ab3.h hVar = c16282xac697352.f226147d;
        if (hVar != null) {
            com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4395x7851a8f0 interfaceC4395x7851a8f0 = c16282xac697352.f226150g;
            if (interfaceC4395x7851a8f0 != null) {
                interfaceC4395x7851a8f0.mo37127x6ff2357(new com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.C4406x873d1d26(f18, f17));
                c16282xac697352.f226150g.mo37130x205ac394(d18);
            } else {
                c16282xac697352.f226150g = hVar.mo998x29f3758d(f18, f17, d18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16282xac697352 c16282xac6973522 = this.f552444d;
            if (c16282xac6973522.f226149f) {
                c16282xac6973522.f226147d.mo1018x517216ab(c16282xac6973522, f18, f17);
            } else {
                c16282xac6973522.f226149f = true;
                c16282xac6973522.f226147d.mo993x4fdae5f9(c16282xac6973522, f18, f17);
            }
        }
        return true;
    }
}
