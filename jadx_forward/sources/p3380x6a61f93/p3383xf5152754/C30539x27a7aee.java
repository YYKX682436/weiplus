package p3380x6a61f93.p3383xf5152754;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J-\u0010\u000b\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0007¨\u0006\u0010"}, d2 = {"Lurgen/ur_54A4/URS_90C1;", "", "", dm.i4.f66863x30b5ef64, "", "UR_75AB", "", "", "commentScene", "downloadType", "Ljz5/f0;", "UR_804B", "([[BII)V", "UR_9F7B", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: urgen.ur_54A4.URS_90C1 */
/* loaded from: classes2.dex */
public final class C30539x27a7aee {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3383xf5152754.C30539x27a7aee f77136x4fbc8495 = new p3380x6a61f93.p3383xf5152754.C30539x27a7aee();

    private C30539x27a7aee() {
    }

    /* renamed from: UR_75AB */
    public static final boolean m169746x21b397e1(byte[] finderObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        qg3.c0 c0Var = qg3.c0.f444342a;
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725().mo11468x92b714fd(finderObject);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderObject");
            dk4.a sj6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).sj((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) mo11468x92b714fd);
            java.lang.String str = sj6 != null ? sj6.f316015s : null;
            if (!(str == null || r26.n0.N(str))) {
                return cu2.x.c(cu2.x.f303982a, str, false, false, false, 14, null).f68968x799e9d9e > 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MegaVideoPreloadJavaStatic", "startPreload but mediaId invalid");
            return false;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MegaVideoPreloadJavaStatic", "startPreload but finderObject invalid");
            return false;
        }
    }

    /* renamed from: UR_804B */
    public static final void m169747x21b3f7e8(byte[][] finderObject, int commentScene, int downloadType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        boolean compareAndSet = qg3.c0.f444345d.compareAndSet(true, false);
        qg3.c0 c0Var = qg3.c0.f444342a;
        if (compareAndSet) {
            es2.h0 b17 = c0Var.b();
            if (b17.f337911k.compareAndSet(true, false)) {
                b17.h();
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (byte[] bArr : finderObject) {
            try {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725().mo11468x92b714fd(bArr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderObject");
                arrayList.add(new so2.u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) mo11468x92b714fd, 0)));
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MegaVideoPreloadJavaStatic", "startPreload but finderObject invalid");
            }
        }
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MegaVideoPreloadJavaStatic", "No valid finder objects to preload");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoPreloadJavaStatic", "startPreload size:" + arrayList.size() + ", commentScene:" + commentScene);
        c0Var.b().i(new ek4.b(1, -1, commentScene, 3, 0L, null, downloadType == 0 ? 0 : 1, 48, null), arrayList, 0, "MicroMsg.MegaVideoPreloadJavaStatic");
    }

    /* renamed from: UR_9F7B */
    public static final void m169748x21b4bf3a() {
        qg3.c0 c0Var = qg3.c0.f444342a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoPreloadJavaStatic", "stopPreload");
        if (qg3.c0.f444345d.compareAndSet(false, true)) {
            qg3.c0 c0Var2 = qg3.c0.f444342a;
            es2.h0 b17 = c0Var2.b();
            if (b17.f337911k.compareAndSet(false, true)) {
                b17.j("resetRunningTask", new es2.f0(b17));
            }
            c0Var2.b().f();
        }
    }
}
