package ud;

/* loaded from: classes7.dex */
public abstract class c extends ud.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t jsRuntime) {
        super(context, jsRuntime);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsRuntime, "jsRuntime");
    }

    @Override // ud.g
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        wd.g gVar = wd.g.f526217a;
        com.p314xaae8f345.p485x5dc4f1ad.C4209xd2d3ddad c4209xd2d3ddad = this.f508102c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4209xd2d3ddad);
        gVar.a(c4209xd2d3ddad, runtime, false);
    }

    @Override // ud.g
    public void d(com.p314xaae8f345.p485x5dc4f1ad.a builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        super.d(builder);
        builder.f130145n.b(builder, com.p314xaae8f345.p485x5dc4f1ad.c0.I[7], java.lang.Boolean.TRUE);
        builder.e(gh.b.ChoreographerInMainThread);
    }
}
