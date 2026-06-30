package ij4;

/* loaded from: classes11.dex */
public final class e implements bi4.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ij4.h f373251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ij4.d f373252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f373253c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f373254d;

    public e(ij4.h hVar, ij4.d dVar, in5.s0 s0Var, android.widget.RelativeLayout relativeLayout) {
        this.f373251a = hVar;
        this.f373252b = dVar;
        this.f373253c = s0Var;
        this.f373254d = relativeLayout;
    }

    @Override // bi4.m0
    public final void a(int i17, java.lang.Object obj) {
        bi4.m0 m0Var = this.f373251a.f373259e;
        if (m0Var != null) {
            m0Var.a(i17, obj);
        }
        if (i17 == 2 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, java.lang.Boolean.TRUE) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mj4.k) this.f373252b.f373250d).o(), en1.a.a())) {
            android.content.Context context = this.f373253c.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 c18676x82a91782 = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class);
            if (c18676x82a91782 != null) {
                c18676x82a91782.T6(this.f373254d, 0, 0, false);
            }
        }
    }
}
