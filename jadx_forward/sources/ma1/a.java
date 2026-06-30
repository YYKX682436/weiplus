package ma1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.o0 {

    /* renamed from: CTRL_INDEX */
    public static final int f72799x366c91de = 667;

    /* renamed from: NAME */
    public static final java.lang.String f72800x24728b = "onGameRecorderStateChange";

    public void x(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, java.lang.String str) {
        u(e9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch error: %d, %s", java.lang.Integer.valueOf(i17), str);
        java.util.HashMap hashMap = new java.util.HashMap(3);
        hashMap.put("state", "error");
        hashMap.put("errCode", java.lang.Integer.valueOf(i17));
        hashMap.put("errMsg", str);
        t(hashMap);
        m();
    }

    public void y(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        u(e9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch pause");
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("state", "pause");
        t(hashMap);
        m();
    }

    public void z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        u(e9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch resume");
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("state", "resume");
        t(hashMap);
        m();
    }
}
