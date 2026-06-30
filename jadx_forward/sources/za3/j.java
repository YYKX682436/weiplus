package za3;

/* loaded from: classes13.dex */
public class j implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16283xa33549b3 f552499d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16283xa33549b3 c16283xa33549b3) {
        this.f552499d = c16283xa33549b3;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.C16283xa33549b3 c16283xa33549b3 = this.f552499d;
        c16283xa33549b3.f226154f.setVisibility(8);
        c16283xa33549b3.f226153e.setVisibility(0);
        ab3.h hVar = c16283xa33549b3.f226155g;
        if (hVar != null && c16283xa33549b3.f226156h) {
            hVar.mo1001x8873d7af().mo991x6ff2357(f18, f17);
            if (c16283xa33549b3.f226155g.mo1009x60df64bb() < 15) {
                c16283xa33549b3.f226155g.mo1001x8873d7af().mo992x76535355(15);
            }
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new za3.i(this));
        return false;
    }
}
