package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ob0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f195265p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f195266q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f195267r;

    /* renamed from: s, reason: collision with root package name */
    public int f195268s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r2 f195269t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f195270u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14269xdff648a5 f195271v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.tencent.mm.plugin.finder.live.plugin.FinderLiveTXLivePlayerPlugin$dragCloseEventListener$1] */
    public ob0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195265p = statusMonitor;
        this.f195266q = "MicroMsg.FinderLiveTXLivePlayerPlugin@" + hashCode();
        this.f195267r = (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614) root.findViewById(com.p314xaae8f345.mm.R.id.f567176ig5);
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f195271v = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5495xad2bb126>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveTXLivePlayerPlugin$dragCloseEventListener$1
            {
                this.f39173x3fe91575 = -1361166058;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5495xad2bb126 c5495xad2bb126) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5495xad2bb126 event = c5495xad2bb126;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ob0Var.f195266q, "rcv FinderLiveStartDragCloseEvent");
                ob0Var.f195267r.setAlpha(0.0f);
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = ob0Var.f195267r;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c10850xc00cf614, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c10850xc00cf614, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$dragCloseEventListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveStartDragCloseEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c10850xc00cf614.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c10850xc00cf614, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$dragCloseEventListener$1", "callback", "(Lcom/tencent/mm/autogen/events/FinderLiveStartDragCloseEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(c10850xc00cf614, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf6142 = ob0Var.f195267r;
                c10850xc00cf6142.getClass();
                android.view.SurfaceView surfaceView = c10850xc00cf6142.f150155g;
                if (surfaceView != null) {
                    c10850xc00cf6142.removeView(surfaceView);
                }
                c10850xc00cf6142.f150155g = null;
                return false;
            }
        };
        root.setPadding(0, 0, 0, 0);
        this.f195267r.f150153e = null;
        this.f195269t = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cb0(this, null), 3, null);
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eb0 A1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var, com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614) {
        mn0.b0 b0Var;
        co0.s y17 = ob0Var.y1();
        if (y17 != null) {
            android.content.Context context = ob0Var.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            b0Var = y17.Y0(context, c25484xcc963946, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ib0(), ((mm2.c1) ob0Var.P0(mm2.c1.class)).g8());
        } else {
            b0Var = null;
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eb0(b0Var, c10850xc00cf614);
    }

    public static /* synthetic */ void G1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var, int i17, com.p314xaae8f345.p2926x359365.C25484xcc963946 c25484xcc963946, int i18, boolean z17, boolean z18, yz5.l lVar, yz5.a aVar, int i19, java.lang.Object obj) {
        ob0Var.F1((i19 & 1) != 0 ? 1 : i17, (i19 & 2) != 0 ? zl2.r4.f555483a.d0(ob0Var.f195266q) : c25484xcc963946, i18, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? true : z18, (i19 & 32) != 0 ? null : lVar, (i19 & 64) != 0 ? null : aVar);
    }

    public static final java.lang.Object t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var, android.view.SurfaceView surfaceView, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ob0Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        int width = surfaceView.getWidth();
        int height = surfaceView.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin", "requestPixelCopy", "(Landroid/view/SurfaceView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin", "requestPixelCopy", "(Landroid/view/SurfaceView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        android.view.PixelCopy.request(surfaceView, createBitmap, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jb0(rVar, createBitmap), new android.os.Handler(android.os.Looper.getMainLooper()));
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f440719d;
        return j17;
    }

    public final mn0.b0 B1() {
        co0.s y17 = y1();
        if (y17 != null) {
            return y17.R1.f363942a;
        }
        return null;
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        android.graphics.RectF rectF;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar != null) {
            mn0.b0 B1 = B1();
            nn0.c cVar2 = B1 instanceof nn0.c ? (nn0.c) B1 : null;
            if (cVar2 != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBlendAlphaRect list: ");
                java.util.LinkedList linkedList = cVar.f536072i;
                sb6.append(linkedList.size());
                sb6.append(" value: ");
                sb6.append(linkedList);
                java.lang.String sb7 = sb6.toString();
                java.lang.String str = this.f195266q;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
                if (linkedList.size() <= 0 || !((mm2.o4) P0(mm2.o4.class)).A7()) {
                    rectF = new android.graphics.RectF(-1.0f, -1.0f, -1.0f, -1.0f);
                } else {
                    java.lang.Object obj = linkedList.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    xh2.h hVar = (xh2.h) obj;
                    float f17 = hVar.f536084c;
                    float f18 = hVar.f536082a;
                    float f19 = hVar.f536085d;
                    float f27 = hVar.f536083b;
                    rectF = new android.graphics.RectF(f18, f27, f17 + f18, f19 + f27);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "getBlendAlphaRect rect: " + rectF);
                nn0.o oVar = ((nn0.i) cVar2.p()).f420117b;
                if (oVar != null) {
                    oVar.t3(rectF);
                }
                android.graphics.RectF[] l17 = fj2.r.f344715a.l(cVar.f536067d, cVar.f536068e, cVar.f536069f, cVar.f536066c, cVar.f536064a);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("revertAlphaRectList: ");
                sb8.append(l17 != null ? kz5.z.d0(l17, ", ", null, null, 0, null, null, 62, null) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb8.toString());
                nn0.o oVar2 = ((nn0.i) cVar2.p()).f420117b;
                if (oVar2 != null) {
                    oVar2.Bg(l17);
                }
            }
        }
    }

    public final com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf C1() {
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 txLivePlayerPreview = this.f195267r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(txLivePlayerPreview, "txLivePlayerPreview");
        return txLivePlayerPreview;
    }

    public final boolean D1() {
        return ((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh();
    }

    public final void E1(boolean z17) {
        co0.s y17 = y1();
        if (y17 != null) {
            y17.f1(z17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195266q, "txLivePlayer, mute:" + z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0460  */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v51, types: [ez2.e] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [r45.nw1] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F1(int r30, com.p314xaae8f345.p2926x359365.C25484xcc963946 r31, int r32, boolean r33, boolean r34, yz5.l r35, yz5.a r36) {
        /*
            Method dump skipped, instructions count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.F1(int, com.tencent.rtmp.TXLivePlayConfig, int, boolean, boolean, yz5.l, yz5.a):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    public final void H1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195266q, "stopPlay, type:" + this.f195268s);
        co0.s y17 = y1();
        if (y17 != null) {
            y17.T0(z17);
        }
    }

    public final void I1() {
        H1(true);
        zl2.r4 r4Var = zl2.r4.f555483a;
        G1(this, 0, r4Var.d0(this.f195266q), r4Var.R0(S0(), x0(), false), false, !((mm2.c1) P0(mm2.c1.class)).g8(), null, null, 105, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r12 != null ? java.lang.Long.valueOf(r12.f339412a) : null, r11) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r12 != null ? java.lang.Long.valueOf(r12.f339412a) : null, r11) != false) goto L39;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        mo48814x2efc64();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f195269t;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        co0.s y17 = y1();
        if (y17 != null) {
            y17.f125266a2 = false;
        }
        this.f195270u = false;
        ez2.g.f339435a = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.db0 u1() {
        android.view.SurfaceView f150155g = this.f195267r.getF150155g();
        if (f150155g == null) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.db0.f193781f;
        }
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(f150155g.getContext());
        return ((b17.x > b17.y) || !f150155g.getHolder().getSurface().isValid()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.db0.f193780e : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.db0.f193779d;
    }

    public final void v1() {
        long j17 = V0().f390662d.f150082s;
        ig2.r f17 = ig2.m.f372926a.f(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("detachBlock feedId: ");
        sb6.append(j17);
        sb6.append(" director: ");
        sb6.append(f17);
        sb6.append(" isDetach: ");
        sb6.append(f17 != null ? java.lang.Boolean.valueOf(f17.i()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195266q, sb6.toString());
        boolean z17 = false;
        if (f17 != null && !f17.i()) {
            z17 = true;
        }
        if (z17) {
            if (f17 != null) {
                f17.h();
            }
            w1(f17);
            mn0.b0 B1 = B1();
            if (B1 != null) {
                ((mn0.y) B1).J(y1());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1(ig2.r r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.f195266q
            java.lang.String r1 = "fluentSwitchLiveRootEnd"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            boolean r0 = r5 instanceof ig2.i
            if (r0 == 0) goto Ld
            r0 = 1
            goto Lf
        Ld:
            boolean r0 = r5 instanceof ig2.d
        Lf:
            r1 = 0
            if (r0 == 0) goto L3f
            km2.m r5 = r4.V0()
            com.tencent.mm.live.api.LiveConfig r5 = r5.f390662d
            long r2 = r5.f150082s
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            if (r5 == 0) goto L35
            ez2.e r0 = ez2.g.f339435a
            if (r0 == 0) goto L2b
            long r2 = r0.f339412a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L2c
        L2b:
            r0 = r1
        L2c:
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r5)
            if (r5 == 0) goto L33
            goto L35
        L33:
            r5 = r1
            goto L37
        L35:
            ez2.e r5 = ez2.g.f339435a
        L37:
            if (r5 == 0) goto L6d
            r0 = 0
            r2 = 0
            r5.h(r2, r0, r2)
            goto L6d
        L3f:
            boolean r5 = r5 instanceof ig2.f
            if (r5 == 0) goto L6d
            km2.m r5 = r4.V0()
            com.tencent.mm.live.api.LiveConfig r5 = r5.f390662d
            long r2 = r5.f150082s
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            if (r5 == 0) goto L66
            ez2.e r0 = ez2.g.f339435a
            if (r0 == 0) goto L5c
            long r2 = r0.f339412a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L5d
        L5c:
            r0 = r1
        L5d:
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r5)
            if (r5 == 0) goto L64
            goto L66
        L64:
            r5 = r1
            goto L68
        L66:
            ez2.e r5 = ez2.g.f339435a
        L68:
            if (r5 == 0) goto L6d
            r5.j()
        L6d:
            com.tencent.mm.plugin.finder.live.view.k0 r5 = r4.Y0()
            if (r5 != 0) goto L74
            goto L79
        L74:
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r0)
        L79:
            android.view.ViewGroup r5 = r4.f446856d
            android.content.Context r0 = r5.getContext()
            boolean r2 = r0 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            if (r2 == 0) goto L86
            r1 = r0
            com.tencent.mm.ui.MMActivity r1 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r1
        L86:
            if (r1 == 0) goto La9
            android.view.Window r0 = r1.getWindow()
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r0 == 0) goto L99
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L99
            r0.setBackgroundColor(r1)
        L99:
            android.view.View r5 = r5.getRootView()
            r0 = 2131306071(0x7f092657, float:1.823033E38)
            android.view.View r5 = r5.findViewById(r0)
            if (r5 == 0) goto La9
            r5.setBackgroundColor(r1)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.w1(ig2.r):void");
    }

    public final jz5.l x1() {
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf;
        android.view.TextureView mo46536x4ee17f0a;
        int ordinal = u1().ordinal();
        if (ordinal == 0) {
            android.view.SurfaceView f150155g = this.f195267r.getF150155g();
            if (f150155g != null) {
                return new jz5.l(java.lang.Integer.valueOf(f150155g.getWidth()), java.lang.Integer.valueOf(f150155g.getHeight()));
            }
            return null;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            android.view.TextureView mo46536x4ee17f0a2 = this.f195267r.mo46536x4ee17f0a();
            if (mo46536x4ee17f0a2 != null) {
                return new jz5.l(java.lang.Integer.valueOf(mo46536x4ee17f0a2.getWidth()), java.lang.Integer.valueOf(mo46536x4ee17f0a2.getHeight()));
            }
            return null;
        }
        mn0.b0 B1 = B1();
        if (B1 == null) {
            return null;
        }
        mn0.y yVar = (mn0.y) B1;
        int i17 = 0;
        if (yVar.b(false)) {
            com.p314xaae8f345.p2926x359365.C25485x5a0a6891 p17 = yVar.p();
            nn0.i iVar = p17 instanceof nn0.i ? (nn0.i) p17 : null;
            if (iVar != null) {
                nn0.o oVar = iVar.f420117b;
                boolean z17 = iVar.f420116a;
                int mo149797x8d5c7601 = (!z17 || oVar == null) ? 0 : oVar.mo149797x8d5c7601();
                if (z17 && oVar != null) {
                    i17 = oVar.mo149796x463504c();
                }
                if (mo149797x8d5c7601 > 0 && i17 > 0) {
                    return new jz5.l(java.lang.Integer.valueOf(mo149797x8d5c7601), java.lang.Integer.valueOf(i17));
                }
            }
        }
        java.lang.ref.WeakReference weakReference = yVar.f411342h;
        if (weakReference == null || (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) weakReference.get()) == null || (mo46536x4ee17f0a = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.mo46536x4ee17f0a()) == null || mo46536x4ee17f0a.getWidth() <= 0 || mo46536x4ee17f0a.getHeight() <= 0) {
            return null;
        }
        return new jz5.l(java.lang.Integer.valueOf(mo46536x4ee17f0a.getWidth()), java.lang.Integer.valueOf(mo46536x4ee17f0a.getHeight()));
    }

    public final co0.s y1() {
        zl2.r4 r4Var = zl2.r4.f555483a;
        qo0.c cVar = this.f194858g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        if (!r4Var.W1(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar).m57654xd7793f26())) {
            return co0.b.f125242e2.c(V0().f390662d.f150070e);
        }
        dk2.ef efVar = dk2.ef.f314905a;
        tn0.w0 w0Var = dk2.ef.f314911d;
        if (w0Var instanceof sn0.b) {
            return (sn0.b) w0Var;
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        mo48813x58998cd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x04e6, code lost:
    
        if (r1.f509195e == false) goto L179;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0511  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eb0 z1(com.p314xaae8f345.p2926x359365.C25484xcc963946 r31, boolean r32, yz5.a r33) {
        /*
            Method dump skipped, instructions count: 1888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.z1(com.tencent.rtmp.TXLivePlayConfig, boolean, yz5.a):com.tencent.mm.plugin.finder.live.plugin.eb0");
    }
}
