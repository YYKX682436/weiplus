package dc;

/* loaded from: classes16.dex */
public abstract class j {

    /* renamed from: d, reason: collision with root package name */
    public final long f310164d;

    /* renamed from: e, reason: collision with root package name */
    public long f310165e;

    /* renamed from: f, reason: collision with root package name */
    public dc.h f310166f;

    /* renamed from: g, reason: collision with root package name */
    public int f310167g;

    public j(long j17, dc.o oVar) {
        new java.util.ArrayList();
        this.f310164d = j17;
    }

    public ec.a h() {
        return this.f310166f.f310158i.f310187a;
    }

    public dc.e i() {
        return this.f310166f.f310158i.b(this.f310165e);
    }

    public int j() {
        return this.f310167g;
    }

    public long k() {
        dc.m mVar = this.f310166f.f310158i;
        dc.q qVar = dc.q.OBJECT;
        int i17 = mVar.f310191e[2];
        if (i17 == 1) {
            return ((ec.b) h()).c();
        }
        if (i17 == 2) {
            return ((ec.b) h()).f();
        }
        if (i17 == 4) {
            return ((ec.b) h()).d();
        }
        if (i17 != 8) {
            return 0L;
        }
        return ((ec.b) h()).e();
    }

    public java.lang.Object l(dc.q qVar) {
        switch (qVar.ordinal()) {
            case 0:
                return this.f310166f.f310158i.d(k());
            case 1:
                return java.lang.Boolean.valueOf(((ec.b) h()).c() != 0);
            case 2:
                ec.b bVar = (ec.b) h();
                char c17 = bVar.f332459b[bVar.a()].getChar(bVar.b());
                bVar.f332461d += 2;
                return java.lang.Character.valueOf(c17);
            case 3:
                ec.b bVar2 = (ec.b) h();
                float f17 = bVar2.f332459b[bVar2.a()].getFloat(bVar2.b());
                bVar2.f332461d += 4;
                return java.lang.Float.valueOf(f17);
            case 4:
                ec.b bVar3 = (ec.b) h();
                double d17 = bVar3.f332459b[bVar3.a()].getDouble(bVar3.b());
                bVar3.f332461d += 8;
                return java.lang.Double.valueOf(d17);
            case 5:
                return java.lang.Byte.valueOf(((ec.b) h()).c());
            case 6:
                return java.lang.Short.valueOf(((ec.b) h()).f());
            case 7:
                return java.lang.Integer.valueOf(((ec.b) h()).d());
            case 8:
                return java.lang.Long.valueOf(((ec.b) h()).e());
            default:
                return null;
        }
    }
}
