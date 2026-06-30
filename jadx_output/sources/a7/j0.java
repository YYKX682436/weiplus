package a7;

/* loaded from: classes13.dex */
public class j0 implements u6.e {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f1830f = {"_data"};

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f1831d;

    /* renamed from: e, reason: collision with root package name */
    public final android.net.Uri f1832e;

    public j0(android.content.Context context, android.net.Uri uri) {
        this.f1831d = context;
        this.f1832e = uri;
    }

    @Override // u6.e
    public java.lang.Class a() {
        return java.io.File.class;
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
        android.database.Cursor query = this.f1831d.getContentResolver().query(this.f1832e, f1830f, null, null, null);
        if (query != null) {
            try {
                r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
            } finally {
                query.close();
            }
        }
        if (!android.text.TextUtils.isEmpty(r0)) {
            dVar.c(new java.io.File(r0));
            return;
        }
        dVar.d(new java.io.FileNotFoundException("Failed to find file path for: " + this.f1832e));
    }

    @Override // u6.e
    public void h() {
    }
}
