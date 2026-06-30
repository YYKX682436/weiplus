package e20;

/* loaded from: classes9.dex */
public final class a implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e20.h f327997a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pq.a f327998b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f327999c;

    public a(e20.h hVar, pq.a aVar, bw5.x7 x7Var) {
        this.f327997a = hVar;
        this.f327998b = aVar;
        this.f327999c = x7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:5:0x001c, B:7:0x0027, B:9:0x0031, B:12:0x0038, B:14:0x003e, B:19:0x004a, B:21:0x005a, B:23:0x0062, B:25:0x0072, B:27:0x0078, B:28:0x0096, B:30:0x00a0, B:33:0x008d), top: B:4:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:5:0x001c, B:7:0x0027, B:9:0x0031, B:12:0x0038, B:14:0x003e, B:19:0x004a, B:21:0x005a, B:23:0x0062, B:25:0x0072, B:27:0x0078, B:28:0x0096, B:30:0x00a0, B:33:0x008d), top: B:4:0x001c }] */
    @Override // android.webkit.ValueCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceiveValue(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r0 = "data"
            e20.h r1 = r10.f327997a
            java.lang.String r2 = "type"
            java.lang.String r3 = "ecsNextAction"
            java.lang.String r4 = "ECS_O.Router.Wxa"
            java.lang.String r5 = "execute ecsNextAction, data isNull: "
            java.lang.String r6 = "execute ecsNextAction failed, unknown type: "
            java.lang.String r7 = "execute ecsNextAction failed, type isNullOrEmpty: "
            int r8 = r11.length()
            if (r8 != 0) goto L1b
            goto Lb0
        L1b:
            r8 = 0
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: java.lang.Exception -> La8
            r9.<init>(r11)     // Catch: java.lang.Exception -> La8
            boolean r11 = r9.has(r3)     // Catch: java.lang.Exception -> La8
            if (r11 == 0) goto Lb0
            org.json.JSONObject r11 = r9.getJSONObject(r3)     // Catch: java.lang.Exception -> La8
            boolean r3 = r11.isNull(r2)     // Catch: java.lang.Exception -> La8
            if (r3 == 0) goto L38
            java.lang.String r11 = "execute ecsNextAction failed, invalid type"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r11)     // Catch: java.lang.Exception -> La8
            goto Lb0
        L38:
            java.lang.String r2 = r11.getString(r2)     // Catch: java.lang.Exception -> La8
            if (r2 == 0) goto L47
            int r3 = r2.length()     // Catch: java.lang.Exception -> La8
            if (r3 != 0) goto L45
            goto L47
        L45:
            r3 = r8
            goto L48
        L47:
            r3 = 1
        L48:
            if (r3 == 0) goto L5a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La8
            r11.<init>(r7)     // Catch: java.lang.Exception -> La8
            r11.append(r2)     // Catch: java.lang.Exception -> La8
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> La8
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r11)     // Catch: java.lang.Exception -> La8
            goto Lb0
        L5a:
            java.util.concurrent.ConcurrentHashMap r3 = r1.f328014c     // Catch: java.lang.Exception -> La8
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Exception -> La8
            if (r3 != 0) goto L72
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La8
            r11.<init>(r6)     // Catch: java.lang.Exception -> La8
            r11.append(r2)     // Catch: java.lang.Exception -> La8
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> La8
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r11)     // Catch: java.lang.Exception -> La8
            goto Lb0
        L72:
            boolean r3 = r11.isNull(r0)     // Catch: java.lang.Exception -> La8
            if (r3 == 0) goto L8d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La8
            r11.<init>(r5)     // Catch: java.lang.Exception -> La8
            r11.append(r2)     // Catch: java.lang.Exception -> La8
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> La8
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r11)     // Catch: java.lang.Exception -> La8
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> La8
            r11.<init>()     // Catch: java.lang.Exception -> La8
            goto L96
        L8d:
            org.json.JSONObject r11 = r11.getJSONObject(r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r0 = "getJSONObject(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r11, r0)     // Catch: java.lang.Exception -> La8
        L96:
            java.util.concurrent.ConcurrentHashMap r0 = r1.f328014c     // Catch: java.lang.Exception -> La8
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> La8
            f20.a r0 = (f20.a) r0     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto Lb0
            pq.a r1 = r10.f327998b     // Catch: java.lang.Exception -> La8
            bw5.x7 r2 = r10.f327999c     // Catch: java.lang.Exception -> La8
            r0.a(r1, r11, r2)     // Catch: java.lang.Exception -> La8
            goto Lb0
        La8:
            r11 = move-exception
            java.lang.String r0 = "fakeNativeResultReceiver value parse error"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r11, r0, r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e20.a.onReceiveValue(java.lang.Object):void");
    }
}
