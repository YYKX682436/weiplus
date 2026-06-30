package ie0;

@j95.b
/* loaded from: classes9.dex */
public class m extends i95.w implements je0.i {
    public boolean Ai() {
        return android.os.Build.VERSION.SDK_INT >= 28 && !se4.h.f488458a && se4.h.f488459b == 2;
    }

    public boolean wi() {
        android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
        if (d17 == null) {
            return false;
        }
        return d17.getBoolean("init_success", false);
    }
}
