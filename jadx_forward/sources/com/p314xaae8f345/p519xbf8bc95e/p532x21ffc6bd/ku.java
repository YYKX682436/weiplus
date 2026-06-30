package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ku {
    public static android.content.SharedPreferences a(android.content.Context context, java.lang.String str) {
        if (context != null) {
            return context.getSharedPreferences("TMS_".concat(java.lang.String.valueOf(str)), 0);
        }
        return null;
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public android.content.SharedPreferences.Editor f131724a;

        public a(android.content.SharedPreferences.Editor editor) {
            this.f131724a = editor;
        }

        public final void a(java.lang.String str, int i17) {
            this.f131724a.putInt(str, i17);
            this.f131724a.commit();
        }

        private void a(java.lang.String str, boolean z17) {
            this.f131724a.putBoolean(str, z17);
            this.f131724a.commit();
        }

        private void a(java.lang.String str, float f17) {
            this.f131724a.putFloat(str, f17);
            this.f131724a.commit();
        }

        private void a(java.lang.String str, long j17) {
            this.f131724a.putLong(str, j17);
            this.f131724a.commit();
        }

        public final void a(java.lang.String str, java.lang.String str2) {
            this.f131724a.putString(str, str2);
            this.f131724a.commit();
        }

        private void a(java.lang.String str, java.util.Set<java.lang.String> set) {
            this.f131724a.putStringSet(str, set);
            this.f131724a.commit();
        }
    }

    private static android.content.SharedPreferences a(android.content.Context context) {
        if (context != null) {
            return context.getSharedPreferences("TMS_GLOBAL", 0);
        }
        return null;
    }

    public static com.tencent.mapsdk.internal.ku.a a(android.content.SharedPreferences sharedPreferences) {
        return new com.tencent.mapsdk.internal.ku.a(sharedPreferences.edit());
    }
}
