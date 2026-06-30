package gx0;

/* loaded from: classes5.dex */
public final class df implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.gf f357876d;

    public df(gx0.gf gfVar) {
        this.f357876d = gfVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        wu5.c cVar;
        gx0.fd fdVar = (gx0.fd) obj;
        gx0.fd fdVar2 = gx0.fd.f357963f;
        gx0.gf gfVar = this.f357876d;
        if (fdVar == fdVar2) {
            gfVar.O6();
            return;
        }
        if ((fdVar != gx0.fd.f357962e && fdVar != gx0.fd.f357968n && fdVar != gx0.fd.f357967m) || gfVar.f358004d || (cVar = gfVar.f358007g) == null) {
            return;
        }
        try {
            cVar.cancel(true);
        } catch (java.lang.Exception unused) {
        }
        gfVar.f358007g = null;
    }
}
