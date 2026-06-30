package ue2;

/* loaded from: classes3.dex */
public final class x extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f508399p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f508400q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f508399p = "Finder.FinderLiveAudioModePreviewPlugin";
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.enq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f508400q = (android.widget.ImageView) findViewById;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e2;
        r45.uo1 m76959xd0530b13;
        r45.uo1 m76959xd0530b132;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.uo1 m76959xd0530b133;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        super.M0(status, bundle);
        if (ue2.r.f508385a[status.ordinal()] == 1) {
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", false) : false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAudioMode isAudioMode:");
            sb6.append(z17);
            sb6.append(" business(LiveCommonSlice::class.java).audioModeHolderBm:");
            sb6.append(((mm2.c1) P0(mm2.c1.class)).I4);
            sb6.append(" liveDesc.cover:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
            sb6.append((c19792x256d2725 == null || (m76802x2dd016662 = c19792x256d2725.m76802x2dd01666()) == null || (m76959xd0530b133 = m76802x2dd016662.m76959xd0530b13()) == null) ? null : m76959xd0530b133.m75945x2fec8307(0));
            sb6.append(" media.url:");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) P0(mm2.c1.class)).f410379n;
            sb6.append((c19792x256d27252 == null || (m76802x2dd01666 = c19792x256d27252.m76802x2dd01666()) == null || (m76962x74cd162e3 = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e3)) == null) ? null : c19788xd7cfd73e3.m76625xb5887639());
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = this.f508399p;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
            mm2.c1 c1Var = (mm2.c1) P0(mm2.c1.class);
            mm2.g1 g1Var = (mm2.g1) P0(mm2.g1.class);
            if (zl2.r4.f555483a.x1()) {
                if (z17) {
                    java.lang.String str2 = (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) g1Var.f410608p).mo144003x754a37bb();
                    c1Var.w7();
                    pm0.v.X(new ue2.u(this, str2));
                } else {
                    K0(4);
                }
            } else if (z17) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = c1Var.f410379n;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = c19792x256d27253 != null ? c19792x256d27253.m76802x2dd01666() : null;
                java.lang.String m75945x2fec8307 = (m76802x2dd016663 == null || (m76959xd0530b132 = m76802x2dd016663.m76959xd0530b13()) == null) ? null : m76959xd0530b132.m75945x2fec8307(0);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    java.lang.String m76625xb5887639 = (m76802x2dd016663 == null || (m76962x74cd162e2 = m76802x2dd016663.m76962x74cd162e()) == null || (c19788xd7cfd73e2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e2)) == null) ? null : c19788xd7cfd73e2.m76625xb5887639();
                    if (m76625xb5887639 == null || m76625xb5887639.length() == 0) {
                        java.lang.String str3 = V0().f390662d.f150075m;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                        r5 = str3.length() > 0 ? str3 : null;
                        if (r5 == null) {
                            r5 = c1Var.f410385o;
                        }
                        ya2.b2 b17 = c1Var.Y4 ? ya2.h.f542017a.b(c1Var.f410385o) : ya2.h.f542017a.b(r5);
                        r5 = b17 != null ? b17.y0() : "";
                    } else {
                        if (m76802x2dd016663 != null && (m76962x74cd162e = m76802x2dd016663.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
                            r5 = c19788xd7cfd73e.m76625xb5887639();
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5);
                    }
                } else {
                    if (m76802x2dd016663 != null && (m76959xd0530b13 = m76802x2dd016663.m76959xd0530b13()) != null) {
                        r5 = m76959xd0530b13.m75945x2fec8307(0);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5);
                }
                c1Var.w7();
                pm0.v.X(new ue2.u(this, r5));
            } else {
                K0(4);
            }
            if (z18) {
                K0(4);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "FINDER_LIVE_MODE_SWITCH isAudioMode:" + z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(this, null, null, new ue2.w((mm2.g1) P0(mm2.g1.class), (mm2.c1) P0(mm2.c1.class), this, null), 3, null);
    }
}
