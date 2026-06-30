package fc3;

/* loaded from: classes9.dex */
public final class d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc3.e f342551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f342552e;

    public d(fc3.e eVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f342551d = eVar;
        this.f342552e = f0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f342552e;
        fc3.e eVar = this.f342551d;
        try {
            if (eVar.f342563g == f0Var.f391649d && (list = eVar.f342562f) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                if (list.size() > eVar.f342563g) {
                    java.util.List list2 = eVar.f342562f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
                    z21.c cVar = (z21.c) list2.get(eVar.f342563g);
                    fc3.f fVar = fc3.f.f342573a;
                    java.lang.String str = eVar.f342568l;
                    java.lang.String str2 = eVar.f342569m;
                    int i17 = eVar.f342570n;
                    int i18 = eVar.f342571o;
                    java.lang.String timeMs = cVar.f551093b;
                    java.lang.String keyword = cVar.f551092a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(timeMs, "timeMs");
                    long parseLong = java.lang.Long.parseLong(timeMs);
                    int i19 = f0Var.f391649d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keyword, "keyword");
                    fVar.a(str, str2, i17, i18, parseLong, i19, keyword, eVar.f342566j);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keyword, "keyword");
                    eVar.d(keyword);
                    eVar.f342563g++;
                    f0Var.f391649d++;
                    eVar.e();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
        }
        return false;
    }
}
