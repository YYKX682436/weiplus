package al0;

/* loaded from: classes12.dex */
public class f implements java.io.Externalizable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f5712d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f5713e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f5714f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f5715g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f5716h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f5717i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f5718m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f5719n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.util.concurrent.atomic.AtomicInteger f5720o = new java.util.concurrent.atomic.AtomicInteger(0);

    public f(al0.a aVar) {
    }

    @Override // java.io.Externalizable
    public void readExternal(java.io.ObjectInput objectInput) {
        synchronized (al0.g.f5725e) {
            this.f5712d = objectInput.readUTF();
            this.f5713e = objectInput.readUTF();
            this.f5716h = objectInput.readInt();
            this.f5717i = objectInput.readInt();
            this.f5718m = objectInput.readLong();
            this.f5714f = "";
            this.f5715g = false;
            this.f5719n = 0L;
            this.f5720o = new java.util.concurrent.atomic.AtomicInteger(0);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(java.io.ObjectOutput objectOutput) {
        synchronized (al0.g.f5725e) {
            objectOutput.writeUTF(this.f5712d);
            objectOutput.writeUTF(this.f5713e);
            objectOutput.writeInt(this.f5716h);
            objectOutput.writeInt(this.f5717i);
            objectOutput.writeLong(this.f5718m);
        }
    }
}
