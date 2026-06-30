package d52;

/* loaded from: classes13.dex */
public class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        d52.b bVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null) {
            try {
                byte[] byteArray = bundle.getByteArray("key_hell_msg");
                if (byteArray != null) {
                    r45.hw3 hw3Var = new r45.hw3();
                    hw3Var.mo11468x92b714fd(byteArray);
                    bVar = d52.e.a(hw3Var);
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    d52.d a17 = d52.d.a();
                    a17.getClass();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                        a17.f308064a.a(bVar);
                    } else {
                        a17.b(bVar);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CallMsgToMainProcess", "other process msg send type = [%d]", java.lang.Integer.valueOf(bVar.f308061a));
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CallMsgToMainProcess", "get other process hellMsg err");
            }
        }
        return null;
    }
}
