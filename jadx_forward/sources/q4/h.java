package q4;

/* loaded from: classes13.dex */
public class h implements p4.g {

    /* renamed from: d, reason: collision with root package name */
    public final android.database.sqlite.SQLiteProgram f441553d;

    public h(android.database.sqlite.SQLiteProgram sQLiteProgram) {
        this.f441553d = sQLiteProgram;
    }

    @Override // p4.g
    /* renamed from: bindBlob */
    public void mo145063x37f7617a(int i17, byte[] bArr) {
        this.f441553d.bindBlob(i17, bArr);
    }

    @Override // p4.g
    /* renamed from: bindDouble */
    public void mo145064x1b3baa6e(int i17, double d17) {
        this.f441553d.bindDouble(i17, d17);
    }

    @Override // p4.g
    /* renamed from: bindLong */
    public void mo145065x37fbf859(int i17, long j17) {
        this.f441553d.bindLong(i17, j17);
    }

    @Override // p4.g
    /* renamed from: bindNull */
    public void mo145066x37fcf764(int i17) {
        this.f441553d.bindNull(i17);
    }

    @Override // p4.g
    /* renamed from: bindString */
    public void mo145067x35198eae(int i17, java.lang.String str) {
        this.f441553d.bindString(i17, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f441553d.close();
    }
}
