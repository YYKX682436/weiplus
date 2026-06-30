package c61;

/* loaded from: classes.dex */
public final class h8 implements db2.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f39021a;

    public h8(yz5.p pVar) {
        this.f39021a = pVar;
    }

    @Override // db2.z0
    public void a(int i17, int i18, java.lang.String str, r45.v71 resp) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(resp, "resp");
        yz5.p pVar = this.f39021a;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderUtilService", "requestLiveNoticeList: failed, errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
            pVar.invoke(java.lang.Boolean.FALSE, null);
            return;
        }
        r45.j32 j32Var = (r45.j32) resp.getCustom(4);
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", "requestLiveNoticeList: success, noticeCount=" + ((j32Var == null || (list = j32Var.getList(0)) == null) ? 0 : list.size()));
        if (j32Var != null) {
            kotlin.jvm.internal.o.f(j32Var.getList(0), "getNotice_info(...)");
            if (!r6.isEmpty()) {
                pVar.invoke(java.lang.Boolean.TRUE, j32Var);
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FinderUtilService", "requestLiveNoticeList: notice_list_info is empty");
        pVar.invoke(java.lang.Boolean.FALSE, null);
    }
}
