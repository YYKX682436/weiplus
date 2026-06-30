package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api;

/* renamed from: com.tencent.mm.plugin.mmsight.api.MMSightRecordView */
/* loaded from: classes10.dex */
public class C16529x1336da53 extends android.widget.FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final bi3.d f230364e = ((kt3.s) ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.m) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.m.class))).f393555e;

    /* renamed from: d, reason: collision with root package name */
    public bi3.g f230365d;

    public C16529x1336da53(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b(context);
    }

    public void a(android.view.MotionEvent motionEvent) {
        float f17;
        kt3.n nVar = (kt3.n) this.f230365d;
        nVar.getClass();
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            if (nVar.f393543g <= 0 || android.os.SystemClock.elapsedRealtime() - nVar.f393543g >= 400) {
                nVar.b(motionEvent.getX(), motionEvent.getY());
            }
            nVar.f393543g = android.os.SystemClock.elapsedRealtime();
            nVar.f393544h = -1.0f;
            return;
        }
        if (valueOf != null && valueOf.intValue() == 5) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == 6) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            nVar.f393544h = -1.0f;
            return;
        }
        if (valueOf != null && valueOf.intValue() == 2 && motionEvent.getPointerCount() >= 2) {
            try {
                f17 = java.lang.Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) + java.lang.Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppRecordViewImpl", "pointerDistance error: %s", e17.getMessage());
                f17 = 0.0f;
            }
            if (f17 > 0.0f) {
                float f18 = nVar.f393544h;
                if (f18 <= 0.0f) {
                    nVar.f393544h = f17;
                } else if (java.lang.Math.abs(f17 - f18) > 15) {
                    if (f17 > nVar.f393544h) {
                        nVar.d();
                    } else {
                        nVar.c();
                    }
                    nVar.f393544h = f17;
                }
            }
        }
    }

    public final void b(android.content.Context context) {
        ((kt3.m) f230364e).getClass();
        kt3.n nVar = new kt3.n();
        this.f230365d = nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        kt3.l lVar = new kt3.l(context);
        nVar.f393540d = lVar;
        lVar.m144376xce6c7bd1(nVar);
        kt3.l lVar2 = nVar.f393540d;
        if (lVar2 != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
            com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea = new com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea(context, null);
            lVar2.f393527n = c10905xfb961aea;
            c10905xfb961aea.setOnTouchListener(lVar2.f393536w);
            addView(lVar2.f393527n, marginLayoutParams);
            di3.d dVar = new di3.d(context, 2);
            lVar2.f393530q = dVar;
            dVar.enable();
            com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab(context);
            lVar2.B = c11508x646260ab;
            c11508x646260ab.setBackgroundColor(android.graphics.Color.argb(0, 0, 0, 0));
            addView(lVar2.B, new android.view.ViewGroup.MarginLayoutParams(1, 1));
        }
        nVar.f393542f = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
    }

    public void c(java.nio.ByteBuffer byteBuffer, bi3.h hVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab;
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            if (hVar == null && byteBuffer == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar = lVar.f393537x;
                if (mVar != null) {
                    mVar.f156291d = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.l lVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.l(mVar);
                    if (mVar.f156288a.isAlive()) {
                        mVar.f156289b.mo50293x3498a0(lVar2);
                    }
                    lVar.f393537x = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab2 = lVar.B;
                    if (c11508x646260ab2 == null) {
                        return;
                    }
                    c11508x646260ab2.setVisibility(8);
                    return;
                }
                return;
            }
            if (lVar.f393537x == null) {
                lVar.f393537x = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m();
                lVar.z();
                com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar2 = lVar.f393537x;
                if (mVar2 != null) {
                    mVar2.f156291d = new kt3.h(hVar, byteBuffer);
                }
                at0.n nVar = lVar.f393529p;
                java.lang.Boolean valueOf = nVar != null ? java.lang.Boolean.valueOf(((ts0.b) nVar.f95127b).G()) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                if (!valueOf.booleanValue() || (c11508x646260ab = lVar.B) == null) {
                    return;
                }
                if (c11508x646260ab.m48789x65b1be3b() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.m mVar3 = lVar.f393537x;
                    if (mVar3 != null) {
                        mVar3.b(c11508x646260ab.m48789x65b1be3b());
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab3 = lVar.B;
                    if (c11508x646260ab3 != null) {
                        c11508x646260ab3.m48793xdb10fe20(new kt3.i(lVar, c11508x646260ab));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab4 = lVar.B;
                if (c11508x646260ab4 == null) {
                    return;
                }
                c11508x646260ab4.setVisibility(0);
            }
        }
    }

    public void d(int i17, int i18, int i19, int i27, int i28) {
        kt3.l lVar;
        st3.b bVar;
        kt3.n nVar = (kt3.n) this.f230365d;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = nVar.f393542f;
        if (c11120x15dce88d != null) {
            c11120x15dce88d.f152728h = i17;
        }
        if (c11120x15dce88d != null) {
            c11120x15dce88d.f152727g = i18;
        }
        if (c11120x15dce88d != null) {
            c11120x15dce88d.f152726f = i19;
        }
        if (c11120x15dce88d != null) {
            c11120x15dce88d.f152731n = i27;
        }
        if (c11120x15dce88d != null) {
            c11120x15dce88d.f152732o = i28;
        }
        if (c11120x15dce88d == null || (lVar = nVar.f393540d) == null || (bVar = lVar.f393528o) == null) {
            return;
        }
        bVar.f494053d = c11120x15dce88d;
    }

    public boolean e(float f17) {
        kt3.n nVar = (kt3.n) this.f230365d;
        float[] fArr = nVar.f393549p;
        if (fArr == null) {
            return false;
        }
        if (fArr.length == 0) {
            return false;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((kz5.u) kz5.v.d(fArr)).indexOf(java.lang.Float.valueOf(f17)));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
        if (valueOf.intValue() < 0) {
            return false;
        }
        kt3.l lVar = nVar.f393540d;
        if (lVar != null) {
            lVar.m144369x76d9b83e(f17);
        }
        return true;
    }

    public void f() {
        int i17;
        kt3.n nVar = (kt3.n) this.f230365d;
        float f17 = nVar.f393545i;
        if (f17 > 0.0f && (i17 = nVar.f393546m) > 0) {
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = nVar.f393542f;
            if (c11120x15dce88d != null) {
                c11120x15dce88d.f152724d = i17;
            }
            if (c11120x15dce88d != null) {
                c11120x15dce88d.f152725e = (int) (i17 / f17);
            }
        }
        kt3.l lVar = nVar.f393540d;
        if (lVar != null) {
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = nVar.f393542f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11120x15dce88d2);
            java.lang.String str = nVar.f393541e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            android.util.Size size = nVar.f393550q;
            com.p314xaae8f345.mm.p859x62f6fe4.p868xd1075a44.p869x904cef5b.p870xed08e3c8.C10905xfb961aea c10905xfb961aea = lVar.f393527n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10905xfb961aea);
            st3.b bVar = new st3.b(c11120x15dce88d2, c10905xfb961aea, str);
            lVar.f393528o = bVar;
            at0.n nVar2 = new at0.n(bVar);
            lVar.f393529p = nVar2;
            if (true != nVar2.f95142q) {
                nVar2.f95142q = true;
            }
            ts0.r rVar = nVar2.f95127b;
            ((ts0.b) rVar).f503068q = size;
            kt3.b bVar2 = new kt3.b(lVar);
            ((ts0.b) rVar).f503061j = true;
            rVar.k(new at0.a(bVar2));
            at0.n nVar3 = lVar.f393529p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(nVar3);
            at0.n.i(nVar3, lVar.f393538y, null, new kt3.e(lVar), 2, null);
        }
    }

    public boolean g(boolean z17, boolean z18) {
        kt3.n nVar = (kt3.n) this.f230365d;
        nVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_RECORD_RESULT_MIRROR_BOOLEAN", z17);
        bundle.putBoolean("PARAM_RECORD_MUTED_BOOLEAN", z18);
        kt3.l lVar = nVar.f393540d;
        if (lVar == null) {
            return true;
        }
        lVar.w(ju3.c0.f383414i, bundle);
        return true;
    }

    /* renamed from: getCameraRotation */
    public int m66777xa3f60eb9() {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            return lVar.m144358xa3f60eb9();
        }
        return 0;
    }

    /* renamed from: getCurrentFramePicture */
    public android.graphics.Bitmap m66778x97c7b4() {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            return lVar.m144359x97c7b4();
        }
        return null;
    }

    /* renamed from: getDrawSizePoint */
    public android.graphics.Point m66779xe2adb975() {
        android.graphics.Point m144361xe2adb975;
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        return (lVar == null || (m144361xe2adb975 = lVar.m144361xe2adb975()) == null) ? new android.graphics.Point() : m144361xe2adb975;
    }

    /* renamed from: getFlashMode */
    public int m66780xbb0896fd() {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            return lVar.m144362xbb0896fd();
        }
        return 0;
    }

    /* renamed from: getPictureSize */
    public android.graphics.Point m66781x8dfb48e9() {
        android.graphics.Point m144363x8dfb48e9;
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        return (lVar == null || (m144363x8dfb48e9 = lVar.m144363x8dfb48e9()) == null) ? new android.graphics.Point() : m144363x8dfb48e9;
    }

    /* renamed from: getPreviewSize */
    public android.graphics.Point m66782x8cdf5ab3() {
        android.graphics.Point m144364x8cdf5ab3;
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        return (lVar == null || (m144364x8cdf5ab3 = lVar.m144364x8cdf5ab3()) == null) ? new android.graphics.Point() : m144364x8cdf5ab3;
    }

    /* renamed from: getSupportZoomMultiple */
    public float[] m66783xa63a1d3c() {
        kt3.l lVar;
        kt3.n nVar = (kt3.n) this.f230365d;
        if (nVar.f393549p == null && (lVar = nVar.f393540d) != null) {
            nVar.f393549p = lVar.m144365x656303f4();
        }
        return nVar.f393549p;
    }

    /* renamed from: getVideoFilePath */
    public java.lang.String m66784x819e39a6() {
        java.lang.String str = ((kt3.n) this.f230365d).f393541e;
        return str == null ? "" : str;
    }

    /* renamed from: getVideoSize */
    public android.graphics.Point m66785x4ee02466() {
        android.graphics.Point m144366x4ee02466;
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        return (lVar == null || (m144366x4ee02466 = lVar.m144366x4ee02466()) == null) ? new android.graphics.Point() : m144366x4ee02466;
    }

    public void h(bi3.j jVar) {
        kt3.n nVar = (kt3.n) this.f230365d;
        kt3.l lVar = nVar.f393540d;
        if (lVar != null) {
            lVar.m144375x9ae644b8(jVar);
        }
        kt3.l lVar2 = nVar.f393540d;
        if (lVar2 != null) {
            ju3.d0.k(lVar2, ju3.c0.f383420m, null, 2, null);
        }
    }

    public void i() {
        kt3.n nVar = (kt3.n) this.f230365d;
        nVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_PREPARE_CAMERA_IGNORE_FLIP_CHECK_BOOLEAN", true);
        kt3.l lVar = nVar.f393540d;
        if (lVar != null) {
            lVar.w(ju3.c0.f383408f, bundle);
        }
    }

    public void j(bi3.i iVar, boolean z17, boolean z18) {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            lVar.f393531r = iVar;
            lVar.f393539z = z17;
            lVar.A = z18;
        }
        if (lVar != null) {
            ju3.d0.k(lVar, ju3.c0.f383434s, null, 2, null);
        }
    }

    /* renamed from: setClipPictureSize */
    public void m66786x6da83fed(boolean z17) {
        this.f230365d.getClass();
    }

    /* renamed from: setClipVideoSize */
    public void m66787x84a70c6a(boolean z17) {
        this.f230365d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: setDisplayRatio */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m66788xf6c2fdeb(float r8) {
        /*
            r7 = this;
            bi3.g r0 = r7.f230365d
            kt3.n r0 = (kt3.n) r0
            r0.getClass()
            android.content.Context r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.WindowManager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r1, r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            r2 = 270(0x10e, float:3.78E-43)
            r3 = 90
            if (r1 == 0) goto L36
            r4 = 1
            if (r1 == r4) goto L34
            r4 = 2
            if (r1 == r4) goto L31
            r4 = 3
            if (r1 == r4) goto L2f
            goto L36
        L2f:
            r1 = r2
            goto L37
        L31:
            r1 = 180(0xb4, float:2.52E-43)
            goto L37
        L34:
            r1 = r3
            goto L37
        L36:
            r1 = 0
        L37:
            java.lang.Float r4 = java.lang.Float.valueOf(r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "MicroMsg.AppRecordViewImpl"
            java.lang.String r6 = "setDisplayRatio: %s, screenRotation: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6, r4)
            r0.f393545i = r8
            if (r1 == r3) goto L52
            if (r1 == r2) goto L52
            goto L57
        L52:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r8
            r0.f393545i = r1
        L57:
            kt3.l r8 = r0.f393540d
            if (r8 != 0) goto L5c
            goto L61
        L5c:
            float r0 = r0.f393545i
            r8.m144367xf6c2fdeb(r0)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.api.C16529x1336da53.m66788xf6c2fdeb(float):void");
    }

    /* renamed from: setDisplayScreenSize */
    public void m66789xac31fcad(android.util.Size size) {
        ((kt3.n) this.f230365d).f393550q = size;
    }

    /* renamed from: setEnableDragZoom */
    public void m66790x98e596cc(boolean z17) {
        ((kt3.n) this.f230365d).f393547n = z17;
    }

    /* renamed from: setEnableTouchFocus */
    public void m66791xdd456b3e(boolean z17) {
        ((kt3.n) this.f230365d).f393548o = z17;
    }

    /* renamed from: setFlashMode */
    public void m66792x175c5771(int i17) {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            lVar.m144368x175c5771(i17);
        }
    }

    /* renamed from: setFrameDataCallback */
    public void m66793x6554ffda(bi3.c cVar) {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            lVar.m144370x6554ffda(cVar);
        }
    }

    /* renamed from: setInitDoneCallback */
    public void m66794x2ec5a399(bi3.e eVar) {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            lVar.m144371x2ec5a399(eVar);
        }
    }

    /* renamed from: setInitErrorCallback */
    public void m66795x54cde6fb(bi3.f fVar) {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            lVar.m144372x54cde6fb(fVar);
        }
    }

    /* renamed from: setPreviewMode */
    public void m66796x234227c9(int i17) {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            lVar.m144373x234227c9(i17);
        }
    }

    /* renamed from: setPreviewSizeLimit */
    public void m66797x14794dd4(int i17) {
        kt3.n nVar = (kt3.n) this.f230365d;
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRecordViewImpl", "setPreviewSizeLimit: %s", java.lang.Integer.valueOf(i17));
        nVar.f393546m = i17;
    }

    /* renamed from: setRGBSizeLimit */
    public void m66798xdeb1636f(int i17) {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            lVar.m144374xdeb1636f(i17);
        }
    }

    /* renamed from: setUseBackCamera */
    public void m66799x6e2af291(boolean z17) {
        kt3.l lVar = ((kt3.n) this.f230365d).f393540d;
        if (lVar != null) {
            lVar.m144377x6e2af291(z17);
        }
    }

    /* renamed from: setVideoFilePath */
    public void m66800x1474a01a(java.lang.String str) {
        kt3.l lVar;
        st3.b bVar;
        kt3.n nVar = (kt3.n) this.f230365d;
        nVar.f393541e = str;
        if (str != null && (lVar = nVar.f393540d) != null && (bVar = lVar.f393528o) != null) {
            bVar.f494055f = str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppRecordViewImpl", "video path has been set %s", str);
    }

    public C16529x1336da53(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public C16529x1336da53(android.content.Context context) {
        super(context);
        b(context);
    }

    public C16529x1336da53(android.content.Context context, android.view.Surface surface, int i17, int i18) {
        super(context);
        ((kt3.m) f230364e).getClass();
        kt3.n nVar = new kt3.n();
        this.f230365d = nVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        kt3.l lVar = new kt3.l(context);
        nVar.f393540d = lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCameraPluginLayout", "surface is %s", surface);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surface);
        lVar.f393527n = new at0.o(context, surface, i17, i18);
        di3.d dVar = new di3.d(context, 2);
        lVar.f393530q = dVar;
        dVar.enable();
        com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab c11508x646260ab = new com.p314xaae8f345.mm.p1006xc5476f33.api.p1025x2bce8a96.C11508x646260ab(context);
        lVar.B = c11508x646260ab;
        c11508x646260ab.setBackgroundColor(android.graphics.Color.argb(0, 0, 0, 0));
        addView(lVar.B, new android.view.ViewGroup.MarginLayoutParams(-1, -1));
        nVar.f393542f = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d();
    }
}
