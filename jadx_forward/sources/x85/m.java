package x85;

/* loaded from: classes9.dex */
public final class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x85.n f534132d;

    public m(x85.n nVar) {
        this.f534132d = nVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle.getInt("err_type");
        int i18 = bundle.getInt("err_code");
        r45.xh3 xh3Var = new r45.xh3();
        byte[] byteArray = bundle.getByteArray("response");
        if (byteArray != null) {
            xh3Var.mo11468x92b714fd(byteArray);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetLensListTask", "ipc callback: " + i17 + ' ' + i18);
        x85.j jVar = this.f534132d.f534133d;
        if (jVar != null) {
            jVar.a(i17, i18, xh3Var);
        }
    }
}
