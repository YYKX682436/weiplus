package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb;

/* renamed from: com.google.android.gms.common.AccountPicker */
/* loaded from: classes15.dex */
public final class C1698xf61598fb {

    /* renamed from: com.google.android.gms.common.AccountPicker$AccountChooserOptions */
    /* loaded from: classes15.dex */
    public static class AccountChooserOptions {
        private android.accounts.Account zza;
        private boolean zzb;
        private java.util.ArrayList zzc;
        private java.util.ArrayList zzd;
        private boolean zze;
        private java.lang.String zzf;
        private android.os.Bundle zzg;
        private boolean zzh;
        private int zzi;
        private java.lang.String zzj;
        private boolean zzk;
        private com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zza zzl;
        private java.lang.String zzm;
        private boolean zzn;
        private boolean zzo;

        /* renamed from: com.google.android.gms.common.AccountPicker$AccountChooserOptions$Builder */
        /* loaded from: classes15.dex */
        public static class Builder {
            private android.accounts.Account zza;
            private java.util.ArrayList zzb;
            private java.util.ArrayList zzc;
            private boolean zzd = false;
            private java.lang.String zze;
            private android.os.Bundle zzf;

            /* renamed from: build */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions m17589x59bc66e() {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(true, "We only support hostedDomain filter for account chip styled account picker");
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(true, "Consent is only valid for account chip styled account picker");
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions();
                accountChooserOptions.zzd = this.zzc;
                accountChooserOptions.zzc = this.zzb;
                accountChooserOptions.zze = this.zzd;
                accountChooserOptions.zzl = null;
                accountChooserOptions.zzj = null;
                accountChooserOptions.zzg = this.zzf;
                accountChooserOptions.zza = this.zza;
                accountChooserOptions.zzb = false;
                accountChooserOptions.zzh = false;
                accountChooserOptions.zzm = null;
                accountChooserOptions.zzi = 0;
                accountChooserOptions.zzf = this.zze;
                accountChooserOptions.zzk = false;
                accountChooserOptions.zzn = false;
                accountChooserOptions.zzo = false;
                return accountChooserOptions;
            }

            /* renamed from: setAllowableAccounts */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.Builder m17590x9ba44ce7(java.util.List<android.accounts.Account> list) {
                this.zzb = list == null ? null : new java.util.ArrayList(list);
                return this;
            }

            /* renamed from: setAllowableAccountsTypes */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.Builder m17591x4a3313d2(java.util.List<java.lang.String> list) {
                this.zzc = list == null ? null : new java.util.ArrayList(list);
                return this;
            }

            /* renamed from: setAlwaysShowAccountPicker */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.Builder m17592x9a89bc0d(boolean z17) {
                this.zzd = z17;
                return this;
            }

            /* renamed from: setOptionsForAddingAccount */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.Builder m17593x45b6b8ff(android.os.Bundle bundle) {
                this.zzf = bundle;
                return this;
            }

            /* renamed from: setSelectedAccount */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.Builder m17594xb3608650(android.accounts.Account account) {
                this.zza = account;
                return this;
            }

            /* renamed from: setTitleOverrideText */
            public com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.Builder m17595x6905554f(java.lang.String str) {
                this.zze = str;
                return this;
            }
        }

        public static /* bridge */ /* synthetic */ boolean zzA(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
            boolean z17 = accountChooserOptions.zzo;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzB(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
            boolean z17 = accountChooserOptions.zzb;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzC(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
            boolean z17 = accountChooserOptions.zzh;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean zzD(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
            boolean z17 = accountChooserOptions.zzk;
            return false;
        }

        public static /* bridge */ /* synthetic */ int zza(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
            int i17 = accountChooserOptions.zzi;
            return 0;
        }

        public static /* bridge */ /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zza zzd(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.zza zzaVar = accountChooserOptions.zzl;
            return null;
        }

        public static /* bridge */ /* synthetic */ java.lang.String zze(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
            java.lang.String str = accountChooserOptions.zzj;
            return null;
        }

        public static /* bridge */ /* synthetic */ java.lang.String zzf(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
            java.lang.String str = accountChooserOptions.zzm;
            return null;
        }

        public static /* bridge */ /* synthetic */ boolean zzz(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
            boolean z17 = accountChooserOptions.zzn;
            return false;
        }
    }

    private C1698xf61598fb() {
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @java.lang.Deprecated
    /* renamed from: newChooseAccountIntent */
    public static android.content.Intent m17587x4d4ea892(android.accounts.Account account, java.util.ArrayList<android.accounts.Account> arrayList, java.lang.String[] strArr, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String[] strArr2, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z17);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (java.lang.String) null);
        return intent;
    }

    /* renamed from: newChooseAccountIntent */
    public static android.content.Intent m17588x4d4ea892(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions accountChooserOptions) {
        android.content.Intent intent = new android.content.Intent();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzD(accountChooserOptions);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zze(accountChooserOptions);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(true, "We only support hostedDomain filter for account chip styled account picker");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzd(accountChooserOptions);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(true, "Consent is only valid for account chip styled account picker");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzB(accountChooserOptions);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18198x312c1fe5(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzD(accountChooserOptions);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.zzc);
        if (accountChooserOptions.zzd != null) {
            intent.putExtra("allowableAccountTypes", (java.lang.String[]) accountChooserOptions.zzd.toArray(new java.lang.String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.zzg);
        intent.putExtra("selectedAccount", accountChooserOptions.zza);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzB(accountChooserOptions);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.zze);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.zzf);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzC(accountChooserOptions);
        intent.putExtra("setGmsCoreAccount", false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzf(accountChooserOptions);
        intent.putExtra("realClientPackage", (java.lang.String) null);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zza(accountChooserOptions);
        intent.putExtra("overrideTheme", 0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzD(accountChooserOptions);
        intent.putExtra("overrideCustomTheme", 0);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zze(accountChooserOptions);
        intent.putExtra("hostedDomainFilter", (java.lang.String) null);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzD(accountChooserOptions);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzd(accountChooserOptions);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzz(accountChooserOptions);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1698xf61598fb.AccountChooserOptions.zzA(accountChooserOptions);
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
