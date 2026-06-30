package sf5;

/* loaded from: classes10.dex */
public final class j implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf5.k f489175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f489176e;

    public j(sf5.k kVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        this.f489175d = kVar;
        this.f489176e = i2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pf5.s0 s0Var = (pf5.s0) obj;
        sf5.k kVar = this.f489175d;
        yz5.l lVar = kVar.f489178c;
        if (lVar != null) {
            lVar.mo146xb9724478(s0Var);
        }
        yz5.p pVar = kVar.f489177b;
        if (pVar != null) {
            sf5.l lVar2 = kVar.f489171a;
            java.lang.Object obj2 = lVar2.f489179a.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type S1 of com.tencent.mm.ui.component.support.StateTransform.StateBuilder2.bindFlow$lambda$0");
            java.lang.Object obj3 = lVar2.f489179a.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type S2 of com.tencent.mm.ui.component.support.StateTransform.StateBuilder2.bindFlow$lambda$0");
            java.lang.Object mo149xb9724478 = pVar.mo149xb9724478((pf5.s0) obj2, (pf5.s0) obj3);
            if (mo149xb9724478 != null) {
                this.f489176e.e(mo149xb9724478);
            }
        }
        return jz5.f0.f384359a;
    }
}
