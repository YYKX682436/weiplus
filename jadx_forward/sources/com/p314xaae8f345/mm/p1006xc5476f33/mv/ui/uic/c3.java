package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class c3 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public dm.i8 f232607d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hf2 f232608e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f232609f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f232610g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.ss4 f232611h;

    /* renamed from: i, reason: collision with root package name */
    public int f232612i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f232613m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f232608e = new r45.hf2();
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0();
        this.f232609f = j0Var;
        this.f232610g = j0Var;
        this.f232611h = new r45.ss4();
        this.f232612i = 3;
        this.f232613m = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z2.f233095d);
    }

    public final p012xc85e97e9.p093xedfae76a.j0 O6() {
        return (p012xc85e97e9.p093xedfae76a.j0) ((jz5.n) this.f232613m).mo141623x754a37bb();
    }

    public final boolean P6() {
        java.lang.Integer num = (java.lang.Integer) O6().mo3195x754a37bb();
        return num != null && num.intValue() == 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        r45.ef2 m76971x25b90ced;
        r45.hf2 hf2Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662;
        r45.ef2 m76971x25b90ced2;
        r45.hf2 hf2Var2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663;
        r45.ef2 m76971x25b90ced3;
        r45.hf2 hf2Var3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664;
        r45.ef2 m76971x25b90ced4;
        r45.hf2 hf2Var4;
        dm.i8 Ai = ((ja0.m0) ((ka0.q0) i95.n0.c(ka0.q0.class))).Ai(m158354x19263085());
        this.f232607d = Ai;
        if (Ai != null) {
            r45.hf2 songInfo = this.f232608e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
            songInfo.set(0, Ai.f67001x79435ae5);
            songInfo.set(1, Ai.f67002x3ed1b556);
            songInfo.set(4, Ai.f67006x45670355);
            songInfo.set(3, Ai.f66974x28d45f97);
            songInfo.set(2, Ai.f67008x6e8dd380);
            songInfo.set(8, Ai.f66995x4a6948ee);
            songInfo.set(6, Ai.f66997xaf16cf45);
            songInfo.set(5, "");
        }
        byte[] byteArrayExtra = m158359x1e885992().getByteArrayExtra("key_track_data");
        r45.ss4 ss4Var = this.f232611h;
        if (byteArrayExtra != null) {
            ss4Var.mo11468x92b714fd(byteArrayExtra);
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0);
        if (c19792x256d2725 != null && (m76802x2dd016664 = c19792x256d2725.m76802x2dd01666()) != null && (m76971x25b90ced4 = m76802x2dd016664.m76971x25b90ced()) != null && (hf2Var4 = (r45.hf2) m76971x25b90ced4.m75936x14adae67(1)) != null) {
            this.f232608e = hf2Var4;
        }
        dm.i8 i8Var = this.f232607d;
        if (i8Var != null) {
            java.lang.String str = i8Var.f66995x4a6948ee;
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0);
                i8Var.f66995x4a6948ee = (c19792x256d27252 == null || (m76802x2dd016663 = c19792x256d27252.m76802x2dd01666()) == null || (m76971x25b90ced3 = m76802x2dd016663.m76971x25b90ced()) == null || (hf2Var3 = (r45.hf2) m76971x25b90ced3.m75936x14adae67(1)) == null) ? null : hf2Var3.m75945x2fec8307(8);
            }
            java.lang.String str2 = i8Var.f66997xaf16cf45;
            if (str2 == null || str2.length() == 0) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0);
                i8Var.f66997xaf16cf45 = (c19792x256d27253 == null || (m76802x2dd016662 = c19792x256d27253.m76802x2dd01666()) == null || (m76971x25b90ced2 = m76802x2dd016662.m76971x25b90ced()) == null || (hf2Var2 = (r45.hf2) m76971x25b90ced2.m75936x14adae67(1)) == null) ? null : hf2Var2.m75945x2fec8307(6);
            }
        }
        this.f232612i = m158359x1e885992().getIntExtra("key_mv_enter_maker_ui_from_scene", 3);
        if (ss4Var.m75939xb282bd08(6) <= 0) {
            ((ja0.o0) ((ka0.r0) i95.n0.c(ka0.r0.class))).getClass();
            int i17 = ll3.j2.f400718a;
            ss4Var.set(6, 8192);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27254 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ss4Var.m75936x14adae67(0);
            if (c19792x256d27254 != null && (m76802x2dd01666 = c19792x256d27254.m76802x2dd01666()) != null && (m76971x25b90ced = m76802x2dd01666.m76971x25b90ced()) != null && (hf2Var = (r45.hf2) m76971x25b90ced.m75936x14adae67(1)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerDataUIC", "syncBeatTrack duration:" + hf2Var.m75939xb282bd08(14));
                r45.sr4 sr4Var = new r45.sr4();
                sr4Var.f467472d = hf2Var.m75945x2fec8307(5);
                sr4Var.f467473e = hf2Var.m75945x2fec8307(0);
                sr4Var.f467474f = hf2Var.m75945x2fec8307(1);
                sr4Var.f467476h = hf2Var.m75945x2fec8307(2);
                sr4Var.f467475g = hf2Var.m75945x2fec8307(4);
                sr4Var.f467477i = hf2Var.m75939xb282bd08(14);
                sr4Var.f467478m = hf2Var;
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j a17 = o01.d.f423424a.a(hm3.j.f363783r.a(sr4Var));
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.a(activity).a(um3.b.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                v65.i.b(((um3.b) a18).O6(), null, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b3(a17, this, null), 1, null);
            }
        }
        this.f232609f.mo7808x76db6cb1(ss4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var.W(p2Var.i(m80379x76847179(), 10, ss4Var.m75942xfb822ef2(4) != 0));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 != null) {
            c19783xd9a946b7.m76378x4897f639(2);
        }
        long m75942xfb822ef2 = ss4Var.m75942xfb822ef2(4);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b72 != null) {
            c19783xd9a946b72.m76376x233d27da((int) m75942xfb822ef2);
        }
    }
}
