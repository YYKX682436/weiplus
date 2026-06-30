package com.google.android.gms.common;

@com.google.errorprone.annotations.RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {com.google.android.gms.internal.base.zad.class, com.google.android.gms.internal.base.zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes13.dex */
public class GoogleApiAvailability extends com.google.android.gms.common.GoogleApiAvailabilityLight {
    public static final java.lang.String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    private java.lang.String zac;
    private static final java.lang.Object zaa = new java.lang.Object();
    private static final com.google.android.gms.common.GoogleApiAvailability zab = new com.google.android.gms.common.GoogleApiAvailability();
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    public static com.google.android.gms.common.GoogleApiAvailability getInstance() {
        return zab;
    }

    public static final com.google.android.gms.tasks.Task zai(com.google.android.gms.common.api.HasApiKey hasApiKey, com.google.android.gms.common.api.HasApiKey... hasApiKeyArr) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(hasApiKey, "Requested API must not be null.");
        for (com.google.android.gms.common.api.HasApiKey hasApiKey2 : hasApiKeyArr) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(hasApiKey2, "Requested API must not be null.");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hasApiKeyArr.length + 1);
        arrayList.add(hasApiKey);
        arrayList.addAll(java.util.Arrays.asList(hasApiKeyArr));
        return com.google.android.gms.common.api.internal.GoogleApiManager.zaj().zam(arrayList);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.GoogleApi<?> googleApi, com.google.android.gms.common.api.GoogleApi<?>... googleApiArr) {
        return zai(googleApi, googleApiArr).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.gms.common.zab
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                int i17 = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return com.google.android.gms.tasks.Tasks.forResult(null);
            }
        });
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int getClientVersion(android.content.Context context) {
        return super.getClientVersion(context);
    }

    public android.app.Dialog getErrorDialog(android.app.Activity activity, int i17, int i18) {
        return getErrorDialog(activity, i17, i18, (android.content.DialogInterface.OnCancelListener) null);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.content.Intent getErrorResolutionIntent(android.content.Context context, int i17, java.lang.String str) {
        return super.getErrorResolutionIntent(context, i17, str);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, int i17, int i18) {
        return super.getErrorResolutionPendingIntent(context, i17, i18);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final java.lang.String getErrorString(int i17) {
        return super.getErrorString(i17);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int isGooglePlayServicesAvailable(android.content.Context context) {
        return super.isGooglePlayServicesAvailable(context);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public final boolean isUserResolvableError(int i17) {
        return super.isUserResolvableError(i17);
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> makeGooglePlayServicesAvailable(android.app.Activity activity) {
        int i17 = GOOGLE_PLAY_SERVICES_VERSION_CODE;
        com.google.android.gms.common.internal.Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(activity, i17);
        if (isGooglePlayServicesAvailable == 0) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        com.google.android.gms.common.api.internal.zacc zaa2 = com.google.android.gms.common.api.internal.zacc.zaa(activity);
        zaa2.zah(new com.google.android.gms.common.ConnectionResult(isGooglePlayServicesAvailable, null), 0);
        return zaa2.zad();
    }

    public void setDefaultNotificationChannelId(android.content.Context context, java.lang.String str) {
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(((android.app.NotificationManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getSystemService("notification"))).getNotificationChannel(str));
        }
        synchronized (zaa) {
            this.zac = str;
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(android.app.Activity activity, int i17, int i18) {
        return showErrorDialogFragment(activity, i17, i18, (android.content.DialogInterface.OnCancelListener) null);
    }

    public void showErrorNotification(android.content.Context context, int i17) {
        zae(context, i17, null, getErrorResolutionPendingIntent(context, i17, 0, "n"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.app.Dialog zaa(android.content.Context context, int i17, com.google.android.gms.common.internal.zag zagVar, android.content.DialogInterface.OnCancelListener onCancelListener, android.content.DialogInterface.OnClickListener onClickListener) {
        if (i17 == 0) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.alertDialogTheme, typedValue, true);
        android.app.AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new android.app.AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new android.app.AlertDialog.Builder(context);
        }
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(context, i17));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        java.lang.String zab2 = com.google.android.gms.common.internal.zac.zab(context, i17);
        if (zab2 != null) {
            if (zagVar == null) {
                zagVar = onClickListener;
            }
            builder.setPositiveButton(zab2, zagVar);
        }
        java.lang.String zaf = com.google.android.gms.common.internal.zac.zaf(context, i17);
        if (zaf != null) {
            builder.setTitle(zaf);
        }
        java.lang.String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", java.lang.Integer.valueOf(i17));
        new java.lang.IllegalArgumentException();
        return builder.create();
    }

    public final android.app.Dialog zab(android.app.Activity activity, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(activity, null, android.R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(com.google.android.gms.common.internal.zac.zac(activity, 18));
        builder.setPositiveButton("", (android.content.DialogInterface.OnClickListener) null);
        android.app.AlertDialog create = builder.create();
        zad(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final com.google.android.gms.common.api.internal.zabx zac(android.content.Context context, com.google.android.gms.common.api.internal.zabw zabwVar) {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        com.google.android.gms.common.api.internal.zabx zabxVar = new com.google.android.gms.common.api.internal.zabx(zabwVar);
        com.google.android.gms.internal.base.zao.zaa(context, zabxVar, intentFilter);
        zabxVar.zaa(context);
        if (isUninstalledAppPossiblyUpdating(context, "com.google.android.gms")) {
            return zabxVar;
        }
        zabwVar.zaa();
        zabxVar.zab();
        return null;
    }

    public final void zad(android.app.Activity activity, android.app.Dialog dialog, java.lang.String str, android.content.DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.FragmentActivity) {
                com.google.android.gms.common.SupportErrorDialogFragment.newInstance(dialog, onCancelListener).show(((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (java.lang.NoClassDefFoundError unused) {
        }
        com.google.android.gms.common.ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void zae(android.content.Context context, int i17, java.lang.String str, android.app.PendingIntent pendingIntent) {
        int i18;
        java.lang.String str2;
        java.lang.String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", java.lang.Integer.valueOf(i17), null);
        new java.lang.IllegalArgumentException();
        if (i17 == 18) {
            zaf(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        java.lang.String zae = com.google.android.gms.common.internal.zac.zae(context, i17);
        java.lang.String zad = com.google.android.gms.common.internal.zac.zad(context, i17);
        android.content.res.Resources resources = context.getResources();
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) com.google.android.gms.common.internal.Preconditions.checkNotNull(context.getSystemService("notification"));
        z2.k0 k0Var = new z2.k0(context, null);
        k0Var.f469474r = true;
        k0Var.h(16, true);
        k0Var.f(zae);
        z2.i0 i0Var = new z2.i0();
        i0Var.f469450b = z2.k0.c(zad);
        k0Var.l(i0Var);
        if (com.google.android.gms.common.util.DeviceProperties.isWearable(context)) {
            com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastKitKatWatch());
            k0Var.D.icon = context.getApplicationInfo().icon;
            k0Var.f469466j = 2;
            if (com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(context)) {
                k0Var.f469458b.add(new z2.f0(com.google.android.gms.base.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.gms.base.R.string.common_open_on_phone), pendingIntent));
            } else {
                k0Var.f469463g = pendingIntent;
            }
        } else {
            k0Var.D.icon = android.R.drawable.stat_sys_warning;
            k0Var.m(resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker));
            k0Var.D.when = java.lang.System.currentTimeMillis();
            k0Var.f469463g = pendingIntent;
            k0Var.e(zad);
        }
        if (com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.common.util.PlatformVersion.isAtLeastO());
            synchronized (zaa) {
                str2 = this.zac;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                android.app.NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                java.lang.String string = context.getResources().getString(com.google.android.gms.base.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new android.app.NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            k0Var.f469482z = str2;
        }
        android.app.Notification b17 = k0Var.b();
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            i18 = 10436;
        } else {
            i18 = 39789;
        }
        notificationManager.notify(i18, b17);
    }

    public final void zaf(android.content.Context context) {
        new com.google.android.gms.common.zad(this, context).sendEmptyMessageDelayed(1, u04.d.f423477c);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zag(android.app.Activity activity, com.google.android.gms.common.api.internal.LifecycleFragment lifecycleFragment, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog zaa2 = zaa(activity, i17, com.google.android.gms.common.internal.zag.zad(lifecycleFragment, getErrorResolutionIntent(activity, i17, "d"), 2), onCancelListener, null);
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final boolean zah(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult, int i17) {
        android.app.PendingIntent errorResolutionPendingIntent;
        if (com.google.android.gms.common.wrappers.InstantApps.isInstantApp(context) || (errorResolutionPendingIntent = getErrorResolutionPendingIntent(context, connectionResult)) == null) {
            return false;
        }
        zae(context, connectionResult.getErrorCode(), null, android.app.PendingIntent.getActivity(context, 0, com.google.android.gms.common.api.GoogleApiActivity.zaa(context, errorResolutionPendingIntent, i17, true), com.google.android.gms.internal.base.zap.zaa | 134217728));
        return true;
    }

    public android.app.Dialog getErrorDialog(android.app.Activity activity, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return zaa(activity, i17, com.google.android.gms.common.internal.zag.zab(activity, getErrorResolutionIntent(activity, i17, "d"), i18), onCancelListener, null);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        if (connectionResult.hasResolution()) {
            return connectionResult.getResolution();
        }
        return getErrorResolutionPendingIntent(context, connectionResult.getErrorCode(), 0);
    }

    @Override // com.google.android.gms.common.GoogleApiAvailabilityLight
    public int isGooglePlayServicesAvailable(android.content.Context context, int i17) {
        return super.isGooglePlayServicesAvailable(context, i17);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public boolean showErrorDialogFragment(android.app.Activity activity, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog errorDialog = getErrorDialog(activity, i17, i18, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        zad(activity, errorDialog, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> checkApiAvailability(com.google.android.gms.common.api.HasApiKey<?> hasApiKey, com.google.android.gms.common.api.HasApiKey<?>... hasApiKeyArr) {
        return zai(hasApiKey, hasApiKeyArr).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.gms.common.zaa
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                int i17 = com.google.android.gms.common.GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
                return com.google.android.gms.tasks.Tasks.forResult(null);
            }
        });
    }

    public void showErrorNotification(android.content.Context context, com.google.android.gms.common.ConnectionResult connectionResult) {
        zae(context, connectionResult.getErrorCode(), null, getErrorResolutionPendingIntent(context, connectionResult));
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.Fragment fragment, int i17, int i18) {
        return getErrorDialog(fragment, i17, i18, (android.content.DialogInterface.OnCancelListener) null);
    }

    public boolean showErrorDialogFragment(android.app.Activity activity, int i17, androidx.activity.result.c cVar, android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.app.Dialog zaa2 = zaa(activity, i17, null, onCancelListener, new com.google.android.gms.common.zac(this, activity, i17, cVar));
        if (zaa2 == null) {
            return false;
        }
        zad(activity, zaa2, com.google.android.gms.common.GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public android.app.Dialog getErrorDialog(androidx.fragment.app.Fragment fragment, int i17, int i18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        return zaa(fragment.requireContext(), i17, com.google.android.gms.common.internal.zag.zac(fragment, getErrorResolutionIntent(fragment.requireContext(), i17, "d"), i18), onCancelListener, null);
    }
}
