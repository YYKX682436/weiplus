package hu4;

/* loaded from: classes9.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public long f366767a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f366768b = 0;

    public hu4.l a(byte[] bArr) {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr));
        try {
            this.f366767a = dataInputStream.readLong();
            this.f366768b = dataInputStream.readLong();
            dataInputStream.close();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TimeInfo", e17, "", new java.lang.Object[0]);
        }
        return this;
    }
}
