package qr3;

/* loaded from: classes9.dex */
public class v implements e31.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 f447652a;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323) {
        this.f447652a = activityC16884xbfaa2323;
    }

    @Override // e31.l
    public void d(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewBizInfoSettingUI", "updateSubscribeMsgList onError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
    }

    @Override // e31.l
    public void e(java.lang.String str, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewBizInfoSettingUI", "updateSubscribeMsgList success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.ActivityC16884xbfaa2323 activityC16884xbfaa2323 = this.f447652a;
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed52 = activityC16884xbfaa2323.f235720t;
        if (c11158xe7d16ed52 == null) {
            return;
        }
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = c11158xe7d16ed52.f153318h;
            if (i17 >= arrayList.size()) {
                activityC16884xbfaa2323.f235720t.f153322o = c11158xe7d16ed5.f153322o;
                return;
            }
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) arrayList.get(i17);
            if (c11159x8f55e6d3 != null) {
                for (int i18 = 0; i18 < c11158xe7d16ed5.f153318h.size(); i18++) {
                    com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) c11158xe7d16ed5.f153318h.get(i18);
                    if (c11159x8f55e6d32 != null && c11159x8f55e6d3.f153336f.equals(c11159x8f55e6d32.f153336f)) {
                        c11159x8f55e6d3.f153340m = c11159x8f55e6d32.f153340m;
                    }
                }
            }
            i17++;
        }
    }
}
