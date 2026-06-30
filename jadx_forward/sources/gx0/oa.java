package gx0;

/* loaded from: classes5.dex */
public final class oa implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358328d;

    public oa(gx0.ac acVar) {
        this.f358328d = acVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ex0.r n17;
        ax0.e eVar = (ax0.e) obj;
        gx0.ac acVar = this.f358328d;
        ex0.a0 e86 = acVar.e8();
        if (e86 == null || (n17 = e86.n()) == null) {
            return;
        }
        if (n17.f338702c == ug.m.Narration && kz5.z.G(new ax0.e[]{ax0.e.f96512h, ax0.e.f96513i}, eVar)) {
            gx0.ac.a8(acVar, n17);
        }
    }
}
