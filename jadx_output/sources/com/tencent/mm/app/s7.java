package com.tencent.mm.app;

/* loaded from: classes9.dex */
public class s7 implements com.tencent.mm.contact.q {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f53772a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f53773b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f53774c;

    public s7(android.content.Context context) {
        this.f53774c = context;
    }

    public java.lang.String a(java.lang.String str) {
        java.util.Map map = this.f53772a;
        if (!((java.util.HashMap) map).containsKey(str)) {
            return null;
        }
        int intValue = ((java.lang.Integer) ((java.util.HashMap) map).get(str)).intValue();
        android.content.Context context = this.f53774c;
        java.lang.String string = context.getString(intValue);
        return com.tencent.mm.storage.z3.M4(str) ? com.tencent.mm.plugin.profile.s1.c(context, "weixin", new android.text.SpannableString(string)).toString() : string;
    }
}
