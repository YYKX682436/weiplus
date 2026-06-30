package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0016R#\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0017\u001a\n \r*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010'\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006."}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView;", "Lcom/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView;", "", "getLayoutId", "", "visible", "Ljz5/f0;", "setBarVisible", "visibility", "setBarVisibleExcludeProgress", "drag", "setEnableDrag", "Lcom/tencent/mm/ui/base/MMImageButton;", "kotlin.jvm.PlatformType", "I", "Ljz5/g;", "getPlayMediaBtn", "()Lcom/tencent/mm/ui/base/MMImageButton;", "playMediaBtn", "Landroid/view/ViewGroup;", "J", "getControlProcessArea", "()Landroid/view/ViewGroup;", "controlProcessArea", "Lz35/s0;", "K", "Lz35/s0;", "getVideoPlayStatusListener", "()Lz35/s0;", "setVideoPlayStatusListener", "(Lz35/s0;)V", "videoPlayStatusListener", "Lz35/e0;", "L", "Lz35/e0;", "getUserOperateListener", "()Lz35/e0;", "setUserOperateListener", "(Lz35/e0;)V", "userOperateListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-playvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView */
/* loaded from: classes4.dex */
public final class C19719xa864b110 extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 {
    public static final /* synthetic */ int U = 0;

    /* renamed from: I, reason: from kotlin metadata */
    public final jz5.g playMediaBtn;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public final jz5.g controlProcessArea;

    /* renamed from: K, reason: from kotlin metadata */
    public z35.s0 videoPlayStatusListener;

    /* renamed from: L, reason: from kotlin metadata */
    public z35.e0 userOperateListener;
    public volatile boolean M;
    public float N;
    public float P;
    public float Q;
    public long R;
    public final int S;
    public boolean T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19719xa864b110(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.playMediaBtn = jz5.h.b(new z35.v0(this));
        this.controlProcessArea = jz5.h.b(new z35.t0(this));
        m75696x17be9a2().setBackground(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80867xcfdedccd, i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aby)));
        m75696x17be9a2().setOnClickListener(new z35.q0(this));
        m75652xa19403eb().setOnSeekBarChangeListener(null);
        m75652xa19403eb().setEnabled(false);
        m75695x63802bf5().setOnTouchListener(new z35.r0(this));
        this.S = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* renamed from: getControlProcessArea */
    private final android.view.ViewGroup m75695x63802bf5() {
        return (android.view.ViewGroup) ((jz5.n) this.controlProcessArea).mo141623x754a37bb();
    }

    /* renamed from: getPlayMediaBtn */
    private final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21502xd5f766ad m75696x17be9a2() {
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21502xd5f766ad) ((jz5.n) this.playMediaBtn).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46
    public void d() {
        super.d();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("style", "light");
        com.p314xaae8f345.mm.ui.jk.f290544a.b(jSONObject.toString());
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46
    public void e() {
        z35.e0 e0Var = this.userOperateListener;
        if (e0Var != null) {
            z35.b bVar = (z35.b) e0Var;
            if (bVar.f551535a.isAccessibilityEnable) {
                return;
            }
            bVar.f551535a.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46
    /* renamed from: getLayoutId */
    public int mo75660x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eps;
    }

    public final z35.e0 getUserOperateListener() {
        return this.userOperateListener;
    }

    public final z35.s0 getVideoPlayStatusListener() {
        return this.videoPlayStatusListener;
    }

    public final boolean l(android.view.MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.P += motionEvent.getX() - this.Q;
                    this.Q = motionEvent.getX();
                    if (getUserTouching()) {
                        int max = (int) (m75652xa19403eb().getMax() * (this.P / m75652xa19403eb().getWidth()));
                        if (max != 0) {
                            int progress = m75652xa19403eb().getProgress() + max;
                            m75652xa19403eb().getMax();
                            m75652xa19403eb().getProgress();
                            m75652xa19403eb().setProgress(progress);
                            m(progress, true);
                            this.P = 0.0f;
                        }
                    } else if (java.lang.System.currentTimeMillis() - this.R >= 100 || java.lang.Math.abs(motionEvent.getX() - this.N) > this.S) {
                        m75691x389cdeb0(true);
                        m75682xb0dabe1c(true);
                        int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
                        m75652xa19403eb().setPadding(h17, 0, h17, 0);
                        m75676xa589f587(com.p314xaae8f345.mm.R.C30861xcebc809e.d9s);
                        m75700x9ae69d06(4);
                        android.widget.TextView indCurrentTimeTv = getIndCurrentTimeTv();
                        android.view.View view = (android.view.View) (indCurrentTimeTv != null ? indCurrentTimeTv.getParent() : null);
                        if (view != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "onSeekBarStartTrackingTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "onSeekBarStartTrackingTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        m75652xa19403eb().setVisibility(0);
                        z35.g0 visibleChangeListener = getVisibleChangeListener();
                        if (visibleChangeListener != null) {
                            visibleChangeListener.a(false);
                        }
                        m75652xa19403eb().setThumb(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.agi));
                        z35.d0 heroSeekBarChangeListener = getHeroSeekBarChangeListener();
                        if (heroSeekBarChangeListener != null) {
                            heroSeekBarChangeListener.g6(m75652xa19403eb(), getUserSeekProgress());
                        }
                        e();
                        x25.b reporter = getReporter();
                        if (reporter != null) {
                            xd4.l0 l0Var = (xd4.l0) reporter;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onProcessBarDragged", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                            l0Var.a();
                            l0Var.f535211m++;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onProcessBarDragged", "com.tencent.mm.plugin.sns.ui.video.SnsVideoSeekBarReporter");
                        }
                    }
                }
            } else if (getUserTouching()) {
                m75691x389cdeb0(false);
                z35.d0 heroSeekBarChangeListener2 = getHeroSeekBarChangeListener();
                if (heroSeekBarChangeListener2 != null) {
                    heroSeekBarChangeListener2.D0(m75652xa19403eb(), getUserSeekProgress());
                }
                int h18 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                m75652xa19403eb().setPadding(h18, 0, h18, 0);
                m75676xa589f587(com.p314xaae8f345.mm.R.C30861xcebc809e.d9r);
                m75652xa19403eb().setThumb(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.agh));
                m75700x9ae69d06(0);
                android.widget.TextView indCurrentTimeTv2 = getIndCurrentTimeTv();
                android.view.View view2 = (android.view.View) (indCurrentTimeTv2 != null ? indCurrentTimeTv2.getParent() : null);
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "onSeekBarStopTrackingTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "onSeekBarStopTrackingTouch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                z35.g0 visibleChangeListener2 = getVisibleChangeListener();
                if (visibleChangeListener2 != null) {
                    visibleChangeListener2.a(true);
                }
                e();
                e();
            } else {
                this.N = 0.0f;
                this.P = 0.0f;
                this.Q = 0.0f;
                this.R = 0L;
            }
        } else {
            float x17 = motionEvent.getX();
            this.N = x17;
            this.Q = x17;
            this.R = java.lang.System.currentTimeMillis();
        }
        return true;
    }

    public final void m(int i17, boolean z17) {
        z35.d0 heroSeekBarChangeListener = getHeroSeekBarChangeListener();
        if (heroSeekBarChangeListener != null) {
            heroSeekBarChangeListener.mo129341x95ed2be8(m75652xa19403eb(), i17, z17);
        }
        if (z17) {
            m75690x727fe0b2(i17);
            m75683xc531d4eb(getMTotalTimeMs() * i17);
            k(i17);
            postDelayed(new z35.u0(this, i17), 500L);
        }
    }

    public final void n(boolean z17) {
        if (this.M == z17) {
            return;
        }
        this.M = z17;
        if (!getUserTouching()) {
            java.lang.Object tag = m75696x17be9a2().getTag(com.p314xaae8f345.mm.R.id.vca);
            if ((!this.M || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "playing")) && (this.M || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, "pause"))) {
                if (this.M) {
                    m75696x17be9a2().setBackground(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80820x59fe03cb, i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aby)));
                    m75696x17be9a2().setTag(com.p314xaae8f345.mm.R.id.vca, "playing");
                    m75696x17be9a2().setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575384pc5));
                } else {
                    m75696x17be9a2().setBackground(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f80867xcfdedccd, i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aby)));
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21502xd5f766ad m75696x17be9a2 = m75696x17be9a2();
                    if (m75696x17be9a2 != null) {
                        m75696x17be9a2.setTag(com.p314xaae8f345.mm.R.id.vca, "pause");
                    }
                    m75696x17be9a2().setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pc6));
                }
            }
        }
        z35.s0 s0Var = this.videoPlayStatusListener;
        if (s0Var != null) {
            s0Var.a(z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.T) {
            return l(motionEvent);
        }
        return false;
    }

    /* renamed from: setBarVisible */
    public final void m75699x8fc0e6e1(boolean z17) {
        if (z17) {
            android.view.View m75666xfee3d4b = m75666xfee3d4b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m75666xfee3d4b, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m75666xfee3d4b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m75666xfee3d4b, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View m75666xfee3d4b2 = m75666xfee3d4b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m75666xfee3d4b2, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m75666xfee3d4b2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m75666xfee3d4b2, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        z35.g0 visibleChangeListener = getVisibleChangeListener();
        if (visibleChangeListener != null) {
            visibleChangeListener.a(z17);
        }
        e();
    }

    /* renamed from: setBarVisibleExcludeProgress */
    public final void m75700x9ae69d06(int i17) {
        m75696x17be9a2().setVisibility(i17);
        android.view.View m75666xfee3d4b = m75666xfee3d4b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m75666xfee3d4b, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisibleExcludeProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m75666xfee3d4b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m75666xfee3d4b, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView", "setBarVisibleExcludeProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46
    /* renamed from: setEnableDrag */
    public void mo75675x8d365359(boolean z17) {
        this.T = z17;
    }

    /* renamed from: setUserOperateListener */
    public final void m75701x3a66674b(z35.e0 e0Var) {
        this.userOperateListener = e0Var;
    }

    /* renamed from: setVideoPlayStatusListener */
    public final void m75702x6c38a833(z35.s0 s0Var) {
        this.videoPlayStatusListener = s0Var;
    }
}
