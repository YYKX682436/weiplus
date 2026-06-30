package co1;

/* loaded from: classes12.dex */
public abstract class i {
    public static final void a(bw5.t0 t0Var, java.lang.String mediaId, int i17, java.lang.String mediaPath, bw5.u0 u0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t0Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaPath, "mediaPath");
        boolean z17 = true;
        if (!(mediaPath.length() == 0)) {
            java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(mediaPath, false);
            if (i18 != null && i18.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackupMsgItem", "getExternalPath fail, " + i17 + ", " + mediaPath + ", " + mediaId);
                mediaPath = "";
            } else {
                mediaPath = i18;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mediaPath);
        }
        t0Var.f114736e.add(mediaId);
        t0Var.f114737f.add(java.lang.Integer.valueOf(i17));
        t0Var.f114738g.add(mediaPath);
        if (u0Var != null) {
            u0Var.f115212o.add(mediaId);
        }
        if (u0Var != null) {
            u0Var.f115213p.add(java.lang.Integer.valueOf(i17));
        }
    }

    public static final void b(java.lang.String tag, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, java.lang.Object type, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "talker=" + msg.Q0() + ", createTime=" + msg.mo78012x3fdd41df() + ", fromUser=" + msg.y0() + ", toUser=" + msg.T0() + ", type=" + type + ", mediaPath=" + str);
    }
}
