package bd4;

/* loaded from: classes3.dex */
public final class o1 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19377a;

    public o1(bd4.f2 f2Var) {
        this.f19377a = f2Var;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("OnMMMenuItemGetView", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$buildInnerMenu$3");
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                str = "hover_win_fav";
            } else if (itemId != 11) {
                if (itemId != 12) {
                    if (itemId == 14 || itemId == 15) {
                        str = "hover_win_translate";
                    } else if (itemId != 27 && itemId != 29) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("OnMMMenuItemGetView", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$buildInnerMenu$3");
                        return;
                    }
                }
                str = "hover_win_search";
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 40, 32337);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "hover_win_from", 5);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new bd4.n1(this.f19377a));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("OnMMMenuItemGetView", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$buildInnerMenu$3");
        }
        str = "hover_win_copy";
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view, str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view, 40, 32337);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(view, "hover_win_from", 5);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view, new bd4.n1(this.f19377a));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("OnMMMenuItemGetView", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$buildInnerMenu$3");
    }
}
