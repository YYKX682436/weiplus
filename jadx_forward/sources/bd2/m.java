package bd2;

/* loaded from: classes2.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f100801a;

    public m(long j17) {
        this.f100801a = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NoInterestedLogic", "[CgiFinderFeedBack] errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152149b == 0 && fVar.f152148a == 0) {
            cu2.u.f303974a.b(this.f100801a);
        }
        return jz5.f0.f384359a;
    }
}
