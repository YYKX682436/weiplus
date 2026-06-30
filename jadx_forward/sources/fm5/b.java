package fm5;

/* loaded from: classes12.dex */
public class b implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final fm5.a f345716d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f345717e;

    /* renamed from: f, reason: collision with root package name */
    public final int f345718f;

    public b(java.lang.Object obj, fm5.a aVar) {
        iz5.a.d("Callback should not be null!", obj);
        this.f345718f = obj.hashCode();
        this.f345717e = obj;
        this.f345716d = aVar;
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        fm5.a aVar = this.f345716d;
        iz5.a.d(null, aVar);
        synchronized (aVar) {
            aVar.f345714d.remove(this);
        }
    }

    /* renamed from: equals */
    public boolean m129797xb2c87fbf(java.lang.Object obj) {
        return obj != null && obj.hashCode() == this.f345718f;
    }

    /* renamed from: hashCode */
    public int m129798x8cdac1b() {
        return this.f345718f;
    }
}
