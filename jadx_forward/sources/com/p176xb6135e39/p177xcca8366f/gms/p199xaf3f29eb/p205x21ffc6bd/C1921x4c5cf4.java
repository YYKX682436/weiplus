package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.Objects */
/* loaded from: classes13.dex */
public final class C1921x4c5cf4 {

    /* renamed from: com.google.android.gms.common.internal.Objects$ToStringHelper */
    /* loaded from: classes13.dex */
    public static final class ToStringHelper {
        private final java.util.List zza;
        private final java.lang.Object zzb;

        public /* synthetic */ ToStringHelper(java.lang.Object obj, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1955x394b68 c1955x394b68) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(obj);
            this.zzb = obj;
            this.zza = new java.util.ArrayList();
        }

        public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.ToStringHelper add(java.lang.String str, java.lang.Object obj) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(str);
            this.zza.add(str + "=" + java.lang.String.valueOf(obj));
            return this;
        }

        /* renamed from: toString */
        public java.lang.String m18192x9616526c() {
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

    private C1921x4c5cf4() {
        throw new java.lang.AssertionError("Uninstantiable");
    }

    /* renamed from: checkBundlesEquality */
    public static boolean m18188xfd591a23(android.os.Bundle bundle, android.os.Bundle bundle2) {
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
            if (!m18189x5c46734(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: equal */
    public static boolean m18189x5c46734(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: hashCode */
    public static int m18190x8cdac1b(java.lang.Object... objArr) {
        return java.util.Arrays.hashCode(objArr);
    }

    /* renamed from: toStringHelper */
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.ToStringHelper m18191xbe50cd3a(java.lang.Object obj) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.ToStringHelper(obj, null);
    }
}
