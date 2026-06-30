package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes8.dex */
public final class r4 implements android.content.SharedPreferences.Editor {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f274488d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f274489e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd f274490f;

    public r4(com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd sharedPreferencesC20998x2b0514dd) {
        this.f274490f = sharedPreferencesC20998x2b0514dd;
    }

    public final boolean a(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd sharedPreferencesC20998x2b0514dd = this.f274490f;
        if (sharedPreferencesC20998x2b0514dd.f273952g) {
            return false;
        }
        synchronized (sharedPreferencesC20998x2b0514dd) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd sharedPreferencesC20998x2b0514dd2 = this.f274490f;
            sharedPreferencesC20998x2b0514dd2.a(sharedPreferencesC20998x2b0514dd2.f273949d);
            java.lang.String[] strArr = {java.lang.String.valueOf(this.f274490f.f273951f), java.lang.String.valueOf(this.f274489e)};
            synchronized (this) {
                z17 = this.f274490f.f273949d.getContentResolver().update(android.net.Uri.withAppendedPath(android.net.Uri.withAppendedPath(com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.f273948p, this.f274490f.f273950e), str), com.p314xaae8f345.mm.sdk.p2603x2137b148.s4.a((java.util.HashMap) this.f274488d), null, strArr) > 0;
            }
        }
        return z17;
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        a("apply");
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
        synchronized (this) {
            this.f274489e = true;
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        return a("commit");
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17) {
        synchronized (this) {
            ((java.util.HashMap) this.f274488d).put(str, java.lang.Boolean.valueOf(z17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17) {
        synchronized (this) {
            ((java.util.HashMap) this.f274488d).put(str, java.lang.Float.valueOf(f17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17) {
        synchronized (this) {
            ((java.util.HashMap) this.f274488d).put(str, java.lang.Integer.valueOf(i17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17) {
        synchronized (this) {
            ((java.util.HashMap) this.f274488d).put(str, java.lang.Long.valueOf(j17));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            ((java.util.HashMap) this.f274488d).put(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        synchronized (this) {
            ((java.util.HashMap) this.f274488d).put(str, set == null ? null : new java.util.HashSet(set));
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String str) {
        synchronized (this) {
            ((java.util.HashMap) this.f274488d).put(str, null);
        }
        return this;
    }
}
