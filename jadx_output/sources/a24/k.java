package a24;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a24.l f889d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a24.l lVar) {
        super(1);
        this.f889d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xm3.a aVar;
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        java.util.ArrayList arrayList;
        java.lang.Object obj2;
        j75.a state = (j75.a) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        a24.l lVar = this.f889d;
        if (dVar != null && (dVar instanceof r24.b)) {
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList2 = lVar.f890d;
            if (mvvmList2 != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.r(mvvmList2, null, 1, null);
            }
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof r24.a)) {
            r24.a aVar2 = (r24.a) dVar2;
            com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList3 = lVar.f890d;
            if (mvvmList3 != null && (arrayList = mvvmList3.f152065o) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (kotlin.jvm.internal.o.b(((c24.a) ((xm3.a) obj2)).j().getClass(), aVar2.f368848b)) {
                        break;
                    }
                }
                xm3.a aVar3 = (xm3.a) obj2;
                if (aVar3 != null) {
                    aVar = (xm3.a) aVar3.y0();
                    if (aVar != null && (mvvmList = lVar.f890d) != null) {
                        com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, aVar, false, 2, null);
                    }
                }
            }
            aVar = null;
            if (aVar != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, aVar, false, 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
