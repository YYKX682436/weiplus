package ty2;

/* loaded from: classes9.dex */
public final class j extends ty2.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1687xed8dccef.C15512x7615df4d f504605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, ty2.z config) {
        super(context, ty2.q.f504641h, config);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f504605d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1687xed8dccef.C15512x7615df4d(context);
    }

    @Override // ty2.b
    public android.view.View b(bw5.q5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ty2.z zVar = this.f504593c;
        ty2.c cVar = zVar.f504664f;
        ty2.i iVar = cVar instanceof ty2.i ? (ty2.i) cVar : null;
        if (iVar == null) {
            iVar = new ty2.i(null, true, true, true);
        }
        int i17 = zVar.f504663e;
        java.lang.String source = a();
        boolean z17 = iVar.f504602b;
        boolean z18 = iVar.f504603c;
        boolean z19 = iVar.f504604d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1687xed8dccef.C15512x7615df4d c15512x7615df4d = this.f504605d;
        c15512x7615df4d.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        android.content.Context context = c15512x7615df4d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1687xed8dccef.C15512x7615df4d c15512x7615df4d2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1687xed8dccef.C15512x7615df4d(context);
        java.lang.Float f17 = iVar.f504601a;
        c15512x7615df4d.a(c15512x7615df4d.b(c15512x7615df4d2, new ty2.p(item, f17 != null ? f17.floatValue() : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1687xed8dccef.C15512x7615df4d.f218482m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1687xed8dccef.C15512x7615df4d.f218483n, i17, z17, z18, z19)), source);
        return c15512x7615df4d;
    }
}
