package a7;

/* loaded from: classes13.dex */
public class h implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1825d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.g f1826e;

    public h(byte[] bArr, a7.g gVar) {
        this.f1825d = bArr;
        this.f1826e = gVar;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return this.f1826e.a();
    }

    @Override // u6.e
    public t6.a b() {
        return t6.a.LOCAL;
    }

    @Override // u6.e
    public void cancel() {
    }

    @Override // u6.e
    public void e(com.bumptech.glide.g gVar, u6.d dVar) {
        dVar.c(this.f1826e.b(this.f1825d));
    }

    @Override // u6.e
    public void h() {
    }
}
