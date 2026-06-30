package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.jni;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/tencent/wechat/mm/brand_service/jni/BrandServiceAffBridge;", "", "", "hello", "sayHello", "Lcom/tencent/wechat/mm/brand_service/j;", "callJava", "getUserAgent", "", "getResortContext", "doDataMigrate", "doNotiDataMigrate", "", "msgId", "getResortCardContext", "Lfw5/a;", "cb", "Ljz5/f0;", "setCallBack", "callback", "Lfw5/a;", "getCallback", "()Lfw5/a;", "setCallback", "(Lfw5/a;)V", "<init>", "()V", "plugin-brandecs_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.wechat.mm.brand_service.jni.BrandServiceAffBridge */
/* loaded from: classes11.dex */
public final class C27657x1851221c {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.jni.C27657x1851221c f60570x4fbc8495 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.jni.C27657x1851221c();
    private static fw5.a callback;

    private C27657x1851221c() {
    }

    /* renamed from: callJava */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j m118912xf5b139a0(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j hello) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hello, "hello");
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j jVar = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.j();
        jVar.f300508f = "use_from_java";
        return jVar;
    }

    /* renamed from: doDataMigrate */
    public static final byte[] m118913xcb6a5116() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k a17;
        if (callback != null) {
            try {
                a17 = qw.d.f448588a.a();
                if (a17.f300531d.size() == 0) {
                    jx3.f.INSTANCE.w(2053L, 23L, 1L);
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BrandServiceAffC2JHandler", th6, "onDataMigrate failed.", new java.lang.Object[0]);
                jx3.f.INSTANCE.w(2053L, 118L, 1L);
                zv.q qVar = zv.q.f557612a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markBrandServiceDataMigrateCrash key:");
                java.lang.String str = zv.m.f557561a;
                sb6.append(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandEcsFlutterHelper", sb6.toString());
                zv.q.f557616e = java.lang.Boolean.TRUE;
                y02.v0 a18 = y02.x0.f540167d.a();
                if (a18 != null) {
                    a18.G(bw5.d5.EcsBrandEntryStatusCheck, 6);
                }
                ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) zv.q.f557613b).mo141623x754a37bb()).G(str, true);
                throw th6;
            }
        } else {
            a17 = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k.f300530h;
        }
        byte[] mo14344x5f01b1f6 = a17.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        return mo14344x5f01b1f6;
    }

    /* renamed from: doNotiDataMigrate */
    public static final byte[] m118914x260f90c0() {
        byte[] mo14344x5f01b1f6 = com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k.f300530h.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        return mo14344x5f01b1f6;
    }

    /* renamed from: getResortCardContext */
    public static final byte[] m118915xfb0650b8(long msgId) {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j1 j1Var;
        if (callback != null) {
            j1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j1();
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o3 o3Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.o3();
            java.lang.String valueOf = java.lang.String.valueOf(msgId);
            r01.z1 z1Var = r01.z1.f449815g;
            zv.m0 m0Var = zv.m0.f557562a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(valueOf, "<this>");
            o3Var.f299962d = z1Var.o("totalExpCount_" + valueOf + '}', 0);
            boolean[] zArr = o3Var.f299965g;
            zArr[1] = true;
            o3Var.f299963e = (int) z1Var.q(m0Var.b(valueOf), 0L);
            zArr[2] = true;
            o3Var.f299964f = z1Var.o("minExpIndex_" + valueOf + '}', 0);
            zArr[3] = true;
            j1Var.f299749d = o3Var;
            j1Var.f299750e[1] = true;
        } else {
            j1Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.j1.f299748f;
        }
        byte[] mo14344x5f01b1f6 = j1Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        return mo14344x5f01b1f6;
    }

    /* renamed from: getResortContext */
    public static final byte[] m118916x7fd4ca68() {
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1 l1Var;
        java.lang.Long j17;
        if (callback != null) {
            l1Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e eVar = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.e.f270810a;
            l1Var.f299798g = eVar.b();
            boolean[] zArr = l1Var.f299810v;
            zArr[4] = true;
            l1Var.f299799h = eVar.e();
            zArr[5] = true;
            java.lang.String str = zv.m0.f557567f;
            if (str == null) {
                str = "";
            }
            l1Var.f299797f = str;
            zArr[3] = true;
            l1Var.f299796e = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).l();
            zArr[2] = true;
            long j18 = 0;
            if (zv.m0.f557571j) {
                l1Var.f299800i = 7;
                zArr[6] = true;
                l1Var.f299801m = zv.m0.f557579r;
                zArr[7] = true;
                l1Var.f299795d = 0L;
                zArr[1] = true;
            } else {
                l1Var.f299800i = 0;
                zArr[6] = true;
                if (!zv.m0.f557575n && (j17 = r26.h0.j(zv.m0.f557574m)) != null) {
                    j18 = j17.longValue();
                }
                l1Var.f299795d = j18;
                zArr[1] = true;
            }
        } else {
            l1Var = com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l1.f299794w;
        }
        byte[] mo14344x5f01b1f6 = l1Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        return mo14344x5f01b1f6;
    }

    /* renamed from: getUserAgent */
    public static final java.lang.String m118917x11fd7f44() {
        if (callback == null) {
            return "";
        }
        java.lang.String a17 = ik1.l0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, hy4.w.f367733f.a(), lu4.m.f402974d.a());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        return a17;
    }

    /* renamed from: sayHello */
    public static final java.lang.String m118918x880427a7(java.lang.String hello) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hello, "hello");
        return "hello from java ".concat(hello);
    }

    /* renamed from: getCallback */
    public final fw5.a m118919x71965dbb() {
        return callback;
    }

    /* renamed from: setCallBack */
    public final void m118920x6c4032e7(fw5.a cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        callback = cb6;
    }

    /* renamed from: setCallback */
    public final void m118921x6c4ebec7(fw5.a aVar) {
        callback = aVar;
    }
}
