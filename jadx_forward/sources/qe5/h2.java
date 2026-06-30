package qe5;

/* loaded from: classes12.dex */
public final class h2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f443654d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gp0 f443655e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void T6(boolean z17) {
        boolean Y6;
        long longExtra = m158359x1e885992().getLongExtra("message_id", -1L);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("message_talker");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(stringExtra, longExtra);
        this.f443654d = java.lang.String.valueOf(m158359x1e885992().getStringExtra("record_data_id"));
        r45.gp0 n18 = bt3.g2.n(m158359x1e885992().getStringExtra("record_xml"), this.f443654d);
        this.f443655e = n18;
        if (n18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.RecordFileDataUIC", "initData: dataItem is null");
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new kd5.f(false));
                return;
            }
            return;
        }
        j75.f Q62 = Q6();
        kd5.e eVar = Q62 != null ? (kd5.e) Q62.mo140437x75286adb() : null;
        if (eVar != null) {
            eVar.f388410e = n17;
            eVar.f388412g = longExtra;
            eVar.f388413h = stringExtra;
            java.lang.String str = n18.K;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getDatafmt(...)");
            eVar.f388426x = str;
            java.lang.String t17 = bt3.g2.t(this.f443655e, n17.Q0(), n17.m124847x74d37ac6(), 1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "getDataPath(...)");
            eVar.F = t17;
            eVar.f388424v = bt3.g2.y(n18.T, stringExtra, longExtra, true);
            java.lang.String str2 = n18.f456937d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getTitle(...)");
            eVar.f388425w = str2;
            eVar.f388427y = n18.R;
            java.lang.String str3 = n18.M;
            if (str3 == null) {
                str3 = "";
            }
            eVar.f388428z = str3;
            eVar.f388423u = n18.I;
            eVar.D = n18.f456971u;
            eVar.B = n18.f456967s;
            eVar.C = n18.f456944g2;
            eVar.f388414i = ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).qj(n17);
            eVar.G = bt3.g2.K(this.f443655e, stringExtra, longExtra);
            eVar.f388417o = true;
            m158359x1e885992().getStringExtra("record_xml");
            eVar.f388418p = this.f443654d;
        }
        if (z17) {
            j75.f Q63 = Q6();
            kd5.e eVar2 = Q63 != null ? (kd5.e) Q63.mo140437x75286adb() : null;
            if (eVar2 != null && eVar2.G) {
                j75.f Q64 = Q6();
                kd5.e eVar3 = Q64 != null ? (kd5.e) Q64.mo140437x75286adb() : null;
                if (eVar3 != null && eVar3.N) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDataUIC", "tryOpenFile: file is uploading");
                    Y6 = true;
                } else {
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    Y6 = ((qe5.h) pf5.z.f435481a.a(activity).a(qe5.h.class)).Y6();
                }
                if (!Y6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDataUIC", "initData: open file succeed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
                    if (P6 != null) {
                        P6.finish();
                    }
                    j75.f Q65 = Q6();
                    if (Q65 != null) {
                        Q65.B3(new kd5.f(false));
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.RecordFileDataUIC", "initData: open file failed");
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21859x7e56223.class)).W6()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = P6();
                    if (P62 != null) {
                        P62.finish();
                        return;
                    }
                    return;
                }
            }
        }
        j75.f Q66 = Q6();
        if (Q66 != null) {
            Q66.B3(new kd5.f(true));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new qe5.g2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        T6(true);
    }
}
