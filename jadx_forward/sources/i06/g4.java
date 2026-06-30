package i06;

/* loaded from: classes15.dex */
public class g4 extends p3321xbce91901.jvm.p3324x21ffc6bd.j0 {
    public static i06.u1 j(p3321xbce91901.jvm.p3324x21ffc6bd.e eVar) {
        f06.f mo9625x74f198fd = eVar.mo9625x74f198fd();
        return mo9625x74f198fd instanceof i06.u1 ? (i06.u1) mo9625x74f198fd : i06.k.f368205e;
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.j0
    public f06.g a(p3321xbce91901.jvm.p3324x21ffc6bd.l lVar) {
        i06.u1 container = j(lVar);
        java.lang.String name = lVar.mo9624xfb82e301();
        java.lang.String signature = lVar.mo9626x3f6b0a02();
        java.lang.Object m143943x2404e5d7 = lVar.m143943x2404e5d7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        return new i06.y1(container, name, signature, null, m143943x2404e5d7);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.j0
    public f06.d b(java.lang.Class cls) {
        return i06.h.a(cls);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.j0
    public f06.f c(java.lang.Class jClass, java.lang.String str) {
        java.lang.Object putIfAbsent;
        i06.a aVar = i06.h.f368185a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        i06.i iVar = (i06.i) i06.h.f368186b;
        iVar.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = iVar.f368191b;
        java.lang.Object obj = concurrentHashMap.get(jClass);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(jClass, (obj = iVar.f368190a.mo146xb9724478(jClass)))) != null) {
            obj = putIfAbsent;
        }
        return (f06.f) obj;
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.j0
    public f06.j d(p3321xbce91901.jvm.p3324x21ffc6bd.r rVar) {
        return new i06.b2(j(rVar), rVar.mo9624xfb82e301(), rVar.mo9626x3f6b0a02(), rVar.m143943x2404e5d7());
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.j0
    public f06.l e(p3321xbce91901.jvm.p3324x21ffc6bd.t tVar) {
        return new i06.e2(j(tVar), tVar.mo9624xfb82e301(), tVar.mo9626x3f6b0a02(), tVar.m143943x2404e5d7());
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.j0
    public f06.s f(p3321xbce91901.jvm.p3324x21ffc6bd.x xVar) {
        return new i06.y2(j(xVar), xVar.mo9624xfb82e301(), xVar.mo9626x3f6b0a02(), xVar.m143943x2404e5d7());
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.j0
    public f06.u g(p3321xbce91901.jvm.p3324x21ffc6bd.z zVar) {
        return new i06.c3(j(zVar), zVar.mo9624xfb82e301(), zVar.mo9626x3f6b0a02(), zVar.m143943x2404e5d7());
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.j0
    public java.lang.String h(p3321xbce91901.jvm.p3324x21ffc6bd.k kVar) {
        i06.y1 b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kVar, "<this>");
        p3321xbce91901.InterfaceC29042xe907df4f interfaceC29042xe907df4f = (p3321xbce91901.InterfaceC29042xe907df4f) kVar.getClass().getAnnotation(p3321xbce91901.InterfaceC29042xe907df4f.class);
        i06.y1 y1Var = null;
        if (interfaceC29042xe907df4f != null) {
            java.lang.String[] d17 = interfaceC29042xe907df4f.d1();
            if (d17.length == 0) {
                d17 = null;
            }
            if (d17 != null) {
                java.lang.String[] strings = interfaceC29042xe907df4f.d2();
                m16.j jVar = m16.j.f404432a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strings, "strings");
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(m16.a.b(d17));
                m16.h g17 = m16.j.f404432a.g(byteArrayInputStream, strings);
                p16.d dVar = (p16.d) i16.j0.B;
                p16.l lVar = m16.j.f404433b;
                dVar.getClass();
                p16.h hVar = new p16.h(byteArrayInputStream);
                p16.h0 h0Var = (p16.h0) dVar.a(hVar, lVar);
                try {
                    hVar.a(0);
                    dVar.b(h0Var);
                    i16.j0 j0Var = (i16.j0) h0Var;
                    m16.g gVar = new m16.g(interfaceC29042xe907df4f.mv(), (interfaceC29042xe907df4f.xi() & 8) != 0);
                    java.lang.Class<?> cls = kVar.getClass();
                    i16.v1 v1Var = j0Var.f369072v;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(v1Var, "getTypeTable(...)");
                    y1Var = new i06.y1(i06.k.f368205e, (o06.v1) i06.o4.f(cls, j0Var, g17, new k16.k(v1Var), gVar, h06.d.f359473d));
                } catch (p16.z e17) {
                    e17.f432904d = h0Var;
                    throw e17;
                }
            }
        }
        if (y1Var == null || (b17 = i06.o4.b(y1Var)) == null) {
            return super.h(kVar);
        }
        i06.j4 j4Var = i06.j4.f368203a;
        o06.n0 l17 = b17.l();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        j4Var.a(sb6, l17);
        java.util.List W = l17.W();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "getValueParameters(...)");
        kz5.n0.f0(W, sb6, ", ", "(", ")", 0, null, i06.i4.f368196d, 48, null);
        sb6.append(" -> ");
        f26.o0 mo132801x3df4e080 = l17.mo132801x3df4e080();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo132801x3df4e080);
        sb6.append(j4Var.d(mo132801x3df4e080));
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.j0
    public java.lang.String i(p3321xbce91901.jvm.p3324x21ffc6bd.q qVar) {
        return h(qVar);
    }
}
