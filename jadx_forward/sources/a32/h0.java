package a32;

/* loaded from: classes10.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 f82551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5) {
        super(1);
        this.f82551d = c13394xa8c361b5;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        t85.d dVar = (t85.d) obj;
        r45.p64 p64Var = dVar != null ? dVar.f497989a : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = this.f82551d;
        c13394xa8c361b5.f180213u = p64Var;
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 reporter = c13394xa8c361b5.getReporter();
            r45.p64 p64Var2 = dVar.f497989a;
            if (reporter != null) {
                java.lang.String str = p64Var2.f464325d;
                java.lang.String str2 = p64Var2.f464327f;
                reporter.A = str;
                reporter.D = str2;
                reporter.B = dVar.f497990b;
                reporter.C = dVar.f497991c;
                reporter.e(23);
            }
            c13394xa8c361b5.f180211s = p64Var2;
            c13394xa8c361b5.f180212t = p64Var2.f464325d;
            fp0.u c17 = u85.i.f507240a.c(p64Var2);
            if (c17 == fp0.u.f346823f) {
                c13394xa8c361b5.c(c17);
            }
        }
        return jz5.f0.f384359a;
    }
}
