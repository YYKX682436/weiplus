package yf0;

/* loaded from: classes12.dex */
public final class j implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf0.m f543099a;

    public j(yf0.m mVar) {
        this.f543099a = mVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        yf0.m mVar = this.f543099a;
        zf0.v0 v0Var = mVar.f543119a;
        oi3.h hVar = v0Var.f554096i.f517711e;
        if (hVar == null || n1Var == null || n1Var.f152636a != com.p314xaae8f345.mm.p947xba6de98f.m1.f152613i) {
            return;
        }
        java.lang.Integer e17 = qi3.c.e(v0Var, false, 1, null);
        if (e17 != null) {
            e17.intValue();
            dn.m mVar2 = n1Var.f152639d;
            java.lang.String str = mVar2 != null ? mVar2.f69601xaca5bdda : null;
            if (str == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoCdnSendApi", mVar.f543119a.id() + " uploading compress video and found cancel,cancel cdn mediaid :" + str + ' ');
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Bi(str);
            return;
        }
        if (mVar.f543119a.f445210f == qi3.g0.f445242h) {
            dn.g gVar = n1Var.f152640e;
            long j17 = gVar != null ? gVar.f69496x83ec3dd : 0L;
            long j18 = gVar != null ? gVar.f69500x8ab84c59 : 0L;
            t21.v2 e18 = vf0.m3.e(hVar);
            if (e18 != null) {
                vf0.m3.m(e18, j17);
            }
            zf0.v0 v0Var2 = mVar.f543119a;
            v0Var2.f554103s = j17;
            v0Var2.f554104t = j18;
            v0Var2.J();
        }
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void c(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        if (n1Var != null) {
            java.lang.Integer e17 = qi3.c.e(this.f543099a.f543119a, false, 1, null);
            if (e17 != null) {
                e17.intValue();
                sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
                dn.m mVar = n1Var.f152639d;
                java.lang.String str = mVar != null ? mVar.f69601xaca5bdda : null;
                if (str == null) {
                    str = "";
                }
                ((rx.f) b0Var).Bi(str);
            }
        }
    }
}
