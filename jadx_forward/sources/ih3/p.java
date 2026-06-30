package ih3;

/* loaded from: classes4.dex */
public abstract class p {
    public static java.util.ArrayList a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SysMsgTemplateParser", "hy: null text!!");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String[] split = str.split("\\$");
        for (int i17 = 0; i17 < split.length; i17++) {
            arrayList.add(i17 % 2 == 0 ? new ih3.o(0, split[i17]) : new ih3.o(1, split[i17]));
        }
        return arrayList;
    }
}
