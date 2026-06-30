package th5;

/* loaded from: classes12.dex */
public final class q0 extends mf3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // mf3.m
    public mf3.n O0(android.content.Context context, mf3.p apiCenter, mf3.u type) {
        mf3.x xVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            th5.d dVar = new th5.d(apiCenter);
            arrayList.add(dVar);
            apiCenter.d(rf3.q.class, dVar);
            th5.w wVar = new th5.w(apiCenter);
            arrayList.add(wVar);
            apiCenter.d(rf3.h.class, wVar);
            xVar = new mf3.x(apiCenter, arrayList);
        } else {
            if (ordinal != 3) {
                return new mf3.h(apiCenter);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            uf3.g gVar = new uf3.g(apiCenter);
            arrayList2.add(gVar);
            apiCenter.d(uf3.c.class, gVar);
            th5.l0 l0Var = new th5.l0(apiCenter);
            arrayList2.add(l0Var);
            apiCenter.d(uf3.a.class, l0Var);
            xVar = new mf3.x(apiCenter, arrayList2);
        }
        return xVar;
    }
}
