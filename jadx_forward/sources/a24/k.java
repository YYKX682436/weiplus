package a24;

/* loaded from: classes.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a24.l f82422d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a24.l lVar) {
        super(1);
        this.f82422d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xm3.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        java.util.ArrayList arrayList;
        java.lang.Object obj2;
        j75.a state = (j75.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        a24.l lVar = this.f82422d;
        if (dVar != null && (dVar instanceof r24.b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe2 = lVar.f82423d;
            if (c16718x7059cefe2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(c16718x7059cefe2, null, 1, null);
            }
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof r24.a)) {
            r24.a aVar2 = (r24.a) dVar2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe3 = lVar.f82423d;
            if (c16718x7059cefe3 != null && (arrayList = c16718x7059cefe3.f233598o) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((c24.a) ((xm3.a) obj2)).j().getClass(), aVar2.f450381b)) {
                        break;
                    }
                }
                xm3.a aVar3 = (xm3.a) obj2;
                if (aVar3 != null) {
                    aVar = (xm3.a) aVar3.y0();
                    if (aVar != null && (c16718x7059cefe = lVar.f82423d) != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, aVar, false, 2, null);
                    }
                }
            }
            aVar = null;
            if (aVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, aVar, false, 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
