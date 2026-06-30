package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public class s3 implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4 f264151a;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4 c19264xff7385d4) {
        this.f264151a = c19264xff7385d4;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        r45.aq3 aq3Var = (r45.aq3) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.C19264xff7385d4 c19264xff7385d4 = this.f264151a;
        if (aq3Var == null) {
            bundle.putInt("key_resp_ret", -1);
            c19264xff7385d4.f263666d.a(bundle);
            return;
        }
        try {
            byte[] mo14344x5f01b1f6 = aq3Var.mo14344x5f01b1f6();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QBarLogicTask", "response bytes len = %d ", java.lang.Integer.valueOf(mo14344x5f01b1f6.length));
            bundle.putInt("key_resp_ret", 0);
            bundle.putByteArray("key_resp_item_bytes", mo14344x5f01b1f6);
            c19264xff7385d4.f263666d.a(bundle);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QBarLogicTask", e17.getMessage());
        }
    }
}
