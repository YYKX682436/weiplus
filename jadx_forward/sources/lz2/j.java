package lz2;

/* loaded from: classes9.dex */
public class j implements pz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lz2.k f403872d;

    public j(lz2.k kVar) {
        this.f403872d = kVar;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "prepared finish: %s, %s", java.lang.Integer.valueOf(i17), str);
        lz2.k kVar = this.f403872d;
        kVar.f403879d.m83114xe5d7a18f();
        if (i17 == 0) {
            kVar.f403879d.f218514d.setEnabled(true);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = kVar.f403879d;
            activityC15521xdb435b6d.U6(activityC15521xdb435b6d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.aiu));
        }
    }
}
