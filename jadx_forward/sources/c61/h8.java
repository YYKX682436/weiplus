package c61;

/* loaded from: classes.dex */
public final class h8 implements db2.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f120554a;

    public h8(yz5.p pVar) {
        this.f120554a = pVar;
    }

    @Override // db2.z0
    public void a(int i17, int i18, java.lang.String str, r45.v71 resp) {
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        yz5.p pVar = this.f120554a;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderUtilService", "requestLiveNoticeList: failed, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
            return;
        }
        r45.j32 j32Var = (r45.j32) resp.m75936x14adae67(4);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", "requestLiveNoticeList: success, noticeCount=" + ((j32Var == null || (m75941xfb821914 = j32Var.m75941xfb821914(0)) == null) ? 0 : m75941xfb821914.size()));
        if (j32Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j32Var.m75941xfb821914(0), "getNotice_info(...)");
            if (!r6.isEmpty()) {
                pVar.mo149xb9724478(java.lang.Boolean.TRUE, j32Var);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderUtilService", "requestLiveNoticeList: notice_list_info is empty");
        pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
    }
}
