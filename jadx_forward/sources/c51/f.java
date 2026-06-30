package c51;

/* loaded from: classes10.dex */
public final class f extends c51.e {

    /* renamed from: o, reason: collision with root package name */
    public final d51.a f120172o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d51.a loadConfig) {
        super(loadConfig);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadConfig, "loadConfig");
        this.f120172o = loadConfig;
    }

    @Override // c51.e
    public void e(c51.c result) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PAGLoadTask", " result:" + result);
        boolean z17 = result instanceof c51.b;
        d51.a aVar = this.f120172o;
        if (z17) {
            org.p3363xbe4143f1.C29690xfae77312 m154716x243906 = org.p3363xbe4143f1.C29690xfae77312.m154716x243906(((c51.b) result).f120162a);
            yz5.l lVar2 = aVar.f308053d;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(m154716x243906);
            }
        } else if ((result instanceof c51.a) && (lVar = aVar.f308053d) != null) {
            lVar.mo146xb9724478(null);
        }
        aVar.f308053d = null;
    }
}
