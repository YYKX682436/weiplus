package q4;

/* loaded from: classes13.dex */
public class i extends q4.h implements p4.i {

    /* renamed from: e, reason: collision with root package name */
    public final android.database.sqlite.SQLiteStatement f441554e;

    public i(android.database.sqlite.SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f441554e = sQLiteStatement;
    }

    public int a() {
        return this.f441554e.executeUpdateDelete();
    }
}
