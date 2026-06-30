package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc;

/* renamed from: com.google.android.gms.auth.api.credentials.PasswordSpecification */
/* loaded from: classes13.dex */
public final class C1670x6e485a08 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08> f5602x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.zzm();

    /* renamed from: zzdg */
    public static final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08 f5603x394bc3 = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zzd().zzd(12, 16).zze("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").zzd("abcdefghijkmnopqrstxyz", 1).zzd("ABCDEFGHJKLMNPQRSTXY", 1).zzd("3456789", 1).zzj();

    /* renamed from: zzdh */
    private static final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08 f5604x394bc4 = new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zzd().zzd(12, 16).zze("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").zzd("abcdefghijklmnopqrstuvwxyz", 1).zzd("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).zzd("1234567890", 1).zzj();

    /* renamed from: zzdi */
    private final java.lang.String f5605x394bc5;

    /* renamed from: zzdj */
    private final java.util.List<java.lang.String> f5606x394bc6;

    /* renamed from: zzdk */
    private final java.util.List<java.lang.Integer> f5607x394bc7;

    /* renamed from: zzdl */
    private final int f5608x394bc8;

    /* renamed from: zzdm */
    private final int f5609x394bc9;

    /* renamed from: zzdn */
    private final int[] f5610x394bca;

    /* renamed from: zzdo */
    private final java.util.Random f5611x394bcb;

    /* renamed from: com.google.android.gms.auth.api.credentials.PasswordSpecification$zzd */
    /* loaded from: classes13.dex */
    public static class zzd {

        /* renamed from: zzdp */
        private final java.util.TreeSet<java.lang.Character> f5616x394bcc = new java.util.TreeSet<>();

        /* renamed from: zzdj */
        private final java.util.List<java.lang.String> f5612x394bc6 = new java.util.ArrayList();

        /* renamed from: zzdk */
        private final java.util.List<java.lang.Integer> f5613x394bc7 = new java.util.ArrayList();

        /* renamed from: zzdl */
        private int f5614x394bc8 = 12;

        /* renamed from: zzdm */
        private int f5615x394bc9 = 16;

        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zzd zzd(int i17, int i18) {
            this.f5614x394bc8 = 12;
            this.f5615x394bc9 = 16;
            return this;
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zzd zze(java.lang.String str) {
            this.f5616x394bcc.addAll(zzd(str, "allowedChars"));
            return this;
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08 zzj() {
            if (this.f5616x394bcc.isEmpty()) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zze("no allowed characters specified");
            }
            java.util.Iterator<java.lang.Integer> it = this.f5613x394bc7.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                i17 += it.next().intValue();
            }
            if (i17 > this.f5615x394bc9) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zze("required character count cannot be greater than the max password size");
            }
            boolean[] zArr = new boolean[95];
            java.util.Iterator<java.lang.String> it6 = this.f5612x394bc6.iterator();
            while (it6.hasNext()) {
                for (char c17 : it6.next().toCharArray()) {
                    int i18 = c17 - ' ';
                    if (zArr[i18]) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(58);
                        sb6.append("character ");
                        sb6.append(c17);
                        sb6.append(" occurs in more than one required character set");
                        throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zze(sb6.toString());
                    }
                    zArr[i18] = true;
                }
            }
            return new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zzd(this.f5616x394bcc), this.f5612x394bc6, this.f5613x394bc7, this.f5614x394bc8, this.f5615x394bc9);
        }

        public final com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zzd zzd(java.lang.String str, int i17) {
            this.f5612x394bc6.add(com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zzd(zzd(str, "requiredChars")));
            this.f5613x394bc7.add(1);
            return this;
        }

        private static java.util.TreeSet<java.lang.Character> zzd(java.lang.String str, java.lang.String str2) {
            if (android.text.TextUtils.isEmpty(str)) {
                throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zze(java.lang.String.valueOf(str2).concat(" cannot be null or empty"));
            }
            java.util.TreeSet<java.lang.Character> treeSet = new java.util.TreeSet<>();
            for (char c17 : str.toCharArray()) {
                if (com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zzd(c17, 32, 126)) {
                    throw new com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.zze(java.lang.String.valueOf(str2).concat(" must only contain ASCII printable characters"));
                }
                treeSet.add(java.lang.Character.valueOf(c17));
            }
            return treeSet;
        }
    }

    /* renamed from: com.google.android.gms.auth.api.credentials.PasswordSpecification$zze */
    /* loaded from: classes13.dex */
    public static class zze extends java.lang.Error {
        public zze(java.lang.String str) {
            super(str);
        }
    }

    public C1670x6e485a08(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.Integer> list2, int i17, int i18) {
        this.f5605x394bc5 = str;
        java.util.List<java.lang.String> unmodifiableList = java.util.Collections.unmodifiableList(list);
        this.f5606x394bc6 = unmodifiableList;
        this.f5607x394bc7 = java.util.Collections.unmodifiableList(list2);
        this.f5608x394bc8 = i17;
        this.f5609x394bc9 = i18;
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
        this.f5610x394bca = iArr;
        this.f5611x394bcb = new java.security.SecureRandom();
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
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18355x542d00d0(parcel, 1, this.f5605x394bc5, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18357x81443d8e(parcel, 2, this.f5606x394bc6, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18338x31f4d59d(parcel, 3, this.f5607x394bc7, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 4, this.f5608x394bc8);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 5, this.f5609x394bc9);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzd(int i17, int i18, int i19) {
        return i17 < 32 || i17 > 126;
    }
}
