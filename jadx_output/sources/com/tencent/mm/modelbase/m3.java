package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class m3 extends k36.c {
    public m3(com.tencent.mm.modelbase.n3 n3Var) {
    }

    @Override // k36.c
    public void a(int i17, java.lang.String str, java.lang.String str2) {
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WtloginMgr.Core", "[%s]%s", str, str2);
        } else if (i17 != 2 && i17 == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WtloginMgr.Core", "[%s]%s", str, str2);
        }
    }
}
