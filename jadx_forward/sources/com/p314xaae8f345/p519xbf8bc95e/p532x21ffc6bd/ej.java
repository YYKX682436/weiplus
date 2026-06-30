package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ej extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48 {

    /* renamed from: a, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "layerid")
    public java.lang.String f130814a;

    /* renamed from: b, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "type")
    public int f130815b;

    /* renamed from: c, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "local_data_ver")
    public int f130816c;

    /* renamed from: d, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "local_cfg_ver")
    public int f130817d;

    /* renamed from: e, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35884xb90bfdd2 = true)
    public java.lang.String f130818e;

    /* renamed from: f, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "data_ver")
    private java.lang.String f130819f;

    /* renamed from: g, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "cfg_ver")
    private java.lang.String f130820g;

    /* renamed from: h, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "params")
    private java.lang.String[] f130821h;

    /* renamed from: i, reason: collision with root package name */
    @com.p314xaae8f345.map.p511x696c9db.p512x31ece8.p513xa34feb2f.InterfaceC4321x236108(m35885x337a8b = "url")
    private java.lang.String f130822i;

    private void a(int i17) {
        if (i17 != this.f130816c) {
            this.f130818e = null;
        }
        this.f130816c = i17;
    }

    private java.lang.String b() {
        return this.f130814a;
    }

    private java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f130816c);
        return sb6.toString();
    }

    private java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f130817d);
        return sb6.toString();
    }

    private boolean e() {
        java.lang.String str = this.f130819f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f130816c);
        if (!str.equals(sb6.toString())) {
            return true;
        }
        java.lang.String str2 = this.f130820g;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(this.f130817d);
        return !str2.equals(sb7.toString());
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef f() {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ef.a(this.f130815b);
    }

    /* renamed from: toString */
    public final java.lang.String m36708x9616526c() {
        return "DataLayer{layerId='" + this.f130814a + "', layerType='" + this.f130815b + "', remoteDataVersion='" + this.f130819f + "', dataVersion=" + this.f130816c + ", remoteStyleVersion='" + this.f130820g + "', styleVersion=" + this.f130817d + ", params=" + java.util.Arrays.toString(this.f130821h) + ", dataUrl='" + this.f130822i + "', decodeDataUrl='" + this.f130818e + "'}";
    }

    private void b(int i17) {
        if (i17 != this.f130817d) {
            this.f130818e = null;
        }
        this.f130817d = i17;
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
            java.lang.String r0 = r8.f130819f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.f130816c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L30
            java.lang.String r0 = r8.f130820g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r3 = r8.f130817d
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
            int r2 = r8.f130817d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.f130820g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r8.f130816c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.f130819f = r0
            r0 = 0
            r8.f130818e = r0
        L56:
            java.lang.String[] r0 = r8.f130821h
            if (r0 == 0) goto L99
            java.lang.String r0 = r8.f130818e
            if (r0 != 0) goto L99
            java.lang.String r0 = r8.f130822i
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L99
            java.lang.String r0 = r8.f130822i
            r8.f130818e = r0
            java.lang.String[] r0 = r8.f130821h
            int r2 = r0.length
        L6d:
            if (r1 >= r2) goto L99
            r3 = r0[r1]
            java.lang.Object r4 = r8.m35864x4934e577(r3)     // Catch: java.lang.IllegalAccessException -> L96
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.IllegalAccessException -> L96
            if (r5 == 0) goto L96
            java.lang.String r5 = r8.f130818e     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r7 = "\\{"
            r6.<init>(r7)     // Catch: java.lang.IllegalAccessException -> L96
            r6.append(r3)     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r3 = "\\}"
            r6.append(r3)     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r3 = r6.toString()     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.IllegalAccessException -> L96
            java.lang.String r3 = r5.replaceAll(r3, r4)     // Catch: java.lang.IllegalAccessException -> L96
            r8.f130818e = r3     // Catch: java.lang.IllegalAccessException -> L96
        L96:
            int r1 = r1 + 1
            goto L6d
        L99:
            java.lang.String r0 = r8.f130818e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ej.a():java.lang.String");
    }
}
