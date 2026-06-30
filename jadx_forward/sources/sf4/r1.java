package sf4;

/* loaded from: classes4.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.lang.String str) {
        super(0);
        this.f489108d = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        java.lang.Long l17;
        sf4.u1 u1Var = sf4.u1.f489116a;
        java.lang.String str = this.f489108d;
        java.util.Iterator it = sf4.u1.f489124i.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, ((sf4.q1) obj).f489106c)) {
                break;
            }
        }
        sf4.q1 q1Var = (sf4.q1) obj;
        if (q1Var != null) {
            sf4.u1.f489124i.remove(q1Var);
        }
        boolean z17 = true;
        if (sf4.u1.f489118c == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryVideoPreloadMgr", "upgrades mediaId " + str + " runningMediaId " + sf4.u1.f489128m + " selectMediaId " + sf4.u1.f489129n);
            java.lang.Long l18 = sf4.u1.f489128m;
            long j17 = sf4.u1.f489129n;
            if (l18 == null || l18.longValue() != j17 || ((l17 = sf4.u1.f489128m) != null && l17.longValue() == 0)) {
                z17 = false;
            }
            u1Var.m(z17);
        }
        sf4.u1.f489117b.getClass();
        return jz5.f0.f384359a;
    }
}
