package yj5;

/* loaded from: classes5.dex */
public final class a0 extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public xj5.l f544237f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f544238g = new yj5.z(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f536418g;
        return xj5.a.f536428t;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerInfo, "talkerInfo");
        long c17 = c01.id.c();
        xj5.l lVar = this.f544237f;
        if (lVar != null) {
            long j17 = lVar.f536446x - c17;
            if (j17 > 0 && j17 < 5000) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(lVar);
                return linkedList;
            }
            this.f544237f = null;
        }
        return null;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.p314xaae8f345.mm.ui.p2738xb1dfbddb.d tipsBarContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.a0(ui6, tipsBarContext, this);
    }
}
