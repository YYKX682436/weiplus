package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ej extends com.tencent.map.tools.json.JsonComposer {

    /* renamed from: a, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "layerid")
    public java.lang.String f49281a;

    /* renamed from: b, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "type")
    public int f49282b;

    /* renamed from: c, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "local_data_ver")
    public int f49283c;

    /* renamed from: d, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "local_cfg_ver")
    public int f49284d;

    /* renamed from: e, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(ignore = true)
    public java.lang.String f49285e;

    /* renamed from: f, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "data_ver")
    private java.lang.String f49286f;

    /* renamed from: g, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "cfg_ver")
    private java.lang.String f49287g;

    /* renamed from: h, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "params")
    private java.lang.String[] f49288h;

    /* renamed from: i, reason: collision with root package name */
    @com.tencent.map.tools.json.annotation.Json(name = "url")
    private java.lang.String f49289i;

    private void a(int i17) {
        if (i17 != this.f49283c) {
            this.f49285e = null;
        }
        this.f49283c = i17;
    }

    private java.lang.String b() {
        return this.f49281a;
    }

    private java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f49283c);
        return sb6.toString();
    }

    private java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f49284d);
        return sb6.toString();
    }

    private boolean e() {
        java.lang.String str = this.f49286f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f49283c);
        if (!str.equals(sb6.toString())) {
            return true;
        }
        java.lang.String str2 = this.f49287g;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(this.f49284d);
        return !str2.equals(sb7.toString());
    }

    private com.tencent.mapsdk.internal.ef f() {
        return com.tencent.mapsdk.internal.ef.a(this.f49282b);
    }

    public final java.lang.String toString() {
        return "DataLayer{layerId='" + this.f49281a + "', layerType='" + this.f49282b + "', remoteDataVersion='" + this.f49286f + "', dataVersion=" + this.f49283c + ", remoteStyleVersion='" + this.f49287g + "', styleVersion=" + this.f49284d + ", params=" + java.util.Arrays.toString(this.f49288h) + ", dataUrl='" + this.f49289i + "', decodeDataUrl='" + this.f49285e + "'}";
    }

    private void b(int i17) {
        if (i17 != this.f49284d) {
            this.f49285e = null;
        }
        this.f49284d = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            r8 = this;
            java.lang.String r0 = r8.f49286f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.f49283c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L30
            java.lang.String r0 = r8.f49287g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r8.f49284d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2e
            goto L30
        L2e:
            r0 = r1
            goto L31
        L30:
            r0 = 1
        L31:
            if (r0 == 0) goto L56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r8.f49284d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.f49287g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r8.f49283c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.f49286f = r0
            r0 = 0
            r8.f49285e = r0
        L56:
            java.lang.String[] r0 = r8.f49288h
            if (r0 == 0) goto L99
            java.lang.String r0 = r8.f49285e
            if (r0 != 0) goto L99
            java.lang.String r0 = r8.f49289i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L99
            java.lang.String r0 = r8.f49289i
            r8.f49285e = r0
            java.lang.String[] r0 = r8.f49288h
            int r2 = r0.length
        L6d:
            if (r1 >= r2) goto L99
            r3 = r0[r1]
            java.lang.Object r4 = r8.getFieldValueByJsonName(r3)     // Catch: java.lang.IllegalAccessException -> L96
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.IllegalAccessException -> L96
            if (r5 == 0) goto L96
            java.lang.String r5 = r8.f49285e     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r7 = "\\{"
            r6.<init>(r7)     // Catch: java.lang.IllegalAccessException -> L96
            r6.append(r3)     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r3 = "\\}"
            r6.append(r3)     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r3 = r6.toString()     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r3 = r5.replaceAll(r3, r4)     // Catch: java.lang.IllegalAccessException -> L96
            r8.f49285e = r3     // Catch: java.lang.IllegalAccessException -> L96
        L96:
            int r1 = r1 + 1
            goto L6d
        L99:
            java.lang.String r0 = r8.f49285e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.ej.a():java.lang.String");
    }
}
