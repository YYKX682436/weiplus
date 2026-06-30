package sn1;

/* loaded from: classes8.dex */
public class p0 extends sn1.i {

    /* renamed from: u, reason: collision with root package name */
    public final wn1.l f491605u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.m f491606v;

    public p0(java.util.LinkedList linkedList, long j17, long j18) {
        wn1.l lVar = new wn1.l();
        this.f491605u = lVar;
        this.f491606v = new wn1.m();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRequestSessionScene", "init sessionName[%d], startTime[%d], endTime[%d]", java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        lVar.f528970d = linkedList;
        lVar.f528971e = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            this.f491605u.f528971e.add(java.lang.Long.valueOf(j17));
            this.f491605u.f528971e.add(java.lang.Long.valueOf(j18));
        }
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f M() {
        return this.f491605u;
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f N() {
        return this.f491606v;
    }

    @Override // sn1.i
    public void P(int i17) {
        wn1.m mVar = this.f491606v;
        java.util.LinkedList linkedList = mVar.f528972d;
        if (linkedList != null && mVar.f528973e != null && !linkedList.isEmpty() && mVar.f528972d.size() * 2 == mVar.f528973e.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName size[%d], name:%s", java.lang.Integer.valueOf(mVar.f528972d.size()), mVar.f528972d.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRequestSessionScene", "onSceneEnd requestsession resp, TimeInterval:%s", mVar.f528973e.toString());
            J(0, 0, "BackupRequestSession success");
        } else {
            java.util.LinkedList linkedList2 = mVar.f528972d;
            if (linkedList2 != null && mVar.f528973e != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupRequestSessionScene", "onSceneEnd sessionName and TimeInterval size error. sessionName size[%d], timeInterval size[%d]", java.lang.Integer.valueOf(linkedList2.size()), java.lang.Integer.valueOf(mVar.f528973e.size()));
            }
            J(4, -1, "BackupRequestSession failed");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 11;
    }
}
