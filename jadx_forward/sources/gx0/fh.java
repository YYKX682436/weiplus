package gx0;

/* loaded from: classes5.dex */
public final class fh implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.kh f357973d;

    public fh(gx0.kh khVar) {
        this.f357973d = khVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        cx0.f fVar = (cx0.f) obj;
        if (fVar == null) {
            return;
        }
        gx0.kh khVar = this.f357973d;
        gx0.bf.q7(khVar.V6(), fVar.f306053c, true, 0L, 4, null);
        cx0.a aVar = cx0.a.f306026d;
        cx0.a aVar2 = fVar.f306051a;
        java.lang.String str2 = fVar.f306052b;
        if (aVar2 == aVar) {
            str = ((java.lang.String) ((jz5.n) khVar.f358178u).mo141623x754a37bb()) + str2;
        } else {
            str = ((java.lang.String) ((jz5.n) khVar.f358179v).mo141623x754a37bb()) + str2;
        }
        if (str2.length() > 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = khVar.f358180w;
            if (f4Var != null) {
                f4Var.cancel();
            }
            android.app.Activity m80379x76847179 = khVar.m80379x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
            e4Var.f293309c = str;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 a17 = e4Var.a();
            khVar.f358180w = a17;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = a17.f293324d;
            if (e4Var2 != null) {
                e4Var2.c();
            }
        }
    }
}
