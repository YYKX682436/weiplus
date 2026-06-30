package ez;

@j95.b
/* loaded from: classes4.dex */
public final class f1 extends i95.w implements pt.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f339262d = jz5.h.b(ez.d1.f339255d);

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p720xaf3f29eb.C10516x5ba7666f f339263e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.common.MMTypingFeatureService$typingNotifyListener$1] */
    public f1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f339263e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5216x2580ba3f>(a0Var) { // from class: com.tencent.mm.feature.common.MMTypingFeatureService$typingNotifyListener$1
            {
                this.f39173x3fe91575 = -1889773009;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5216x2580ba3f c5216x2580ba3f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5216x2580ba3f event = c5216x2580ba3f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                long t17 = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_BYP_INFO_KEY_LONG_SYNC, 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMTypingFeatureService", "typingNotifyListener callback!! docgi syncKey=" + t17);
                ez.f1.wi(ez.f1.this, t17, 3);
                return true;
            }
        };
    }

    public static final void wi(ez.f1 f1Var, long j17, int i17) {
        f1Var.getClass();
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new ez.c1(j17, i17, f1Var, null), 1, null);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        mo48813x58998cd();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        mo48814x2efc64();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            en1.k kVar = (en1.k) i95.n0.c(en1.k.class);
            ((dn1.i) kVar).f323407d.v(new ez.e1(this));
        }
    }
}
