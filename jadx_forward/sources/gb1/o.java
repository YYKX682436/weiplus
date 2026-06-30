package gb1;

/* loaded from: classes4.dex */
public class o implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ig f351532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1069x2e06d1.C12015x8f4deb15 f351533e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1069x2e06d1.C12015x8f4deb15 c12015x8f4deb15, r45.ig igVar) {
        this.f351533e = c12015x8f4deb15;
        this.f351532d = igVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return 0;
        }
        synchronized (this.f351533e.getClass()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1069x2e06d1.C12015x8f4deb15.B(this.f351533e, this.f351532d.f458543d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportSubmitFormTask", "Error: %d, %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return 0;
    }
}
