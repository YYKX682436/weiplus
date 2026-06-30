package ua1;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f507451a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f507452b = 0;

    /* renamed from: c, reason: collision with root package name */
    public short f507453c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f507454d = 0;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f507455e = null;

    public synchronized byte[] a() {
        if (!this.f507451a) {
            return null;
        }
        try {
            int m48785xb9d12c3 = com.p314xaae8f345.mm.p1006xc5476f33.ap.C11507x90b85d77.m48785xb9d12c3(this.f507452b, this.f507455e, this.f507453c);
            if (m48785xb9d12c3 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAudioMixer", "[hilive] getData " + m48785xb9d12c3);
            }
            return this.f507455e;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerGetMixedPCM Exception " + e17.getMessage());
            return null;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerGetMixedPCM UnsatisfiedLinkError " + e18.getMessage());
            return null;
        }
    }

    public synchronized boolean b(int i17, short s17) {
        int i18;
        try {
            try {
                try {
                    if (this.f507451a) {
                        i18 = 0;
                    } else {
                        i18 = com.p314xaae8f345.mm.p1006xc5476f33.ap.C11507x90b85d77.m48784x3b516066("libvoipCodec.so");
                        this.f507452b = com.p314xaae8f345.mm.p1006xc5476f33.ap.C11507x90b85d77.m48786x21903262(128, i17, 40);
                        this.f507451a = true;
                        this.f507453c = s17;
                        int i19 = 2 * (((s17 * i17) * 40) / 1000);
                        this.f507454d = i19;
                        this.f507455e = new byte[i19];
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameLiveAudioMixer", "[hilive] init outputSamplerate: " + i17 + " outputChannel: " + ((int) s17) + " outputSize: " + this.f507454d + " handle: " + this.f507452b + " code: " + i18);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAudioMixer", e17.getMessage());
                    return this.f507451a;
                }
            } catch (java.lang.UnsatisfiedLinkError e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAudioMixer", e18.getMessage());
                return this.f507451a;
            }
        } catch (java.lang.Throwable unused) {
            return this.f507451a;
        }
        return this.f507451a;
    }

    public synchronized boolean c(short s17, short s18, int i17, byte[] bArr) {
        if (!this.f507451a) {
            return false;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.ap.C11507x90b85d77.m48787x586106fd(this.f507452b, (short) (((40 * i17) / 1000) << 1), s17, s18, i17, bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerInsertRawPCM Exception " + e17.getMessage());
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerInsertRawPCM UnsatisfiedLinkError " + e18.getMessage());
        }
        return true;
    }
}
