package cm5;

/* loaded from: classes8.dex */
public class i extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final l75.e0 f43435g = new l75.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f43436d;

    /* renamed from: e, reason: collision with root package name */
    public int f43437e;

    /* renamed from: f, reason: collision with root package name */
    public final st0.g f43438f = new st0.g();

    @Override // l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        this.f43438f.convertFrom(cursor);
        int columnIndex = cursor.getColumnIndex("content");
        this.f43436d = columnIndex >= 0 ? cursor.getString(columnIndex) : null;
        int columnIndex2 = cursor.getColumnIndex("type");
        this.f43437e = columnIndex2 >= 0 ? cursor.getInt(columnIndex2) : 0;
    }

    @Override // l75.f0
    public android.content.ContentValues convertTo() {
        return null;
    }

    @Override // l75.f0
    public l75.e0 getDBInfo() {
        return f43435g;
    }
}
