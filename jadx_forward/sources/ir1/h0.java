package ir1;

/* loaded from: classes11.dex */
public final class h0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12969xadf72c8 f375511d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12969xadf72c8 activityC12969xadf72c8) {
        this.f375511d = activityC12969xadf72c8;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12969xadf72c8 activityC12969xadf72c8 = this.f375511d;
        intent.putExtra("serviceType", activityC12969xadf72c8.f175483f);
        j45.l.n(activityC12969xadf72c8, "brandservice", ".conversation.ui.BizFansSettingUI", intent, activityC12969xadf72c8.f175481d);
        return true;
    }
}
