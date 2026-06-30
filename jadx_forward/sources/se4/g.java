package se4;

/* loaded from: classes9.dex */
public class g implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ re4.z f488457a;

    public g(re4.z zVar) {
        this.f488457a = zVar;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        nm5.b bVar = (nm5.b) obj;
        int intValue = ((java.lang.Integer) bVar.a(0)).intValue();
        java.lang.String str = (java.lang.String) bVar.a(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterInitManager", "onInterrupt errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intValue), str);
        re4.z zVar = this.f488457a;
        if (zVar != null) {
            zVar.h(intValue, str);
        }
        se4.h.b(intValue, str);
    }
}
