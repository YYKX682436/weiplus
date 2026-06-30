package e45;

/* loaded from: classes10.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.h f330910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d f330911e;

    public d(e45.h hVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d) {
        this.f330910d = hVar;
        this.f330911e = c1161x57298f5d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (1 == i17) {
            t23.p0.h().b();
        } else {
            e45.h hVar = this.f330910d;
            if (i17 == 0) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = this.f330911e;
                hVar.f330929u = c1161x57298f5d.w();
                hVar.f330930v = c1161x57298f5d.y();
                int i18 = hVar.f330929u;
                int i19 = hVar.f330930v;
                d45.q qVar = hVar.f330924p;
                if (qVar != null) {
                    int B = qVar.B();
                    t23.z1 z1Var = t23.z1.f496846d;
                    t23.z1.f496846d.b(t23.p1.f496780d, hVar.f330929u, hVar.f330930v, B);
                }
            } else if (2 == i17) {
                com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45819x8226d3ce(), hVar.f330931w);
                hVar.f330931w = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45819x8226d3ce(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45818xeb5a95d8(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45817x95b06b3d(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45820x3ea298d1(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45821x95b0ae13() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45822xd4536876(), 702, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45816x7ac12c81(), "FS.AlbumFileUIC");
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = this.f330911e;
        int w17 = c1161x57298f5d.w();
        int y17 = c1161x57298f5d.y();
        e45.h hVar = this.f330910d;
        int i19 = hVar.f330929u;
        int i27 = hVar.f330930v;
        if (hVar.f330929u != w17 || hVar.f330930v != y17) {
            hVar.f330929u = w17;
            hVar.f330930v = y17;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i28 = hVar.f330929u;
            int i29 = hVar.f330930v;
            if (i28 <= i29) {
                while (true) {
                    d45.q qVar = hVar.f330924p;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z17 = qVar != null ? qVar.z(i28) : null;
                    if (z17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z17.o())) {
                        arrayList2.add(j33.d0.d(z17.o(), null, -1));
                    }
                    if (i28 == i29) {
                        break;
                    } else {
                        i28++;
                    }
                }
            }
            arrayList2.size();
            t23.p0.h().d(arrayList2);
            if (i18 != 0) {
                hVar.f330928t = i18 < 0 ? t23.p1.f496781e : t23.p1.f496782f;
                t23.p1 p1Var = hVar.f330928t;
                d45.q qVar2 = hVar.f330924p;
                if (qVar2 != null) {
                    int B = qVar2.B();
                    t23.z1 z1Var = t23.z1.f496846d;
                    t23.z1.f496846d.b(hVar.f330928t, hVar.f330929u, hVar.f330930v, B);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/fs/album/uic/AlbumFileUIC$initView$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
