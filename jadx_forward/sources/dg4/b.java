package dg4;

/* loaded from: classes15.dex */
public class b implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2245xd97a0892.ActivityC18503x48fe0024 f313887a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2245xd97a0892.ActivityC18503x48fe0024 activityC18503x48fe0024) {
        this.f313887a = activityC18503x48fe0024;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2245xd97a0892.ActivityC18503x48fe0024 activityC18503x48fe0024 = this.f313887a;
        if (z17) {
            activityC18503x48fe0024.f253694h |= 32;
        } else {
            activityC18503x48fe0024.f253694h &= -33;
        }
        activityC18503x48fe0024.f253693g.put(4, z17 ? 1 : 2);
    }
}
