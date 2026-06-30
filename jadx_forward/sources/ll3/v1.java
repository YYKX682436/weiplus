package ll3;

/* loaded from: classes10.dex */
public final class v1 implements hh4.j {
    @Override // hh4.j
    public void k0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }

    @Override // hh4.j
    public void m6(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ri()) {
            r45.rs4 rs4Var = new r45.rs4();
            try {
                rs4Var.mo11468x92b714fd(info.f66790x225a93cf);
                b21.m.i(b21.u.b(rs4Var.m75939xb282bd08(1), rs4Var.m75945x2fec8307(2), rs4Var.m75945x2fec8307(3), rs4Var.m75945x2fec8307(4), rs4Var.m75945x2fec8307(5), rs4Var.m75945x2fec8307(6), rs4Var.m75945x2fec8307(7), rs4Var.m75945x2fec8307(8), rs4Var.m75945x2fec8307(9), rs4Var.m75945x2fec8307(10), rs4Var.m75945x2fec8307(11), rs4Var.m75945x2fec8307(12), b21.t.a(rs4Var.m75945x2fec8307(8), (r45.xs4) rs4Var.m75936x14adae67(0))));
                r45.bt4 bt4Var = new r45.bt4();
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
                bt4Var.f452570e = uuid;
                bt4Var.f452571f = 86;
                bt4Var.f452569d = 7;
                android.content.Intent intent = new android.content.Intent();
                r45.xs4 xs4Var = (r45.xs4) rs4Var.m75936x14adae67(0);
                intent.putExtra("key_scene", 12);
                intent.putExtra("key_mv_feed_id", xs4Var != null ? xs4Var.m75945x2fec8307(0) : null);
                intent.putExtra("key_mv_nonce_id", xs4Var != null ? xs4Var.m75945x2fec8307(1) : null);
                intent.putExtra("key_mv_cover_url", xs4Var != null ? xs4Var.m75945x2fec8307(2) : null);
                intent.putExtra("key_mv_poster", xs4Var != null ? xs4Var.m75945x2fec8307(3) : null);
                java.lang.String str12 = "";
                if (xs4Var == null || (str = xs4Var.m75945x2fec8307(14)) == null) {
                    str = "";
                }
                intent.putExtra("key_mv_song_name", str);
                if (xs4Var == null || (str2 = xs4Var.m75945x2fec8307(15)) == null) {
                    str2 = "";
                }
                intent.putExtra("key_mv_song_lyric", str2);
                if (xs4Var == null || (str3 = xs4Var.m75945x2fec8307(4)) == null) {
                    str3 = "";
                }
                intent.putExtra("key_mv_singer_name", str3);
                if (xs4Var == null || (str4 = xs4Var.m75945x2fec8307(5)) == null) {
                    str4 = "";
                }
                intent.putExtra("key_mv_album_name", str4);
                if (xs4Var == null || (str5 = xs4Var.m75945x2fec8307(7)) == null) {
                    str5 = "";
                }
                intent.putExtra("key_mv_music_genre", str5);
                if (xs4Var == null || (str6 = java.lang.Long.valueOf(xs4Var.m75942xfb822ef2(8)).toString()) == null) {
                    str6 = "";
                }
                intent.putExtra("key_mv_issue_date", str6);
                if (xs4Var == null || (str7 = xs4Var.m75945x2fec8307(16)) == null) {
                    str7 = "";
                }
                intent.putExtra("key_mv_album_cover_url", str7);
                if (xs4Var == null || (str8 = xs4Var.m75945x2fec8307(9)) == null) {
                    str8 = "";
                }
                intent.putExtra("key_mv_identification", str8);
                if (xs4Var == null || (str9 = xs4Var.m75945x2fec8307(6)) == null) {
                    str9 = "";
                }
                intent.putExtra("key_mv_extra_info", str9);
                intent.putExtra("key_mv_music_duration", xs4Var != null ? xs4Var.m75939xb282bd08(10) : 0);
                if (xs4Var == null || (str10 = xs4Var.m75945x2fec8307(13)) == null) {
                    str10 = "";
                }
                intent.putExtra("key_mv_thumb_path", str10);
                if (xs4Var == null || (str11 = xs4Var.m75945x2fec8307(12)) == null) {
                    str11 = "";
                }
                intent.putExtra("key_mv_music_operation_url", str11);
                if (xs4Var != null && (m75945x2fec8307 = xs4Var.m75945x2fec8307(11)) != null) {
                    str12 = m75945x2fec8307;
                }
                intent.putExtra("key_mv_song_mid", str12);
                intent.putExtra("key_mv_report_data", bt4Var.mo14344x5f01b1f6());
                intent.setFlags(268435456);
                j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "mv", ".ui.MusicMvMainUI", intent, null);
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicPlayerMultiTaskHelper", "MusicMultiTaskData parse failed");
            }
        }
    }

    @Override // hh4.j
    public void p0(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
    }
}
