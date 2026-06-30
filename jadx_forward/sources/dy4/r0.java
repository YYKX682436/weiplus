package dy4;

/* loaded from: classes15.dex */
public final class r0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f326233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f326234f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(dy4.f1 f1Var, sf.f fVar, java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f326232d = f1Var;
        this.f326233e = fVar;
        this.f326234f = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.n23 n23Var = (r45.n23) obj;
        dy4.f1 f1Var = this.f326232d;
        f1Var.C = n23Var;
        java.lang.String m75945x2fec8307 = n23Var != null ? n23Var.m75945x2fec8307(2) : null;
        boolean z17 = false;
        boolean z18 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        sf.f fVar = this.f326233e;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f1Var.x(), "insertVideo getFinderVideoInfo callback url empty");
            fVar.g("fail");
        } else if (((sf.f) this.f326234f.get()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(f1Var.x(), "insertVideo getFinderVideoInfo callback context invalid");
        } else {
            ye1.e eVar = f1Var.f326160n;
            if ((eVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v) && n23Var != null) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v vVar = eVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v) eVar : null;
                    if (vVar != null) {
                        vVar.H(n23Var);
                    }
                    z17 = true;
                } catch (java.lang.IllegalStateException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(f1Var.x(), "setFinderVideoInfoForMp illegal state: " + e17.getMessage());
                }
            }
            if (z17) {
                f1Var.B();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "insertVideo getFinderVideoInfo callback handleRet: " + z17);
            fVar.g(z17 ? "ok" : "fail");
            f1Var.t(fVar);
        }
        return jz5.f0.f384359a;
    }
}
