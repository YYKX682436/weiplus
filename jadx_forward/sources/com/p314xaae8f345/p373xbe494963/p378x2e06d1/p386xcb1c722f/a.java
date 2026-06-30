package com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f;

/* loaded from: classes13.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<android.content.pm.PackageInfo> f127933a = new com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.r<>(com.p314xaae8f345.p373xbe494963.p378x2e06d1.p386xcb1c722f.b.a());

    public static java.lang.String a() {
        android.content.pm.PackageInfo a17 = f127933a.a();
        return a17 == null ? "" : a17.packageName;
    }

    public static java.lang.String b() {
        android.content.pm.PackageInfo a17;
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        return (m29240x6e669035 == null || (a17 = f127933a.a()) == null) ? "" : m29240x6e669035.getPackageManager().getApplicationLabel(a17.applicationInfo).toString();
    }

    public static java.lang.String c() {
        android.content.pm.PackageInfo a17 = f127933a.a();
        return a17 == null ? "" : a17.versionName;
    }

    public static /* synthetic */ android.content.pm.PackageInfo d() {
        android.content.Context m29240x6e669035 = com.p314xaae8f345.p373xbe494963.p378x2e06d1.C3737x4bd17462.m29240x6e669035();
        if (m29240x6e669035 == null) {
            return null;
        }
        return m29240x6e669035.getPackageManager().getPackageInfo(m29240x6e669035.getPackageName(), 0);
    }
}
