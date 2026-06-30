package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public class g8 implements java.lang.Runnable {
    public g8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59 c11577xd02dca59) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.wa waVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.wa();
        if (pd.e.f434970a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageBoot", "do not setup more than once.");
        } else {
            pd.e.f434970a = waVar;
            waVar.b(new pd.a());
        }
    }
}
