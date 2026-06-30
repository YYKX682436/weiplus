package x11;

/* loaded from: classes11.dex */
public final class x implements x11.a {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ju4 f532951a;

    /* renamed from: b, reason: collision with root package name */
    public int f532952b;

    public x(int i17, int i18, java.lang.String str, r45.ju4 ju4Var, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        ju4Var = (i27 & 8) != 0 ? null : ju4Var;
        i19 = (i27 & 16) != 0 ? 0 : i19;
        this.f532951a = ju4Var;
        this.f532952b = i19;
    }

    @Override // x11.a
    public x11.y a(x11.t initController) {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initController, "initController");
        t4.a.f("NewInitProcessData");
        com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1();
        a1Var.b("NetSceneInit");
        int i17 = ((java.lang.Boolean) ((jz5.n) initController.f532936t).mo141623x754a37bb()).booleanValue() ? Integer.MAX_VALUE : initController.f532926g ? 40 : 10;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i19 >= i17) {
                break;
            }
            r45.ju4 ju4Var = this.f532951a;
            r4 = null;
            r4 = null;
            r45.b50 b50Var = null;
            if ((((ju4Var != null ? ju4Var.f459649i : null) == null || this.f532952b >= ju4Var.f459649i.size()) ? i18 : 1) == 0) {
                ((java.util.LinkedList) initController.f532935s).poll();
                java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(x51.j1.d(ju4Var != null ? ju4Var.f459644d : null));
                java.lang.String l18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(x51.j1.d(ju4Var != null ? ju4Var.f459645e : null));
                gm0.j1.u().c().w(8197, l17);
                gm0.j1.u().c().w(8198, l18);
                gm0.j1.u().c().w(16, java.lang.Integer.valueOf(i18));
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[i18] = ju4Var != null ? java.lang.Integer.valueOf(ju4Var.f459646f) : null;
                objArr[1] = l17;
                objArr[2] = l18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneInit.dkInit", "handleNoMoreCmds ContinueFlag:%s, cur[%s], max[%s]", objArr);
                gm0.j1.u().c().w(8196, ju4Var != null ? java.lang.Long.valueOf(ju4Var.f459646f) : null);
                gm0.j1.u().c().i(true);
            } else {
                if ((((ju4Var != null ? ju4Var.f459649i : null) == null || this.f532952b >= ju4Var.f459649i.size()) ? i18 : 1) != 0 && ju4Var != null && (linkedList2 = ju4Var.f459649i) != null) {
                    b50Var = (r45.b50) linkedList2.get(this.f532952b);
                }
                r45.b50 b50Var2 = b50Var;
                a1Var.d("NetSceneInit", this.f532952b, (ju4Var == null || (linkedList = ju4Var.f459649i) == null) ? i18 : linkedList.size(), b50Var2, true, com.p314xaae8f345.mm.p642xad8b531f.x1.e(), 1);
                this.f532952b++;
                initController.d(b50Var2);
                i19++;
                i18 = 0;
            }
        }
        a1Var.a("NetSceneInit");
        return x11.y.f532954e;
    }

    @Override // x11.a
    public java.lang.String b() {
        return "InitTaskNewInitRsp@" + hashCode();
    }
}
