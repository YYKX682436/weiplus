package al0;

/* loaded from: classes12.dex */
public class f implements java.io.Externalizable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f87245d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f87246e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f87247f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f87248g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f87249h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f87250i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f87251m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f87252n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f87253o = new java.util.concurrent.atomic.AtomicInteger(0);

    public f(al0.a aVar) {
    }

    @Override // java.io.Externalizable
    public void readExternal(java.io.ObjectInput objectInput) {
        synchronized (al0.g.f87258e) {
            this.f87245d = objectInput.readUTF();
            this.f87246e = objectInput.readUTF();
            this.f87249h = objectInput.readInt();
            this.f87250i = objectInput.readInt();
            this.f87251m = objectInput.readLong();
            this.f87247f = "";
            this.f87248g = false;
            this.f87252n = 0L;
            this.f87253o = new java.util.concurrent.atomic.AtomicInteger(0);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(java.io.ObjectOutput objectOutput) {
        synchronized (al0.g.f87258e) {
            objectOutput.writeUTF(this.f87245d);
            objectOutput.writeUTF(this.f87246e);
            objectOutput.writeInt(this.f87249h);
            objectOutput.writeInt(this.f87250i);
            objectOutput.writeLong(this.f87251m);
        }
    }
}
