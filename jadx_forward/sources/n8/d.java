package n8;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final n8.d f417014c = new n8.d(new int[]{2}, 2);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f417015a;

    /* renamed from: b, reason: collision with root package name */
    public final int f417016b;

    public d(int[] iArr, int i17) {
        if (iArr != null) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.f417015a = copyOf;
            java.util.Arrays.sort(copyOf);
        } else {
            this.f417015a = new int[0];
        }
        this.f417016b = i17;
    }

    public static n8.d a(android.content.Context context) {
        android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        return (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f417014c : new n8.d(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    /* renamed from: equals */
    public boolean m149204xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8.d)) {
            return false;
        }
        n8.d dVar = (n8.d) obj;
        return java.util.Arrays.equals(this.f417015a, dVar.f417015a) && this.f417016b == dVar.f417016b;
    }

    /* renamed from: hashCode */
    public int m149205x8cdac1b() {
        return this.f417016b + (java.util.Arrays.hashCode(this.f417015a) * 31);
    }

    /* renamed from: toString */
    public java.lang.String m149206x9616526c() {
        return "AudioCapabilities[maxChannelCount=" + this.f417016b + ", supportedEncodings=" + java.util.Arrays.toString(this.f417015a) + "]";
    }
}
