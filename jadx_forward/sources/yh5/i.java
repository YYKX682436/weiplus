package yh5;

/* loaded from: classes12.dex */
public final class i extends mf3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // mf3.m
    public mf3.n O0(android.content.Context context, mf3.p apiCenter, mf3.u type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "CleanMediaViewHolderFactory.createHolder type=" + type);
        int ordinal = type.ordinal();
        if (ordinal == 1) {
            mf3.q qVar = new mf3.q(apiCenter);
            qVar.a(rf3.q.class, new rf3.u(apiCenter));
            qVar.a(rf3.h.class, new rf3.p(apiCenter));
            qVar.a(eg3.b.class, new eg3.g(apiCenter));
            qVar.a(pf3.h.class, new yh5.p(apiCenter));
            return new mf3.x(qVar.f407648a, qVar.f407649b);
        }
        if (ordinal != 2) {
            return new mf3.h(apiCenter);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        fg3.v vVar = new fg3.v(apiCenter);
        arrayList.add(vVar);
        apiCenter.d(fg3.p.class, vVar);
        yh5.q qVar2 = new yh5.q(apiCenter);
        arrayList.add(qVar2);
        apiCenter.d(fg3.h.class, qVar2);
        yh5.r rVar = new yh5.r(apiCenter);
        arrayList.add(rVar);
        apiCenter.d(pf3.h.class, rVar);
        return new mf3.x(apiCenter, arrayList);
    }
}
