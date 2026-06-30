package on;

/* loaded from: classes11.dex */
public class f implements xg3.i0 {
    @Override // xg3.i0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        java.util.ArrayList arrayList;
        boolean z17;
        boolean z18;
        if (m0Var == null || l0Var == null || !"delete".equals(l0Var.f535944b) || (arrayList = l0Var.f535945c) == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            } else if (kn.l0.a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next())) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            rn.i Di = ((nn.j) i95.n0.c(nn.j.class)).Di();
            java.lang.String str = l0Var.f535943a;
            rn.h y07 = Di.y0(str);
            if (y07 == null || y07.f66386xae782d0e == 0) {
                z18 = false;
            } else {
                y07.f66386xae782d0e = 0;
                z18 = ((nn.j) i95.n0.c(nn.j.class)).Di().mo9952xce0038c9(y07, new java.lang.String[0]);
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            objArr[1] = y07 == null ? "null" : "not_null";
            objArr[2] = java.lang.Boolean.valueOf(z18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatroomUIMsgListener", "onNotifyChange roomName:%s groupTools:%s result:%s", objArr);
        }
    }
}
