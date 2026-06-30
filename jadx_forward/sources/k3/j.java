package k3;

/* loaded from: classes13.dex */
public class j implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385327a;

    public j(java.lang.String str) {
        this.f385327a = str;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        k3.k kVar = (k3.k) obj;
        synchronized (k3.l.f385332c) {
            x.n nVar = k3.l.f385333d;
            java.util.ArrayList arrayList = (java.util.ArrayList) nVar.m174751x4aabfc28(this.f385327a, null);
            if (arrayList == null) {
                return;
            }
            nVar.m174754xc84af884(this.f385327a);
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                ((m3.a) arrayList.get(i17)).mo3938xab27b508(kVar);
            }
        }
    }
}
