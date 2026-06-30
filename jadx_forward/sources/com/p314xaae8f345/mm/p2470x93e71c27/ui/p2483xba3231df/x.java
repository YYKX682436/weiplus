package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public class x implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public android.content.pm.ResolveInfo f272561d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f272562e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f272563f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f272564g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f272565h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f272566i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f272567m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f272568n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.Intent f272569o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Intent f272570p;

    public x(android.content.pm.ResolveInfo resolveInfo, java.lang.CharSequence charSequence, boolean z17, boolean z18, boolean z19) {
        this.f272561d = resolveInfo;
        this.f272562e = charSequence;
        this.f272565h = z17;
        this.f272566i = z18;
        this.f272567m = z19;
    }

    public boolean a(java.lang.Object obj) {
        android.content.pm.ResolveInfo resolveInfo;
        if (!(obj instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x)) {
            return false;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x) obj;
        android.content.pm.ResolveInfo resolveInfo2 = xVar.f272561d;
        if (resolveInfo2 == null || (resolveInfo = this.f272561d) == null || !resolveInfo2.activityInfo.packageName.equals(resolveInfo.activityInfo.packageName)) {
            return xVar.f272565h && this.f272565h;
        }
        return true;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
