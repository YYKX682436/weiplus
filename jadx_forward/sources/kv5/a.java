package kv5;

/* loaded from: classes16.dex */
public class a implements cv5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.io.ByteArrayInputStream f394285a;

    public a(kv5.f fVar, java.io.ByteArrayInputStream byteArrayInputStream) {
        this.f394285a = byteArrayInputStream;
    }

    @Override // cv5.a
    /* renamed from: readByte */
    public byte mo9119xcc4273be() {
        return (byte) (this.f394285a.read() & 255);
    }
}
