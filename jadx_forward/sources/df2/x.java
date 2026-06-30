package df2;

/* loaded from: classes3.dex */
public final class x extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.y f313283b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(df2.y yVar, java.lang.Class cls) {
        super(cls);
        this.f313283b = yVar;
    }

    @Override // dk2.cb
    public void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.nb2 result = (r45.nb2) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        df2.y yVar = this.f313283b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(yVar.f313365m, "polling success, enable_show_guide_info:" + result.m75933x41a8a7f2(0) + ", guide_wording:" + result.m75945x2fec8307(1));
        yVar.f313366n = result;
    }
}
