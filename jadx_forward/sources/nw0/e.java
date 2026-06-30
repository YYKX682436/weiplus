package nw0;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f422296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kw0.a f422297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw0.h f422298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kw0.b f422299g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kw0.a aVar, nw0.h hVar, kw0.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f422297e = aVar;
        this.f422298f = hVar;
        this.f422299g = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nw0.e(this.f422297e, this.f422298f, this.f422299g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nw0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f422296d;
        kw0.b bVar = this.f422299g;
        nw0.h hVar = this.f422298f;
        kw0.a aVar2 = this.f422297e;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zu0.i iVar = aVar2.f394322b;
            hVar.getClass();
            int i18 = bVar.f394327d;
            kw0.e eVar = (kw0.e) hVar.b(bVar).f557206a;
            java.util.Iterator it = eVar.f394334a.iterator();
            int i19 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                c4104x6d422cb2 = aVar2.f394321a;
                if (!hasNext) {
                    i19 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((kw0.a) it.next()).f394321a.f129757b, c4104x6d422cb2.f129757b)) {
                    break;
                }
                i19++;
            }
            kw0.j jVar = kw0.j.f394340a;
            java.util.List infoList = eVar.f394334a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
            zu0.h hVar2 = new zu0.h(new kw0.e(infoList, i19, jVar));
            kw0.b bVar2 = kw0.b.f394324e;
            p012xc85e97e9.p093xedfae76a.j0 j0Var = hVar.f422303d;
            p012xc85e97e9.p093xedfae76a.j0 j0Var2 = hVar.f422302c;
            if (i18 == 3) {
                j0Var2.mo523x53d8522f(hVar2);
            } else if (i18 == 2) {
                j0Var.mo523x53d8522f(hVar2);
            }
            if (iVar == zu0.i.f557207d) {
                zu0.h d17 = fv0.e.d(hVar.b(bVar), aVar2, zu0.i.f557208e, false);
                int i27 = bVar.f394327d;
                if (i27 == 3) {
                    j0Var2.mo523x53d8522f(d17);
                } else if (i27 == 2) {
                    j0Var.mo523x53d8522f(d17);
                }
                java.lang.String str = c4104x6d422cb2.f129757b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getMaterialID(...)");
                z17 = true;
                this.f422296d = 1;
                if (hVar.f422300a.S6(str, this) == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        hVar.getClass();
        int i28 = bVar.f394327d;
        zu0.h d18 = fv0.e.d(hVar.b(bVar), aVar2, zu0.i.f557209f, z17);
        kw0.b bVar3 = kw0.b.f394324e;
        if (i28 == 3) {
            hVar.f422302c.mo523x53d8522f(d18);
        } else if (i28 == 2) {
            hVar.f422303d.mo523x53d8522f(d18);
        }
        return jz5.f0.f384359a;
    }
}
