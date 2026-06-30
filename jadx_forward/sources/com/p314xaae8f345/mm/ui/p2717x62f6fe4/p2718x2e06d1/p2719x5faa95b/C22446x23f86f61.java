package com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b;

/* renamed from: com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent */
/* loaded from: classes3.dex */
public class C22446x23f86f61 extends lf3.n implements cg3.a, kd0.o2 {

    /* renamed from: d, reason: collision with root package name */
    public cg3.c f290657d;

    /* renamed from: e, reason: collision with root package name */
    public kd0.p2 f290658e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f290659f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f290660g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22447x41d7f69e f290661h;

    /* renamed from: i, reason: collision with root package name */
    public final oc5.g0 f290662i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f290663m;

    /* renamed from: n, reason: collision with root package name */
    public final oc5.o f290664n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent$scanResultEventListener$1] */
    public C22446x23f86f61(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f290660g = new java.util.HashMap();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f290661h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(a0Var) { // from class: com.tencent.mm.ui.media.base.image.BaseQRCodeScanComponent$scanResultEventListener$1
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 event = c5886xd11a0be7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.lang.String str = event.f136194g.f87901a;
                if (str == null) {
                    str = "";
                }
                com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 c22446x23f86f61 = com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61.this;
                cg3.d V6 = com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61.V6(c22446x23f86f61, event);
                if (V6 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultQRCodeScanComponent", "qrCode scan failed. rawPath: ".concat(str));
                    return false;
                }
                ((java.util.HashMap) c22446x23f86f61.f290660g).put(str, V6);
                return false;
            }
        };
        this.f290662i = new oc5.g0(activity, true, "");
        this.f290663m = "";
        this.f290664n = new rh5.c(activity, this);
    }

    public static final cg3.d V6(com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 c22446x23f86f61, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 event) {
        android.view.View mo14794xfb86a31b;
        cg3.c cVar;
        android.graphics.Matrix a17;
        cg3.c cVar2 = c22446x23f86f61.f290657d;
        if (cVar2 == null || (mo14794xfb86a31b = cVar2.mo14794xfb86a31b()) == null || (cVar = c22446x23f86f61.f290657d) == null || (a17 = cVar.a()) == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        arrayList.clear();
        java.util.ArrayList a18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a.a(event);
        jz5.l a19 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.c0.a(c22446x23f86f61.m80379x76847179(), mo14794xfb86a31b, a18, 0);
        return new cg3.d(event, a18, (java.util.ArrayList) a19.f384366d, (java.util.ArrayList) a19.f384367e, a17, null, 32, null);
    }

    @Override // cg3.a
    public void H1(mf3.k info, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, db5.g4 g4Var) {
        sf3.g e17;
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (g4Var == null || (e17 = info.e()) == null || info.mo2109xfb85f7b0() != mf3.u.f407656e) {
            return;
        }
        cg3.d dVar = (cg3.d) ((java.util.HashMap) this.f290660g).get(e17.c());
        if (dVar == null || (list = dVar.f122682c) == null) {
            return;
        }
        kd0.p2 p2Var = this.f290658e;
        if (p2Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list);
            dg3.q qVar = dg3.q.f313874e;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).e(arrayList, null, k0Var, g4Var, 3);
        }
        if (list.size() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) list.get(0);
            if (k0Var != null) {
                java.lang.ref.WeakReference weakReference = this.f290659f;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(weakReference != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) weakReference.get() : null, k0Var)) {
                    return;
                }
                this.f290659f = new java.lang.ref.WeakReference(k0Var);
                kd0.p2 p2Var2 = this.f290658e;
                if (p2Var2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var2).h(c17261xe88a6357.f240153e, c17261xe88a6357.f240152d);
                }
            }
        }
    }

    @Override // kd0.o2
    public void K0(java.lang.String str, r45.aq3 aq3Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        java.lang.ref.WeakReference weakReference = this.f290659f;
        if (weakReference == null || (k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) weakReference.get()) == null || !k0Var.i()) {
            return;
        }
        k0Var.v();
    }

    @Override // cg3.a
    public cg3.c U3() {
        return this.f290657d;
    }

    public oc5.l0 W6(cg3.d scanResult) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanResult, "scanResult");
        oc5.l0 l0Var = new oc5.l0();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 event = scanResult.f122680a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        l0Var.f425984a.clear();
        l0Var.f425985b = null;
        l0Var.f425986c = null;
        l0Var.f425984a = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a.a(event);
        mf3.k kVar = scanResult.f122685f;
        if (kVar == null || (str = kVar.g()) == null) {
            str = "";
        }
        l0Var.f425996m = str;
        return l0Var;
    }

    @Override // cg3.a
    /* renamed from: cancel */
    public void mo14793xae7a2e7a() {
        kd0.p2 p2Var = this.f290658e;
        if (p2Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).n();
        }
    }

    @Override // cg3.a
    public void n5(cg3.d scanResult, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 selectInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanResult, "scanResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectInfo, "selectInfo");
        java.lang.String codeString = selectInfo.f240152d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(codeString, "codeString");
        this.f290663m = codeString;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultQRCodeScanComponent", "select codeString " + this.f290663m);
        oc5.l0 W6 = W6(scanResult);
        if (W6 == null) {
            return;
        }
        this.f290662i.b(W6, selectInfo, this.f290664n);
    }

    @Override // cg3.a
    public void o4(java.lang.String imgPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        if (((java.util.HashMap) this.f290660g).containsKey(imgPath)) {
            return;
        }
        cg3.c cVar = this.f290657d;
        android.view.View mo14794xfb86a31b = cVar != null ? cVar.mo14794xfb86a31b() : null;
        cg3.c cVar2 = this.f290657d;
        if (cVar2 != null) {
            cVar2.a();
        }
        this.f290662i.h(mo14794xfb86a31b, -1L, "", imgPath, null, true, 2, true, new rh5.d(mo14794xfb86a31b, this, imgPath));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        ((jd0.q2) x2Var).getClass();
        this.f290658e = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(context, this, m158354x19263085);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        mo48814x2efc64();
        this.f290662i.f();
    }

    @Override // cg3.a
    public void u0(mf3.k mediaInfo, android.graphics.Bitmap bitmap, cg3.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        sf3.g e17 = mediaInfo.e();
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DefaultQRCodeScanComponent", "scan failed, loadParam null, mediaId: " + mediaInfo.mo2110x5db1b11());
            return;
        }
        java.lang.String c17 = e17.c();
        cg3.c cVar = this.f290657d;
        android.view.View mo14794xfb86a31b = cVar != null ? cVar.mo14794xfb86a31b() : null;
        cg3.c cVar2 = this.f290657d;
        if (cVar2 != null) {
            cVar2.a();
        }
        this.f290662i.h(mo14794xfb86a31b, -1L, "", c17, bitmap, true, 2, true, new rh5.e(mo14794xfb86a31b, this, e17, c17, mediaInfo, hVar));
    }

    @Override // cg3.a
    public void u3(cg3.c cVar) {
        this.f290657d = cVar;
    }
}
