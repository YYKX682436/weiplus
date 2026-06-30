package wj1;

/* loaded from: classes14.dex */
public class o0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj1.q0 f528155d;

    public o0(wj1.q0 q0Var) {
        this.f528155d = q0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        wj1.q0 q0Var = this.f528155d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "phone_list.size %d", java.lang.Integer.valueOf(q0Var.f528163d.f171085e.f460115f.size()));
        java.util.Iterator it = q0Var.f528163d.f171085e.f460115f.iterator();
        while (it.hasNext()) {
            r45.jc jcVar = (r45.jc) it.next();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jcVar.f459225d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jcVar.f459226e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "phone_id or show_phone is empty, continue");
            } else {
                g4Var.f(q0Var.f528163d.f171085e.f460115f.indexOf(jcVar), jcVar.f459226e);
            }
        }
    }
}
