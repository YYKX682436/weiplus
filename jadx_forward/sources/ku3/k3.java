package ku3;

/* loaded from: classes3.dex */
public final class k3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f393827d;

    public k3(ku3.y3 y3Var) {
        this.f393827d = y3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        boolean z17 = ((zt3.c) obj).f557121b;
        ku3.y3 y3Var = this.f393827d;
        if (z17) {
            y3Var.e().setBackground(y3Var.f394015t);
            y3Var.d().s(com.p314xaae8f345.mm.R.raw.f79978xb34bbf16, com.p314xaae8f345.mm.R.C30859x5a72f63.f560305gs);
        } else {
            y3Var.e().setBackground(y3Var.f394016u);
            y3Var.d().s(com.p314xaae8f345.mm.R.raw.f79978xb34bbf16, com.p314xaae8f345.mm.R.C30859x5a72f63.f560306gt);
        }
    }
}
