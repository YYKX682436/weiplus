package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes12.dex */
public class q0 implements com.p314xaae8f345.mm.p669x38b6e557.g5 {
    @Override // com.p314xaae8f345.mm.p669x38b6e557.g5
    public void a(android.content.Intent intent) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            mt1.b0 b0Var = mt1.b0.f412724a;
            b0Var.t(null, null);
            java.util.HashSet hashSet = new java.util.HashSet();
            ot1.j n17 = b0Var.n();
            n17.getClass();
            android.database.Cursor f17 = n17.f430382d.f("SELECT username, msgId FROM WxFileIndex3 WHERE msgSubType IN (?,?)", new java.lang.String[]{java.lang.String.valueOf(23), java.lang.String.valueOf(3)}, 0);
            while (f17 != null && f17.moveToNext()) {
                hashSet.add(new m3.d(f17.getString(0), java.lang.Long.valueOf(f17.getLong(1))));
            }
            if (f17 != null) {
                f17.close();
            }
            aw1.l0 l0Var = aw1.l0.f96101a;
            aw1.l0.f96109i.add(new com.p314xaae8f345.mm.p669x38b6e557.r0(this));
            l0Var.k((java.util.Set) hashSet.stream().map(new com.p314xaae8f345.mm.p669x38b6e557.C10420x64ebda2()).collect(java.util.stream.Collectors.toSet()), false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "startCompressOriginalMediaTaskAsync backup done");
        }
    }
}
