package lt3;

/* loaded from: classes4.dex */
public final class h extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f402774e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f402775f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f402776d;

    static {
        l75.e0 e0Var = lt3.g.f402773y0;
        java.lang.String str = lt3.g.f402771l1;
        f402774e = new java.lang.String[]{l75.n0.m145250x3fdc6f77(e0Var, str)};
        f402775f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l75.k0 db6) {
        super(db6, lt3.g.f402773y0, lt3.g.f402771l1, lt3.g.f402772p1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = lt3.g.f402773y0;
        this.f402776d = db6;
    }

    public final lt3.g y0(java.lang.String taskId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        java.lang.String format = java.lang.String.format("select * from %s where %s=\"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{f402775f, "taskId", taskId}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.database.Cursor m145256x1d3f4980 = m145256x1d3f4980(format, new java.lang.String[0]);
        if (m145256x1d3f4980 != null) {
            try {
                if (m145256x1d3f4980.moveToFirst()) {
                    lt3.g gVar = new lt3.g();
                    gVar.mo9015xbf5d97fd(m145256x1d3f4980);
                    vz5.b.a(m145256x1d3f4980, null);
                    return gVar;
                }
                vz5.b.a(m145256x1d3f4980, null);
            } finally {
            }
        }
        return null;
    }

    public final int z0(java.lang.String taskId, lt3.g editorData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editorData, "editorData");
        android.content.ContentValues mo9763xeb27878e = editorData.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        return this.f402776d.p(f402775f, mo9763xeb27878e, "taskId=?", new java.lang.String[]{taskId});
    }
}
