package vh5;

/* loaded from: classes12.dex */
public final class c extends mf3.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // mf3.m
    public mf3.n O0(android.content.Context context, mf3.p apiCenter, mf3.u type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiCenter, "apiCenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        if (vh5.b.f518735a[type.ordinal()] != 1) {
            return new mf3.h(apiCenter);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        uf3.g gVar = new uf3.g(apiCenter);
        arrayList.add(gVar);
        apiCenter.d(uf3.c.class, gVar);
        wh5.s sVar = new wh5.s(apiCenter);
        arrayList.add(sVar);
        apiCenter.d(uf3.a.class, sVar);
        wh5.k0 k0Var = new wh5.k0(apiCenter);
        arrayList.add(k0Var);
        apiCenter.d(vh5.p.class, k0Var);
        return new mf3.x(apiCenter, arrayList);
    }
}
