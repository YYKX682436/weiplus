package com.google.android.gms.common.util;

/* loaded from: classes13.dex */
public final class ScopeUtil {
    private ScopeUtil() {
    }

    public static java.lang.String[] toScopeString(java.util.Set<com.google.android.gms.common.api.Scope> set) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(set, "scopes can't be null.");
        com.google.android.gms.common.api.Scope[] scopeArr = (com.google.android.gms.common.api.Scope[]) set.toArray(new com.google.android.gms.common.api.Scope[set.size()]);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scopeArr, "scopes can't be null.");
        java.lang.String[] strArr = new java.lang.String[scopeArr.length];
        for (int i17 = 0; i17 < scopeArr.length; i17++) {
            strArr[i17] = scopeArr[i17].getScopeUri();
        }
        return strArr;
    }
}
