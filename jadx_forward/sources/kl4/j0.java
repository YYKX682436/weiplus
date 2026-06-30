package kl4;

/* loaded from: classes15.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f390453d;

    public j0(kl4.k0 k0Var) {
        this.f390453d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k0 k0Var = this.f390453d;
        if (k0Var.f390462d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f390481z, "writeToAudioTrack audioTrack is null");
            return;
        }
        try {
            if (k0Var.f390471p == null) {
                k0Var.f390471p = kl4.k0.a(k0Var);
                k0Var.f390472q = 0;
            }
            byte[] bArr = k0Var.f390471p;
            if (bArr != null) {
                if ((!(bArr.length == 0)) && !k0Var.f390469n) {
                    int i17 = k0Var.f390475t;
                    int i18 = i17 / 3;
                    int length = bArr.length;
                    int i19 = k0Var.f390472q;
                    int i27 = length - i19;
                    if (i27 > i18) {
                        android.media.AudioTrack audioTrack = k0Var.f390462d;
                        r12 = audioTrack != null ? audioTrack.write(bArr, i19, i18, 1) : -1;
                        if (r12 > 0) {
                            k0Var.f390472q += r12;
                            return;
                        }
                        return;
                    }
                    if (i27 <= 0) {
                        r12 = 0;
                    } else if (k0Var.f390470o) {
                        byte[] bArr2 = new byte[i17];
                        for (int i28 = 0; i28 < i17; i28++) {
                            bArr2[i28] = 0;
                        }
                        int i29 = k0Var.f390472q;
                        kz5.v.l(bArr, bArr2, 0, i29, i29 + i27, 2, null);
                        android.media.AudioTrack audioTrack2 = k0Var.f390462d;
                        if (audioTrack2 != null) {
                            r12 = audioTrack2.write(bArr2, 0, k0Var.f390475t, 1);
                        }
                    } else {
                        android.media.AudioTrack audioTrack3 = k0Var.f390462d;
                        if (audioTrack3 != null) {
                            r12 = audioTrack3.write(bArr, i19, i27, 1);
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f390481z, "writeToAudioTrack: " + r12 + " bytes, buffer remaining: " + i27 + ", bufferHasMore: " + k0Var.f390470o);
                    if (r12 >= 0) {
                        k0Var.f390472q = 0;
                        k0Var.f390471p = null;
                    }
                    if (k0Var.f390470o) {
                        return;
                    }
                    k0Var.f();
                    return;
                }
            }
            if (k0Var.f390470o || !((java.util.ArrayList) k0Var.f390463e).isEmpty() || k0Var.f390469n) {
                return;
            }
            k0Var.e(kl4.b0.f390421h);
        } catch (java.lang.Exception e17) {
            rk4.k5.d(k0Var.f390481z, "AudioTrack write exception: " + e17.getMessage());
        }
    }
}
