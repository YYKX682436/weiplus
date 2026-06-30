package u62;

/* loaded from: classes12.dex */
public class d implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f506482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u62.e f506483e;

    public d(u62.e eVar, java.lang.String str) {
        this.f506483e = eVar;
        this.f506482d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        u62.e eVar = this.f506483e;
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderMsg", "scene == null");
            c01.d9.e().q(522, this);
            eVar.f506487g.k(4);
            eVar.f506486f.a();
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 522) {
            eVar.f506487g.k(0);
        } else {
            java.lang.String str2 = this.f506482d;
            if (i17 == 0 && i18 == 0) {
                eVar.f506487g.f181424o.addRow(new java.lang.Object[]{str2, 1});
                eVar.f506487g.k(0);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtControlProviderMsg", "rtSENDMSG onSceneEnd err, errType = " + i17 + ", errCode = " + i18);
                eVar.f506487g.f181424o.addRow(new java.lang.Object[]{str2, 2});
                eVar.f506487g.k(4);
            }
        }
        eVar.f506486f.a();
        c01.d9.e().q(522, this);
    }
}
