package c01;

/* loaded from: classes12.dex */
public class xd extends c01.ee {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r0 != null) goto L33;
     */
    @Override // c01.ee
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r5, com.tencent.mm.pointers.PInt r6) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L9
            java.lang.String r5 = ""
            return r5
        L9:
            java.util.Map r0 = r4.f37169a
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r5)
            m3.d r0 = (m3.d) r0
            r1 = 0
            if (r0 != 0) goto L18
            r0 = r1
            goto L26
        L18:
            java.lang.Object r2 = r0.f323093b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6.value = r2
            java.lang.Object r0 = r0.f323092a
            java.lang.String r0 = (java.lang.String) r0
        L26:
            if (r0 == 0) goto L29
            return r0
        L29:
            java.lang.String r0 = com.tencent.mm.sdk.platformtools.a9.f192463a
            java.util.Set r2 = c01.je.f37271a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r3 = "@"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r2 = com.tencent.mm.sdk.platformtools.n9.f192884a
            com.tencent.mm.sdk.platformtools.o4 r2 = c01.je.g(r2)
            if (r2 == 0) goto L50
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 == 0) goto L51
            goto L59
        L50:
            r0 = r1
        L51:
            org.json.JSONObject r2 = c01.ae.f37062a
            if (r2 == 0) goto L59
            java.lang.String r0 = r2.optString(r5, r1)
        L59:
            if (r0 == 0) goto L6d
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.Map r1 = r4.f37169a
            m3.d r2 = new m3.d
            r2.<init>(r0, r6)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r5, r2)
            return r0
        L6d:
            int r0 = com.tencent.mm.sdk.platformtools.n9.f192884a
            com.tencent.mm.sdk.platformtools.o4 r0 = c01.je.f(r0)
            if (r0 == 0) goto L7c
            java.lang.String r0 = r0.getString(r5, r1)
            if (r0 == 0) goto L7d
            goto L85
        L7c:
            r0 = r1
        L7d:
            org.json.JSONObject r2 = c01.ce.f37094a
            if (r2 == 0) goto L85
            java.lang.String r0 = r2.optString(r5, r1)
        L85:
            if (r0 == 0) goto L9b
            r1 = 1
            r6.value = r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.util.Map r1 = r4.f37169a
            m3.d r2 = new m3.d
            r2.<init>(r0, r6)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r5, r2)
            return r0
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.xd.a(java.lang.String, com.tencent.mm.pointers.PInt):java.lang.String");
    }

    @Override // com.tencent.mm.sdk.platformtools.h9
    public void reload() {
        this.f37169a = new java.util.concurrent.ConcurrentHashMap();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        synchronized (c01.ce.class) {
            if (!c01.ce.f37096c) {
                c01.ce.f37096c = true;
                try {
                    int i17 = !sm.a.c() ? com.tencent.mm.R.raw.domain_mainland : com.tencent.mm.R.raw.domain_oversea;
                    if (c01.ce.f37094a == null || c01.ce.f37095b != i17) {
                        c01.ee.c(context, i17, new c01.be(i17));
                        synchronized (c01.ce.class) {
                            c01.ce.f37096c = false;
                        }
                    } else {
                        synchronized (c01.ce.class) {
                            c01.ce.f37096c = false;
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    synchronized (c01.ce.class) {
                        c01.ce.f37096c = false;
                        throw th6;
                    }
                }
            }
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        synchronized (c01.ae.class) {
            if (c01.ae.f37064c) {
                return;
            }
            c01.ae.f37064c = true;
            try {
                java.lang.String b17 = sm.a.b();
                if (c01.ae.f37062a != null && c01.ae.f37063b.equals(b17)) {
                    synchronized (c01.ae.class) {
                        c01.ae.f37064c = false;
                    }
                } else {
                    c01.ee.b(context2, b17, new c01.zd(b17));
                    synchronized (c01.ae.class) {
                        c01.ae.f37064c = false;
                    }
                }
            } catch (java.lang.Throwable th7) {
                synchronized (c01.ae.class) {
                    c01.ae.f37064c = false;
                    throw th7;
                }
            }
        }
    }
}
