package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class a1 implements java.lang.Runnable {
    public a1(com.p314xaae8f345.mm.p669x38b6e557.b1 b1Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.vfs.C22758x1f6ac662 c22758x1f6ac662 = new com.p314xaae8f345.mm.vfs.C22758x1f6ac662("${sdTo}/MicroMsg/${accountSd}/video");
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.q2[] q2VarArr = {c22758x1f6ac662.b(b3Var.c()), ((com.p314xaae8f345.mm.vfs.r5) b3Var.a()).b("video")};
        for (int i17 = 0; i17 < 2; i17++) {
            com.p314xaae8f345.mm.vfs.q2 q2Var = q2VarArr[i17];
            java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> o17 = com.p314xaae8f345.mm.vfs.e8.o(q2Var, "");
            if (o17 == null) {
                o17 = java.util.Collections.emptyList();
            }
            for (com.p314xaae8f345.mm.vfs.x1 x1Var : o17) {
                java.lang.String q17 = com.p314xaae8f345.mm.vfs.w6.q(x1Var.f294765b);
                if (q17.endsWith(ya.b.f77495x8b74a326)) {
                    java.lang.String substring = q17.substring(0, q17.length() - 6);
                    java.lang.String str = x1Var.f294765b;
                    com.p314xaae8f345.mm.vfs.x1 m17 = q2Var.m(substring + str.substring(str.lastIndexOf(".")));
                    ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                    t21.v2 h17 = t21.d3.h(q17);
                    if (m17 != null && h17 != null && h17.i() && m17.b(true)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "cleanOriginCompressVideo, relPath = " + m17.f294764a + ", diskSpace = " + m17.f294767d);
                        android.database.Cursor Ai = ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).Ai(substring, new java.lang.String[]{"msglocalid", "msg_talker"});
                        if (Ai != null) {
                            Ai.moveToFirst();
                            long j17 = Ai.getLong(0);
                            int columnIndex = Ai.getColumnIndex("msg_talker");
                            java.lang.String string = columnIndex >= 0 ? Ai.getString(columnIndex) : null;
                            if (string == null) {
                                string = "talker-ignore";
                            }
                            mt1.b0.f412724a.r(j17, string);
                            Ai.close();
                        }
                    }
                }
            }
        }
    }
}
