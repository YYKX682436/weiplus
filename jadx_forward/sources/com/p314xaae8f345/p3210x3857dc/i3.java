package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class i3 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.z2 f301834a;

    public static synchronized void a(java.lang.String str, int i17) {
        android.content.SharedPreferences c17;
        synchronized (com.p314xaae8f345.p3210x3857dc.i3.class) {
            if (org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l().equalsIgnoreCase(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464()) && (c17 = by5.d4.c()) != null) {
                by5.c4.f("XWebWebViewMode", "saveWebViewModeIfNeed, key:" + str + ", value:" + i17);
                c17.edit().putInt(str, i17).apply();
            }
        }
    }
}
