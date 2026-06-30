package qd0;

/* loaded from: classes11.dex */
public class m0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd0.n0 f443080d;

    public m0(qd0.n0 n0Var) {
        this.f443080d = n0Var;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        java.lang.Object obj;
        int i17 = vVar.f432691c;
        qd0.n0 n0Var = this.f443080d;
        p13.u uVar = vVar.f432689a;
        if (i17 == -3 || i17 == -2 || i17 == -1) {
            if (uVar.f432674c.equals(n0Var.f443096n)) {
                n0Var.b();
                return;
            }
            return;
        }
        if (i17 == 0 && (obj = n0Var.f443095m) != null && obj.equals(obj)) {
            n0Var.f443098p = vVar.f432692d;
            java.util.List list = vVar.f432693e;
            int i18 = 0;
            if (n0Var.f443099q != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    p13.y yVar = (p13.y) list.get(size);
                    if (!n0Var.f443099q.contains(yVar.f432720e)) {
                        int i19 = yVar.f432717b;
                        if (i19 == 131072 || i19 == 131075 || i19 == 131076 || i19 == 2097171 || i19 == 2097173 || i19 == 131081) {
                        }
                    }
                    list.remove(size);
                }
            }
            rd0.b1 b1Var = n0Var.f443104v;
            if (b1Var != null) {
                b1Var.a(list);
            }
            int[] iArr = uVar.f432678g;
            if (iArr != null && iArr.length > 0) {
                i18 = iArr[0];
            }
            if (vVar.f432693e.size() > 0) {
                switch (i18) {
                    case 131072:
                    case 131081:
                        qd0.n0.a(n0Var, vVar.f432693e, i18);
                        break;
                    case 131075:
                        java.util.List list2 = vVar.f432693e;
                        if (n0Var.f443102t && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list2)) {
                            int size2 = list2.size();
                            int size3 = list2.size();
                            while (true) {
                                size3--;
                                if (size3 < 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "checkFilterAssociateChatRoom: originCount:%d, final count:%d", java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(list2.size()));
                                } else if (c01.e2.E(((p13.y) list2.get(size3)).f432720e)) {
                                    list2.remove(size3);
                                }
                            }
                        }
                        n0Var.f443093k = vVar.f432693e;
                        break;
                    case 131076:
                    case 2097171:
                    case 2097173:
                        n0Var.f443094l = vVar.f432693e;
                        break;
                    default:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSearchContactAdapter", "not support search");
                        break;
                }
            } else {
                switch (i18) {
                    case 131072:
                    case 131081:
                        qd0.n0.a(n0Var, null, i18);
                        break;
                    case 131075:
                        n0Var.f443093k = null;
                        break;
                    case 131076:
                    case 2097171:
                    case 2097173:
                        n0Var.f443094l = null;
                        break;
                }
            }
            n0Var.j(uVar.f432674c, n0Var.b(), true);
        }
    }
}
