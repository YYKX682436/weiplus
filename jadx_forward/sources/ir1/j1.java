package ir1;

/* loaded from: classes3.dex */
public final class j1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12972x45ae6e01 f375540d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12972x45ae6e01 activityC12972x45ae6e01) {
        this.f375540d = activityC12972x45ae6e01;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12972x45ae6e01 activityC12972x45ae6e01 = this.f375540d;
        activityC12972x45ae6e01.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_ori_scope_type", activityC12972x45ae6e01.f175489f);
        activityC12972x45ae6e01.setResult(-1, intent);
        activityC12972x45ae6e01.finish();
        return true;
    }
}
