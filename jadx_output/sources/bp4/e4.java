package bp4;

/* loaded from: classes10.dex */
public final class e4 extends yt3.a implements bp4.a0, bp4.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f23158f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f23159g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView f23160h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23161i;

    /* renamed from: m, reason: collision with root package name */
    public final int f23162m;

    /* renamed from: n, reason: collision with root package name */
    public long f23163n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(android.view.View layout, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23158f = layout;
        android.view.View findViewById = layout.findViewById(com.tencent.mm.R.id.p4d);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f23159g = findViewById;
        android.view.View findViewById2 = layout.findViewById(com.tencent.mm.R.id.p4k);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = (com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView) findViewById2;
        this.f23160h = vLogThumbView;
        this.f23161i = 112;
        this.f23162m = 63;
        vLogThumbView.setOnSelectCallback(new bp4.c4(status));
        this.f23163n = -1L;
    }

    @Override // bp4.b0
    public void b(com.tencent.mm.plugin.vlog.model.h1 h1Var, long j17, boolean z17) {
        int i17;
        kp4.c1 c1Var;
        if (this.f23159g.getVisibility() != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogThumbViewPlugin", "thumbViewRoot not visible ignore update");
            return;
        }
        if (h1Var != null) {
            com.tencent.tav.coremedia.CMTimeRange i18 = h1Var.i();
            long j18 = 1000;
            long startUs = i18.getStartUs() / j18;
            long endUs = i18.getEndUs() / j18;
            long g17 = h1Var.g();
            java.util.List m17 = h1Var.m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i19 = 0;
            for (java.lang.Object obj : m17) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) obj;
                rm5.j jVar = i1Var.f175627l;
                long j19 = j18;
                if (jVar.f397503e < startUs || jVar.f397502d > endUs) {
                    i17 = i27;
                    c1Var = null;
                } else {
                    c1Var = new kp4.c1(i1Var);
                    c1Var.f311079i = i19;
                    rm5.j jVar2 = c1Var.f311097n.f175627l;
                    i17 = i27;
                    if (jVar2.f397502d < startUs) {
                        c1Var.f311074d = jVar2.f397504f + (((float) (startUs - r12)) * jVar2.f397506h);
                    }
                    if (jVar2.f397503e > endUs) {
                        c1Var.f311075e = jVar2.f397505g - (((float) (r12 - endUs)) * jVar2.f397506h);
                    }
                    c1Var.f311072b = this.f23161i;
                    c1Var.f311071a = this.f23162m;
                }
                if (c1Var != null) {
                    arrayList.add(c1Var);
                }
                j18 = j19;
                i19 = i17;
            }
            long j27 = j18;
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f23160h;
            vLogThumbView.getClass();
            vLogThumbView.f176134e.setVisibility(0);
            java.util.LinkedList linkedList = vLogThumbView.C;
            linkedList.clear();
            linkedList.addAll(arrayList);
            vLogThumbView.f176137h = 0;
            vLogThumbView.E = g17;
            vLogThumbView.f176138i = i18.getStartUs() / j27;
            long endUs2 = i18.getEndUs() / j27;
            vLogThumbView.f176139m = endUs2;
            long j28 = endUs2 - vLogThumbView.f176138i;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogThumbView", "onUpdate, duration:" + (vLogThumbView.f176139m - vLogThumbView.f176138i) + ", visibility:" + vLogThumbView.isShown() + " seekTo:" + j17 + " seekToOrigin:" + z17);
            vLogThumbView.recyclerView.removeCallbacks(vLogThumbView.f176144r);
            vLogThumbView.f176144r = new cq4.v(vLogThumbView, j28, j17, z17);
            vLogThumbView.B = false;
            vLogThumbView.f176140n = false;
            vLogThumbView.f176141o = vLogThumbView.f176142p;
            vLogThumbView.f176142p = 0;
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = vLogThumbView.f176135f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(linearLayoutManager, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "updateTracks", "(JLcom/tencent/tav/coremedia/CMTimeRange;JZLjava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/widget/VLogThumbView", "updateTracks", "(JLcom/tencent/tav/coremedia/CMTimeRange;JZLjava/util/List;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            java.lang.Runnable runnable = vLogThumbView.f176144r;
            if (runnable != null) {
                ((cq4.v) runnable).run();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r0) >= 1000) goto L6;
     */
    @Override // bp4.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r5) {
        /*
            r4 = this;
            long r0 = r4.f23163n
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L15
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
        L15:
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r0 = r4.f23160h
            java.util.Objects.toString(r0)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.f23163n = r0
        L22:
            android.view.View r0 = r4.f23159g
            boolean r0 = r0.isShown()
            if (r0 != 0) goto L2b
            return
        L2b:
            bp4.d4 r0 = new bp4.d4
            r0.<init>(r4, r5)
            pm0.v.X(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bp4.e4.c(long):void");
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f23160h;
        vLogThumbView.f176151y = c0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogThumbView", "onStart: ");
        if (vLogThumbView.isShown()) {
            vLogThumbView.f176140n = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogThumbView", "onStart thumbViewRoot not visible ignore");
        }
    }

    @Override // bp4.a0
    public void onFinish() {
    }

    @Override // yt3.r2
    public void release() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f23160h.recyclerView;
        e06.k m17 = e06.p.m(0, recyclerView.getChildCount());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        kz5.x0 it = m17.iterator();
        while (((e06.j) it).f246214f) {
            arrayList.add(recyclerView.getChildAt(it.b()));
        }
        java.util.Iterator it6 = ((java.util.ArrayList) kz5.j0.I(arrayList, com.tencent.mm.plugin.vlog.ui.thumb.FrameListView.class)).iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.vlog.ui.thumb.FrameListView frameListView = (com.tencent.mm.plugin.vlog.ui.thumb.FrameListView) it6.next();
            rm5.k kVar = frameListView.f176018x;
            if (kVar != null) {
                kVar.destroy();
            }
            frameListView.f176018x = null;
            frameListView.f176003f = null;
            com.tencent.mars.xlog.Log.i(frameListView.f176001d, "clearThumb");
            frameListView.f176004g.clear();
            frameListView.f176005h = null;
            frameListView.postInvalidate();
        }
        rm5.c cVar = rm5.h.f397489h;
        rm5.h.f397490i.evictAll();
    }

    @Override // yt3.r2
    public void reset() {
        this.f23160h.a(-1, 0L, 0L);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View view = this.f23159g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/VLogThumbViewPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/VLogThumbViewPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = i17 == 0;
        com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView vLogThumbView = this.f23160h;
        vLogThumbView.D = z17;
        vLogThumbView.f176134e.setVisibility(i17);
    }

    public final void z(int i17, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogThumbViewPlugin", "selectTrack:" + i17);
        this.f23160h.a(i17, j17, j18);
    }
}
