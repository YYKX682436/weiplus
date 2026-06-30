package uj;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj.i f509688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(uj.i iVar) {
        super(0);
        this.f509688d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u3 b17 = this.f509688d.f509689d.b();
        if (b17 != null) {
            str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8) b17).b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPkgPath(...)");
        } else {
            str = "";
        }
        return ((str.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(str)) ? com.p314xaae8f345.mm.vfs.w6.p(str) : "MagicPlayableService";
    }
}
