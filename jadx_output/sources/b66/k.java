package b66;

/* loaded from: classes11.dex */
public class k extends com.tencent.unit_rc.BaseProxyObject implements b66.j {
    public bw5.er0[] a(java.lang.String[] idList) {
        kotlin.jvm.internal.o.g(idList, "idList");
        byte[][] UR_B857 = urgen.ur_2BA9.UR_71EB.UR_B857(getCppPointer(), idList);
        int length = UR_B857.length;
        bw5.er0[] er0VarArr = new bw5.er0[length];
        for (int i17 = 0; i17 < length; i17++) {
            er0VarArr[i17] = new bw5.er0();
        }
        b66.b0.c(UR_B857, er0VarArr);
        return er0VarArr;
    }

    public bw5.fr0 d() {
        return (bw5.fr0) b66.b0.d(urgen.ur_2BA9.UR_71EB.UR_72C6(getCppPointer()), new bw5.fr0());
    }
}
