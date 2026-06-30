package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.RsaCryptUtilImpl */
/* loaded from: classes12.dex */
public class C3258xab4e2a90 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3596xc021fc50 {
    private static final java.lang.String TAG = "MicroMsg.RsaCryptUtilImpl";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3596xc021fc50
    /* renamed from: rsaPublicEncryptPemkey */
    public com.p314xaae8f345.p347x615374d.gen.C3597x390028a2 mo25955xb1150ac3(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p347x615374d.gen.C3597x390028a2 c3597x390028a2 = new com.p314xaae8f345.p347x615374d.gen.C3597x390028a2();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "input is null");
            c3597x390028a2.f13842x32ccf4 = 0;
            return c3597x390028a2;
        }
        com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
        boolean m75993xb1150ac3 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75993xb1150ac3(str.getBytes(), c19764x527bffc1, str2.getBytes());
        if (m75993xb1150ac3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(c19764x527bffc1.f38861x6ac9171)) {
            c3597x390028a2.f13841xc13bc75 = android.util.Base64.encodeToString(c19764x527bffc1.f38861x6ac9171, 2);
        }
        c3597x390028a2.f13842x32ccf4 = !m75993xb1150ac3 ? 1 : 0;
        return c3597x390028a2;
    }
}
