package yt3;

/* loaded from: classes10.dex */
public final class s2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.z2 f547199d;

    public s2(yt3.z2 z2Var) {
        this.f547199d = z2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        boolean z17 = cVar.f557121b;
        yt3.z2 z2Var = this.f547199d;
        if (!z17) {
            z2Var.f547273g.g(1, 0);
            return;
        }
        android.os.Bundle bundle = cVar.f557122c;
        if (bundle != null) {
            z2Var.f547273g.g(3, bundle.getInt("PARAM_1_INT"));
        }
    }
}
