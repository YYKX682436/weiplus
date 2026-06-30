package qr4;

/* loaded from: classes9.dex */
public class c extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f447660c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qr4.h hVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f447660c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        qr4.h hVar = this.f447660c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) hVar.f295334c.getParcelable("key_bankcard");
        hVar.f295334c.putString("key_pwd1", (java.lang.String) objArr[0]);
        hVar.f295334c.putString("key_mobile", c19091x9511676c.f69249x61dbf87);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71();
        c19090x75920c71.f261075d = 3;
        c19090x75920c71.f261077f = (java.lang.String) objArr[0];
        c19090x75920c71.f261079h = c19091x9511676c.f69225xed6d60f6;
        c19090x75920c71.f261078g = c19091x9511676c.f69223x58802fcb;
        c19090x75920c71.f261090v = (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) hVar.f295334c.getParcelable("key_pay_info");
        c19090x75920c71.f261089u = c19091x9511676c.f69215x54da57dd;
        this.f420367b.d(new as4.b(c19090x75920c71, (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05) hVar.f295334c.getParcelable("key_orders"), false), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof as4.b)) {
            return false;
        }
        as4.b bVar = (as4.b) m1Var;
        qr4.h hVar = this.f447660c;
        hVar.f295334c.putString("kreq_token", bVar.C);
        hVar.f295334c.putParcelable("key_authen", bVar.B);
        hVar.f295334c.putBoolean("key_need_verify_sms", !bVar.f95083z);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2368x36f002.C19088xa4b300c1 c19088xa4b300c1 = bVar.f295594s;
        if (c19088xa4b300c1 != null) {
            hVar.f295334c.putParcelable("key_realname_guide_helper", c19088xa4b300c1);
        }
        org.json.JSONArray jSONArray = bVar.I;
        if (jSONArray != null) {
            hVar.f295334c.putString("key_fetch_result_show_info", jSONArray.toString());
        }
        android.os.Bundle bundle = hVar.f295334c;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f420366a;
        com.p314xaae8f345.mm.p2802xd031a825.a.d(abstractActivityC21394xb3d2c0cf, bundle);
        abstractActivityC21394xb3d2c0cf.finish();
        return true;
    }
}
