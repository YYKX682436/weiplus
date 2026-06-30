package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes13.dex */
public final class h4 extends i95.w implements com.tencent.mm.feature.emoji.api.q6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f66310d = "EmoticonPageFeatureService";

    public void Ai(android.content.Context context, qk.i7 pageContext, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pageContext, "pageContext");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (pageContext instanceof qk.v) {
            f22.e.f258966a.b(context, Bi((qk.v) pageContext), false, z17, callback);
        } else {
            ot5.g.d(this.f66310d, "unable to handle this page context");
            callback.invoke(null);
        }
    }

    public final f22.a Bi(qk.v vVar) {
        f22.a aVar = new f22.a();
        aVar.f364027g = vVar.f364027g;
        java.lang.String str = vVar.f364028h;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        aVar.f364028h = str;
        java.lang.String str2 = vVar.f364029i;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        aVar.f364029i = str2;
        java.lang.String str3 = vVar.f364030j;
        kotlin.jvm.internal.o.g(str3, "<set-?>");
        aVar.f364030j = str3;
        java.lang.String str4 = vVar.f364031k;
        kotlin.jvm.internal.o.g(str4, "<set-?>");
        aVar.f364031k = str4;
        java.lang.String str5 = vVar.f364032l;
        kotlin.jvm.internal.o.g(str5, "<set-?>");
        aVar.f364032l = str5;
        java.lang.String str6 = vVar.f364033m;
        kotlin.jvm.internal.o.g(str6, "<set-?>");
        aVar.f364033m = str6;
        java.lang.String str7 = vVar.f364034n;
        kotlin.jvm.internal.o.g(str7, "<set-?>");
        aVar.f364034n = str7;
        aVar.f364035o = vVar.f364035o;
        java.lang.String str8 = vVar.f364036p;
        kotlin.jvm.internal.o.g(str8, "<set-?>");
        aVar.f364036p = str8;
        java.lang.String str9 = vVar.f364037q;
        kotlin.jvm.internal.o.g(str9, "<set-?>");
        aVar.f364037q = str9;
        java.lang.String str10 = vVar.f364038r;
        kotlin.jvm.internal.o.g(str10, "<set-?>");
        aVar.f364038r = str10;
        java.lang.String str11 = vVar.f364039s;
        kotlin.jvm.internal.o.g(str11, "<set-?>");
        aVar.f364039s = str11;
        java.lang.String str12 = vVar.f364040t;
        kotlin.jvm.internal.o.g(str12, "<set-?>");
        aVar.f364040t = str12;
        aVar.f364041u = vVar.f364041u;
        aVar.f364042v = vVar.f364042v;
        aVar.f364043w = vVar.f364043w;
        aVar.f364044x = vVar.f364044x;
        aVar.f364046z = vVar.f364046z;
        aVar.f364045y = vVar.f364045y;
        aVar.f364155a = vVar.f364155a;
        java.lang.String str13 = vVar.f364157c;
        kotlin.jvm.internal.o.g(str13, "<set-?>");
        aVar.f364157c = str13;
        aVar.A = vVar.A;
        return aVar;
    }

    public void wi(android.content.Context context, qk.i7 pageContext) {
        kotlin.jvm.internal.o.g(pageContext, "pageContext");
        if (!(pageContext instanceof qk.v)) {
            ot5.g.d(this.f66310d, "unable to handle this page context");
        } else {
            f22.e.f258966a.a(context, Bi((qk.v) pageContext));
        }
    }
}
