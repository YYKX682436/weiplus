package z51;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f551725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.p f551726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(z51.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f551726e = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        z51.l lVar = new z51.l(this.f551726e, interfaceC29045xdcb5ca57);
        lVar.f551725d = obj;
        return lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f551725d;
        z51.p pVar = this.f551726e;
        a61.c cVar = pVar.f551737k;
        if (cVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
            throw null;
        }
        java.lang.String str = cVar.f83254c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("first start play finish path is empty");
        }
        boolean h17 = p3325xe03a0797.p3326xc267989b.z0.h(y0Var);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!h17) {
            pVar.g("parse job is cancel");
            return f0Var;
        }
        pVar.f551740n = true;
        if (!pVar.f551741o) {
            z51.c cVar2 = (z51.c) pVar.a(z51.c.class);
            boolean z17 = ((z51.c) pVar.a(z51.c.class)).f551709h;
            pVar.f("parsed no finish case >> parseIsSuccess: " + z17);
            if (z17) {
                y51.d dVar = pVar.f551736j;
                if (dVar != null) {
                    a61.c cVar3 = pVar.f551737k;
                    if (cVar3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
                        throw null;
                    }
                    java.lang.Long l17 = cVar3.f83255d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "getMediaId(...)");
                    long longValue = l17.longValue();
                    aq.u0 u0Var = cVar2.f551710i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var);
                    dVar.b(longValue, u0Var);
                }
                pVar.f551742p = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = pVar.f551733g;
                if (c18697xb57c3465 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
                    throw null;
                }
                a61.c cVar4 = pVar.f551737k;
                if (cVar4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
                    throw null;
                }
                c18697xb57c3465.mo69327xab3268fe(cVar4.f83254c);
            } else {
                f65.q.b(f65.q.f341492a, "play_local_live_photo", -1, 0L, null, 12, null);
                y51.d dVar2 = pVar.f551736j;
                if (dVar2 != null) {
                    a61.c cVar5 = pVar.f551737k;
                    if (cVar5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceConfig");
                        throw null;
                    }
                    java.lang.Long l18 = cVar5.f83255d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l18, "getMediaId(...)");
                    long longValue2 = l18.longValue();
                    aq.u0 u0Var2 = cVar2.f551710i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u0Var2);
                    dVar2.a(longValue2, u0Var2.f94508a.f94494b);
                }
                z51.h hVar = (z51.h) pVar.a(z51.h.class);
                hVar.f("showErrorTipAlert " + hVar.f551720f);
                if (hVar.f551720f) {
                    android.content.Context b17 = hVar.b();
                    java.lang.String tips = hVar.f551721g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tips, "tips");
                    db5.e1.E(b17, tips, "", i65.a.r(b17, com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi), false, b61.a.f99673d);
                }
            }
        }
        return f0Var;
    }
}
