package v72;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public long f515186a;

    /* renamed from: b, reason: collision with root package name */
    public int f515187b;

    /* renamed from: c, reason: collision with root package name */
    public long f515188c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f515189d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bq0 f515190e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rq0 f515191f;

    public e(v72.i iVar, v72.b bVar) {
    }

    public void a(android.database.Cursor cursor) {
        this.f515186a = cursor.getLong(0);
        this.f515187b = cursor.getInt(1);
        this.f515188c = cursor.getLong(2);
        this.f515189d = cursor.getString(3);
        byte[] blob = cursor.getBlob(4);
        if (blob == null || blob.length == 0) {
            this.f515190e = new r45.bq0();
        } else {
            this.f515190e = (r45.bq0) new r45.bq0().mo11468x92b714fd(blob);
        }
        byte[] blob2 = cursor.getBlob(5);
        if (blob2 == null || blob2.length == 0) {
            this.f515191f = null;
        } else {
            this.f515191f = (r45.rq0) new r45.rq0().mo11468x92b714fd(blob2);
        }
    }
}
