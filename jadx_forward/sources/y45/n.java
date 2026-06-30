package y45;

/* loaded from: classes11.dex */
public class n implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m3.a f540911a;

    public n(m3.a aVar) {
        this.f540911a = aVar;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = num.intValue();
        if (intValue > 60 || intValue > 20) {
            d55.u.d("MicroMsg.recovery.operator", "Failed to get patch: %s", num);
        }
        this.f540911a.mo3938xab27b508(num);
    }
}
