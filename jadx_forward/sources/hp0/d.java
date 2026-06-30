package hp0;

/* loaded from: classes10.dex */
public class d extends hp0.i {

    /* renamed from: b, reason: collision with root package name */
    public final hp0.h f364441b;

    public d(byte[] bArr, java.lang.String str, hp0.h hVar) {
        super(bArr);
        this.f364441b = hVar;
    }

    @Override // hp0.i
    public jp0.f a() {
        return this.f364441b.a(this.f364447a);
    }

    @Override // hp0.i
    public void b(java.io.OutputStream stream) {
        byte[] data = (byte[]) this.f364447a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stream, "stream");
        try {
            stream.write(data);
        } catch (android.system.ErrnoException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Loader.DiskFunction", e17, "", new java.lang.Object[0]);
        }
    }
}
