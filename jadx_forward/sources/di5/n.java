package di5;

/* loaded from: classes12.dex */
public final class n extends mf3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
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
            rf3.u uVar = new rf3.u(apiCenter);
            arrayList.add(uVar);
            apiCenter.d(rf3.q.class, uVar);
            di5.m mVar = new di5.m(apiCenter);
            arrayList.add(mVar);
            apiCenter.d(rf3.h.class, mVar);
            eg3.g gVar = new eg3.g(apiCenter);
            arrayList.add(gVar);
            apiCenter.d(eg3.b.class, gVar);
            xVar = new mf3.x(apiCenter, arrayList);
        } else {
            if (ordinal != 2) {
                return new mf3.h(apiCenter);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            fg3.v vVar = new fg3.v(apiCenter);
            arrayList2.add(vVar);
            apiCenter.d(fg3.p.class, vVar);
            fg3.o oVar = new fg3.o(apiCenter);
            arrayList2.add(oVar);
            apiCenter.d(fg3.h.class, oVar);
            di5.s sVar = new di5.s(apiCenter);
            arrayList2.add(sVar);
            apiCenter.d(fg3.a.class, sVar);
            xVar = new mf3.x(apiCenter, arrayList2);
        }
        return xVar;
    }
}
