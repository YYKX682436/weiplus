package x11;

/* loaded from: classes11.dex */
public final class u implements x11.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f532943a;

    public u(java.util.List contactList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactList, "contactList");
        this.f532943a = contactList;
    }

    @Override // x11.a
    public x11.y a(x11.t initController) {
        r45.b50 b50Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initController, "initController");
        com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a1();
        a1Var.b("NetSceneInit");
        java.util.List list = this.f532943a;
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.b50 b50Var2 = new r45.b50();
            b50Var2.f452063d = 2;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(((r45.n80) obj).f462684f.m75962x8b6d8abc());
            b50Var2.f452064e = cu5Var;
            try {
                b50Var = b50Var2;
                try {
                    a1Var.d("NetSceneInit", i17, list.size(), b50Var2, true, com.p314xaae8f345.mm.p642xad8b531f.x1.e(), 1);
                    initController.d(b50Var);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneInit.dkInit", th, "InitTaskBatchContactRsp err", new java.lang.Object[0]);
                    w11.k.f523601a.b(b50Var, th, 1);
                    i17 = i18;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                b50Var = b50Var2;
            }
            i17 = i18;
        }
        ((java.util.LinkedList) initController.f532935s).poll();
        a1Var.a("NetSceneInit");
        return x11.y.f532954e;
    }

    @Override // x11.a
    public java.lang.String b() {
        return "InitTaskBatchContactRsp@" + hashCode();
    }
}
