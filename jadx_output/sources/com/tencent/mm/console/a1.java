package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class a1 implements java.lang.Runnable {
    public a1(com.tencent.mm.console.b1 b1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.vfs.NativeFileSystem nativeFileSystem = new com.tencent.mm.vfs.NativeFileSystem("${sdTo}/MicroMsg/${accountSd}/video");
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.q2[] q2VarArr = {nativeFileSystem.b(b3Var.c()), ((com.tencent.mm.vfs.r5) b3Var.a()).b("video")};
        for (int i17 = 0; i17 < 2; i17++) {
            com.tencent.mm.vfs.q2 q2Var = q2VarArr[i17];
            java.lang.Iterable<com.tencent.mm.vfs.x1> o17 = com.tencent.mm.vfs.e8.o(q2Var, "");
            if (o17 == null) {
                o17 = java.util.Collections.emptyList();
            }
            for (com.tencent.mm.vfs.x1 x1Var : o17) {
                java.lang.String q17 = com.tencent.mm.vfs.w6.q(x1Var.f213232b);
                if (q17.endsWith(ya.b.ORIGIN)) {
                    java.lang.String substring = q17.substring(0, q17.length() - 6);
                    java.lang.String str = x1Var.f213232b;
                    com.tencent.mm.vfs.x1 m17 = q2Var.m(substring + str.substring(str.lastIndexOf(".")));
                    ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                    t21.v2 h17 = t21.d3.h(q17);
                    if (m17 != null && h17 != null && h17.i() && m17.b(true)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "cleanOriginCompressVideo, relPath = " + m17.f213231a + ", diskSpace = " + m17.f213234d);
                        android.database.Cursor Ai = ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).Ai(substring, new java.lang.String[]{"msglocalid", "msg_talker"});
                        if (Ai != null) {
                            Ai.moveToFirst();
                            long j17 = Ai.getLong(0);
                            int columnIndex = Ai.getColumnIndex("msg_talker");
                            java.lang.String string = columnIndex >= 0 ? Ai.getString(columnIndex) : null;
                            if (string == null) {
                                string = "talker-ignore";
                            }
                            mt1.b0.f331191a.r(j17, string);
                            Ai.close();
                        }
                    }
                }
            }
        }
    }
}
