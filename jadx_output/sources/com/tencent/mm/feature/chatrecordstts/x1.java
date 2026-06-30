package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes5.dex */
public final class x1 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f65559f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f65560g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f65561h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f65562i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f65559f = jz5.h.b(com.tencent.mm.feature.chatrecordstts.t1.f65536d);
        this.f65560g = jz5.h.b(com.tencent.mm.feature.chatrecordstts.s1.f65532d);
        this.f65561h = jz5.h.b(com.tencent.mm.feature.chatrecordstts.u1.f65540d);
        this.f65562i = jz5.h.b(com.tencent.mm.feature.chatrecordstts.w1.f65555d);
    }

    public static final java.lang.String T6(boolean z17, boolean z18, java.lang.String str, android.content.Context context, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (z17 && !z18 && str != null) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.pfn, str2, str3, str, str5);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        if (z17 && !z18) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.pfm, str2, str3, str5);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        if (z17 && str != null) {
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.pfk, str4, str3, str, str5);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            return string3;
        }
        if (z17) {
            java.lang.String string4 = context.getString(com.tencent.mm.R.string.pfj, str4, str3, str5);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            return string4;
        }
        if (z18) {
            java.lang.String string5 = context.getString(com.tencent.mm.R.string.pfi, str4, str5);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            return string5;
        }
        java.lang.String string6 = context.getString(com.tencent.mm.R.string.pfl, str2, str5);
        kotlin.jvm.internal.o.f(string6, "getString(...)");
        return string6;
    }

    public static final oy.m U6(boolean z17, boolean z18, java.lang.Boolean bool, android.content.Context context, com.tencent.mm.feature.chatrecordstts.x1 x1Var, java.lang.String str, java.util.List list, java.lang.String str2, boolean z19) {
        if (!z17 || z18) {
            if (z19) {
                x1Var.getClass();
                str2 = context.getString(com.tencent.mm.R.string.pfc, str, str2);
                kotlin.jvm.internal.o.f(str2, "getString(...)");
            } else {
                x1Var.getClass();
                str2 = context.getString(com.tencent.mm.R.string.pfe, str, str2);
                kotlin.jvm.internal.o.f(str2, "getString(...)");
            }
        } else if (!kotlin.jvm.internal.o.b(bool, java.lang.Boolean.valueOf(z19))) {
            str2 = z19 ? context.getString(com.tencent.mm.R.string.pfd, str2) : context.getString(com.tencent.mm.R.string.pff, str2);
            kotlin.jvm.internal.o.d(str2);
        }
        return new oy.m(str2, java.lang.Boolean.valueOf(z19), list);
    }

    public final java.lang.String V6(android.content.Context context, com.tencent.mm.storage.f9 message, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(message, "message");
        if (message.A0() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReadableMessageFSC", "getReadableUserName: sender is current user");
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490472w1);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        boolean g17 = g95.e0.g(message);
        if (str == null && (str = com.tencent.mm.feature.chatrecordstts.r1.b(message)) == null) {
            str = "";
        }
        tg3.v0 v0Var = (tg3.v0) ((jz5.n) this.f65559f).getValue();
        java.lang.String Q0 = g17 ? message.Q0() : null;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(str, Q0);
        if (f17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ReadableMessageFSC", "getReadableUserName: failed to get display name, isGroupChat=" + g17);
        }
        if (f17 != null) {
            return f17;
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.pf_);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    public final java.lang.String W6(android.content.Context context, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (kotlin.jvm.internal.o.b(str, str2)) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490472w1);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        boolean g17 = g95.e0.g(f9Var);
        tg3.v0 v0Var = (tg3.v0) ((jz5.n) this.f65559f).getValue();
        java.lang.String Q0 = g17 ? f9Var.Q0() : null;
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(str, Q0);
        if (f17 != null) {
            return f17;
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.pf_);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }
}
