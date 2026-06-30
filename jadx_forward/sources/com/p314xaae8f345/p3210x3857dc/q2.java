package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.w f302059a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f302060b = new java.util.ArrayList();

    public static boolean a(java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.w wVar = f302059a;
        if (wVar == null) {
            by5.c4.g("XWebPreferences", "getBooleanValue, web preferences not set, key:" + str);
            return false;
        }
        vx5.f fVar = (vx5.f) wVar;
        fVar.a();
        try {
            return ((java.lang.Boolean) fVar.f522877f.b(str)).booleanValue();
        } catch (java.lang.UnsupportedOperationException e17) {
            if (fVar.f522872a == null) {
                throw new java.lang.RuntimeException("Crosswalk's APIs are not ready yet");
            }
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120282x5101ff58(e17);
            return false;
        }
    }

    public static java.lang.String b(java.lang.String str) {
        com.p314xaae8f345.p3210x3857dc.w wVar = f302059a;
        if (wVar == null) {
            by5.c4.g("XWebPreferences", "getStringValue, web preferences not set, key:" + str);
            return null;
        }
        vx5.f fVar = (vx5.f) wVar;
        fVar.a();
        try {
            return (java.lang.String) fVar.f522879h.b(str);
        } catch (java.lang.UnsupportedOperationException e17) {
            if (fVar.f522872a == null) {
                throw new java.lang.RuntimeException("Crosswalk's APIs are not ready yet");
            }
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120282x5101ff58(e17);
            return null;
        }
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3210x3857dc.w wVar = f302059a;
        if (wVar == null) {
            by5.c4.g("XWebPreferences", "setValue, web preferences not set, key:" + str);
            return;
        }
        vx5.f fVar = (vx5.f) wVar;
        fVar.a();
        try {
            fVar.f522875d.b(str, str2);
        } catch (java.lang.UnsupportedOperationException e17) {
            if (fVar.f522872a == null) {
                throw new java.lang.RuntimeException("Crosswalk's APIs are not ready yet");
            }
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120282x5101ff58(e17);
        }
    }

    public static void d(java.lang.String str, boolean z17) {
        com.p314xaae8f345.p3210x3857dc.w wVar = f302059a;
        if (wVar == null) {
            by5.c4.g("XWebPreferences", "setValue, web preferences not set, key:" + str);
            return;
        }
        vx5.f fVar = (vx5.f) wVar;
        fVar.a();
        try {
            fVar.f522873b.b(str, java.lang.Boolean.valueOf(z17));
        } catch (java.lang.UnsupportedOperationException e17) {
            if (fVar.f522872a == null) {
                throw new java.lang.RuntimeException("Crosswalk's APIs are not ready yet");
            }
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.C27842xafdfb9f1.m120282x5101ff58(e17);
        }
    }
}
