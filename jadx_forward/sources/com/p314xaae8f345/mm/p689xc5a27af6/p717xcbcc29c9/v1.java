package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f147078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(android.content.Context context) {
        super(1);
        this.f147078d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r26.m match = (r26.m) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(match, "match");
        r26.q qVar = (r26.q) match;
        java.lang.Integer h17 = r26.h0.h((java.lang.String) qVar.a().get(1));
        int intValue = h17 != null ? h17.intValue() : 0;
        java.lang.Integer h18 = r26.h0.h((java.lang.String) qVar.a().get(2));
        int intValue2 = (intValue * 60) + (h18 != null ? h18.intValue() : 0);
        android.content.Context context = this.f147078d;
        if (intValue2 < 60) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pey, java.lang.Integer.valueOf(intValue2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            return string;
        }
        int i17 = intValue2 % 60;
        if (i17 == 0) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pew, java.lang.Integer.valueOf(intValue2 / 60));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            return string2;
        }
        java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pex, java.lang.Integer.valueOf(intValue2 / 60), java.lang.Integer.valueOf(i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        return string3;
    }
}
