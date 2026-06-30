package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayoutImpl;", "Lcom/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputLayout;", "Liy2/b;", "getVoiceInputDrawable", "", "z", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.voice.FinderLiveVoiceInputLayoutImpl */
/* loaded from: classes15.dex */
public final class C15488x2a0085b4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 {
    public static final /* synthetic */ int G = 0;
    public android.view.View A;
    public android.widget.TextView B;
    public iy2.b C;
    public boolean D;
    public boolean E;
    public final android.view.View.OnTouchListener F;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C15488x2a0085b4(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974
    public void c(boolean z17) {
        i(new iy2.l(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974
    public void d(int i17) {
        i(new iy2.m(this, i17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974
    public void e() {
        i(new iy2.n(this));
    }

    public final void g(boolean z17, boolean z18) {
        iy2.b bVar;
        iy2.b bVar2;
        android.app.Activity activity;
        z21.e m48277x9cf0d20b;
        getCurrentState();
        if (getCurrentState() != getSTATE_PREPARED()) {
            if (getCurrentState() != getSTATE_STARTED()) {
                if (!z17 && !z18) {
                    a();
                    return;
                } else {
                    if (!z17 || z18 || (bVar = this.C) == null) {
                        return;
                    }
                    bVar.b();
                    return;
                }
            }
            if (!z18) {
                b();
                return;
            }
            iy2.b bVar3 = this.C;
            if (bVar3 != null) {
                bVar3.b();
            }
            a();
            if (getLongClickListener() != null) {
                iy2.d longClickListener = getLongClickListener();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(longClickListener);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a.b(((iy2.a0) longClickListener).f377394a, com.p314xaae8f345.mm.R.C30867xcad56011.nw_);
                return;
            }
            return;
        }
        if (z17 || z18) {
            if (!z17 || z18 || (bVar2 = this.C) == null) {
                return;
            }
            bVar2.b();
            return;
        }
        if (iq.b.C(getContext()) || iq.b.v(getContext()) || iq.b.e(getContext())) {
            e();
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.RECORD_AUDIO", true)) {
            if (getContext() instanceof android.app.Activity) {
                android.content.Context context2 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
                activity = (android.app.Activity) context2;
            } else {
                activity = null;
            }
            if (activity != null) {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activity, new java.lang.String[]{"android.permission.RECORD_AUDIO"}, 80, null, null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f218277d, "context = " + activity);
            return;
        }
        if (this.currentState != this.STATE_PREPARED) {
            return;
        }
        this.currentState = this.STATE_STARTED;
        iy2.e eVar = this.voiceDetectListener;
        if (eVar != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15489x5c3b8a7a c15489x5c3b8a7a = ((iy2.z) eVar).f377448a;
            c15489x5c3b8a7a.getClass();
            java.lang.Object[] objArr = {java.lang.Long.valueOf(currentTimeMillis)};
            java.lang.String str = c15489x5c3b8a7a.f218296d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "VoiceDetectListener onDetectStart time %s", objArr);
            c15489x5c3b8a7a.f218309t = false;
            c15489x5c3b8a7a.f218310u = true;
            c15489x5c3b8a7a.f218311v = true;
            c15489x5c3b8a7a.e();
            c15489x5c3b8a7a.f218310u = false;
            iy2.c cVar = c15489x5c3b8a7a.f218314y;
            if (cVar != null) {
                cVar.f377425i = 3;
            }
            if (cVar != null) {
                cVar.a(c15489x5c3b8a7a.f218304o);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "pauseMusic");
            co0.s u07 = dk2.ef.f314905a.u0();
            if (u07 != null) {
                u07.f1(true);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15489x5c3b8a7a.f218304o;
            if (c22621x7603e017 != null) {
                c22621x7603e017.setCursorVisible(false);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c15489x5c3b8a7a.f218304o;
                if (c22621x7603e0172 != null) {
                    c22621x7603e0172.requestFocus();
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.t0(c15489x5c3b8a7a.f218297e);
            }
            android.content.Context context3 = c15489x5c3b8a7a.f218306q;
            if (context3 instanceof android.app.Activity) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context3).getWindow().addFlags(128);
            }
            android.widget.TextView textView = c15489x5c3b8a7a.f218300h;
            if (textView != null) {
                textView.setVisibility(8);
            }
            android.view.View view = c15489x5c3b8a7a.f218299g;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$listener$1", "onDetectStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$listener$1", "onDetectStart", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = c15489x5c3b8a7a.f218304o;
            if (c22621x7603e0173 != null) {
                c22621x7603e0173.setHint(c15489x5c3b8a7a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nw8));
            }
            iy2.r rVar = c15489x5c3b8a7a.f218303n;
            if (rVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wr) rVar).a(true);
            }
            android.view.View view2 = c15489x5c3b8a7a.f218302m;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(0.5f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$listener$1", "onDetectStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/voice/FinderLiveVoiceInputPanel$listener$1", "onDetectStart", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.amplitudeTimer;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var);
        b4Var.c(50L, 50L);
        h(true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
            m48277x9cf0d20b = new z21.w();
        } else {
            ((x90.o) ((y90.i) i95.n0.c(y90.i.class))).getClass();
            m48277x9cf0d20b = com.p314xaae8f345.mm.p964x2822171a.BinderC11153x6a3b619.m48277x9cf0d20b();
        }
        this.f218279f = m48277x9cf0d20b;
        if (m48277x9cf0d20b != null) {
            m48277x9cf0d20b.mo48283x316510(this.f218282i, 8, new iy2.h(this));
        }
        z21.e eVar2 = this.f218279f;
        if (eVar2 != null) {
            eVar2.mo48296x68ac462();
        }
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    /* renamed from: getVoiceInputDrawable, reason: from getter */
    public final iy2.b getC() {
        return this.C;
    }

    public void h(boolean z17) {
        i(new iy2.o(this, z17));
    }

    public final void i(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15488x2a0085b4(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "MicroMsg.FinderLiveVoiceInputLayoutImpl";
        iy2.k kVar = new iy2.k(this);
        iy2.p pVar = new iy2.p(this);
        this.F = pVar;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ece, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f569150p71);
        this.A = findViewById;
        if (findViewById != null) {
            findViewById.setLayerType(1, null);
        }
        iy2.b bVar = new iy2.b(context);
        this.C = bVar;
        android.view.View view = this.A;
        if (view != null) {
            view.setBackground(bVar);
        }
        android.view.View view2 = this.A;
        if (view2 != null) {
            view2.setEnabled(true);
        }
        android.view.View view3 = this.A;
        if (view3 != null) {
            view3.setOnTouchListener(pVar);
        }
        android.view.View view4 = this.A;
        if (view4 != null) {
            view4.setOnLongClickListener(kVar);
        }
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.tqw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.B = (android.widget.TextView) findViewById2;
        f(true);
        if (isInEditMode() || com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return;
        }
        i(new iy2.j(this));
        this.currentState = this.STATE_PREPARED;
        e();
        iy2.e eVar = this.voiceDetectListener;
        if (eVar != null) {
            ((iy2.z) eVar).a(12, -1, -1);
        }
    }
}
