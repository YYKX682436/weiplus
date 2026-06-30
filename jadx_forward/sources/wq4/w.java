package wq4;

/* loaded from: classes14.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 f530228d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65) {
        this.f530228d = c18924x4c862f65;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = this.f530228d;
        if (c18924x4c862f65.f258611z) {
            c18924x4c862f65.f258597l.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f652 = this.f530228d;
            c18924x4c862f652.f258611z = false;
            c18924x4c862f652.f258592g = null;
            c18924x4c862f652.getClass();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "detach finish");
        }
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.B;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e17) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("OpenGlRender", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
