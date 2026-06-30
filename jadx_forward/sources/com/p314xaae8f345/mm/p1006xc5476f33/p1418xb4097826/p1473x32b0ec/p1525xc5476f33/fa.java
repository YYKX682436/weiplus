package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class fa extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f194058p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f194059q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.FrameLayout f194060r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 f194061s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1527x58d9bd6.C14275xc7bd3384 f194062t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f194063u;

    /* renamed from: v, reason: collision with root package name */
    public int f194064v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194058p = "Finder.FinderLiveAudioModePreviewPlugin";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.enq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f194059q = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.env);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f194060r = (android.widget.FrameLayout) findViewById2;
        android.view.View findViewById3 = root.findViewById(com.p314xaae8f345.mm.R.id.enw);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1527x58d9bd6.C14275xc7bd3384) findViewById3).setVisibility(8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "apply(...)");
        this.f194062t = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.p1526x373aa5.p1527x58d9bd6.C14275xc7bd3384) findViewById3;
        this.f194064v = -1;
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        u1(micUserMap.size() > 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        android.view.ViewGroup viewGroup = this.f446856d;
        java.lang.String str = this.f194058p;
        if (ordinal != 191) {
            if (ordinal != 248) {
                return;
            }
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_CO_LIVE_CAMERA_OPEN", true) : true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FINDER_LIVE_CO_LIVE_CAMERA_TOGGLE: open=" + z17);
            t1(z17 ^ true);
            if (this.f194064v == -1) {
                this.f194064v = com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
            }
            zl2.r4.g(zl2.r4.f555483a, this.f194058p, this.f446856d, z17, false, this.f194064v, 8, null);
            return;
        }
        boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
        boolean z19 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
        t1(z18);
        if (z19) {
            K0(4);
        }
        if (z18) {
            if (this.f194064v == -1) {
                this.f194064v = com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
            }
            zl2.r4.g(zl2.r4.f555483a, this.f194058p, this.f446856d, !r5.x1(), false, this.f194064v, 8, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FINDER_LIVE_MODE_SWITCH isAudioMode:" + z18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        this.f194063u = true;
        y1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(boolean z17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.uo1 m76959xd0530b13;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664;
        r45.uo1 m76959xd0530b132;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAudioMode isAudioMode:");
        sb6.append(z17);
        sb6.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
        sb6.append(((mm2.c1) P0(mm2.c1.class)).I4);
        sb6.append(" liveDesc.cover:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
        sb6.append((c19792x256d27252 == null || (m76802x2dd016664 = c19792x256d27252.m76802x2dd01666()) == null || (m76959xd0530b132 = m76802x2dd016664.m76959xd0530b13()) == null) ? null : m76959xd0530b132.m75945x2fec8307(0));
        sb6.append(" media.url:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
        sb6.append((c19792x256d27253 == null || (m76802x2dd016663 = c19792x256d27253.m76802x2dd01666()) == null || (m76962x74cd162e2 = m76802x2dd016663.m76962x74cd162e()) == null || (c19788xd7cfd73e2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e2)) == null) ? null : c19788xd7cfd73e2.m76625xb5887639());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194058p, sb6.toString());
        if (zl2.r4.f555483a.x1()) {
            if (z17) {
                java.lang.String str = (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) P0(mm2.g1.class)).f410608p).mo144003x754a37bb();
                ((mm2.c1) P0(mm2.c1.class)).w7();
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z9(this, str));
            } else {
                K0(4);
            }
        } else if (z17) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
            java.lang.String m75945x2fec8307 = (c19792x256d27254 == null || (m76802x2dd016662 = c19792x256d27254.m76802x2dd01666()) == null || (m76959xd0530b13 = m76802x2dd016662.m76959xd0530b13()) == null) ? null : m76959xd0530b13.m75945x2fec8307(0);
            if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) && ((c19792x256d2725 = ((mm2.c1) P0(mm2.c1.class)).f410379n) == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null || (m75945x2fec8307 = c19788xd7cfd73e.m76625xb5887639()) == null)) {
                m75945x2fec8307 = "";
            }
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                java.lang.String str2 = V0().f390662d.f150075m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                java.lang.String str3 = str2.length() > 0 ? str2 : null;
                if (str3 == null) {
                    str3 = ((mm2.c1) P0(mm2.c1.class)).f410385o;
                }
                ya2.b2 b17 = ((mm2.c1) P0(mm2.c1.class)).Y4 ? ya2.h.f542017a.b(((mm2.c1) P0(mm2.c1.class)).f410385o) : ya2.h.f542017a.b(str3);
                m75945x2fec8307 = b17 != null ? b17.y0() : "";
            }
            ((mm2.c1) P0(mm2.c1.class)).w7();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z9(this, m75945x2fec8307));
        } else {
            K0(4);
        }
        if (!z17) {
            y1();
        }
        xh2.b bVar = ((mm2.y2) P0(mm2.y2.class)).f411098r;
        u1(((bVar == null || (linkedList = bVar.f536063i) == null) ? 0 : linkedList.size()) > 1);
    }

    public final void u1(boolean z17) {
        android.widget.FrameLayout frameLayout = this.f194060r;
        android.widget.ImageView imageView = this.f194059q;
        java.lang.String str = this.f194058p;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkIsNeedForbidMainAudioCover alpha 1");
            x1(imageView, true);
            x1(frameLayout, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkIsNeedForbidMainAudioCover alpha 0");
            x1(imageView, false);
            x1(frameLayout, false);
            x1(this.f194062t, false);
        }
    }

    public final void v1(java.lang.String str) {
        if (r26.i0.y(str, "http", false)) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c a17 = g1Var.e().a(new mn2.j0(str));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ba baVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ba(this);
            a17.getClass();
            a17.f529406d = baVar;
            a17.g(g1Var.h(mn2.f1.G));
            a17.f();
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a18.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l17, a18.f294813g, a18.f294814h);
            }
        }
        java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(a18, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "openRead(...)");
        android.view.ViewGroup viewGroup = this.f446856d;
        android.graphics.Bitmap P = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.P(D, 0.0f, i65.a.B(viewGroup.getContext()), i65.a.k(viewGroup.getContext()), true);
        this.f194059q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(viewGroup.getContext().getResources(), P));
        ((mm2.c1) P0(mm2.c1.class)).I4 = P;
    }

    public final void w1() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f194061s;
        if (c14932xfc4acec9 != null) {
            if (!c14932xfc4acec9.mo58787xc00617a4()) {
                c14932xfc4acec9 = null;
            }
            if (c14932xfc4acec9 != null) {
                c14932xfc4acec9.mo58788x65825f6();
            }
        }
    }

    public final void x1(android.view.View view, boolean z17) {
        float f17 = z17 ? 1.0f : 0.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAudioModePreviewPlugin", "setViewAlpha", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAudioModePreviewPlugin", "setViewAlpha", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public final void y1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194058p, "playerView stopAndReleasePlayerView " + this.f194061s);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec9 = this.f194061s;
        if (c14932xfc4acec9 != null) {
            c14932xfc4acec9.mo58801x360802();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec92 = this.f194061s;
        if (c14932xfc4acec92 != null) {
            c14932xfc4acec92.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.C14932xfc4acec9 c14932xfc4acec93 = this.f194061s;
        if (c14932xfc4acec93 != null) {
            c14932xfc4acec93.b();
        }
        this.f194061s = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        this.f194063u = false;
        if (((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(((ct2.j) P0(ct2.j.class)).P6())) {
            ((mm2.c1) P0(mm2.c1.class)).B1.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ca(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea(this, null), 3, null);
    }
}
