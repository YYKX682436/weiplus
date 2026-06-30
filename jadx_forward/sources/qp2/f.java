package qp2;

/* loaded from: classes2.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h81 f447305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qp2.g f447306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.h81 h81Var, qp2.g gVar) {
        super(0);
        this.f447305d = h81Var;
        this.f447306e = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        nq2.d dVar = nq2.d.f420513a;
        r45.h81 h81Var = this.f447305d;
        java.util.LinkedList m75941xfb821914 = h81Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getTab_list(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyPreloadManager", "onGetLiveTabList tabSize:" + m75941xfb821914.size());
        java.util.LinkedList linkedList = nq2.d.f420516d;
        linkedList.clear();
        linkedList.addAll(m75941xfb821914);
        yz5.s sVar = this.f447306e.f447314n;
        if (sVar != null) {
            java.lang.String m75945x2fec83072 = h81Var.m75945x2fec8307(7);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            r45.ky1 ky1Var = (r45.ky1) h81Var.m75936x14adae67(2);
            if (ky1Var == null || (str = ky1Var.m75945x2fec8307(2)) == null) {
                str = "";
            }
            r45.ky1 ky1Var2 = (r45.ky1) h81Var.m75936x14adae67(2);
            java.lang.String str2 = (ky1Var2 == null || (m75945x2fec8307 = ky1Var2.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307;
            java.util.LinkedList m75941xfb8219142 = h81Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getTab_list(...)");
            sVar.v(m75945x2fec83072, str, str2, m75941xfb8219142, java.lang.Boolean.valueOf(h81Var.m75939xb282bd08(8) == 1));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveSquareTabFetcher", "onSceneEnd list:" + h81Var.m75941xfb821914(1));
        return jz5.f0.f384359a;
    }
}
