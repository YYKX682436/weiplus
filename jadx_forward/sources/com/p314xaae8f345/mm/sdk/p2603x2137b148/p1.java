package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes12.dex */
public class p1 implements com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final bm5.p1 f274443a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.o1();

    public p1(com.p314xaae8f345.mm.sdk.p2603x2137b148.o1 o1Var) {
    }

    @Override // com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0
    /* renamed from: isLoggable */
    public boolean mo75069x492678c7(java.lang.String str, int i17) {
        return true;
    }

    @Override // com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.InterfaceC25626x87fce1b0
    /* renamed from: println */
    public void mo75070xed3dc8ef(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, str2);
        } else if (i17 == 5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, str2);
        } else {
            if (i17 != 6) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, str2);
        }
    }
}
