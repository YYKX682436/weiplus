package yj5;

/* loaded from: classes5.dex */
public final class v extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public final e01.g f544266f = new yj5.u(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536427s;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        android.app.Activity g17 = this.f280113d.g();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i iVar = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i.CHATTING_SECURITY_BANNER_V2;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = talkerInfo.f542275a;
        java.lang.String str = talkerInfo.f542276b;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        objArr[2] = java.lang.Boolean.valueOf(talkerInfo.f542278d);
        s35.a a17 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j.a(g17, iVar, objArr);
        java.util.Objects.toString(a17);
        if (a17 == null || ((s35.b) a17).f484376h == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new xj5.j(a17));
        return linkedList;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.z(ui6, tipsBarContext, this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        c01.d9.b().o().a(this.f544266f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        if (gm0.j1.b().m()) {
            e01.f o17 = c01.d9.b().o();
            ((java.util.ArrayList) o17.f327371a).remove(this.f544266f);
        }
    }
}
