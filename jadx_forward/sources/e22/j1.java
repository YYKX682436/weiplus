package e22;

/* loaded from: classes10.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a f328206d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a c13340xd9e4c60a) {
        super(0);
        this.f328206d = c13340xd9e4c60a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13340xd9e4c60a c13340xd9e4c60a = this.f328206d;
        boolean z17 = true;
        db5.e1.s(c13340xd9e4c60a.m7550xf0c4608a(), "", c13340xd9e4c60a.m7550xf0c4608a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.obk, 1));
        if (c13340xd9e4c60a.mo7430x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c13340xd9e4c60a.mo7430x19263085();
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 activityC13339x8f3095f9 = mo7430x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13339x8f3095f9) mo7430x19263085 : null;
            java.lang.String str = activityC13339x8f3095f9 != null ? activityC13339x8f3095f9.f179691o : null;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                or.d.c(str, 5, 2, null, 0, or.c.c("warning_pup_win", str, 4, null, null, 24, null), 16, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
