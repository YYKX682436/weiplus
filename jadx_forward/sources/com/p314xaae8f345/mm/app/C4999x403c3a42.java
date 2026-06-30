package com.p314xaae8f345.mm.app;

/* renamed from: com.tencent.mm.app.MMBugReportContents */
/* loaded from: classes12.dex */
public final class C4999x403c3a42 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f134753a = "java_crash";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f134754b = "native_crash";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f134755c = "anr";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f134756d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.m3 f134757e = new com.p314xaae8f345.mm.app.m3(null, "bug.type", false, false, null, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.m3 f134758f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.s3 f134759g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.o3 f134760h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.t3 f134761i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.l3 f134762j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.q3 f134763k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.p3 f134764l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.r3 f134765m;

    static {
        com.p314xaae8f345.mm.app.m3 m3Var = new com.p314xaae8f345.mm.app.m3(null, "previous", false, false, null, null, null);
        m3Var.e(java.lang.Boolean.FALSE);
        f134758f = m3Var;
        f134759g = new com.p314xaae8f345.mm.app.s3();
        f134760h = new com.p314xaae8f345.mm.app.o3();
        f134761i = new com.p314xaae8f345.mm.app.t3();
        f134762j = new com.p314xaae8f345.mm.app.l3();
        f134763k = new com.p314xaae8f345.mm.app.q3();
        f134764l = new com.p314xaae8f345.mm.app.p3();
        f134765m = new com.p314xaae8f345.mm.app.r3();
    }

    /* renamed from: A_PSEUDO_NATIVE_METHOD_THAT_MAKES_JAVAC_KEEP_ALL_UNUSED_PRIVATE_FIELDS */
    private static native void m42974x7872f57d();

    public static java.lang.String a(boolean z17, boolean z18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        f134757e.b(jSONObject, z17, z18);
        f134758f.b(jSONObject, z17, z18);
        f134759g.b(jSONObject, z17, z18);
        f134760h.b(jSONObject, z17, z18);
        f134761i.b(jSONObject, z17, z18);
        f134762j.b(jSONObject, z17, z18);
        f134763k.b(jSONObject, z17, z18);
        f134764l.b(jSONObject, z17, z18);
        f134765m.b(jSONObject, z17, z18);
        return jSONObject.toString();
    }
}
