package com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8;

/* loaded from: classes12.dex */
public class f1 implements com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0 {
    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1 m1Var) {
    }

    @Override // com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0
    /* renamed from: isLoggable */
    public boolean mo75069x492678c7(java.lang.String str, int i17) {
        return i17 >= 2 && i17 <= 7 && com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.f270192g[i17] >= com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
    }

    @Override // com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0
    /* renamed from: println */
    public void mo75070xed3dc8ef(int i17, java.lang.String str, java.lang.String str2) {
        if (mo75069x492678c7(str, i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208 m40533xfb80ca96 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40533xfb80ca96();
            int myPid = android.os.Process.myPid();
            int myTid = android.os.Process.myTid();
            switch (i17) {
                case 2:
                    m40533xfb80ca96.mo40556x32c592(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 3:
                    m40533xfb80ca96.mo40552x32c580(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 4:
                    m40533xfb80ca96.mo40555x32c585(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 5:
                    m40533xfb80ca96.mo40557x32c593(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 6:
                    m40533xfb80ca96.mo40553x32c581(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                case 7:
                    m40533xfb80ca96.mo40554x32c582(0L, str, "", "", 0, myPid, myTid, myPid, str2);
                    return;
                default:
                    return;
            }
        }
    }
}
