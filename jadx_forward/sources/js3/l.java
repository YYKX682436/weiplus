package js3;

/* loaded from: classes.dex */
public class l implements com.p314xaae8f345.mm.p794xb0fa9b5e.j, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383066d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f383067e;

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        this.f383066d = bundle.getString("mail_id");
        int i17 = bundle.getInt("mail_status");
        this.f383067e = rVar;
        gm0.j1.d().g(new ms3.g(this.f383066d, i17));
        gm0.j1.d().a(11480, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateMailStatusTask", "read mail, errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (!((ms3.g) m1Var).f412527f.equals(this.f383066d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UpdateMailStatusTask", "not my scene, ignore");
            return;
        }
        gm0.j1.d().q(11480, this);
        if (this.f383067e != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("err_type", i17);
            bundle.putInt("err_code", i18);
            bundle.putString("err_msg", str);
            bundle.putString("mail_id", this.f383066d);
            this.f383067e.a(bundle);
        }
    }
}
