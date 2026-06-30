package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/pkg/BackupRangeManagerUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI */
/* loaded from: classes5.dex */
public final class ActivityC12866x739418c6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.Calendar f174317t;

    /* renamed from: d, reason: collision with root package name */
    public long f174318d = -1;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 f174319e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 f174320f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174321g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174322h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174323i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f174324m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f174325n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f174326o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f174327p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f174328q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f174329r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f174330s;

    static {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26, 0, 21);
        f174317t = calendar;
    }

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 activityC12866x739418c6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = activityC12866x739418c6.f174320f;
        if (c12853x6acde7c9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        if (c12853x6acde7c9.f174263d != po1.b.f438823e) {
            c12853x6acde7c9.f174264e.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = activityC12866x739418c6.f174320f;
            if (c12853x6acde7c92 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            c12853x6acde7c92.f174265f.clear();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = activityC12866x739418c6.f174327p;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeMenuSwt");
            throw null;
        }
        if (!viewOnClickListenerC22631x1cc07cc8.f292896x) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c93 = activityC12866x739418c6.f174320f;
            if (c12853x6acde7c93 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            c12853x6acde7c93.f174266g = 0L;
            c12853x6acde7c93.f174267h = 0L;
        }
        zo1.n nVar = new zo1.n(activityC12866x739418c6);
        long j17 = activityC12866x739418c6.f174318d;
        if (j17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRangeManagerUI", "skip update range list, pkgId=-1");
            nVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = r0Var.k(j17);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupRangeManagerUI", "Fail to get pkgInfo");
            nVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return;
        }
        java.lang.String string = activityC12866x739418c6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC12866x739418c6, string, false, 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c94 = activityC12866x739418c6.f174320f;
        if (c12853x6acde7c94 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i b17 = c12853x6acde7c94.b();
        int i17 = k17.f297368m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c95 = activityC12866x739418c6.f174320f;
        if (c12853x6acde7c95 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        if (c12853x6acde7c95.f174267h > 0) {
            i17 &= -2;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g();
        gVar.mo11468x92b714fd(k17.m75960xfb7e5820());
        gVar.f297367i = b17;
        gVar.f297368m = i17;
        r0Var.s(gVar, new zo1.r(f17, nVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6 r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6.U6(com.tencent.mm.plugin.backup.roambackup.ui.pkg.BackupRangeManagerUI, boolean):void");
    }

    public final void V6() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = this.f174319e;
        if (c12853x6acde7c9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("originalRange");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = this.f174320f;
        if (c12853x6acde7c92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        boolean z18 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12853x6acde7c9, c12853x6acde7c92);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f174327p;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeMenuSwt");
            throw null;
        }
        if (viewOnClickListenerC22631x1cc07cc8.f292896x) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c93 = this.f174320f;
            if (c12853x6acde7c93 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            if (c12853x6acde7c93.f174266g <= 0) {
                z17 = false;
                m78501x43e00957(!z18 && z17);
            }
        }
        z17 = true;
        m78501x43e00957(!z18 && z17);
    }

    public final void W6() {
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559262q, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    public final void X6() {
        java.lang.String str;
        java.lang.String string;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = this.f174320f;
        if (c12853x6acde7c9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        int ordinal = c12853x6acde7c9.f174263d.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f174321g;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allConvCheckedWiv");
                throw null;
            }
            c22699x3dcdb352.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f174322h;
            if (c22699x3dcdb3522 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvCheckedWiv");
                throw null;
            }
            c22699x3dcdb3522.setVisibility(4);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f174323i;
            if (c22699x3dcdb3523 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allButFoldConvCheckedWiv");
                throw null;
            }
            c22699x3dcdb3523.setVisibility(4);
            android.widget.LinearLayout linearLayout = this.f174325n;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
                throw null;
            }
            if (linearLayout.getVisibility() == 0) {
                android.widget.LinearLayout linearLayout2 = this.f174325n;
                if (linearLayout2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
                    throw null;
                }
                linearLayout2.setVisibility(8);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f174324m;
                if (c22699x3dcdb3524 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificIndicatorIv");
                    throw null;
                }
                c22699x3dcdb3524.setImageResource(com.p314xaae8f345.mm.R.raw.f78534x98e18718);
            }
        } else if (ordinal == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = this.f174321g;
            if (c22699x3dcdb3525 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allConvCheckedWiv");
                throw null;
            }
            c22699x3dcdb3525.setVisibility(4);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = this.f174322h;
            if (c22699x3dcdb3526 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvCheckedWiv");
                throw null;
            }
            c22699x3dcdb3526.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3527 = this.f174323i;
            if (c22699x3dcdb3527 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allButFoldConvCheckedWiv");
                throw null;
            }
            c22699x3dcdb3527.setVisibility(4);
            android.widget.LinearLayout linearLayout3 = this.f174325n;
            if (linearLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
                throw null;
            }
            if (linearLayout3.getVisibility() == 0) {
                oo1.g gVar = oo1.g.f428676a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = this.f174320f;
                if (c12853x6acde7c92 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                    throw null;
                }
                java.util.List K0 = kz5.n0.K0(c12853x6acde7c92.f174264e, 50);
                boolean isEmpty = K0.isEmpty();
                java.util.Collection collection = kz5.p0.f395529d;
                if (!isEmpty) {
                    java.util.Collection i17 = ((b93.b) c93.a.a()).i(kz5.n0.g0(K0, ",", null, null, 0, null, null, 62, null));
                    if (i17 != null) {
                        collection = i17;
                    }
                }
                java.lang.String g07 = kz5.n0.g0(collection, ",", null, null, 0, null, null, 62, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c93 = this.f174320f;
                if (c12853x6acde7c93 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                    throw null;
                }
                java.lang.String g08 = kz5.n0.g0(gVar.b(this, kz5.n0.K0(c12853x6acde7c93.f174265f, 50)), ",", null, null, 0, null, null, 62, null);
                android.widget.LinearLayout linearLayout4 = this.f174325n;
                if (linearLayout4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
                    throw null;
                }
                android.widget.TextView textView = (android.widget.TextView) linearLayout4.findViewById(com.p314xaae8f345.mm.R.id.s2x);
                if (g07.length() > 0) {
                    textView.setText(g07);
                } else {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mz9);
                }
                android.widget.LinearLayout linearLayout5 = this.f174325n;
                if (linearLayout5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
                    throw null;
                }
                android.widget.TextView textView2 = (android.widget.TextView) linearLayout5.findViewById(com.p314xaae8f345.mm.R.id.s2t);
                if (g08.length() > 0) {
                    textView2.setText(g08);
                } else {
                    textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574405mz5);
                }
            }
        } else if (ordinal == 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3528 = this.f174321g;
            if (c22699x3dcdb3528 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allConvCheckedWiv");
                throw null;
            }
            c22699x3dcdb3528.setVisibility(4);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3529 = this.f174322h;
            if (c22699x3dcdb3529 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvCheckedWiv");
                throw null;
            }
            c22699x3dcdb3529.setVisibility(4);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35210 = this.f174323i;
            if (c22699x3dcdb35210 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("allButFoldConvCheckedWiv");
                throw null;
            }
            c22699x3dcdb35210.setVisibility(0);
            android.widget.LinearLayout linearLayout6 = this.f174325n;
            if (linearLayout6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
                throw null;
            }
            if (linearLayout6.getVisibility() == 0) {
                android.widget.LinearLayout linearLayout7 = this.f174325n;
                if (linearLayout7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
                    throw null;
                }
                linearLayout7.setVisibility(8);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb35211 = this.f174324m;
                if (c22699x3dcdb35211 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificIndicatorIv");
                    throw null;
                }
                c22699x3dcdb35211.setImageResource(com.p314xaae8f345.mm.R.raw.f78534x98e18718);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f174327p;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeMenuSwt");
            throw null;
        }
        if (viewOnClickListenerC22631x1cc07cc8.f292896x) {
            android.widget.LinearLayout linearLayout8 = this.f174326o;
            if (linearLayout8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeSubMenu");
                throw null;
            }
            linearLayout8.setVisibility(0);
            android.widget.TextView textView3 = this.f174328q;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("startTimeTv");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c94 = this.f174320f;
            if (c12853x6acde7c94 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            if (c12853x6acde7c94.f174266g > 0) {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c95 = this.f174320f;
                if (c12853x6acde7c95 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                    throw null;
                }
                calendar.setTimeInMillis(c12853x6acde7c95.f174266g);
                str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7h, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)));
            } else {
                str = "";
            }
            textView3.setText(str);
            android.widget.TextView textView4 = this.f174329r;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("endTimeTv");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c96 = this.f174320f;
            if (c12853x6acde7c96 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            if (c12853x6acde7c96.f174267h > 0) {
                java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c97 = this.f174320f;
                if (c12853x6acde7c97 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                    throw null;
                }
                calendar2.setTimeInMillis(c12853x6acde7c97.f174267h);
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7h, java.lang.Integer.valueOf(calendar2.get(1)), java.lang.Integer.valueOf(calendar2.get(2) + 1), java.lang.Integer.valueOf(calendar2.get(5)));
            } else {
                string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.mz_);
            }
            textView4.setText(string);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dwa;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == 0 || intent == null) {
            return;
        }
        if (i17 == 126) {
            java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("Select_Contact");
            if (stringArrayExtra == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupRangeManagerUI", "Fail to get selected contact list");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = this.f174320f;
            if (c12853x6acde7c9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
            c12853x6acde7c9.f174265f.clear();
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = this.f174320f;
            if (c12853x6acde7c92 != null) {
                kz5.h0.w(c12853x6acde7c92.f174265f, stringArrayExtra);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
                throw null;
            }
        }
        if (i17 != 127) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
        if (stringArrayListExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupRangeManagerUI", "fail to get selected label list");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c93 = this.f174320f;
        if (c12853x6acde7c93 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        c12853x6acde7c93.f174264e.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c94 = this.f174320f;
        if (c12853x6acde7c94 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(stringArrayListExtra, 10));
        for (java.lang.String str : stringArrayListExtra) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
        }
        c12853x6acde7c94.f174264e.addAll(arrayList);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = this.f174319e;
        if (c12853x6acde7c9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("originalRange");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = this.f174320f;
        if (c12853x6acde7c92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12853x6acde7c9, c12853x6acde7c92)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRangeManagerUI", "Content not changed, skip showing dialog.");
            W6();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.myu));
        u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgk));
        u1Var.n(getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgl));
        u1Var.a(true);
        u1Var.b(new zo1.b(this));
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean booleanExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9;
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mxy);
        m78560xe21cbbf(false);
        mo78514x143f1b92().x0(getString(com.p314xaae8f345.mm.R.C30867xcad56011.mvh), new java.lang.Runnable() { // from class: zo1.e
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Calendar calendar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6.f174317t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6.this.W6();
            }
        });
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.s2s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f174321g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f568233s33);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f174322h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.s2q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f174323i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f568230s30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f174324m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.f568232s32);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f174325n = (android.widget.LinearLayout) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.f568236s36);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f174327p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.s37);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById7;
        this.f174326o = linearLayout;
        android.view.View findViewById8 = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f568235s35);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById8, "findViewById(...)");
        this.f174328q = (android.widget.TextView) findViewById8;
        android.widget.LinearLayout linearLayout2 = this.f174326o;
        if (linearLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeSubMenu");
            throw null;
        }
        android.view.View findViewById9 = linearLayout2.findViewById(com.p314xaae8f345.mm.R.id.s2w);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById9, "findViewById(...)");
        this.f174329r = (android.widget.TextView) findViewById9;
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.s2r)).setOnClickListener(new zo1.f(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f568231s31)).setOnClickListener(new zo1.g(this));
        ((android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.s2p)).setOnClickListener(new zo1.h(this));
        android.widget.LinearLayout linearLayout3 = this.f174325n;
        if (linearLayout3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
            throw null;
        }
        ((android.widget.LinearLayout) linearLayout3.findViewById(com.p314xaae8f345.mm.R.id.s2z)).setOnClickListener(new zo1.i(this));
        android.widget.LinearLayout linearLayout4 = this.f174325n;
        if (linearLayout4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
            throw null;
        }
        ((android.widget.LinearLayout) linearLayout4.findViewById(com.p314xaae8f345.mm.R.id.s2y)).setOnClickListener(new zo1.j(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f174327p;
        if (viewOnClickListenerC22631x1cc07cc8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeMenuSwt");
            throw null;
        }
        viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new zo1.l(this));
        setResult(0);
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.mwh), new zo1.m(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        long longExtra = getIntent().getLongExtra("packageId", -1L);
        this.f174318d = longExtra;
        if (longExtra != -1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(longExtra);
            if (k17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRangeManagerUI", "[onCreate] Fail to get package info by pkgId=" + this.f174318d);
                W6();
                return;
            }
            booleanExtra = (k17.f297368m & 1) != 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.a(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.a2.f174100a, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174482q, k17, null, null, null, null, 60, null);
            po1.a aVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9.f35348x681a0c0c;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i iVar = k17.f297367i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iVar, "getBackupRange(...)");
            c12853x6acde7c9 = aVar.a(iVar);
        } else {
            booleanExtra = getIntent().getBooleanExtra("autoBackupEnable", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174482q);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
            c6839x89375b51.f141599d = 3L;
            c6839x89375b51.f141600e = 1L;
            c6839x89375b51.k();
            java.lang.Object parcelableExtra = getIntent().getParcelableExtra("convParcelRange");
            if (parcelableExtra == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRangeManagerUI", "[onCreate] create new range");
                parcelableExtra = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9(null, null, null, 0L, 0L, 31, null);
            }
            c12853x6acde7c9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9) parcelableExtra;
        }
        this.f174319e = c12853x6acde7c9;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c92 = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9(c12853x6acde7c9.f174263d, new java.util.ArrayList(c12853x6acde7c9.f174264e), new java.util.ArrayList(c12853x6acde7c9.f174265f), c12853x6acde7c9.f174266g, c12853x6acde7c9.f174267h);
        this.f174320f = c12853x6acde7c92;
        if (c12853x6acde7c92.f174266g > 0 || c12853x6acde7c92.f174267h > 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = this.f174327p;
            if (viewOnClickListenerC22631x1cc07cc82 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeMenuSwt");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(true);
            android.widget.LinearLayout linearLayout5 = this.f174326o;
            if (linearLayout5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeSubMenu");
                throw null;
            }
            linearLayout5.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c93 = this.f174319e;
        if (c12853x6acde7c93 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("originalRange");
            throw null;
        }
        this.f174330s = c12853x6acde7c93.f174266g > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c94 = this.f174320f;
        if (c12853x6acde7c94 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        if (c12853x6acde7c94.f174263d == po1.b.f438823e) {
            android.widget.LinearLayout linearLayout6 = this.f174325n;
            if (linearLayout6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
                throw null;
            }
            linearLayout6.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f174324m;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificIndicatorIv");
                throw null;
            }
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78551xb3b49691);
        } else {
            android.widget.LinearLayout linearLayout7 = this.f174325n;
            if (linearLayout7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificConvSubMenu");
                throw null;
            }
            linearLayout7.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f174324m;
            if (c22699x3dcdb3522 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("specificIndicatorIv");
                throw null;
            }
            c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f78534x98e18718);
        }
        android.widget.LinearLayout linearLayout8 = this.f174326o;
        if (linearLayout8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeSubMenu");
            throw null;
        }
        ((android.widget.LinearLayout) linearLayout8.findViewById(com.p314xaae8f345.mm.R.id.f568234s34)).setOnClickListener(new zo1.c(this));
        android.widget.LinearLayout linearLayout9 = this.f174326o;
        if (linearLayout9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timeSubMenu");
            throw null;
        }
        android.widget.LinearLayout linearLayout10 = (android.widget.LinearLayout) linearLayout9.findViewById(com.p314xaae8f345.mm.R.id.s2v);
        if (!booleanExtra) {
            linearLayout10.setOnClickListener(new zo1.d(this));
            return;
        }
        linearLayout10.setAlpha(0.5f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c95 = this.f174320f;
        if (c12853x6acde7c95 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        c12853x6acde7c95.f174267h = 0L;
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.s2u)).setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        X6();
        V6();
    }
}
