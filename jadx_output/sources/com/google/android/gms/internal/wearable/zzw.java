package com.google.android.gms.internal.wearable;

/* loaded from: classes16.dex */
public final class zzw {
    private static final int zzhn = 11;
    private static final int zzho = 12;
    private static final int zzhp = 16;
    private static final int zzhq = 26;
    private static final int[] zzhr = new int[0];
    public static final long[] zzhs = new long[0];
    public static final float[] zzht = new float[0];
    private static final double[] zzhu = new double[0];
    private static final boolean[] zzhv = new boolean[0];
    public static final java.lang.String[] zzhw = new java.lang.String[0];
    private static final byte[][] zzhx = new byte[0];
    public static final byte[] zzhy = new byte[0];

    public static final int zzb(com.google.android.gms.internal.wearable.zzk zzkVar, int i17) {
        int position = zzkVar.getPosition();
        zzkVar.zzd(i17);
        int i18 = 1;
        while (zzkVar.zzj() == i17) {
            zzkVar.zzd(i17);
            i18++;
        }
        zzkVar.zzc(position, i17);
        return i18;
    }
}
