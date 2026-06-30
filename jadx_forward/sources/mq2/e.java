package mq2;

/* loaded from: classes15.dex */
public final class e implements bb5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mq2.h f412261a;

    public e(mq2.h hVar) {
        this.f412261a = hVar;
    }

    @Override // bb5.e
    public int a() {
        return this.f412261a.getCount();
    }

    @Override // bb5.e
    public java.lang.String b(int i17) {
        if (i17 >= 0) {
            mq2.h hVar = this.f412261a;
            if (i17 < hVar.getCount()) {
                r45.b64 b64Var = (r45.b64) ((java.util.LinkedList) hVar.f412272g.f203631p).get(i17);
                if (b64Var != null) {
                    return b64Var.f452083d;
                }
                return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NearbyPersonUIC", "pos is invalid");
        return null;
    }
}
