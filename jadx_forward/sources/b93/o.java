package b93;

/* loaded from: classes.dex */
public class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        if (java.lang.System.currentTimeMillis() - ((java.lang.Long) c01.d9.b().p().l(209408, 0L)).longValue() > 86400000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.PostTaskGetContactLabelListener", "cpan[callback] get contact label list.");
            c01.d9.e().g(new e93.d());
            c01.d9.b().p().w(209408, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 86400000) + 1800000));
        }
        return false;
    }
}
