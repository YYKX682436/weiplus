package zk3;

/* loaded from: classes8.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f555010f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f555011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zk3.g0 g0Var, java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        super(0);
        this.f555008d = g0Var;
        this.f555009e = str;
        this.f555010f = i17;
        this.f555011g = c16601x7ed0e40c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zk3.h hVar;
        zk3.g0 g0Var = this.f555008d;
        java.lang.String str = this.f555009e;
        int i17 = this.f555010f;
        int a76 = g0Var.a7(str, i17);
        java.util.ArrayList arrayList = g0Var.f554985g;
        if (a76 >= 0) {
            arrayList.remove(a76);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = g0Var.f554995t;
            int a07 = (c22848x6ddd90cf != null ? c22848x6ddd90cf.a0() : 1) + a76;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = g0Var.f554995t;
            if (c22848x6ddd90cf2 != null) {
                c22848x6ddd90cf2.m8155x27702c4(a07);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = null;
            int i18 = 0;
            if (arrayList.size() == 1) {
                g0Var.d7(((uk3.a) arrayList.get(0)).f510057d, false, false);
            } else {
                g0Var.d7(null, true, false);
            }
            g0Var.X6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = this.f555011g;
            if (c16601x7ed0e40c2 == null) {
                if (str != null) {
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        uk3.a aVar = (uk3.a) next;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f510057d.f66791xc8a07680, str)) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c3 = aVar.f510057d;
                            if (c16601x7ed0e40c3.f66793x2262335f == i17) {
                                c16601x7ed0e40c = c16601x7ed0e40c3;
                                break;
                            }
                        }
                        i18 = i19;
                    }
                }
                c16601x7ed0e40c2 = c16601x7ed0e40c;
            }
            if (c16601x7ed0e40c2 != null && (hVar = g0Var.f554992q) != null) {
                yk3.i iVar = (yk3.i) hVar;
                pk3.h c17 = iVar.c(c16601x7ed0e40c2);
                if (c17 != null) {
                    c17.Q6(c16601x7ed0e40c2, a76);
                }
                java.lang.String field_id = c16601x7ed0e40c2.f66791xc8a07680;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
                iVar.g(field_id);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MinusScreenPanel", "onGridItemDelete, id:%s", c16601x7ed0e40c2.f66791xc8a07680);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "DELETE, curSize: " + arrayList.size());
        return jz5.f0.f384359a;
    }
}
