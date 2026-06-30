package or1;

/* loaded from: classes.dex */
public class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8 f429110d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8 activityC12977xe43db9b8) {
        this.f429110d = activityC12977xe43db9b8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12977xe43db9b8 activityC12977xe43db9b8 = this.f429110d;
        if (activityC12977xe43db9b8.f175534n) {
            android.content.Intent intent = new android.content.Intent(activityC12977xe43db9b8, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12978x882bdc19.class);
            intent.putExtra("is_return_result", activityC12977xe43db9b8.f175534n);
            intent.putExtra("intent_service_type", activityC12977xe43db9b8.f175529f);
            intent.addFlags(67108864);
            activityC12977xe43db9b8.startActivityForResult(intent, 1);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("intent_service_type", activityC12977xe43db9b8.f175529f);
            intent2.putExtra("detail_type", -7);
            int i17 = activityC12977xe43db9b8.f175529f;
            if (i17 == 251658241 || i17 == 0) {
                intent2.putExtra("Search_Scene", 7);
                intent2.putExtra("key_search_bar_title_suffix", activityC12977xe43db9b8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogd));
            } else if (i17 == 1) {
                intent2.putExtra("Search_Scene", 6);
                intent2.putExtra("key_search_bar_title_suffix", activityC12977xe43db9b8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oge));
            }
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            o13.n.q(activityC12977xe43db9b8, ".ui.FTSBizDetailUI", intent2);
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            su4.r2.o();
        }
        return true;
    }
}
