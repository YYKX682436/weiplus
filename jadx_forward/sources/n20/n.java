package n20;

/* loaded from: classes9.dex */
public final class n implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public long f415762a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10554x8fea218 f415763b;

    public n(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10554x8fea218 c10554x8fea218) {
        this.f415763b = c10554x8fea218;
    }

    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_exp");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.v3.C10554x8fea218 c10554x8fea218 = this.f415763b;
        if (b17) {
            this.f415762a = java.lang.System.currentTimeMillis();
            return kz5.c1.s(c10554x8fea218.mo44382x29c21c7c());
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_unexp")) {
            return null;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("stay_duration", java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - this.f415762a) / 1000)));
        return kz5.c1.m(kz5.c1.s(c10554x8fea218.mo44382x29c21c7c()), kz5.b1.e(new jz5.l("element_info", e17.isEmpty() ? null : kz5.n0.g0(e17.entrySet(), ";", "{", "}", 0, null, b30.d.f99093d, 24, null))));
    }
}
