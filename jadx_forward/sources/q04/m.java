package q04;

/* loaded from: classes4.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q04.r f440918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q04.r rVar) {
        super(0);
        this.f440918d = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        long c17 = c01.id.c();
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(r04.a.class);
        }
        r04.d dVar = (r04.d) ((r04.a) a17).P6(r04.d.class);
        p75.n0 n0Var = dm.ba.f317441o;
        n0Var.getClass();
        p75.d dVar2 = dm.ba.f317442p;
        java.lang.String value = java.lang.String.valueOf(c01.id.c());
        dVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.lang.String column = dVar2.z();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(column, "column");
        p75.p pVar = p75.p.f434216h;
        java.lang.String tag = dVar.f449889h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var.f434209a;
        java.lang.String str = column + ' ' + pVar + " ?";
        java.lang.String[] strArr = {value};
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(table, "table");
        l75.k0 Q4 = dVar.f274680g.Q4();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "cleanExpireData result:" + ((Q4 != null ? Q4.mo70514xb06685ab(table, str, strArr) : -1) > 0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f440918d.f440931d, "cleanExpireData cost:" + (c01.id.c() - c17));
        return jz5.f0.f384359a;
    }
}
