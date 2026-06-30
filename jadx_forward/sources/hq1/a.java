package hq1;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f364610a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f364611b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f364612c = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.bluetooth.BluetoothGattCharacteristic f364613d = null;

    public a(int i17) {
    }

    public byte[] a() {
        int i17 = this.f364612c;
        int i18 = this.f364611b;
        int i19 = i17 - i18;
        if (i19 == 0) {
            return null;
        }
        if (i19 >= 20) {
            i19 = 20;
        }
        byte[] bArr = new byte[i19];
        java.lang.System.arraycopy(this.f364610a, i18, bArr, 0, i19);
        this.f364611b += i19;
        return bArr;
    }
}
