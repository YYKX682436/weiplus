package df2;

/* loaded from: classes3.dex */
public final class kj implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.oj f312117d;

    public kj(df2.oj ojVar) {
        this.f312117d = ojVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.y0 y0Var = (mm2.y0) obj;
        int i17 = y0Var.f411083c.getInt("PARAM_FINDER_LIVE_GAME_TEAM_UP_GIFT_MODE", 0);
        android.os.Bundle bundle = y0Var.f411083c;
        boolean z17 = bundle.getBoolean("PARAM_FINDER_LIVE_IS_GAME_TEAM_UP_GIFT", false);
        java.lang.String string = bundle.getString("PARAM_FINDER_LIVE_GIFT_ID", "");
        java.lang.String str = string != null ? string : "";
        df2.oj ojVar = this.f312117d;
        java.lang.String str2 = ojVar.f312504m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onGiftSendInstantClick] result = ");
        qs5.m mVar = y0Var.f411081a;
        sb6.append(mVar);
        sb6.append(", mode = ");
        sb6.append(i17);
        sb6.append(", isFromGameTeamUp = ");
        sb6.append(z17);
        sb6.append(", giftId = ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        if (mVar != qs5.m.f447971d && i17 == 9 && z17) {
            ojVar.i7(false, str);
        }
    }
}
