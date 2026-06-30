package xm3;

/* loaded from: classes4.dex */
public class t0 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf implements xm3.m0 {
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f536913J;

    public /* synthetic */ t0(com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe, in5.s sVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(c16718x7059cefe, sVar, (i17 & 4) != 0 ? false : z17);
    }

    public void k(xm3.o0 pendingData) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pendingData, "pendingData");
        if (this.f374642s) {
            for (xm3.b bVar : pendingData.f536899c) {
                int ordinal = bVar.f536820a.ordinal();
                if (ordinal == 0) {
                    int a07 = bVar.f536821b + a0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onInserted pos:" + bVar.f536821b + " fixPos:" + a07 + " count:" + bVar.f536822c);
                    m8153xd399a4d9(a07, bVar.f536822c);
                } else if (ordinal == 1) {
                    int a08 = bVar.f536821b + a0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onRemoved pos:" + bVar.f536821b + " fixPos:" + a08 + " count:" + bVar.f536822c);
                    m8154xdb81fc7f(a08, bVar.f536822c);
                } else if (ordinal == 2) {
                    int a09 = bVar.f536823d + a0();
                    int a010 = bVar.f536824e + a0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onMoved fromPos:" + bVar.f536823d + " fromFixPos:" + a09 + " toPos:" + bVar.f536824e + " toFixPos:" + a010);
                    m8150x87567217(a09, a010);
                } else if (ordinal == 3) {
                    int a011 = bVar.f536821b + a0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "onChanged pos:" + bVar.f536821b + " fixPos:" + a011 + " count:" + bVar.f536822c + ' ' + bVar.f536825f);
                    m8152xc67946d3(a011, bVar.f536822c, bVar.f536825f);
                }
            }
            java.util.List<xm3.i> list = pendingData.f536900d;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                for (xm3.i iVar : list) {
                    if (iVar == xm3.i.f536858h || iVar == xm3.i.f536857g || iVar == xm3.i.f536860m) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.I;
                if (c16718x7059cefe.f233591e.b() >= 0) {
                    int b17 = c16718x7059cefe.f233591e.b();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mvvm.MvvmRecyclerAdapter", "scrollToPosition pos:" + b17);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = b0().getLayoutManager();
                    if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        arrayList.add(java.lang.Integer.valueOf(b17));
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                        yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        return;
                    }
                    if (layoutManager != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(java.lang.Integer.valueOf(b17));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(layoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
                        layoutManager.mo2420xc593c771(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(layoutManager, "com/tencent/mm/plugin/mvvmlist/MvvmRecyclerAdapter", "onUpdateAdapter", "(Lcom/tencent/mm/plugin/mvvmlist/MvvmListPendingData;)V", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf
    public boolean x0() {
        return this.f536913J;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe r3, in5.s r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "mvvmList"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "itemConvertFactory"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<T of com.tencent.mm.plugin.mvvmlist.MvvmRecyclerAdapter>{ kotlin.collections.TypeAliasesKt.ArrayList<T of com.tencent.mm.plugin.mvvmlist.MvvmRecyclerAdapter> }"
            java.util.ArrayList r1 = r3.f233598o
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r0)
            r2.<init>(r4, r1, r5)
            r4 = 1
            r2.f536913J = r4
            r2.I = r3
            r3.f233600q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xm3.t0.<init>(com.tencent.mm.plugin.mvvmlist.MvvmList, in5.s, boolean):void");
    }

    public /* synthetic */ t0(ym3.f fVar, p012xc85e97e9.p093xedfae76a.y yVar, in5.s sVar, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(fVar, yVar, sVar, (i17 & 8) != 0 ? false : z17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(ym3.f dataSource, p012xc85e97e9.p093xedfae76a.y lifecycleOwner, in5.s itemConvertFactory, boolean z17) {
        this(new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(dataSource, new xm3.n0(), lifecycleOwner, null, null, 24, null), itemConvertFactory, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemConvertFactory, "itemConvertFactory");
    }
}
