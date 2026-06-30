package wo1;

/* loaded from: classes5.dex */
public final class i extends wo1.m {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String[] f529479e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12856xc25e966b f529480f;

    public i(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12856xc25e966b c12856xc25e966b) {
        this.f529480f = c12856xc25e966b;
        java.lang.String[] stringArray = context.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559552b0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray, "getStringArray(...)");
        this.f529479e = (java.lang.String[]) kz5.z.n0(stringArray, new e06.k(2, 3)).toArray(new java.lang.String[0]);
    }

    @Override // wo1.m
    public java.lang.String[] a() {
        return this.f529479e;
    }

    @Override // wo1.m
    public void c(int i17, java.util.List convList) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convList, "convList");
        if (i17 != 0) {
            if (i17 != 1) {
                str = this.f529480f.TAG;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Invalid position=" + i17);
                return;
            }
            if (convList.size() > 1) {
                kz5.g0.t(convList, new wo1.g());
            }
        } else if (convList.size() > 1) {
            kz5.g0.t(convList, new wo1.h());
        }
        this.f529521d = i17;
    }
}
