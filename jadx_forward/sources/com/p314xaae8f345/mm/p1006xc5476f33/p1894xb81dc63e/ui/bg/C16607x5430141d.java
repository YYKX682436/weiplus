package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\u0003¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0017\u0010#\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d¨\u0006+"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/bg/DynamicBgContainer;", "Landroid/widget/FrameLayout;", "Lsk3/c;", "", "visibility", "Ljz5/f0;", "setGradientBgViewVisibility", "setVisibility", "", "d", "Z", "getReleased", "()Z", "setReleased", "(Z)V", "released", "Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "e", "Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "getDynamicBgSurfaceView", "()Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "setDynamicBgSurfaceView", "(Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;)V", "dynamicBgSurfaceView", "Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "value", "f", "Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "getGradientBgView", "()Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "setGradientBgView", "(Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;)V", "gradientBgView", "g", "getBottomGradientBgView", "bottomGradientBgView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer */
/* loaded from: classes8.dex */
public final class C16607x5430141d extends android.widget.FrameLayout implements sk3.c {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f232063h;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean released;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 dynamicBgSurfaceView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 bottomGradientBgView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16607x5430141d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setIsInMultiWindowMode */
    public static final void m67175x90bef41b(boolean z17) {
        f232063h = z17;
    }

    public final synchronized void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "activeDynamicBg");
        if (this.released) {
            return;
        }
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5851x7d4ee7fd().e();
        setVisibility(0);
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView = getGradientBgView();
        if (gradientBgView != null) {
            gradientBgView.setVisibility(0);
        }
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView2 = getGradientBgView();
        if (gradientBgView2 != null) {
            gradientBgView2.setAlpha(1.0f);
        }
        if (((hh4.m) i95.n0.c(hh4.m.class)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DynamicBgContainer.", "addDynamicBackgroundView service is null");
            return;
        }
        if (gh4.j0.b() && jh4.d.f381384b && !f232063h) {
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            android.content.Context applicationContext = context.getApplicationContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(applicationContext, "getApplicationContext(...)");
            this.dynamicBgSurfaceView = new com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40(applicationContext, null);
            c();
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d40 = this.dynamicBgSurfaceView;
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d c16607x5430141d = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.bg.C16607x5430141d) (c10434xd4fc3d40 != null ? c10434xd4fc3d40.getParent() : null);
            if (c16607x5430141d != null && c16607x5430141d.dynamicBgSurfaceView != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "removed");
                c16607x5430141d.removeView(c16607x5430141d.dynamicBgSurfaceView);
                c16607x5430141d.dynamicBgSurfaceView = null;
            }
            addView(this.dynamicBgSurfaceView, layoutParams);
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d402 = this.dynamicBgSurfaceView;
            if (c10434xd4fc3d402 != null) {
                com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView3 = getGradientBgView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gradientBgView3);
                c10434xd4fc3d402.m43652xa32f3f45(gradientBgView3);
            }
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d403 = this.dynamicBgSurfaceView;
            if (c10434xd4fc3d403 != null) {
                c10434xd4fc3d403.m43653x16ae2614(false);
            }
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d404 = this.dynamicBgSurfaceView;
            if (c10434xd4fc3d404 != null) {
                c10434xd4fc3d404.setVisibility(0);
            }
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d405 = this.dynamicBgSurfaceView;
            if (c10434xd4fc3d405 != null) {
                c10434xd4fc3d405.c();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "virbg: added");
        }
    }

    public final synchronized void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "stopDynamicBg keepGradientBgViewVisible:" + z17);
        if (z17) {
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView = getGradientBgView();
            if (gradientBgView != null) {
                gradientBgView.setVisibility(0);
            }
        } else {
            setVisibility(8);
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView2 = getGradientBgView();
            if (gradientBgView2 != null) {
                gradientBgView2.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView3 = getGradientBgView();
        if (gradientBgView3 != null) {
            gradientBgView3.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d40 = this.dynamicBgSurfaceView;
        if (c10434xd4fc3d40 != null) {
            if (((hh4.m) i95.n0.c(hh4.m.class)) != null) {
                jh4.e.a();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "stop dynamicBg");
            c10434xd4fc3d40.b();
            c10434xd4fc3d40.setVisibility(8);
            com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d402 = this.dynamicBgSurfaceView;
            if (c10434xd4fc3d402 != null) {
                sk3.b bVar = new sk3.b();
                nq.s sVar = c10434xd4fc3d402.f146415f;
                sVar.f420433d = new nq.h(c10434xd4fc3d402, bVar);
                if (sVar.f420435f.isAlive()) {
                    sVar.f420436g.sendEmptyMessage(5);
                }
            }
            removeView(this.dynamicBgSurfaceView);
            this.dynamicBgSurfaceView = null;
        }
    }

    public final void c() {
        com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 c10432x58e9524;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskViewBgParticleColorConfig", "getColorConfig " + com.p314xaae8f345.mm.ui.bk.C());
        sk3.d dVar = com.p314xaae8f345.mm.ui.bk.C() ? sk3.d.f490488f : sk3.d.f490489g;
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d40 = this.dynamicBgSurfaceView;
        if (c10434xd4fc3d40 != null) {
            int i17 = dVar.f490490a;
            int i18 = dVar.f490491b;
            int i19 = dVar.f490492c;
            int i27 = dVar.f490493d;
            int i28 = dVar.f490494e;
            nq.f fVar = c10434xd4fc3d40.f146411t;
            if (fVar != null) {
                fVar.f420410k = new nq.a(i17, i18, i19, i27, i28);
                if (fVar.f420411l && (c10432x58e9524 = fVar.f420400a) != null) {
                    long j17 = c10432x58e9524.f146409a;
                    if (j17 > 0) {
                        c10432x58e9524.m43648x52d2f021(j17, i17, i18, i19, i27, i28);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView = getGradientBgView();
        int i29 = dVar.f490494e;
        int i37 = dVar.f490493d;
        if (gradientBgView != null) {
            gradientBgView.post(new nq.y(gradientBgView, i37, i29));
        }
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView2 = getGradientBgView();
        if (gradientBgView2 != null) {
            gradientBgView2.m43673xabe600e(1);
        }
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 c10436x212919c6 = this.bottomGradientBgView;
        c10436x212919c6.getClass();
        c10436x212919c6.post(new nq.y(c10436x212919c6, i37, i29));
        c10436x212919c6.m43673xabe600e(1);
    }

    public final com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 getBottomGradientBgView() {
        return this.bottomGradientBgView;
    }

    public final com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 getDynamicBgSurfaceView() {
        return this.dynamicBgSurfaceView;
    }

    @Override // sk3.c
    public com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 getGradientBgView() {
        return this.gradientBgView;
    }

    public final boolean getReleased() {
        return this.released;
    }

    /* renamed from: setDynamicBgSurfaceView */
    public final void m67180xc4d784f0(com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d40) {
        this.dynamicBgSurfaceView = c10434xd4fc3d40;
    }

    @Override // sk3.c
    /* renamed from: setGradientBgView */
    public void mo67181xa37004dc(com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 c10436x212919c6) {
        this.gradientBgView = c10436x212919c6;
        c();
    }

    /* renamed from: setGradientBgViewVisibility */
    public final void m67182x894ce10e(int i17) {
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 gradientBgView = getGradientBgView();
        if (gradientBgView == null) {
            return;
        }
        gradientBgView.setVisibility(i17);
    }

    /* renamed from: setReleased */
    public final void m67183x55b677bf(boolean z17) {
        this.released = z17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DynamicBgContainer.", "virbg: set visibility " + i17);
    }

    public /* synthetic */ C16607x5430141d(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16607x5430141d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6 c10436x212919c6 = new com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10436x212919c6(context2);
        this.bottomGradientBgView = c10436x212919c6;
        addView(c10436x212919c6, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (((hh4.m) i95.n0.c(hh4.m.class)) != null) {
            gh4.j0.a();
        }
    }
}
