package iw4;

/* loaded from: classes15.dex */
public final class h implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 f376791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f376792b;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f376791a = activityC19250xb79f2208;
        this.f376792b = h0Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5 y5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.y5.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2405x2dcbb45b.ui.ActivityC19250xb79f2208 activityC19250xb79f2208 = this.f376791a;
            com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = activityC19250xb79f2208.f263583d.f376778e;
            java.lang.String str2 = c21007x2f4a06dc != null ? c21007x2f4a06dc.f274687i : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f376792b;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.s0) y5Var).Ai(str2, (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) h0Var.f391656d, null);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_EMOJI_INFO_RESULT", (android.os.Parcelable) h0Var.f391656d);
            activityC19250xb79f2208.setResult(-1, intent);
            activityC19250xb79f2208.finish();
        }
    }
}
