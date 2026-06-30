package com.tencent.mm.console;

/* loaded from: classes12.dex */
public class q0 implements com.tencent.mm.console.g5 {
    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            mt1.b0 b0Var = mt1.b0.f331191a;
            b0Var.t(null, null);
            java.util.HashSet hashSet = new java.util.HashSet();
            ot1.j n17 = b0Var.n();
            n17.getClass();
            android.database.Cursor f17 = n17.f348849d.f("SELECT username, msgId FROM WxFileIndex3 WHERE msgSubType IN (?,?)", new java.lang.String[]{java.lang.String.valueOf(23), java.lang.String.valueOf(3)}, 0);
            while (f17 != null && f17.moveToNext()) {
                hashSet.add(new m3.d(f17.getString(0), java.lang.Long.valueOf(f17.getLong(1))));
            }
            if (f17 != null) {
                f17.close();
            }
            aw1.l0 l0Var = aw1.l0.f14568a;
            aw1.l0.f14576i.add(new com.tencent.mm.console.r0(this));
            l0Var.k((java.util.Set) hashSet.stream().map(new com.tencent.mm.console.q0$$a()).collect(java.util.stream.Collectors.toSet()), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "startCompressOriginalMediaTaskAsync backup done");
        }
    }
}
