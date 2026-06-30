package ss2;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.l f493480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry2.r0 f493481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ss2.l lVar, ry2.r0 r0Var, long j17) {
        super(0);
        this.f493480d = lVar;
        this.f493481e = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        ss2.l lVar = this.f493480d;
        ry2.o P6 = lVar.P6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = lVar.m158354x19263085();
        ss2.d dVar = lVar.f493493i;
        if (dVar == null || (str = dVar.b().getText().toString()) == null) {
            str = "";
        }
        P6.b(m158354x19263085, str, this.f493481e, null, null, new java.util.LinkedList(), 2L, "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.QAPostMainUIC", "ready to post");
        pm0.v.X(new ss2.h(lVar));
        return jz5.f0.f384359a;
    }
}
