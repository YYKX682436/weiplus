package dr;

/* loaded from: classes12.dex */
public class p extends dr.t {

    /* renamed from: d, reason: collision with root package name */
    public dr.q f323930d;

    /* renamed from: e, reason: collision with root package name */
    public final long f323931e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 view, dr.q qVar) {
        super(emojiInfo, view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f323930d = qVar;
        this.f323931e = java.lang.System.currentTimeMillis();
    }

    @Override // dr.t, dr.s
    public void a() {
        super.a();
        this.f323930d = null;
    }

    @Override // dr.s
    public void c(boolean z17) {
        toString();
        java.lang.ref.WeakReference weakReference = this.f323935c;
        android.graphics.drawable.Drawable drawable = null;
        java.util.Objects.toString(weakReference != null ? (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) weakReference.get() : null);
        if (this.f323932f) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = this.f323931e;
            if (currentTimeMillis - j17 <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                int m40062x608a19a0 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (m40062x608a19a0 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 124L);
                } else if (m40062x608a19a0 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 115L);
                } else if (m40062x608a19a0 == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 118L);
                } else if (m40062x608a19a0 == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1257L, 121L);
                }
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - j17;
                int m40062x608a19a02 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                if (m40062x608a19a02 == 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1257L, 125L, currentTimeMillis2);
                } else if (m40062x608a19a02 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1257L, 116L, currentTimeMillis2);
                } else if (m40062x608a19a02 == 3) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1257L, 119L, currentTimeMillis2);
                } else if (m40062x608a19a02 == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1257L, 122L, currentTimeMillis2);
                }
            }
        }
        java.lang.ref.WeakReference weakReference2 = this.f323935c;
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = weakReference2 != null ? (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) weakReference2.get() : null;
        if (z17) {
            br.a aVar = new br.a();
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f323933a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
            drawable = aVar.b((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb, new dr.m(this));
        }
        pm0.v.X(new dr.l(z17, drawable, abstractC10447x8c9cf7d9, this));
    }

    @Override // dr.s
    public void f(boolean z17) {
        if (this.f323933a.E0()) {
            pm0.v.K(null, new dr.n(this));
        } else {
            this.f323932f = true;
            pm0.v.X(new dr.o(this));
        }
    }
}
