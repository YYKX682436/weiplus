package wq4;

/* loaded from: classes14.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 f530230d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65) {
        this.f530230d = c18924x4c862f65;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f530230d.f258610y) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "attachGLContext");
            this.f530230d.f258610y = !r0.f258597l.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65 = this.f530230d;
            c18924x4c862f65.f258592g = null;
            c18924x4c862f65.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "attach finish");
        }
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.C;
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
