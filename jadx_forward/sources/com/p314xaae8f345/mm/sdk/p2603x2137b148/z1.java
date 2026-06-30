package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes7.dex */
public class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.ArrayMap f274660a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f274661b = false;

    public z1() {
        this.f274660a = null;
        this.f274660a = new android.util.ArrayMap();
    }

    public java.lang.String a(java.lang.String str) {
        java.lang.Object obj = this.f274660a.get(str);
        try {
            return (java.lang.String) obj;
        } catch (java.lang.ClassCastException e17) {
            b(str, obj, "String", "<null>", e17);
            return null;
        }
    }

    public void b(java.lang.String str, java.lang.Object obj, java.lang.String str2, java.lang.Object obj2, java.lang.ClassCastException classCastException) {
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.ImmutableBundle", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w("MicroMsg.ImmutableBundle", "Attempt to cast generated internal exception:", classCastException);
    }
}
