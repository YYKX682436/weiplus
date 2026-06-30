package ws2;

/* loaded from: classes3.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.y f530680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ws2.y yVar) {
        super(0);
        this.f530680d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ws2.y yVar = this.f530680d;
        r45.i72 i72Var = (r45.i72) ((mm2.e1) yVar.c(mm2.e1.class)).f410521r.m75936x14adae67(44);
        long m75942xfb822ef2 = i72Var != null ? i72Var.m75942xfb822ef2(1) : 0L;
        if (m75942xfb822ef2 <= 0) {
            return "";
        }
        java.lang.String string = yVar.f530625b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dtv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{zl2.r4.S(zl2.r4.f555483a, m75942xfb822ef2, 0, 2, null)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
