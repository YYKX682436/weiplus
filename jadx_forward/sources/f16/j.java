package f16;

/* loaded from: classes16.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final a16.f f340272a;

    public j(a16.f javaResolverSettings) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaResolverSettings, "javaResolverSettings");
        this.f340272a = javaResolverSettings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0230  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f16.i a(f26.z0 r20, yz5.l r21, int r22, f16.d1 r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f16.j.a(f26.z0, yz5.l, int, f16.d1, boolean, boolean):f16.i");
    }

    public final f16.h b(f26.c3 c3Var, yz5.l lVar, int i17, boolean z17) {
        f26.o0 o0Var;
        f26.o0 o0Var2 = null;
        if (f26.s0.a(c3Var)) {
            return new f16.h(null, 1);
        }
        if (!(c3Var instanceof f26.e0)) {
            if (!(c3Var instanceof f26.z0)) {
                throw new jz5.j();
            }
            f16.i a17 = a((f26.z0) c3Var, lVar, i17, f16.d1.f340250f, false, z17);
            f26.o0 o0Var3 = a17.f340267a;
            if (a17.f340269c) {
                o0Var3 = f26.b3.c(c3Var, o0Var3);
            }
            return new f16.h(o0Var3, a17.f340268b);
        }
        boolean z18 = c3Var instanceof f26.y0;
        f26.e0 e0Var = (f26.e0) c3Var;
        f16.i a18 = a(e0Var.f340686e, lVar, i17, f16.d1.f340248d, z18, z17);
        f16.i a19 = a(e0Var.f340687f, lVar, i17, f16.d1.f340249e, z18, z17);
        f26.z0 z0Var = a19.f340267a;
        f26.z0 z0Var2 = a18.f340267a;
        if (z0Var2 != null || z0Var != null) {
            if (!a18.f340269c) {
                f26.z0 z0Var3 = z0Var2;
                if (!a19.f340269c) {
                    if (z18) {
                        f26.z0 z0Var4 = z0Var2;
                        if (z0Var2 == null) {
                            z0Var4 = e0Var.f340686e;
                        }
                        if (z0Var == null) {
                            z0Var = e0Var.f340687f;
                        }
                        o0Var2 = new c16.k(z0Var4, z0Var);
                    } else {
                        if (z0Var2 == null) {
                            z0Var3 = e0Var.f340686e;
                        }
                        if (z0Var == null) {
                            z0Var = e0Var.f340687f;
                        }
                        o0Var2 = f26.r0.a(z0Var3, z0Var);
                    }
                }
            }
            if (z0Var != null) {
                if (z0Var2 == null) {
                    z0Var2 = z0Var;
                }
                o0Var = f26.r0.a(z0Var2, z0Var);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(z0Var2);
                o0Var = z0Var2;
            }
            o0Var2 = f26.b3.c(c3Var, o0Var);
        }
        return new f16.h(o0Var2, a18.f340268b);
    }
}
