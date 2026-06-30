package dy4;

/* loaded from: classes15.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326152d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(dy4.f1 f1Var) {
        super(1);
        this.f326152d = f1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.n23 n23Var = (r45.n23) obj;
        dy4.f1 f1Var = this.f326152d;
        java.lang.String x17 = f1Var.x();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateFinderFeed getFinderVideoInfo callback, mediaId: ");
        boolean z17 = true;
        sb6.append(n23Var != null ? n23Var.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x17, sb6.toString());
        java.lang.String m75945x2fec8307 = n23Var != null ? n23Var.m75945x2fec8307(2) : null;
        if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(f1Var.x(), "updateFinderFeed getFinderVideoInfo callback, url empty");
        } else if (n23Var != null) {
            ye1.e eVar = f1Var.f326160n;
            if (eVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v vVar = eVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v) eVar : null;
                    if (vVar != null) {
                        vVar.H(n23Var);
                    }
                    f1Var.B();
                } catch (java.lang.IllegalStateException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(f1Var.x(), "setFinderVideoInfoForMp illegal state: " + e17.getMessage());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
