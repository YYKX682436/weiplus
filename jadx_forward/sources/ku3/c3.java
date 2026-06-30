package ku3;

/* loaded from: classes3.dex */
public final class c3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f393713d;

    public c3(ku3.e3 e3Var) {
        this.f393713d = e3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        boolean z17 = ((zt3.c) obj).f557121b;
        ku3.e3 e3Var = this.f393713d;
        if (z17) {
            e3Var.e().setBackground(e3Var.f393743m);
            e3Var.d().s(com.p314xaae8f345.mm.R.raw.f79977x985fd9b7, com.p314xaae8f345.mm.R.C30859x5a72f63.f560305gs);
        } else {
            e3Var.e().setBackground(e3Var.f393744n);
            e3Var.d().s(com.p314xaae8f345.mm.R.raw.f79977x985fd9b7, com.p314xaae8f345.mm.R.C30859x5a72f63.f560306gt);
        }
    }
}
