package yd;

/* loaded from: classes7.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f542498a;

    /* renamed from: b, reason: collision with root package name */
    public yd.n f542499b;

    /* renamed from: c, reason: collision with root package name */
    public volatile yd.e f542500c;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad f542503f;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f542501d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f542502e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final yd.t f542504g = new yd.t(null);

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
    
        if (r6 != 3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(yd.q r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.GameInspector"
            if (r6 == 0) goto L53
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r1 == 0) goto Lb
            goto L53
        Lb:
            int r6 = r6.ordinal()
            r1 = 0
            if (r6 == 0) goto L1b
            r2 = 1
            if (r6 == r2) goto L1c
            r2 = 2
            if (r6 == r2) goto L1c
            r2 = 3
            if (r6 == r2) goto L1c
        L1b:
            r2 = r1
        L1c:
            java.lang.String r6 = "wxClient: "
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "level"
            r3.put(r4, r2)     // Catch: org.json.JSONException -> L4a
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L4a
            r2.<init>()     // Catch: org.json.JSONException -> L4a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L4a
            r4.<init>(r6)     // Catch: org.json.JSONException -> L4a
            r4.append(r7)     // Catch: org.json.JSONException -> L4a
            java.lang.String r6 = r4.toString()     // Catch: org.json.JSONException -> L4a
            r2.put(r6)     // Catch: org.json.JSONException -> L4a
            java.lang.String r6 = "logs"
            r3.put(r6, r2)     // Catch: org.json.JSONException -> L4a
            java.lang.String r6 = r3.toString()
            r5.b(r6)
            goto L52
        L4a:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r1 = "hy: vConsole json error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r6, r1, r7)
        L52:
            return
        L53:
            java.lang.String r6 = "hy: not valid console!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.u.a(yd.q, java.lang.String):void");
    }

    public void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameInspector", "hy: on js logged : %s", str);
        synchronized (this.f542502e) {
            if (this.f542501d != 1) {
                ((java.util.LinkedList) this.f542502e).add(str);
            } else {
                if (this.f542500c == null) {
                    return;
                }
                yd.e eVar = this.f542500c;
                eVar.f542472a.post(new yd.p(this, str));
            }
        }
    }
}
