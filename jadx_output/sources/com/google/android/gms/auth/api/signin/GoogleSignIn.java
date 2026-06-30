package com.google.android.gms.auth.api.signin;

/* loaded from: classes13.dex */
public final class GoogleSignIn {
    private GoogleSignIn() {
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccountForExtension(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "please provide a valid Context object");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptionsExtension, "please provide valid GoogleSignInOptionsExtension");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault();
        }
        return lastSignedInAccount.requestExtraScopes(zzd(googleSignInOptionsExtension.getImpliedScopes()));
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getAccountForScopes(android.content.Context context, com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope... scopeArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "please provide a valid Context object");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scope, "please provide at least one valid scope");
        com.google.android.gms.auth.api.signin.GoogleSignInAccount lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = com.google.android.gms.auth.api.signin.GoogleSignInAccount.createDefault();
        }
        lastSignedInAccount.requestExtraScopes(scope);
        lastSignedInAccount.requestExtraScopes(scopeArr);
        return lastSignedInAccount;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInClient getClient(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInClient(activity, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions));
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount getLastSignedInAccount(android.content.Context context) {
        return com.google.android.gms.auth.api.signin.internal.zzq.zze(context).zzo();
    }

    public static com.google.android.gms.tasks.Task<com.google.android.gms.auth.api.signin.GoogleSignInAccount> getSignedInAccountFromIntent(android.content.Intent intent) {
        com.google.android.gms.auth.api.signin.GoogleSignInResult signInResultFromIntent = com.google.android.gms.auth.api.signin.internal.zzi.getSignInResultFromIntent(intent);
        return signInResultFromIntent == null ? com.google.android.gms.tasks.Tasks.forException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(com.google.android.gms.common.api.Status.RESULT_INTERNAL_ERROR)) : (!signInResultFromIntent.getStatus().isSuccess() || signInResultFromIntent.getSignInAccount() == null) ? com.google.android.gms.tasks.Tasks.forException(com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(signInResultFromIntent.getStatus())) : com.google.android.gms.tasks.Tasks.forResult(signInResultFromIntent.getSignInAccount());
    }

    public static boolean hasPermissions(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
        return hasPermissions(googleSignInAccount, zzd(googleSignInOptionsExtension.getImpliedScopes()));
    }

    public static void requestPermissions(android.app.Activity activity, int i17, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Please provide a non-null Activity");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(activity, i17, googleSignInAccount, zzd(googleSignInOptionsExtension.getImpliedScopes()));
    }

    private static android.content.Intent zzd(android.app.Activity activity, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Scope... scopeArr) {
        com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder builder = new com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder();
        if (scopeArr.length > 0) {
            builder.requestScopes(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !android.text.TextUtils.isEmpty(googleSignInAccount.getEmail())) {
            builder.setAccountName(googleSignInAccount.getEmail());
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInClient(activity, builder.build()).getSignInIntent();
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInClient getClient(android.content.Context context, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        return new com.google.android.gms.auth.api.signin.GoogleSignInClient(context, (com.google.android.gms.auth.api.signin.GoogleSignInOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptions));
    }

    public static boolean hasPermissions(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Scope... scopeArr) {
        if (googleSignInAccount == null) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Collections.addAll(hashSet, scopeArr);
        return googleSignInAccount.getGrantedScopes().containsAll(hashSet);
    }

    public static void requestPermissions(androidx.fragment.app.Fragment fragment, int i17, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension googleSignInOptionsExtension) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(fragment, "Please provide a non-null Fragment");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(googleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
        requestPermissions(fragment, i17, googleSignInAccount, zzd(googleSignInOptionsExtension.getImpliedScopes()));
    }

    private static com.google.android.gms.common.api.Scope[] zzd(java.util.List<com.google.android.gms.common.api.Scope> list) {
        return list == null ? new com.google.android.gms.common.api.Scope[0] : (com.google.android.gms.common.api.Scope[]) list.toArray(new com.google.android.gms.common.api.Scope[list.size()]);
    }

    public static void requestPermissions(androidx.fragment.app.Fragment fragment, int i17, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Scope... scopeArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(fragment, "Please provide a non-null Fragment");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scopeArr, "Please provide at least one scope");
        fragment.startActivityForResult(zzd(fragment.getActivity(), googleSignInAccount, scopeArr), i17);
    }

    public static void requestPermissions(android.app.Activity activity, int i17, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Scope... scopeArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(activity, "Please provide a non-null Activity");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(scopeArr, "Please provide at least one scope");
        android.content.Intent zzd = zzd(activity, googleSignInAccount, scopeArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(zzd);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/google/android/gms/auth/api/signin/GoogleSignIn", "requestPermissions", "(Landroid/app/Activity;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;[Lcom/google/android/gms/common/api/Scope;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
