package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f65545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(android.content.Context context) {
        super(1);
        this.f65545d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r26.m match = (r26.m) obj;
        kotlin.jvm.internal.o.g(match, "match");
        r26.q qVar = (r26.q) match;
        java.lang.Integer h17 = r26.h0.h((java.lang.String) qVar.a().get(1));
        int intValue = h17 != null ? h17.intValue() : 0;
        java.lang.Integer h18 = r26.h0.h((java.lang.String) qVar.a().get(2));
        int intValue2 = (intValue * 60) + (h18 != null ? h18.intValue() : 0);
        android.content.Context context = this.f65545d;
        if (intValue2 < 60) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.pey, java.lang.Integer.valueOf(intValue2));
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        int i17 = intValue2 % 60;
        if (i17 == 0) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.pew, java.lang.Integer.valueOf(intValue2 / 60));
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            return string2;
        }
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.pex, java.lang.Integer.valueOf(intValue2 / 60), java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        return string3;
    }
}
