package com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.t tVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTips.NewTipsXMLConsumer", "consumeNewXml() batch delete expire data!!");
        vn3.b Bi = rn3.i.Bi();
        long a17 = c01.id.a() / 1000;
        l75.k0 k0Var = Bi.f519963d;
        try {
            k0Var.mo70514xb06685ab("NewTipsInfo2", "disappearTime!=0 and disappearTime<?", new java.lang.String[]{a17 + ""});
            k0Var.mo70514xb06685ab("NewTipsInfo2", "disappearTime=0 and exposureTime!=0 and exposureDisappearTime<?", new java.lang.String[]{a17 + ""});
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTips.NewTipsInfoStorage", "deleteExpireData NewTipsInfo by dissappearTime [%s]", e17.toString());
        }
    }
}
