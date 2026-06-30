package com.google.android.gms.auth.api.credentials;

/* loaded from: classes13.dex */
public final class PasswordSpecification extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.credentials.PasswordSpecification> CREATOR = new com.google.android.gms.auth.api.credentials.zzm();
    public static final com.google.android.gms.auth.api.credentials.PasswordSpecification zzdg = new com.google.android.gms.auth.api.credentials.PasswordSpecification.zzd().zzd(12, 16).zze("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").zzd("abcdefghijkmnopqrstxyz", 1).zzd("ABCDEFGHJKLMNPQRSTXY", 1).zzd("3456789", 1).zzj();
    private static final com.google.android.gms.auth.api.credentials.PasswordSpecification zzdh = new com.google.android.gms.auth.api.credentials.PasswordSpecification.zzd().zzd(12, 16).zze("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").zzd("abcdefghijklmnopqrstuvwxyz", 1).zzd("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).zzd("1234567890", 1).zzj();
    private final java.lang.String zzdi;
    private final java.util.List<java.lang.String> zzdj;
    private final java.util.List<java.lang.Integer> zzdk;
    private final int zzdl;
    private final int zzdm;
    private final int[] zzdn;
    private final java.util.Random zzdo;

    /* loaded from: classes13.dex */
    public static class zzd {
        private final java.util.TreeSet<java.lang.Character> zzdp = new java.util.TreeSet<>();
        private final java.util.List<java.lang.String> zzdj = new java.util.ArrayList();
        private final java.util.List<java.lang.Integer> zzdk = new java.util.ArrayList();
        private int zzdl = 12;
        private int zzdm = 16;

        public final com.google.android.gms.auth.api.credentials.PasswordSpecification.zzd zzd(int i17, int i18) {
            this.zzdl = 12;
            this.zzdm = 16;
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.PasswordSpecification.zzd zze(java.lang.String str) {
            this.zzdp.addAll(zzd(str, "allowedChars"));
            return this;
        }

        public final com.google.android.gms.auth.api.credentials.PasswordSpecification zzj() {
            if (this.zzdp.isEmpty()) {
                throw new com.google.android.gms.auth.api.credentials.PasswordSpecification.zze("no allowed characters specified");
            }
            java.util.Iterator<java.lang.Integer> it = this.zzdk.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                i17 += it.next().intValue();
            }
            if (i17 > this.zzdm) {
                throw new com.google.android.gms.auth.api.credentials.PasswordSpecification.zze("required character count cannot be greater than the max password size");
            }
            boolean[] zArr = new boolean[95];
            java.util.Iterator<java.lang.String> it6 = this.zzdj.iterator();
            while (it6.hasNext()) {
                for (char c17 : it6.next().toCharArray()) {
                    int i18 = c17 - ' ';
                    if (zArr[i18]) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(58);
                        sb6.append("character ");
                        sb6.append(c17);
                        sb6.append(" occurs in more than one required character set");
                        throw new com.google.android.gms.auth.api.credentials.PasswordSpecification.zze(sb6.toString());
                    }
                    zArr[i18] = true;
                }
            }
            return new com.google.android.gms.auth.api.credentials.PasswordSpecification(com.google.android.gms.auth.api.credentials.PasswordSpecification.zzd(this.zzdp), this.zzdj, this.zzdk, this.zzdl, this.zzdm);
        }

        public final com.google.android.gms.auth.api.credentials.PasswordSpecification.zzd zzd(java.lang.String str, int i17) {
            this.zzdj.add(com.google.android.gms.auth.api.credentials.PasswordSpecification.zzd(zzd(str, "requiredChars")));
            this.zzdk.add(1);
            return this;
        }

        private static java.util.TreeSet<java.lang.Character> zzd(java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str)) {
                throw new com.google.android.gms.auth.api.credentials.PasswordSpecification.zze(java.lang.String.valueOf(str2).concat(" cannot be null or empty"));
            }
            java.util.TreeSet<java.lang.Character> treeSet = new java.util.TreeSet<>();
            for (char c17 : str.toCharArray()) {
                if (com.google.android.gms.auth.api.credentials.PasswordSpecification.zzd(c17, 32, 126)) {
                    throw new com.google.android.gms.auth.api.credentials.PasswordSpecification.zze(java.lang.String.valueOf(str2).concat(" must only contain ASCII printable characters"));
                }
                treeSet.add(java.lang.Character.valueOf(c17));
            }
            return treeSet;
        }
    }

    /* loaded from: classes13.dex */
    public static class zze extends java.lang.Error {
        public zze(java.lang.String str) {
            super(str);
        }
    }

    public PasswordSpecification(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.Integer> list2, int i17, int i18) {
        this.zzdi = str;
        java.util.List<java.lang.String> unmodifiableList = java.util.Collections.unmodifiableList(list);
        this.zzdj = unmodifiableList;
        this.zzdk = java.util.Collections.unmodifiableList(list2);
        this.zzdl = i17;
        this.zzdm = i18;
        int[] iArr = new int[95];
        java.util.Arrays.fill(iArr, -1);
        java.util.Iterator<java.lang.String> it = unmodifiableList.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            int length = it.next().toCharArray().length;
            for (int i27 = 0; i27 < length; i27++) {
                iArr[r8[i27] - ' '] = i19;
            }
            i19++;
        }
        this.zzdn = iArr;
        this.zzdo = new java.security.SecureRandom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String zzd(java.util.Collection<java.lang.Character> collection) {
        char[] cArr = new char[collection.size()];
        java.util.Iterator<java.lang.Character> it = collection.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            cArr[i17] = it.next().charValue();
            i17++;
        }
        return new java.lang.String(cArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zzdi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 2, this.zzdj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerList(parcel, 3, this.zzdk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzdl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzdm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(int i17, int i18, int i19) {
        return i17 < 32 || i17 > 126;
    }
}
