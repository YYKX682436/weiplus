package p71;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public i83.a f434006a = new i83.a();

    public void a(i83.b bVar) {
        java.lang.String str = bVar.f371168e;
        if (str == null || !str.equals("0")) {
            java.lang.String str2 = bVar.f371168e;
            if (str2 != null && str2.equals("1")) {
                bVar.f371170g = bVar.f371169f;
                bVar.f371169f = "";
                bVar.f371175o = "";
                bVar.f371171h = "";
                bVar.f371172i = "";
                bVar.f371173m = "";
                bVar.f371178r = "";
                this.f434006a.f371166d.add(bVar);
            }
        } else {
            bVar.f371170g = "";
            bVar.f371176p = "";
            bVar.f371177q = "";
            this.f434006a.f371166d.add(bVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InvoiceMgr", "type is error..");
    }
}
