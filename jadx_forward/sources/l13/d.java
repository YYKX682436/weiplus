package l13;

/* loaded from: classes15.dex */
public final class d extends p012xc85e97e9.p103xe821e364.p104xd1075a44.u2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b f396523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f396524b;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b c15566x578e2f9b, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f396523a = c15566x578e2f9b;
        this.f396524b = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.u2
    public boolean a(int i17, int i18) {
        l13.b bVar = i18 < 0 ? l13.b.f396520e : l13.b.f396519d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b c15566x578e2f9b = this.f396523a;
        int m8018x1c4fb41d = c15566x578e2f9b.m8018x1c4fb41d() * (c15566x578e2f9b.m8020x7e414b06() - 1);
        int i19 = c15566x578e2f9b.f218893m;
        boolean z17 = false;
        if (1 <= i19 && i19 < m8018x1c4fb41d) {
            z17 = true;
        }
        if (z17) {
            c15566x578e2f9b.f218894n = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b.m(c15566x578e2f9b, this.f396524b, bVar);
        return true;
    }
}
