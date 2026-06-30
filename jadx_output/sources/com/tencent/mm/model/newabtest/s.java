package com.tencent.mm.model.newabtest;

@j95.b
/* loaded from: classes8.dex */
public final class s extends i95.w {

    /* renamed from: e, reason: collision with root package name */
    public static final l75.q0 f70404e = new com.tencent.mm.model.newabtest.o();

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f70405d = jz5.h.b(com.tencent.mm.model.newabtest.q.f70403d);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037 A[Catch: all -> 0x005c, TryCatch #0 {all -> 0x005c, blocks: (B:6:0x0013, B:11:0x001e, B:13:0x0023, B:14:0x0026, B:16:0x002a, B:22:0x0052, B:28:0x0037, B:33:0x003c), top: B:5:0x0013, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ai(com.tencent.mm.storage.e r8) {
        /*
            r7 = this;
            java.lang.String r0 = "storage"
            kotlin.jvm.internal.o.g(r8, r0)
            com.tencent.mm.sdk.platformtools.o4 r0 = r7.wi()
            r0.clear()
            android.database.Cursor r8 = r8.getAll()
            if (r8 == 0) goto L63
            boolean r1 = r8.moveToFirst()     // Catch: java.lang.Throwable -> L5c
            r2 = 0
            if (r1 != 0) goto L1e
            vz5.b.a(r8, r2)
            return
        L1e:
            com.tencent.mm.storage.c r1 = new com.tencent.mm.storage.c     // Catch: java.lang.Throwable -> L5c
            r1.<init>()     // Catch: java.lang.Throwable -> L5c
        L23:
            r1.convertFrom(r8)     // Catch: com.tencent.wcdb.database.SQLiteException -> L3b java.lang.Throwable -> L5c
            java.lang.String r3 = r1.field_layerId     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L33
            int r3 = r3.length()     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L31
            goto L33
        L31:
            r3 = 0
            goto L34
        L33:
            r3 = 1
        L34:
            if (r3 == 0) goto L37
            goto L52
        L37:
            r7.Bi(r1, r0)     // Catch: java.lang.Throwable -> L5c
            goto L52
        L3b:
            r3 = move-exception
            java.lang.String r4 = "MicroMsg.PluginABTest.NewABTestMMKV"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r5.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = "resetAllExp, convertFrom cursor get exception:"
            r5.append(r6)     // Catch: java.lang.Throwable -> L5c
            r5.append(r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L5c
            com.tencent.mars.xlog.Log.e(r4, r3)     // Catch: java.lang.Throwable -> L5c
        L52:
            boolean r3 = r8.moveToNext()     // Catch: java.lang.Throwable -> L5c
            if (r3 != 0) goto L23
            vz5.b.a(r8, r2)
            goto L63
        L5c:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L5e
        L5e:
            r1 = move-exception
            vz5.b.a(r8, r0)
            throw r1
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.model.newabtest.s.Ai(com.tencent.mm.storage.e):void");
    }

    public final void Bi(com.tencent.mm.storage.c cVar, com.tencent.mm.sdk.platformtools.o4 o4Var) {
        java.lang.String str = "layer_" + cVar.field_layerId;
        o4Var.putString(str + "_rawXML", cVar.field_rawXML);
        o4Var.putLong(str + "_startTime", cVar.field_startTime);
        o4Var.putLong(str + "_endTime", cVar.field_endTime);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAccountInitialized uin[");
        java.lang.String vVar = new kk.v(gm0.j1.b().h()).toString();
        kotlin.jvm.internal.o.f(vVar, "toString(...)");
        sb6.append(vVar);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginABTest.NewABTestMMKV", sb6.toString());
        com.tencent.mm.storage.e Ai = com.tencent.mm.model.newabtest.z.Ai();
        kotlin.jvm.internal.o.f(Ai, "getABTestStorage(...)");
        Ai(Ai);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final com.tencent.mm.sdk.platformtools.o4 wi() {
        java.lang.String vVar = new kk.v(((com.tencent.mm.model.newabtest.r) ((jz5.n) this.f70405d).getValue()).a()).toString();
        kotlin.jvm.internal.o.f(vVar, "toString(...)");
        return com.tencent.mm.sdk.platformtools.o4.M(vVar.concat("_PluginABTest_NewABTestMMKV"));
    }
}
