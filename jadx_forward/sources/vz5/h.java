package vz5;

/* loaded from: classes14.dex */
public final class h extends vz5.k {

    /* renamed from: b, reason: collision with root package name */
    public boolean f523322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vz5.j jVar, java.io.File rootFile) {
        super(rootFile);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootFile, "rootFile");
    }

    @Override // vz5.k
    public java.io.File a() {
        if (this.f523322b) {
            return null;
        }
        this.f523322b = true;
        return this.f523329a;
    }
}
