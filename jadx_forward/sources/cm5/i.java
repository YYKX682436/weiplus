package cm5;

/* loaded from: classes8.dex */
public class i extends l75.f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final l75.e0 f124968g = new l75.e0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f124969d;

    /* renamed from: e, reason: collision with root package name */
    public int f124970e;

    /* renamed from: f, reason: collision with root package name */
    public final st0.g f124971f = new st0.g();

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        this.f124971f.mo9015xbf5d97fd(cursor);
        int columnIndex = cursor.getColumnIndex("content");
        this.f124969d = columnIndex >= 0 ? cursor.getString(columnIndex) : null;
        int columnIndex2 = cursor.getColumnIndex("type");
        this.f124970e = columnIndex2 >= 0 ? cursor.getInt(columnIndex2) : 0;
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        return null;
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f124968g;
    }
}
