package sj3;

/* loaded from: classes14.dex */
public final class o3 {

    /* renamed from: e, reason: collision with root package name */
    public static final sj3.n3 f490199e = new sj3.n3(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 f490200a;

    /* renamed from: b, reason: collision with root package name */
    public uj3.p f490201b;

    /* renamed from: c, reason: collision with root package name */
    public uj3.i f490202c;

    /* renamed from: d, reason: collision with root package name */
    public int f490203d;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 mainUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainUI, "mainUI");
        this.f490200a = mainUI;
        this.f490203d = -1;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f490200a;
        if (serviceConnectionC16581x3d1d6bd2.T6() == null || serviceConnectionC16581x3d1d6bd2.T6().findViewById(com.p314xaae8f345.mm.R.id.m7w) == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        sj3.n3 n3Var = f490199e;
        int a17 = n3Var.a(serviceConnectionC16581x3d1d6bd2);
        this.f490203d = a17;
        if (a17 == 0 || a17 == 180) {
            n3Var.d(serviceConnectionC16581x3d1d6bd2, true);
            layoutParams.bottomMargin = n3Var.c(serviceConnectionC16581x3d1d6bd2);
        } else if (a17 == 270) {
            n3Var.d(serviceConnectionC16581x3d1d6bd2, false);
            layoutParams.leftMargin = n3Var.c(serviceConnectionC16581x3d1d6bd2);
        } else if (a17 == 90) {
            n3Var.d(serviceConnectionC16581x3d1d6bd2, false);
            layoutParams.rightMargin = n3Var.c(serviceConnectionC16581x3d1d6bd2);
        }
        serviceConnectionC16581x3d1d6bd2.T6().findViewById(com.p314xaae8f345.mm.R.id.m7w).setLayoutParams(layoutParams);
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f490200a;
        android.view.ViewGroup T6 = serviceConnectionC16581x3d1d6bd2.T6();
        if (T6 != null) {
            T6.removeView(this.f490201b);
        }
        android.view.ViewGroup T62 = serviceConnectionC16581x3d1d6bd2.T6();
        if (T62 != null) {
            T62.removeView(this.f490202c);
        }
        uj3.p pVar = this.f490201b;
        if (pVar != null) {
            pVar.l();
        }
        uj3.i iVar = this.f490202c;
        if (iVar != null) {
            iVar.l();
        }
        this.f490201b = null;
        this.f490202c = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231719y1 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231703o = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "markExitProject");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1538L, 4L, 1L);
    }

    public final void c(int i17) {
        android.view.ViewGroup T6 = this.f490200a.T6();
        if (T6 != null) {
            if (i17 == 2) {
                android.content.Context context = T6.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                uj3.p pVar = new uj3.p(context);
                this.f490201b = pVar;
                pVar.setVisibility(0);
                T6.addView(this.f490201b);
            } else {
                android.content.Context context2 = T6.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                uj3.i iVar = new uj3.i(context2);
                this.f490202c = iVar;
                iVar.setVisibility(0);
                T6.addView(this.f490202c);
            }
            a();
        }
    }

    public final boolean d() {
        uj3.p pVar = this.f490201b;
        if (pVar != null) {
            return pVar != null && pVar.getVisibility() == 0;
        }
        uj3.i iVar = this.f490202c;
        if (iVar != null) {
            return iVar.isShown();
        }
        return false;
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f490200a;
        if (serviceConnectionC16581x3d1d6bd2.T6() != null) {
            uj3.p pVar = this.f490201b;
            if (pVar != null) {
                pVar.p();
            }
            a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.q3 r17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().r();
            sj3.n3 n3Var = f490199e;
            int a17 = n3Var.a(serviceConnectionC16581x3d1d6bd2);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.r3) r17).getClass();
            int i17 = a17 != 0 ? a17 != 90 ? a17 != 180 ? a17 != 270 ? a17 != 360 ? 0 : 5 : 4 : 3 : 2 : 1;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4 i4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE;
            byte[] array = allocate.array();
            i4Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(62, array, 4);
            if (n3Var.a(serviceConnectionC16581x3d1d6bd2) == 90 || n3Var.a(serviceConnectionC16581x3d1d6bd2) == 270) {
                if (this.f490201b != null) {
                    zj3.g.f554835a.b(3, 1);
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153139d;
                }
                if (this.f490202c != null) {
                    java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231710t.f153139d;
                }
            }
        }
    }
}
