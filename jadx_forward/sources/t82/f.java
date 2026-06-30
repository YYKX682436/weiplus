package t82;

/* loaded from: classes12.dex */
public final class f implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f497919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t82.r f497920b;

    public f(o72.r2 r2Var, t82.r rVar) {
        this.f497919a = r2Var;
        this.f497920b = rVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleDelete] positiveClick remove favItemInfo = ");
            o72.r2 favItemInfo = this.f497919a;
            sb6.append(favItemInfo.f67643xc8a07680);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavFinderFilterUI", sb6.toString());
            t82.r rVar = this.f497920b;
            rVar.Q6();
            int i17 = rVar.f497939g;
            t82.e eVar = new t82.e(rVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favItemInfo, "favItemInfo");
            o72.x1.k(favItemInfo, new t82.c(i17, eVar), 5);
        }
    }
}
