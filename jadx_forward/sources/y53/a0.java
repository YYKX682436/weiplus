package y53;

/* loaded from: classes8.dex */
public final class a0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f541001e = {l75.n0.m145250x3fdc6f77(y53.m.C, "GameLifeContact")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f541002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(l75.k0 storage) {
        super(storage, y53.m.C, "GameLifeContact", dm.m5.f319991p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        l75.e0 e0Var = y53.m.C;
        this.f541002d = storage;
    }

    public final y53.m y0(java.lang.String username) {
        y53.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.database.Cursor f17 = this.f541002d.f("SELECT *, rowid FROM GameLifeContact WHERE username = " + d95.b0.O(username), null, 2);
        boolean z17 = false;
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    z17 = true;
                }
            } finally {
            }
        }
        if (z17) {
            mVar = new y53.m();
            mVar.mo9015xbf5d97fd(f17);
        } else {
            mVar = null;
        }
        vz5.b.a(f17, null);
        return mVar;
    }
}
