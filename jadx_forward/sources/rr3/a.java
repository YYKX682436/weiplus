package rr3;

/* loaded from: classes4.dex */
public final class a implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym3.d f480702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rr3.c f480703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f480704f;

    public a(ym3.d dVar, rr3.c cVar, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var) {
        this.f480702d = dVar;
        this.f480703e = cVar;
        this.f480704f = i2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.ym ymVar;
        o01.a aVar = (o01.a) obj;
        q01.f fVar = aVar.f440817a;
        q01.f fVar2 = q01.f.f440809e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (fVar != fVar2) {
            return f0Var;
        }
        r45.p14 p14Var = (aVar.f440819c == 0 && aVar.f440818b == 0) ? (r45.p14) aVar.f440822f : null;
        int i17 = 0;
        ym3.d dVar = this.f480702d;
        if (p14Var == null) {
            dVar.f544681b = false;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList<r45.ym> linkedList = p14Var.f464192d;
            if (linkedList != null) {
                for (r45.ym ymVar2 : linkedList) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ymVar2);
                    arrayList.add(new rr3.d(ymVar2, 0, 2, null));
                }
            }
            dVar.f544682c.addAll(arrayList);
            dVar.f544681b = p14Var.f464193e == 1;
            rr3.d dVar2 = (rr3.d) kz5.n0.k0(arrayList);
            if (dVar2 != null && (ymVar = dVar2.f480714d) != null) {
                i17 = ymVar.f472742e;
            }
            this.f480703e.f480712e = i17;
        }
        if (!dVar.f544681b) {
            dVar.f544682c.add(new rr3.d(null, 1, 1, null));
        }
        java.lang.Object mo771x2f8fd3 = this.f480704f.mo771x2f8fd3(dVar, interfaceC29045xdcb5ca57);
        return mo771x2f8fd3 == pz5.a.f440719d ? mo771x2f8fd3 : f0Var;
    }
}
