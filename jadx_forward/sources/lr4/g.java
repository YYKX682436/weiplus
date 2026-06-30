package lr4;

/* loaded from: classes11.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr4.k f402264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f402265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(lr4.k kVar, l75.w0 w0Var) {
        super(0);
        this.f402264d = kVar;
        this.f402265e = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kr4.o oVar;
        java.lang.Object obj = this.f402265e.f398509d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.w1wpersonalmsg.storage.W1wContact");
        lr4.k kVar = this.f402264d;
        java.util.HashMap hashMap = kVar.f402277g;
        kr4.n Vi = ((fr4.g0) i95.n0.c(fr4.g0.class)).Vi();
        java.lang.String str = ((kr4.e) obj).f68903xdec927b;
        if (str == null || str.length() == 0) {
            oVar = new kr4.o();
        } else {
            java.lang.String Di = ((fr4.g0) i95.n0.c(fr4.g0.class)).Di();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = Vi.f393053e;
            kr4.o oVar2 = (kr4.o) concurrentHashMap.get(str + '_' + Di);
            if (oVar2 == null) {
                android.database.Cursor B = Vi.f393052d.B("select * , rowid from W1wSessionInfo  where talkerUserName = '" + str + "' and selfUserName = '" + Di + '\'', null);
                try {
                    if (B.moveToFirst()) {
                        kr4.o oVar3 = new kr4.o();
                        oVar3.mo9015xbf5d97fd(B);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = Vi.f393054f;
                        java.lang.String field_sessionId = oVar3.f69158xbed8694c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                        concurrentHashMap2.put(field_sessionId, oVar3);
                        concurrentHashMap.put(str + '_' + Di, oVar3);
                        vz5.b.a(B, null);
                        oVar = oVar3;
                    } else {
                        vz5.b.a(B, null);
                        oVar = null;
                    }
                } finally {
                }
            } else {
                oVar = oVar2;
            }
        }
        java.lang.String str2 = oVar != null ? oVar.f69158xbed8694c : null;
        if (str2 == null) {
            str2 = "";
        }
        kr4.g gVar = (kr4.g) hashMap.get(str2);
        int c07 = kz5.n0.c0(kVar.f402276f, gVar);
        if (gVar != null) {
            gVar.t0();
        }
        kVar.m8147xed6e4d18(c07);
        return jz5.f0.f384359a;
    }
}
