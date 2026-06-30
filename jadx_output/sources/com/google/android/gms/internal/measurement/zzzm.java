package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzzm<FieldDescriptorType extends com.google.android.gms.internal.measurement.zzzo<FieldDescriptorType>> {
    private static final com.google.android.gms.internal.measurement.zzzm zzbru = new com.google.android.gms.internal.measurement.zzzm(true);
    private boolean zzbls;
    private final com.google.android.gms.internal.measurement.zzaay<FieldDescriptorType, java.lang.Object> zzbrs;
    private boolean zzbrt;

    private zzzm() {
        this.zzbrt = false;
        this.zzbrs = com.google.android.gms.internal.measurement.zzaay.zzag(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzzs) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.measurement.zzzu) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.measurement.zzabp r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.zzzr.checkNotNull(r3)
            int[] r0 = com.google.android.gms.internal.measurement.zzzn.zzbrv
            com.google.android.gms.internal.measurement.zzabu r2 = r2.zzuv()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L41;
                case 2: goto L3e;
                case 3: goto L3b;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L32;
                case 7: goto L29;
                case 8: goto L20;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L44
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzaal
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzzu
            if (r2 == 0) goto L1e
            goto L43
        L1e:
            r0 = r1
            goto L43
        L20:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzzs
            if (r2 == 0) goto L1e
            goto L43
        L29:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzyw
            if (r2 != 0) goto L43
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L1e
            goto L43
        L32:
            boolean r0 = r3 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r3 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r3 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r3 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r3 instanceof java.lang.Integer
        L43:
            r1 = r0
        L44:
            if (r1 == 0) goto L47
            return
        L47:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzzm.zza(com.google.android.gms.internal.measurement.zzabp, java.lang.Object):void");
    }

    public static <T extends com.google.android.gms.internal.measurement.zzzo<T>> com.google.android.gms.internal.measurement.zzzm<T> zzti() {
        return zzbru;
    }

    public final /* synthetic */ java.lang.Object clone() {
        com.google.android.gms.internal.measurement.zzzm zzzmVar = new com.google.android.gms.internal.measurement.zzzm();
        for (int i17 = 0; i17 < this.zzbrs.zzuj(); i17++) {
            java.util.Map.Entry<FieldDescriptorType, java.lang.Object> zzah = this.zzbrs.zzah(i17);
            zzzmVar.zza((com.google.android.gms.internal.measurement.zzzm) zzah.getKey(), zzah.getValue());
        }
        for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : this.zzbrs.zzuk()) {
            zzzmVar.zza((com.google.android.gms.internal.measurement.zzzm) entry.getKey(), entry.getValue());
        }
        zzzmVar.zzbrt = this.zzbrt;
        return zzzmVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzzm) {
            return this.zzbrs.equals(((com.google.android.gms.internal.measurement.zzzm) obj).zzbrs);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzbrs.hashCode();
    }

    public final java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> iterator() {
        return this.zzbrt ? new com.google.android.gms.internal.measurement.zzzx(this.zzbrs.entrySet().iterator()) : this.zzbrs.entrySet().iterator();
    }

    private zzzm(boolean z17) {
        this.zzbrt = false;
        com.google.android.gms.internal.measurement.zzaay<FieldDescriptorType, java.lang.Object> zzag = com.google.android.gms.internal.measurement.zzaay.zzag(0);
        this.zzbrs = zzag;
        if (this.zzbls) {
            return;
        }
        zzag.zzrg();
        this.zzbls = true;
    }

    private final void zza(FieldDescriptorType fielddescriptortype, java.lang.Object obj) {
        if (!fielddescriptortype.zztk()) {
            zza(fielddescriptortype.zztj(), obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            int size = arrayList.size();
            int i17 = 0;
            while (i17 < size) {
                java.lang.Object obj2 = arrayList.get(i17);
                i17++;
                zza(fielddescriptortype.zztj(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzzu) {
            this.zzbrt = true;
        }
        this.zzbrs.zza((com.google.android.gms.internal.measurement.zzaay<FieldDescriptorType, java.lang.Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }
}
