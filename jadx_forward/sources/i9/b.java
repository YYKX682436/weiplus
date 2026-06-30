package i9;

/* loaded from: classes15.dex */
public abstract class b extends o8.j implements i9.e {
    public b(java.lang.String str) {
        super(new i9.i[2], new i9.j[2]);
        int i17 = this.f425154g;
        o8.g[] gVarArr = this.f425152e;
        t9.a.d(i17 == gVarArr.length);
        for (o8.g gVar : gVarArr) {
            gVar.n(1024);
        }
    }

    @Override // i9.e
    public void b(long j17) {
    }

    public abstract i9.d f(byte[] bArr, int i17, boolean z17);
}
