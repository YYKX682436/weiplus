package co1;

/* loaded from: classes12.dex */
public abstract class i {
    public static final void a(bw5.t0 t0Var, java.lang.String mediaId, int i17, java.lang.String mediaPath, bw5.u0 u0Var) {
        kotlin.jvm.internal.o.g(t0Var, "<this>");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        boolean z17 = true;
        if (!(mediaPath.length() == 0)) {
            java.lang.String i18 = com.tencent.mm.vfs.w6.i(mediaPath, false);
            if (i18 != null && i18.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackupMsgItem", "getExternalPath fail, " + i17 + ", " + mediaPath + ", " + mediaId);
                mediaPath = "";
            } else {
                mediaPath = i18;
            }
            kotlin.jvm.internal.o.d(mediaPath);
        }
        t0Var.f33203e.add(mediaId);
        t0Var.f33204f.add(java.lang.Integer.valueOf(i17));
        t0Var.f33205g.add(mediaPath);
        if (u0Var != null) {
            u0Var.f33679o.add(mediaId);
        }
        if (u0Var != null) {
            u0Var.f33680p.add(java.lang.Integer.valueOf(i17));
        }
    }

    public static final void b(java.lang.String tag, com.tencent.mm.storage.f9 msg, java.lang.Object type, java.lang.String str) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i(tag, "talker=" + msg.Q0() + ", createTime=" + msg.getCreateTime() + ", fromUser=" + msg.y0() + ", toUser=" + msg.T0() + ", type=" + type + ", mediaPath=" + str);
    }
}
