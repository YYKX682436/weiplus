package ur1;

/* loaded from: classes11.dex */
public final class c implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur1.e f511875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23089x8c6e5ca2 f511876e;

    public c(ur1.e eVar, com.p314xaae8f345.p2845xc516c4b6.biz.C23089x8c6e5ca2 c23089x8c6e5ca2) {
        this.f511875d = eVar;
        this.f511876e = c23089x8c6e5ca2;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == this.f511875d.f511882c && i18 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("personalizedOperation", 0);
            com.p314xaae8f345.p2845xc516c4b6.biz.C23089x8c6e5ca2 c23089x8c6e5ca2 = this.f511876e;
            if (c23089x8c6e5ca2 != null) {
                c23089x8c6e5ca2.m84784xd091a4b7(intExtra, ur1.b.f511874d);
            }
        }
    }
}
