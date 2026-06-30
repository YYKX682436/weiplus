package com.google.android.gms.internal.measurement;

/* loaded from: classes16.dex */
public final class zzach {
    private static final int zzbxi = 11;
    private static final int zzbxj = 12;
    private static final int zzbxk = 16;
    private static final int zzbxl = 26;
    public static final int[] zzbti = new int[0];
    public static final long[] zzbxm = new long[0];
    private static final float[] zzbxn = new float[0];
    private static final double[] zzbxo = new double[0];
    private static final boolean[] zzbxp = new boolean[0];
    public static final java.lang.String[] zzbxq = new java.lang.String[0];
    private static final byte[][] zzbxr = new byte[0];
    public static final byte[] zzbxs = new byte[0];

    public static final int zzb(com.google.android.gms.internal.measurement.zzabv zzabvVar, int i17) {
        int position = zzabvVar.getPosition();
        zzabvVar.zzak(i17);
        int i18 = 1;
        while (zzabvVar.zzuw() == i17) {
            zzabvVar.zzak(i17);
            i18++;
        }
        zzabvVar.zzd(position, i17);
        return i18;
    }
}
