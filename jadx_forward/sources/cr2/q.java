package cr2;

/* loaded from: classes2.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f303411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr2.x f303412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f303413f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i17, cr2.x xVar, boolean z17) {
        super(0);
        this.f303411d = i17;
        this.f303412e = xVar;
        this.f303413f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        java.util.LinkedList linkedList;
        r45.xz2 xz2Var = new r45.xz2();
        r45.kv0 a17 = db2.t4.f309704a.a(10200);
        cr2.x xVar = this.f303412e;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = xVar.f303428a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC21394xb3d2c0cf, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        a17.set(1, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) abstractActivityC21394xb3d2c0cf).getD()));
        xz2Var.f472143d = a17;
        xz2Var.f472149m = this.f303411d;
        int i17 = xVar.f303436i;
        xz2Var.f472159w = i17;
        boolean z17 = this.f303413f;
        if (z17) {
            r45.yz2 yz2Var = ((wq2.e) ((gr2.p0) xVar.f303437j).f356339b).f530055a.f530065d;
            if (yz2Var != null) {
                gVar = yz2Var.f473055i;
            }
            gVar = null;
        } else {
            r45.yz2 yz2Var2 = xVar.f303447t;
            if (yz2Var2 != null) {
                gVar = yz2Var2.f473055i;
            }
            gVar = null;
        }
        xz2Var.f472144e = gVar;
        er2.a aVar = xVar.f303431d;
        if (z17) {
            linkedList = new java.util.LinkedList();
            linkedList.add(aVar.f337547g);
        } else {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            r45.u80 u80Var = aVar.f337547g;
            java.util.ArrayList arrayList2 = xVar.f303444q;
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i18 = size - 1;
                    java.lang.Object obj = arrayList2.get(size);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    so2.j5 j5Var = (so2.j5) obj;
                    if (j5Var instanceof wp2.a) {
                        wp2.a aVar2 = (wp2.a) j5Var;
                        if (!arrayList.contains(java.lang.Integer.valueOf(aVar2.i()))) {
                            arrayList.add(java.lang.Integer.valueOf(aVar2.i()));
                            r45.u80 u80Var2 = new r45.u80();
                            u80Var2.set(0, java.lang.Integer.valueOf(aVar2.i()));
                            u80Var2.set(1, aVar2.a());
                            u80Var2.m75941xfb821914(2).addAll(j5Var instanceof wp2.b ? xVar.c() : aVar2.g());
                            if (aVar2.i() == i17) {
                                u80Var = u80Var2;
                            } else {
                                linkedList2.add(u80Var2);
                            }
                        }
                    }
                    if (i18 < 0) {
                        break;
                    }
                    size = i18;
                }
            }
            linkedList2.add(u80Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f303434g, "collectAllContainerContext containerId:" + i17 + ", lastBuf:" + u80Var.m75934xbce7f2f(1));
            linkedList = linkedList2;
        }
        xz2Var.f472161y = linkedList;
        xz2Var.A = null;
        xz2Var.B = xVar.f303432e;
        xz2Var.C = xVar.f303433f;
        xz2Var.E = aVar.f337549i;
        return (az2.j) xz2Var.b();
    }
}
