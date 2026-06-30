package a31;

/* loaded from: classes14.dex */
public class r implements z21.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 f82527a;

    public r(com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924) {
        this.f82527a = c11154x38c1a924;
    }

    public void a(java.lang.String[] strArr, long j17) {
        com.p314xaae8f345.mm.p964x2822171a.ui.C11154x38c1a924 c11154x38c1a924 = this.f82527a;
        if (strArr != null) {
            try {
                strArr.toString();
                for (java.lang.String str : strArr) {
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoiceSearchLayout", e17, "", new java.lang.Object[0]);
                return;
            }
        }
        c11154x38c1a924.f();
        a31.v vVar = ((a31.u) c11154x38c1a924.f153288e).f82528a;
        y90.j jVar = vVar.f82532u;
        if (jVar != null) {
            jVar.o2(true, strArr, j17, vVar.f82531t);
        }
    }
}
