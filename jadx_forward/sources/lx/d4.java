package lx;

/* loaded from: classes11.dex */
public final class d4 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a f403258d;

    public d4(com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a) {
        this.f403258d = c10491x8102098a;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p689xc5a27af6.p704x8f4dc54e.p705xd2ae381c.p712x633fb29.C10491x8102098a c10491x8102098a = this.f403258d;
        if (i17 == c10491x8102098a.f146792m && i18 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("personalizedOperation", 0);
            com.p314xaae8f345.p2845xc516c4b6.biz.C23089x8c6e5ca2 c23089x8c6e5ca2 = c10491x8102098a.f146788f;
            if (c23089x8c6e5ca2 != null) {
                c23089x8c6e5ca2.m84784xd091a4b7(intExtra, lx.c4.f403246d);
            }
        }
    }
}
