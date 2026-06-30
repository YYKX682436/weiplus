package lc;

/* loaded from: classes14.dex */
public final class c implements com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lc.g f399325a;

    public c(lc.g gVar) {
        this.f399325a = gVar;
    }

    @Override // com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29
    /* renamed from: onAutoFocusSucceed */
    public final void mo21570x825db598() {
    }

    @Override // com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29
    /* renamed from: onCameraClosed */
    public final void mo21571x21df6c70() {
    }

    @Override // com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29
    /* renamed from: onCameraSucceed */
    public final void mo21572x771d13be() {
        this.f399325a.a(new java.lang.Runnable() { // from class: lc.c$$a
            /* JADX WARN: Removed duplicated region for block: B:35:0x0298  */
            /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 705
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: lc.RunnableC29073x2d8c9e.run():void");
            }
        });
    }

    @Override // com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29
    /* renamed from: onDataFrameCallBack */
    public final void mo21573x60cd3549(byte[] bArr) {
        mc.r rVar;
        byte[] bArr2;
        byte[] bArr3;
        if (bArr == null) {
            return;
        }
        int i17 = ic.d.f371814k;
        ic.d dVar = ic.c.f371813a;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f52 = dVar.f371823i;
        if (c2920x9dce3f52 == null || c2920x9dce3f52.m21847xc44d541b() || this.f399325a.f399353u == null) {
            return;
        }
        if (this.f399325a.f399358z) {
            oc.h hVar = oc.g.f425634a;
            if (hVar.f425640f && hVar.f425638d != null) {
                if (hVar.f425643i == null) {
                    mc.p.f407064a.e("TuringSdkHelper", "cancelWaitFirstFrameTimeOut handler == null!");
                } else if (!hVar.f425636b) {
                    hVar.f425636b = true;
                    mc.p.f407064a.b("TuringSdkHelper", "remove first frame time out event!");
                    hVar.f425643i.removeMessages(3);
                    if (dVar.f371822h && (rVar = hVar.f425639e) != null) {
                        rVar.k();
                    }
                }
                pc.d dVar2 = pc.c.f434735a;
                synchronized (pc.d.class) {
                    com.p314xaae8f345.p318x5a5de35.p324xac8f1cfd.p325xaf3f29eb.ai.p329x6a710b1.C2908x217bf10e c2908x217bf10e = dVar2.f434736a;
                    bArr2 = c2908x217bf10e == null ? null : (byte[]) c2908x217bf10e.m21724xba9b60d6();
                }
                if (bArr2 == null) {
                    bArr2 = (byte[]) bArr.clone();
                } else {
                    java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
                if (hVar.f425635a) {
                    hVar.f425638d.getClass();
                    mc.r rVar2 = hVar.f425639e;
                    if (rVar2 != null) {
                        if (rVar2.i()) {
                            dVar2.a(bArr2);
                        } else if (rVar2.f407082j) {
                            dVar2.a(bArr2);
                        } else {
                            int i18 = rVar2.f407084l;
                            if (i18 < 10) {
                                rVar2.f407084l = i18 + 1;
                                dVar2.a(bArr2);
                            } else {
                                if (rVar2.f407073a.size() >= 10 && (bArr3 = (byte[]) rVar2.f407073a.poll()) != null) {
                                    dVar2.a(bArr3);
                                }
                                rVar2.f407073a.add(bArr2);
                            }
                        }
                    }
                }
            }
        }
        android.hardware.Camera.Size m21551x7651b4bc = this.f399325a.f399353u != null ? this.f399325a.f399353u.m21551x7651b4bc() : this.f399325a.f399354v;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2920x9dce3f52 c2920x9dce3f522 = dVar.f371823i;
        if (c2920x9dce3f522 == null || m21551x7651b4bc == null) {
            return;
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.api.C2914x9e22cdb9.m21754xdc709624(bArr, m21551x7651b4bc.width, m21551x7651b4bc.height, 1, c2920x9dce3f522.m21848x704df978() ? 1 : 8, null, 0, 0, 0);
    }

    @Override // com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29
    /* renamed from: onEventError */
    public final void mo21574x5a5ecd(int i17, java.lang.String str) {
        int i18;
        int i19;
        if (i17 == 4 || i17 == 5) {
            mc.p.f407064a.e("AuthingFragment", str);
            return;
        }
        mc.q qVar = mc.p.f407064a;
        qVar.e("AuthingFragment", "camera, error:" + i17 + " msg:" + str);
        if (i17 == 7) {
            i19 = 230;
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.pj9;
        } else {
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f575425pj1;
            i19 = 215;
        }
        if (i19 == 215) {
            i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f575424pj0;
        }
        lc.g gVar = this.f399325a;
        if (gVar.getContext() != null) {
            java.lang.String string = gVar.b().getString(i18);
            com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde = gVar.B;
            if (c2919x968bacde == null ? true : c2919x968bacde.m21796x50cd83a9()) {
                gVar.a(new lc.RunnableC29084x2f5e1f(gVar, i19, string));
                return;
            } else {
                pc.f.c(i19, string);
                return;
            }
        }
        qVar.e("AuthingFragment", "camera on error context is null! code " + i19);
        pc.f.c(213, gVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575425pj1) + " camera error code: " + i19);
    }

    @Override // com.p314xaae8f345.p318x5a5de35.p319xbd3a024d.p320xf5bc2045.InterfaceC2889x4c929a29
    /* renamed from: onPreviewSucceed */
    public final void mo21575xcf684919() {
        this.f399325a.f399358z = false;
        this.f399325a.getClass();
        if (this.f399325a.f399353u == null) {
            mc.p.f407064a.e("AuthingFragment", "cameraHolder is null  ");
            pc.f.c(213, this.f399325a.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575425pj1) + " cameraHolder is null ");
            return;
        }
        pc.m mVar = pc.l.f434744a;
        android.hardware.Camera m21552x26ba6a48 = this.f399325a.f399353u.m21552x26ba6a48();
        mVar.getClass();
        new java.lang.ref.WeakReference(m21552x26ba6a48);
        mc.p.f407064a.b("AuthingFragment", "on preview succeed!");
        mc.d.f407048a.f407036g = oc.g.f425634a.f425639e;
        this.f399325a.a(new lc.d(this));
    }
}
