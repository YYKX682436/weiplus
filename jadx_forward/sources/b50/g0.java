package b50;

/* loaded from: classes11.dex */
public final class g0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 f99476d;

    public g0(com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935) {
        this.f99476d = c10601x91d05935;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p689xc5a27af6.p746x19f64be5.p747xd2ae381c.p748x633fb29.C10601x91d05935 c10601x91d05935 = this.f99476d;
        if (i17 == c10601x91d05935.f148600m && i18 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("personalizedOperation", 0);
            com.p314xaae8f345.p2845xc516c4b6.biz.C23089x8c6e5ca2 c23089x8c6e5ca2 = c10601x91d05935.f148596f;
            if (c23089x8c6e5ca2 != null) {
                c23089x8c6e5ca2.m84784xd091a4b7(intExtra, b50.f0.f99474d);
            }
        }
    }
}
