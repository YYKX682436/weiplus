package rq1;

/* loaded from: classes12.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480304d;

    public n0(java.lang.String str) {
        this.f480304d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178 c12961x71d22178 = com.p314xaae8f345.mm.p1006xc5476f33.box.C12961x71d22178.f35372x4fbc8495;
            if (c12961x71d22178.m54294x3586704f(this.f480304d) == 0) {
                c12961x71d22178.m54271xa6c12865();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Box.PluginBox", e17, "[updateWordBankRes]", new java.lang.Object[0]);
        }
    }
}
