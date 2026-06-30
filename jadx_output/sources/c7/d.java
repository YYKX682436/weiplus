package c7;

/* loaded from: classes13.dex */
public abstract class d implements w6.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f39517d;

    public d(java.lang.Object obj) {
        q7.n.b(obj);
        this.f39517d = obj;
    }

    @Override // w6.z0
    public java.lang.Class a() {
        return this.f39517d.getClass();
    }

    @Override // w6.z0
    public final java.lang.Object get() {
        return this.f39517d;
    }

    @Override // w6.z0
    public final int getSize() {
        return 1;
    }

    @Override // w6.z0
    public void recycle() {
    }
}
