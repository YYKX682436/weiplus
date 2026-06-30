package qj1;

/* loaded from: classes4.dex */
public final class a extends l75.f0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l75.e0 f445398d = l75.f0.m145246x3593deb(qj1.a.class);

    /* renamed from: field_key */
    @l75.m0(m145248x25c2d86c = "$$invalid", m145249xb40240fd = 1)
    public java.lang.String f76485x4b6e619a;

    /* renamed from: field_value */
    public byte[] f76486x29f571ec;

    @Override // l75.f0
    /* renamed from: convertFrom */
    public void mo9015xbf5d97fd(android.database.Cursor cursor) {
        this.f76485x4b6e619a = cursor.getString(0);
        this.f76486x29f571ec = cursor.getBlob(1);
    }

    @Override // l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        android.content.ContentValues contentValues = new android.content.ContentValues(2);
        contentValues.put("key", this.f76485x4b6e619a);
        contentValues.put("value", this.f76486x29f571ec);
        return contentValues;
    }

    @Override // l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f445398d;
    }
}
