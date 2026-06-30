package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class Objects {

    /* loaded from: classes13.dex */
    public static final class ToStringHelper {
        private final java.util.List zza;
        private final java.lang.Object zzb;

        public /* synthetic */ ToStringHelper(java.lang.Object obj, com.google.android.gms.common.internal.zzai zzaiVar) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(obj);
            this.zzb = obj;
            this.zza = new java.util.ArrayList();
        }

        public com.google.android.gms.common.internal.Objects.ToStringHelper add(java.lang.String str, java.lang.Object obj) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
            this.zza.add(str + "=" + java.lang.String.valueOf(obj));
            return this;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(100);
            sb6.append(this.zzb.getClass().getSimpleName());
            sb6.append('{');
            int size = this.zza.size();
            for (int i17 = 0; i17 < size; i17++) {
                sb6.append((java.lang.String) this.zza.get(i17));
                if (i17 < size - 1) {
                    sb6.append(", ");
                }
            }
            sb6.append('}');
            return sb6.toString();
        }
    }

    private Objects() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    public static boolean checkBundlesEquality(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        java.util.Set<java.lang.String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (java.lang.String str : keySet) {
            if (!equal(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equal(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    public static com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelper(java.lang.Object obj) {
        return new com.google.android.gms.common.internal.Objects.ToStringHelper(obj, null);
    }
}
