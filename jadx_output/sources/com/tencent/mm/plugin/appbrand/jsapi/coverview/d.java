package com.tencent.mm.plugin.appbrand.jsapi.coverview;

/* loaded from: classes7.dex */
public abstract class d {
    public static final android.content.Context a(android.content.Context context) {
        android.content.Context applicationContext;
        kotlin.jvm.internal.o.g(context, "<this>");
        return ((context instanceof android.app.Application) || (applicationContext = context.getApplicationContext()) == null) ? context : applicationContext;
    }
}
