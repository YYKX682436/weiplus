package i06;

/* loaded from: classes15.dex */
public final class w extends i06.y {

    /* renamed from: a, reason: collision with root package name */
    public final o06.o1 f368303a;

    /* renamed from: b, reason: collision with root package name */
    public final i16.u0 f368304b;

    /* renamed from: c, reason: collision with root package name */
    public final l16.j f368305c;

    /* renamed from: d, reason: collision with root package name */
    public final k16.g f368306d;

    /* renamed from: e, reason: collision with root package name */
    public final k16.k f368307e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f368308f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o06.o1 descriptor, i16.u0 proto, l16.j signature, k16.g nameResolver, k16.k typeTable) {
        super(null);
        java.lang.String str;
        java.lang.String sb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptor, "descriptor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        this.f368303a = descriptor;
        this.f368304b = proto;
        this.f368305c = signature;
        this.f368306d = nameResolver;
        this.f368307e = typeTable;
        if ((signature.f396580e & 4) == 4) {
            sb6 = nameResolver.mo141776x2fec8307(signature.f396583h.f396567f) + nameResolver.mo141776x2fec8307(signature.f396583h.f396568g);
        } else {
            m16.d b17 = m16.j.f404432a.b(proto, nameResolver, typeTable, true);
            if (b17 == null) {
                throw new i06.a4("No field signature for property: " + descriptor);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(x06.o0.a(b17.f404421a));
            o06.m e17 = descriptor.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getContainingDeclaration(...)");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(descriptor.mo9617x61f71b08(), o06.f0.f423477d) && (e17 instanceof d26.x)) {
                p16.u classModuleName = l16.r.f396633i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(classModuleName, "classModuleName");
                java.lang.Integer num = (java.lang.Integer) k16.i.a(((d26.x) e17).f307586h, classModuleName);
                java.lang.String str2 = (num == null || (str2 = nameResolver.mo141776x2fec8307(num.intValue())) == null) ? com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19903x18590b29 : str2;
                r26.t tVar = n16.h.f415704a;
                tVar.getClass();
                java.lang.String replaceAll = tVar.f450450d.matcher(str2).replaceAll("_");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
                str = "$".concat(replaceAll);
            } else {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(descriptor.mo9617x61f71b08(), o06.f0.f423474a) && (e17 instanceof o06.d1)) {
                    d26.z zVar = ((d26.n0) descriptor).L;
                    if (zVar instanceof g16.b0) {
                        g16.b0 b0Var = (g16.b0) zVar;
                        if (b0Var.f349127c != null) {
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("$");
                            java.lang.String e18 = b0Var.f349126b.e();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e18, "getInternalName(...)");
                            sb8.append(n16.g.k(r26.n0.o0(e18, '/', e18)).h());
                            str = sb8.toString();
                        }
                    }
                }
                str = "";
            }
            sb7.append(str);
            sb7.append("()");
            sb7.append(b17.f404422b);
            sb6 = sb7.toString();
        }
        this.f368308f = sb6;
    }

    @Override // i06.y
    public java.lang.String a() {
        return this.f368308f;
    }
}
