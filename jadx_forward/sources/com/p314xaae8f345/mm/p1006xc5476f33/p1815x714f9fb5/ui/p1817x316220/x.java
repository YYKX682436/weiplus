package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

@j95.b
/* loaded from: classes13.dex */
public class x extends i95.w implements ab3.g {
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 wi(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 c16320xe3e95109;
        boolean equalsIgnoreCase = "CN".equalsIgnoreCase((java.lang.String) gm0.j1.u().c().l(274436, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MapFactoryImp", "chinaReg:%b", java.lang.Boolean.valueOf(equalsIgnoreCase));
        boolean z17 = !equalsIgnoreCase;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MapFactoryImp", "isOverseasUser:%b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.C25964xb9d36a6b.m99185xfd93bcbe(true);
        if (z17) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7 c25946x7e4576a7 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25946x7e4576a7();
            c25946x7e4576a7.m99065x299d9fab(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81001x834524fd));
            c16320xe3e95109 = new com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109(context, c25946x7e4576a7);
        } else {
            c16320xe3e95109 = new com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109(context);
        }
        c16320xe3e95109.setId(com.p314xaae8f345.mm.R.id.ghr);
        return c16320xe3e95109;
    }
}
