package lf2;

/* loaded from: classes10.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final gk2.e H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f399836J;
    public int K;
    public final jz5.g L;
    public final jz5.g M;
    public android.view.View N;
    public android.view.View P;
    public android.view.View Q;
    public final int R;
    public final int S;
    public int T;
    public android.widget.TextView U;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 V;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 W;
    public android.widget.SeekBar X;
    public android.widget.SeekBar Y;
    public final android.view.View.OnClickListener Z;

    /* renamed from: p0, reason: collision with root package name */
    public final android.view.View.OnClickListener f399837p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.content.Context context, gk2.e buContext, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703 baseController) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseController, "baseController");
        this.H = buContext;
        this.I = 5;
        this.K = -1;
        this.L = jz5.h.b(lf2.n.f399831d);
        this.M = jz5.h.b(new lf2.m(context, this));
        this.R = -12;
        this.S = 12;
        this.Z = new lf2.o(this);
        this.f399837p0 = new lf2.p(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drr;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.rss);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.N = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rsu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.P = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rt6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.Q = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rsl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.U = (android.widget.TextView) findViewById4;
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.view.View view = this.P;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("plusKeyView");
            throw null;
        }
        zl2.r4.c3(r4Var, view, 0, 0, 6, null);
        android.view.View view2 = this.N;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("minusKeyView");
            throw null;
        }
        zl2.r4.c3(r4Var, view2, 0, 0, 6, null);
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rsr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.W = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rso);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.V = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rsy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.X = (android.widget.SeekBar) findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.p314xaae8f345.mm.R.id.rsm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.Y = (android.widget.SeekBar) findViewById8;
        android.widget.SeekBar seekBar = this.X;
        if (seekBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("voiceVolume");
            throw null;
        }
        seekBar.setOnSeekBarChangeListener(new lf2.g(this));
        android.widget.SeekBar seekBar2 = this.Y;
        if (seekBar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("accompanyVolume");
            throw null;
        }
        seekBar2.setOnSeekBarChangeListener(new lf2.h(this));
        android.view.View findViewById9 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566999rt5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById9;
        this.f399836J = c22849x81a93d25;
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(this.f199716e, this.I, 1, false));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f399836J;
        if (c22849x81a93d252 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mReverberationRv");
            throw null;
        }
        c22849x81a93d252.mo7960x6cab2c8d((lf2.l) ((jz5.n) this.M).mo141623x754a37bb());
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f399836J;
        if (c22849x81a93d253 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mReverberationRv");
            throw null;
        }
        c22849x81a93d253.setVerticalScrollBarEnabled(false);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = this.f399836J;
        if (c22849x81a93d254 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mReverberationRv");
            throw null;
        }
        c22849x81a93d254.m7963x830bc99d(true);
        d0();
        Y(com.p314xaae8f345.mm.R.C30859x5a72f63.f560022a);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        gk2.e eVar = this.H;
        int P6 = ((om2.l) eVar.a(om2.l.class)).P6();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        jSONObject.put("sdk_type", P6);
        android.widget.SeekBar seekBar = this.X;
        if (seekBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("voiceVolume");
            throw null;
        }
        jSONObject.put("human_voice", seekBar.getProgress());
        android.widget.SeekBar seekBar2 = this.Y;
        if (seekBar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("accompanyVolume");
            throw null;
        }
        jSONObject.put("accompany", seekBar2.getProgress());
        jSONObject.put("rise_fall_tones", this.T);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.V;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("earSwitch");
            throw null;
        }
        jSONObject.put("return_ear", viewOnClickListenerC22631x1cc07cc8.f292896x ? 1 : 0);
        jSONObject.put("reverb_mode", ((om2.m) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) eVar.a(om2.e.class)).f427830p).mo144003x754a37bb()).f427890e);
        if (zl2.r4.f555483a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.Z1, jSONObject.toString(), null, 4, null);
        } else {
            int i17 = this.K;
            if (i17 != -1) {
                jSONObject.put(ya.b.f77502x92235c1b, i17);
            }
            i95.m c18 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.f408796r2, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }

    public final java.util.LinkedList e0() {
        return (java.util.LinkedList) ((jz5.n) this.L).mo141623x754a37bb();
    }

    public final void f0() {
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) this.H.a(om2.e.class)).f427826i).k(java.lang.Integer.valueOf(this.T));
        int i17 = this.T;
        if (i17 > 0) {
            android.widget.TextView textView = this.U;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyText");
                throw null;
            }
            textView.setText("+" + this.T);
        } else if (i17 == 0) {
            android.widget.TextView textView2 = this.U;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyText");
                throw null;
            }
            textView2.setText(" " + this.T);
        } else {
            android.widget.TextView textView3 = this.U;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyText");
                throw null;
            }
            textView3.setText(java.lang.String.valueOf(i17));
        }
        if (this.T <= this.R) {
            android.view.View view = this.N;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("minusKeyView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = this.N;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("minusKeyView");
                throw null;
            }
            view2.setOnClickListener(null);
        } else {
            android.view.View view3 = this.N;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("minusKeyView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view4 = this.N;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("minusKeyView");
                throw null;
            }
            view4.setOnClickListener(this.Z);
        }
        if (this.T >= this.S) {
            android.view.View view5 = this.P;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("plusKeyView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.3f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view6 = this.P;
            if (view6 != null) {
                view6.setOnClickListener(null);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("plusKeyView");
                throw null;
            }
        }
        android.view.View view7 = this.P;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("plusKeyView");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view7.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/controller/ktv/LiveKtvVoiceSettingPanel", "refreshKeyUI", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view8 = this.P;
        if (view8 != null) {
            view8.setOnClickListener(this.f399837p0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("plusKeyView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean w() {
        return true;
    }
}
