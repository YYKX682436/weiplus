package je2;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je2.n f380775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ je2.j f380776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(je2.n nVar, je2.j jVar) {
        super(0);
        this.f380775d = nVar;
        this.f380776e = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        je2.j jVar;
        java.lang.Object obj;
        je2.n nVar = this.f380775d;
        java.util.Iterator it = nVar.Q6().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            f0Var = null;
            jVar = this.f380776e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((je2.j) obj).f380770a, jVar.f380770a)) {
                break;
            }
        }
        je2.j jVar2 = (je2.j) obj;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = nVar.f380783n;
        java.lang.String str = nVar.f380778f;
        if (jVar2 != null) {
            if (jVar.f380771b.m75942xfb822ef2(2) > jVar2.f380771b.m75942xfb822ef2(2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "addGameDataBanner update game data:" + jVar2 + " to version:" + jVar.f380771b.m75942xfb822ef2(2) + '!');
                r45.wq1 wq1Var = jVar.f380771b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wq1Var, "<set-?>");
                jVar2.f380771b = wq1Var;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = jVar.f380772c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c19786x6a1e2862, "<set-?>");
                jVar2.f380772c = c19786x6a1e2862;
                if (jVar.a()) {
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var).e(java.lang.Boolean.TRUE);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "addGameDataBanner fail, old game data:" + jVar2 + " \n new game data:" + jVar + '!');
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            nVar.Q6().add(jVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "addGameDataBanner add game data " + jVar + '!');
            if (jVar.a()) {
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var).e(java.lang.Boolean.TRUE);
            }
        }
        return f0Var2;
    }
}
