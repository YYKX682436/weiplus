package p000;

/* loaded from: classes10.dex */
public final class y extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p000.x f539830f = new p000.x(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f539831g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String f539832h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f539833i;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f539834d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f539835e;

    static {
        l75.e0 e0Var = jv2.b.L;
        f539831g = new java.lang.String[]{l75.n0.m145250x3fdc6f77(jv2.b.L, "UniAction")};
        f539832h = "UniAction";
        java.lang.String[] INDEX_CREATE = dm.mb.f320104u;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(INDEX_CREATE, "INDEX_CREATE");
        java.util.List C0 = kz5.z.C0(INDEX_CREATE);
        java.util.ArrayList arrayList = (java.util.ArrayList) C0;
        arrayList.add("CREATE INDEX IF NOT EXISTS " + jv2.b.M + " ON UniAction ( actionType,state,postTime )");
        arrayList.add("CREATE INDEX IF NOT EXISTS " + jv2.b.N + " ON UniAction (actionType,feedId, postTime)");
        f539833i = (java.lang.String[]) C0.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(l75.k0 db6) {
        super(db6, jv2.b.L, "UniAction", f539833i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = jv2.b.L;
        this.f539834d = db6;
        this.f539835e = "SELECT * FROM UniAction";
    }

    public final boolean D0(long j17, jv2.a comment, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        android.content.ContentValues mo9763xeb27878e = comment.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z18 = this.f539834d.p("UniAction", mo9763xeb27878e, "localCommentId=?", new java.lang.String[]{sb6.toString()}) > 0;
        if (z17) {
            y0(comment.f67478xf9a02e3e, comment.t0(), comment.f67480xf609be94, 3, comment);
        }
        return z18;
    }

    public final void y0(long j17, long j18, long j19, int i17, jv2.a aVar) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6184xdf3e09db c6184xdf3e09db = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6184xdf3e09db();
        am.oz ozVar = c6184xdf3e09db.f136442g;
        ozVar.f89118a = j17;
        ozVar.getClass();
        ozVar.getClass();
        ozVar.f89119b = i17;
        ozVar.f89120c = aVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusActionStorage", "postEvent, feedId:" + j17 + ", commentId:" + j18 + ", localId:" + j19 + ", opType:" + i17);
        c6184xdf3e09db.e();
    }

    public final boolean z0(long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(j17);
        boolean z17 = this.f539834d.mo70514xb06685ab("UniAction", "localCommentId=?", new java.lang.String[]{sb6.toString()}) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusActionStorage", "removeUnsentComment " + j17 + " ret:" + z17);
        return z17;
    }
}
