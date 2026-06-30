package android.os;

/* loaded from: classes16.dex */
public class HapticPlayer {
    private static final java.lang.String TAG = "HapticPlayer";
    android.os.DynamicEffect mEffect;

    private HapticPlayer() {
    }

    public static boolean isAvailable() {
        return false;
    }

    public void start(int i17) {
    }

    public void stop() {
    }

    public void updateAmplitude(int i17) {
    }

    public void updateFrequency(int i17) {
    }

    public void updateInterval(int i17) {
    }

    public void updateParameter(int i17, int i18, int i19) {
    }

    public HapticPlayer(android.os.DynamicEffect dynamicEffect) {
        this();
        this.mEffect = dynamicEffect;
    }

    public void start(int i17, int i18, int i19) {
    }

    public void start(int i17, int i18, int i19, int i27) {
    }
}
