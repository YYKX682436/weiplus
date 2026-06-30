package dm3;

/* loaded from: classes11.dex */
public final class i0 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public pj4.j0 f323235c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323236d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.wd6 f323237e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dm3.j0 f323238f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, dm3.j0 j0Var) {
        super(str);
        this.f323238f = j0Var;
        this.f323237e = new r45.wd6();
    }

    @Override // bi4.o0
    public boolean b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return false;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        bw5.v70 d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = bundle != null ? bundle.getInt("STATUS_EXPOSED_SCENE") : 0;
        dm3.j jVar = this.f323238f.f323239d;
        java.lang.String str = this.f323236d;
        pj4.j0 j0Var = this.f323235c;
        jVar.getClass();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var != null ? j0Var.f436672d : null, "15")) {
            return false;
        }
        if (iq.b.C(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MusicPlayerJumper", "doJumpTing checkVoiceUsingAndShowToast true");
        } else {
            r45.wd6 wd6Var = new r45.wd6();
            try {
                wd6Var.mo11468x92b714fd(android.util.Base64.decode(j0Var.f436675g, 2));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MusicPlayerJumper", "parseFrom StatusFooterJumpListen exp: %s", e17.getMessage());
            }
            java.lang.String str2 = wd6Var.f470611d;
            if (!(str2 == null || str2.length() == 0)) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).Vi(false);
                qk.k6 k6Var = (qk.k6) i95.n0.c(qk.k6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k6Var);
                bw5.lp0 i66 = qk.k6.i6(k6Var, null, null, null, null, 15, null);
                java.lang.String m13170xcc16feb8 = (i66 == null || (d17 = i66.d()) == null) ? null : d17.m13170xcc16feb8();
                if (m13170xcc16feb8 == null) {
                    m13170xcc16feb8 = "";
                }
                boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m13170xcc16feb8, str2);
                bw5.x2 x2Var = bw5.x2.BizAudioEnterScene_StatusListen;
                if (b17 && qk.k6.vd(k6Var, null, null, null, null, 15, null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicPlayerJumper", "Ting-Trace state same listenId paused, resume");
                    qk.k6.Hb(k6Var, null, null, null, null, 15, null);
                } else if (b17 && qk.k6.Yc(k6Var, null, null, null, null, 15, null)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicPlayerJumper", "Ting-Trace state same listenId available, do nothing");
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                    il4.e eVar = new il4.e(null, 0, 2001, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, x2Var, false, 25165819, null);
                    if (str != null) {
                        eVar.f373655s.f373665d.put("textstatus", str);
                    }
                    rk4.a aVar = (rk4.a) k6Var;
                    java.util.ArrayList arrayList = aVar.f478059d;
                    if (arrayList == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mImplList");
                        throw null;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            qk.j6 j6Var = (qk.j6) it.next();
                            if (j6Var.m(null, str2, null, null)) {
                                j6Var.z(str2, eVar);
                                break;
                            }
                        } else {
                            qk.j6 j6Var2 = aVar.f478060e;
                            if (j6Var2 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFallbackImpl");
                                throw null;
                            }
                            ((rk4.h) j6Var2).z(str2, eVar);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicPlayerJumper", "Ting-Trace state jump do play");
                }
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (i17 == 8 || i17 == 9) {
                    bundle2.putBoolean("key_not_add_floatball_exit", true);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicPlayerJumper", "Ting-Trace state jump goToTingPlayerActivity");
                qk.k6.I1(k6Var, context, false, null, new il4.e(null, 0, 2001, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, x2Var, false, 25165819, null), null, bundle2, bw5.ar0.TingScene_TextState, null, null, null, str2, 918, null);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MusicPlayerJumper", "fail jump ting, listenId is null");
        }
        return true;
    }

    @Override // bi4.o0
    public /* bridge */ /* synthetic */ java.lang.CharSequence f() {
        return "";
    }

    @Override // bi4.o0
    public java.lang.String h() {
        return "";
    }

    @Override // bi4.o0
    public /* bridge */ /* synthetic */ java.lang.CharSequence i() {
        return "";
    }

    @Override // bi4.o0
    public boolean j() {
        return true;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        this.f323235c = j0Var;
        this.f323236d = str;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var != null ? j0Var.f436672d : null, "15")) {
            try {
                this.f323237e.mo11468x92b714fd(android.util.Base64.decode(j0Var.f436675g, 2));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingStatusService", "getOftenRead exp: %s", e17.getMessage());
            }
        }
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean o(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        return false;
    }

    @Override // bi4.o0
    public boolean q(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        dm3.j0 j0Var = this.f323238f;
        if (!j0Var.f323240e) {
            return true;
        }
        j0Var.f323240e = false;
        java.lang.String str = this.f323237e.f470612e;
        if (str == null || r26.n0.N(str)) {
            return false;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("Finder.TextStatusProvider");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
            imageView.setTag("Finder.TextStatusProvider");
            container.removeAllViews();
            container.addView(imageView);
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.post(new dm3.h0(str, imageView));
        return true;
    }
}
