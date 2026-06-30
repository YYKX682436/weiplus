package n20;

/* loaded from: classes9.dex */
public final class l implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10553x87335109 f415759a;

    public l(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10553x87335109 c10553x87335109) {
        this.f415759a = c10553x87335109;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.Map e17 = kz5.b1.e(new jz5.l("click_type", "buy_btn"));
        java.lang.String g07 = e17.isEmpty() ? null : kz5.n0.g0(e17.entrySet(), ";", "{", "}", 0, null, b30.d.f99093d, 24, null);
        l20.o0 callback = this.f415759a.getCallback();
        java.util.Map mo44382x29c21c7c = callback != null ? callback.mo44382x29c21c7c() : null;
        if (mo44382x29c21c7c == null) {
            mo44382x29c21c7c = kz5.q0.f395534d;
        }
        return kz5.c1.m(mo44382x29c21c7c, kz5.b1.e(new jz5.l("element_info", g07)));
    }
}
