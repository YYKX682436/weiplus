package pb1;

/* loaded from: classes7.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final android.os.ParcelUuid f434691a;

    static {
        android.os.ParcelUuid.fromString("0000110B-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("0000110A-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("0000110D-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("00001108-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("00001112-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("0000111E-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("0000111F-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("0000110E-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("0000110C-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("00001105-0000-1000-8000-00805f9b34fb");
        android.os.ParcelUuid.fromString("00001124-0000-1000-8000-00805f9b34fb");
        android.os.ParcelUuid.fromString("00001812-0000-1000-8000-00805f9b34fb");
        android.os.ParcelUuid.fromString("00001115-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("00001116-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("0000000f-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("0000112f-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("00001134-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("00001133-0000-1000-8000-00805F9B34FB");
        android.os.ParcelUuid.fromString("00001132-0000-1000-8000-00805F9B34FB");
        f434691a = android.os.ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    }

    public static android.os.ParcelUuid a(byte[] bArr) {
        long j17;
        if (bArr == null) {
            throw new java.lang.IllegalArgumentException("uuidBytes cannot be null");
        }
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new java.lang.IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 16) {
            java.nio.ByteBuffer order = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            return new android.os.ParcelUuid(new java.util.UUID(order.getLong(8), order.getLong(0)));
        }
        if (length == 2) {
            j17 = (bArr[0] & 255) + ((bArr[1] & 255) << 8);
        } else {
            j17 = ((bArr[3] & 255) << 24) + (bArr[0] & 255) + ((bArr[1] & 255) << 8) + ((bArr[2] & 255) << 16);
        }
        android.os.ParcelUuid parcelUuid = f434691a;
        return new android.os.ParcelUuid(new java.util.UUID(parcelUuid.getUuid().getMostSignificantBits() + (j17 << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }
}
