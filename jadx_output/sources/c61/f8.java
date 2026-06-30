package c61;

/* loaded from: classes.dex */
public final class f8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f38977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f38978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f38979c;

    public f8(java.util.LinkedList linkedList, yz5.p pVar, java.util.List list) {
        this.f38977a = linkedList;
        this.f38978b = pVar;
        this.f38979c = list;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        yz5.p pVar = this.f38978b;
        if (i17 == 0 && fVar.f70616b == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decryptExportNoticeIds: success, decrypted items size=");
            java.util.LinkedList list = ((r45.po1) fVar.f70618d).getList(1);
            sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", sb6.toString());
            java.util.LinkedList list2 = ((r45.po1) fVar.f70618d).getList(1);
            if (list2 == null || list2.size() != this.f38977a.size()) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("decryptExportNoticeIds: decrypted items size mismatch, expected=");
                sb7.append(this.f38979c.size());
                sb7.append(", actual=");
                sb7.append(list2 != null ? java.lang.Integer.valueOf(list2.size()) : null);
                com.tencent.mars.xlog.Log.e("MicroMsg.FinderUtilService", sb7.toString());
                pVar.invoke(java.lang.Boolean.FALSE, null);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    java.lang.String string = ((r45.qo1) it.next()).getString(1);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(string);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderUtilService", "decryptExportNoticeIds: decrypted noticeIds: " + arrayList);
                pVar.invoke(java.lang.Boolean.TRUE, arrayList);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderUtilService", "decryptExportNoticeIds: failed, errType=" + fVar.f70615a + ", errCode=" + fVar.f70616b + ", errMsg=" + fVar.f70617c);
            pVar.invoke(java.lang.Boolean.FALSE, null);
        }
        return jz5.f0.f302826a;
    }
}
