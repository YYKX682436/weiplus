package w30;

/* loaded from: classes11.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6188x2fff9ac3 f524195d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6188x2fff9ac3 c6188x2fff9ac3) {
        super(0);
        this.f524195d = c6188x2fff9ac3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6188x2fff9ac3 c6188x2fff9ac3 = this.f524195d;
        if ((c6188x2fff9ac3.f136446g.f89482b & 1) != 1) {
            e01.f o17 = c01.d9.b().o();
            am.sz szVar = c6188x2fff9ac3.f136446g;
            java.lang.String str = szVar.f89481a;
            if (str == null) {
                str = "";
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o17.c(str, "showtype"), "2")) {
                e01.f o18 = c01.d9.b().o();
                java.lang.String str2 = szVar.f89481a;
                o18.b(str2 != null ? str2 : "");
            }
        }
        return jz5.f0.f384359a;
    }
}
