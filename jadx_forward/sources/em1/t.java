package em1;

/* loaded from: classes7.dex */
public abstract class t extends em1.d {
    public static final void o(em1.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar, java.lang.Runnable runnable) {
        tVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadOnProcessCreated;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = mVar instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y ? (com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y) mVar : null;
        if (o0Var != (yVar != null ? yVar.w1() : null)) {
            ((ku5.t0) ku5.t0.f394148d).r(runnable, "MicroMsg.V8WorkerManagerWC");
        }
    }

    @Override // cl.l3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 d(int i17, java.lang.ref.WeakReference weakReference) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w9[] w9VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w9.f172489d;
        return i17 == 0 ? new em1.p(this, weakReference) : new cl.c3(this, weakReference);
    }

    @Override // em1.d, cl.l3
    public com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 i17 = super.i(component);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.d1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.d1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 w57 = d1Var != null ? d1Var.w5() : null;
        i17.f135492q = new em1.s(w57, this, component);
        if (w57 == null) {
            return i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.V8WorkerManagerWC", "setupJSRuntimeConfig, use nodeOnly snapshot");
        i17.f135477b = w57.f172202i;
        i17.f135478c = true;
        i17.f135480e = w57.c();
        return i17;
    }

    @Override // cl.l3
    public int j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w9[] w9VarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w9.f172489d;
        return 1;
    }

    @Override // em1.d
    public java.lang.String l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m component) {
        k91.z0 E0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        if (!(component instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9)) {
            return "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) component).t3();
        java.lang.String str = (t37 == null || (E0 = t37.E0()) == null || (c11667xc7e59dd6 = E0.f387385r) == null) ? null : c11667xc7e59dd6.f156905md5;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return str == null ? "" : str;
    }

    @Override // em1.d
    public java.lang.String m() {
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d2.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "retrieve(...)");
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    @Override // em1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(cl.j3 r6, long r7, long r9, cl.k1 r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: em1.t.n(cl.j3, long, long, cl.k1):void");
    }
}
