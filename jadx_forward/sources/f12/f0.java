package f12;

/* loaded from: classes4.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.j0 f340137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f12.j0 j0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f340137d = j0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f12.f0(this.f340137d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object next;
        boolean z17;
        f21.d0 d0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.LinkedList eggList = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).K().f340431d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(eggList, "eggList");
        java.util.Iterator it = eggList.iterator();
        do {
            java.lang.Object obj2 = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            f21.e eVar = (f21.e) next;
            if (eVar.f340411n >= 5) {
                java.lang.String str = eVar.f340405e;
                f12.j0 j0Var = this.f340137d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, j0Var.f340150d) && (d0Var = eVar.f340412o) != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var.f340385d, j0Var.f340152f)) {
                    java.util.LinkedList keyWords = eVar.f340404d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keyWords, "keyWords");
                    java.util.Iterator it6 = keyWords.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((f21.f) next2).f340424d, j0Var.f340151e)) {
                            obj2 = next2;
                            break;
                        }
                    }
                    z17 = obj2 != null;
                }
            }
        } while (!z17);
        return next;
    }
}
