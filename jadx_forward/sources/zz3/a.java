package zz3;

/* loaded from: classes5.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f559238e = {l75.n0.m145250x3fdc6f77(fz3.a.f348825x, "ScanHistoryItem")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f559239d;

    public a(l75.k0 k0Var) {
        super(k0Var, fz3.a.f348825x, "ScanHistoryItem", null);
        this.f559239d = k0Var;
    }

    @Override // l75.n0
    /* renamed from: getAll */
    public android.database.Cursor mo78085xb5882a6b() {
        return this.f559239d.B("select * from ScanHistoryItem order by ScanTime desc", null);
    }
}
