package wo1;

/* loaded from: classes5.dex */
public final class e extends wo1.m {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f529452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12855xae28020b f529453f;

    public e(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12855xae28020b c12855xae28020b) {
        this.f529453f = c12855xae28020b;
        java.lang.String[] stringArray = context.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559552b0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray, "getStringArray(...)");
        this.f529452e = c12855xae28020b.m174236x67a7a614() ? stringArray : (java.lang.String[]) kz5.z.p0(stringArray, new e06.k(0, 1));
    }

    @Override // wo1.m
    public java.lang.String[] a() {
        return this.f529452e;
    }

    @Override // wo1.m
    public void c(int i17, java.util.List convList) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convList, "convList");
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        str = this.f529453f.TAG;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Invalid position=" + i17);
                        return;
                    }
                    if (convList.size() > 1) {
                        kz5.g0.t(convList, new wo1.b());
                    }
                } else if (convList.size() > 1) {
                    kz5.g0.t(convList, new wo1.d());
                }
            } else if (convList.size() > 1) {
                kz5.g0.t(convList, new wo1.a());
            }
        } else if (convList.size() > 1) {
            kz5.g0.t(convList, new wo1.c());
        }
        this.f529521d = i17;
    }
}
