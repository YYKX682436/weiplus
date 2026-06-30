package c61;

/* loaded from: classes.dex */
public final class f8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f120510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f120511b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f120512c;

    public f8(java.util.LinkedList linkedList, yz5.p pVar, java.util.List list) {
        this.f120510a = linkedList;
        this.f120511b = pVar;
        this.f120512c = list;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        yz5.p pVar = this.f120511b;
        if (i17 == 0 && fVar.f152149b == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decryptExportNoticeIds: success, decrypted items size=");
            java.util.LinkedList m75941xfb821914 = ((r45.po1) fVar.f152151d).m75941xfb821914(1);
            sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", sb6.toString());
            java.util.LinkedList m75941xfb8219142 = ((r45.po1) fVar.f152151d).m75941xfb821914(1);
            if (m75941xfb8219142 == null || m75941xfb8219142.size() != this.f120510a.size()) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("decryptExportNoticeIds: decrypted items size mismatch, expected=");
                sb7.append(this.f120512c.size());
                sb7.append(", actual=");
                sb7.append(m75941xfb8219142 != null ? java.lang.Integer.valueOf(m75941xfb8219142.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderUtilService", sb7.toString());
                pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb8219142, 10));
                java.util.Iterator it = m75941xfb8219142.iterator();
                while (it.hasNext()) {
                    java.lang.String m75945x2fec8307 = ((r45.qo1) it.next()).m75945x2fec8307(1);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    arrayList.add(m75945x2fec8307);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderUtilService", "decryptExportNoticeIds: decrypted noticeIds: " + arrayList);
                pVar.mo149xb9724478(java.lang.Boolean.TRUE, arrayList);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FinderUtilService", "decryptExportNoticeIds: failed, errType=" + fVar.f152148a + ", errCode=" + fVar.f152149b + ", errMsg=" + fVar.f152150c);
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, null);
        }
        return jz5.f0.f384359a;
    }
}
