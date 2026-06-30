package hf2;

/* loaded from: classes3.dex */
public final class s extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf2.x f362695b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hf2.x xVar, java.lang.Class cls) {
        super(cls);
        this.f362695b = xVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.yc2 result = (r45.yc2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if ((result.m75939xb282bd08(0) & 2) > 0) {
            hf2.x xVar = this.f362695b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f362714m, "#polling success MMFinderLiveesourceLoadFlag_Sticker,resource_load_flag:" + result.m75939xb282bd08(0));
            je2.g gVar = (je2.g) xVar.m56788xbba4bfc0(je2.g.class);
            r45.ca2 ca2Var = (r45.ca2) result.m75936x14adae67(2);
            synchronized (gVar) {
                if (ca2Var != null) {
                    gVar.U6();
                }
                gVar.W6(ca2Var);
            }
            je2.g gVar2 = (je2.g) xVar.m56788xbba4bfc0(je2.g.class);
            r45.da2 da2Var = (r45.da2) result.m75936x14adae67(3);
            synchronized (gVar2) {
                if (da2Var != null) {
                    gVar2.U6();
                }
                gVar2.X6(da2Var);
            }
        }
    }
}
