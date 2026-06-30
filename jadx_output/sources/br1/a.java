package br1;

/* loaded from: classes11.dex */
public final class a implements com.tencent.mm.storage.c8 {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        if (r0 == null) goto L31;
     */
    @Override // com.tencent.mm.storage.c8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.storage.z3 get(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto Lc
            int r1 = r6.length()
            if (r1 != 0) goto La
            goto Lc
        La:
            r1 = r0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            if (r1 != 0) goto Lb4
            boolean r1 = com.tencent.mm.storage.z3.E3(r6)
            if (r1 != 0) goto L1d
            boolean r1 = com.tencent.mm.storage.z3.G3(r6)
            if (r1 != 0) goto L1d
            goto Lb4
        L1d:
            jr1.i r1 = jr1.i.f301360a
            java.lang.String r0 = r1.c(r0)
            java.lang.String r0 = jr1.j.a(r0)
            boolean r0 = kotlin.jvm.internal.o.b(r6, r0)
            if (r0 != 0) goto L66
            r0 = 5
            java.lang.String r0 = r1.c(r0)
            java.lang.String r0 = jr1.j.c(r0)
            boolean r0 = kotlin.jvm.internal.o.b(r6, r0)
            if (r0 != 0) goto L66
            boolean r0 = com.tencent.mm.storage.z3.E3(r6)
            java.lang.String r1 = ""
            if (r0 == 0) goto L53
            hr1.o r0 = yq1.u0.Ni()
            hr1.m r0 = r0.y0(r6)
            java.lang.String r0 = r0.field_talker
            if (r0 != 0) goto L51
            goto L67
        L51:
            r1 = r0
            goto L67
        L53:
            boolean r0 = com.tencent.mm.storage.z3.G3(r6)
            if (r0 == 0) goto L66
            nr1.k r0 = yq1.u0.Zi()
            hr1.m r0 = r0.z0(r6)
            java.lang.String r0 = r0.field_talker
            if (r0 != 0) goto L51
            goto L67
        L66:
            r1 = r6
        L67:
            boolean r0 = com.tencent.mm.storage.z3.G3(r6)
            if (r0 == 0) goto L76
            nr1.b r0 = yq1.u0.Ui()
            hr1.a r0 = r0.y0(r1)
            goto L7e
        L76:
            hr1.c r0 = yq1.u0.Bi()
            hr1.a r0 = r0.y0(r1)
        L7e:
            if (r0 == 0) goto Lab
            com.tencent.mm.storage.z3 r1 = new com.tencent.mm.storage.z3
            r1.<init>()
            java.lang.String r2 = r0.field_nickname
            r1.M1(r2)
            java.lang.Class<le0.x> r2 = le0.x.class
            i95.m r2 = i95.n0.c(r2)
            le0.x r2 = (le0.x) r2
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r4 = r0.field_nickname
            ke0.e r2 = (ke0.e) r2
            r2.getClass()
            android.text.SpannableString r2 = com.tencent.mm.pluginsdk.ui.span.c0.i(r3, r4)
            r1.J2 = r2
            java.lang.String r0 = r0.field_openid
            r1.X1(r0)
            long r2 = r1.systemRowid
            r1.E2 = r2
            goto Lb0
        Lab:
            com.tencent.mm.storage.z3 r1 = new com.tencent.mm.storage.z3
            r1.<init>()
        Lb0:
            r1.X1(r6)
            return r1
        Lb4:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: br1.a.get(java.lang.String):com.tencent.mm.storage.z3");
    }

    @Override // com.tencent.mm.storage.c8
    public int o0(com.tencent.mm.storage.z3 z3Var, boolean z17) {
        if (z3Var == null) {
            return -1;
        }
        java.lang.String d17 = z3Var.d1();
        return (com.tencent.mm.storage.z3.E3(d17) || com.tencent.mm.storage.z3.G3(d17)) ? 1 : -1;
    }

    @Override // com.tencent.mm.storage.c8
    public void w0(com.tencent.mm.storage.e8 e8Var, com.tencent.mm.storage.z3 z3Var) {
    }
}
