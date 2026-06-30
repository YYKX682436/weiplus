package a7;

/* loaded from: classes13.dex */
public class h implements u6.e {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f83358d;

    /* renamed from: e, reason: collision with root package name */
    public final a7.g f83359e;

    public h(byte[] bArr, a7.g gVar) {
        this.f83358d = bArr;
        this.f83359e = gVar;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return this.f83359e.a();
    }

    @Override // u6.e
    public t6.a b() {
        return t6.a.LOCAL;
    }

    @Override // u6.e
    /* renamed from: cancel */
    public void mo751xae7a2e7a() {
    }

    @Override // u6.e
    public void e(com.p147xb1cd08cc.p148x5de23a5.g gVar, u6.d dVar) {
        dVar.c(this.f83359e.b(this.f83358d));
    }

    @Override // u6.e
    public void h() {
    }
}
