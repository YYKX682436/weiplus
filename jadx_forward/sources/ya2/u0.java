package ya2;

/* loaded from: classes10.dex */
public final class u0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542086a;

    public u0(android.content.Context context) {
        this.f542086a = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        if ((i17 == 0 && fVar.f152149b == 0) || hc2.p.b(i17, fVar.f152149b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "FinderImmersiveFeedUI not exists");
        } else {
            ya2.e1.i(ya2.e1.f542005a, this.f542086a, fVar.f152149b, fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
