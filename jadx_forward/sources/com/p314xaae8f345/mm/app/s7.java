package com.p314xaae8f345.mm.app;

/* loaded from: classes9.dex */
public class s7 implements com.p314xaae8f345.mm.p670x38b72420.q {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f135305a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f135306b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135307c;

    public s7(android.content.Context context) {
        this.f135307c = context;
    }

    public java.lang.String a(java.lang.String str) {
        java.util.Map map = this.f135305a;
        if (!((java.util.HashMap) map).containsKey(str)) {
            return null;
        }
        int intValue = ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue();
        android.content.Context context = this.f135307c;
        java.lang.String string = context.getString(intValue);
        return com.p314xaae8f345.mm.p2621x8fb0427b.z3.M4(str) ? com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.s1.c(context, "weixin", new android.text.SpannableString(string)).toString() : string;
    }
}
