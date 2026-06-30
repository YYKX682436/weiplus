package com.tencent.mm.app;

/* loaded from: classes12.dex */
public final class MMBugReportContents {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f53220a = "java_crash";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f53221b = "native_crash";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f53222c = "anr";

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f53223d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.app.m3 f53224e = new com.tencent.mm.app.m3(null, "bug.type", false, false, null, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.app.m3 f53225f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.app.s3 f53226g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.app.o3 f53227h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.app.t3 f53228i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.app.l3 f53229j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.mm.app.q3 f53230k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mm.app.p3 f53231l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.app.r3 f53232m;

    static {
        com.tencent.mm.app.m3 m3Var = new com.tencent.mm.app.m3(null, "previous", false, false, null, null, null);
        m3Var.e(java.lang.Boolean.FALSE);
        f53225f = m3Var;
        f53226g = new com.tencent.mm.app.s3();
        f53227h = new com.tencent.mm.app.o3();
        f53228i = new com.tencent.mm.app.t3();
        f53229j = new com.tencent.mm.app.l3();
        f53230k = new com.tencent.mm.app.q3();
        f53231l = new com.tencent.mm.app.p3();
        f53232m = new com.tencent.mm.app.r3();
    }

    private static native void A_PSEUDO_NATIVE_METHOD_THAT_MAKES_JAVAC_KEEP_ALL_UNUSED_PRIVATE_FIELDS();

    public static java.lang.String a(boolean z17, boolean z18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        f53224e.b(jSONObject, z17, z18);
        f53225f.b(jSONObject, z17, z18);
        f53226g.b(jSONObject, z17, z18);
        f53227h.b(jSONObject, z17, z18);
        f53228i.b(jSONObject, z17, z18);
        f53229j.b(jSONObject, z17, z18);
        f53230k.b(jSONObject, z17, z18);
        f53231l.b(jSONObject, z17, z18);
        f53232m.b(jSONObject, z17, z18);
        return jSONObject.toString();
    }
}
