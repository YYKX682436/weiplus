package b26;

/* loaded from: classes16.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final b26.t f99046a;

    /* renamed from: b, reason: collision with root package name */
    public final b26.g f99047b;

    public s0(b26.t c17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        this.f99046a = c17;
        b26.q qVar = c17.f99048a;
        this.f99047b = new b26.g(qVar.f99017b, qVar.f99027l);
    }

    public final b26.x0 a(o06.m mVar) {
        if (mVar instanceof o06.d1) {
            n16.c cVar = ((r06.z0) ((o06.d1) mVar)).f450099h;
            b26.t tVar = this.f99046a;
            return new b26.w0(cVar, tVar.f99049b, tVar.f99051d, tVar.f99054g);
        }
        if (mVar instanceof d26.x) {
            return ((d26.x) mVar).B;
        }
        return null;
    }

    public final p06.k b(p16.h0 h0Var, int i17, b26.c cVar) {
        if (k16.f.f384968c.c(i17).booleanValue()) {
            return new d26.s0(this.f99046a.f99048a.f99016a, new b26.k0(this, h0Var, cVar));
        }
        int i18 = p06.k.Z0;
        return p06.i.f432298a;
    }

    public final p06.k c(i16.u0 u0Var, boolean z17) {
        if (k16.f.f384968c.c(u0Var.f369296g).booleanValue()) {
            return new d26.s0(this.f99046a.f99048a.f99016a, new b26.l0(this, z17, u0Var));
        }
        int i17 = p06.k.Z0;
        return p06.i.f432298a;
    }

    public final o06.f d(i16.r proto, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        b26.t tVar = this.f99046a;
        o06.m mVar = tVar.f99050c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        o06.g gVar = (o06.g) mVar;
        int i17 = proto.f369238g;
        b26.c cVar = b26.c.FUNCTION;
        d26.c cVar2 = new d26.c(gVar, null, b(proto, i17, cVar), z17, o06.c.DECLARATION, proto, tVar.f99049b, tVar.f99051d, tVar.f99052e, tVar.f99054g, null);
        b26.t b17 = b26.t.b(this.f99046a, cVar2, kz5.p0.f395529d, null, null, null, null, 60, null);
        java.util.List list = proto.f369239h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "getValueParameterList(...)");
        cVar2.G0(b17.f99056i.g(list, proto, cVar), b26.b1.a(b26.z0.f99082a, (i16.h2) k16.f.f384969d.c(proto.f369238g)));
        cVar2.C0(gVar.k());
        cVar2.f450004x = gVar.l0();
        cVar2.C = !k16.f.f384980o.c(proto.f369238g).booleanValue();
        return cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o06.v1 e(i16.j0 r33) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b26.s0.e(i16.j0):o06.v1");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o06.o1 f(i16.u0 r37) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b26.s0.f(i16.u0):o06.o1");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List g(java.util.List r27, p16.h0 r28, b26.c r29) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b26.s0.g(java.util.List, p16.h0, b26.c):java.util.List");
    }
}
