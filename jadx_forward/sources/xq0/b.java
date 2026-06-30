package xq0;

/* loaded from: classes7.dex */
public class b extends mc3.f {

    /* renamed from: w, reason: collision with root package name */
    public yq0.a f537553w;

    /* renamed from: x, reason: collision with root package name */
    public xq0.d f537554x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xq0.c bizConfig) {
        super(bizConfig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        this.f537554x = bizConfig.f537555j;
    }

    public final void K0(xq0.d viewDelegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewDelegate, "viewDelegate");
        if (this.f407168q != null) {
            xq0.d dVar = this.f537554x;
            boolean z17 = false;
            if (dVar != null && dVar.mo157669x7b953cf2()) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f407173v, "bindViewDelegate failed: current viewDelegate is still valid, modification is not supported when biz is running");
                return;
            }
        }
        this.f537554x = viewDelegate;
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on canvas view created, canvasId: " + i17);
        yq0.a aVar = this.f537553w;
        if (aVar != null) {
            java.util.HashMap hashMap = aVar.f545952c;
            if (((java.lang.Long) hashMap.get(java.lang.Integer.valueOf(i17))) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MagicSimpleCanvasReporter", "mark render start, but has marked, canvasId: " + i17);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                hashMap.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                i95.m c17 = i95.n0.c(je3.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                je3.i.La((je3.i) c17, aVar.f545951b, aVar.f545950a, java.lang.String.valueOf(i17), com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37603x4c7d442, 0L, null, null, 96, null);
            }
        }
        xq0.d dVar = this.f537554x;
        if (dVar != null) {
            zq0.a aVar2 = (zq0.a) dVar;
            if (aVar2.f556509d != null) {
                return;
            }
            aVar2.addView(view, -1, -1);
            aVar2.f556509d = view;
        }
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        android.view.View view2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on canvas view layout, canvasId: " + i17);
        xq0.d dVar = this.f537554x;
        if (dVar == null || (view2 = ((zq0.a) dVar).f556509d) == null) {
            return;
        }
        view2.layout(i18, i19, i27 + i18, i28 + i19);
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        zq0.a aVar;
        android.view.View view2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on canvas view destroy, canvasId: " + i17);
        xq0.d dVar = this.f537554x;
        if (dVar == null || (view2 = (aVar = (zq0.a) dVar).f556509d) == null) {
            return;
        }
        aVar.removeView(view2);
        aVar.f556509d = null;
    }

    @Override // jc3.g0
    public void c(int i17, boolean z17) {
        java.lang.Long l17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "on canvas view first frame rendered, canvasId: " + i17);
        yq0.a aVar = this.f537553w;
        if (aVar != null && (l17 = (java.lang.Long) aVar.f545952c.get(java.lang.Integer.valueOf(i17))) != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSimpleCanvasReporter", "mark render finish, canvasId: " + i17 + ", renderTime: " + currentTimeMillis);
            i95.m c17 = i95.n0.c(je3.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            je3.i.La((je3.i) c17, aVar.f545951b, aVar.f545950a, java.lang.String.valueOf(i17), com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37598xf943aa9b, currentTimeMillis, null, null, 96, null);
        }
        xq0.d dVar = this.f537554x;
        if (dVar != null) {
            dVar.c(i17, z17);
        }
    }

    @Override // mc3.f
    /* renamed from: destroy */
    public void mo147148x5cd39ffa() {
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "destroy, bizName: " + this.f407159e);
            if (!this.f407161g || this.f407164m) {
                jc3.j0 j0Var = this.f407168q;
                if (j0Var != null) {
                    synchronized (j0Var) {
                        ((rc3.w0) j0Var).m162151x5cd39ffa();
                        this.f407169r = false;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.i6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.g4.class))).Di(((rc3.w0) j0Var).f475620e, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.z4.f229752d);
                        this.f407168q = null;
                        this.f407162h = null;
                        this.f407170s.clear();
                        this.f407171t.clear();
                        bf3.p pVar = this.f407166o;
                        if (pVar != null) {
                            pVar.b();
                            android.widget.FrameLayout frameLayout = this.f407167p;
                            if (frameLayout != null) {
                                pVar.c(frameLayout);
                            }
                        }
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f407173v, "isBizActive destroy return");
            }
        }
        this.f537553w = null;
    }

    @Override // jc3.h0
    public void v9(int i17) {
        xq0.d dVar = this.f537554x;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // jc3.h0
    public void zf(int i17) {
    }
}
