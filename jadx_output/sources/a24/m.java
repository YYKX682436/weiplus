package a24;

/* loaded from: classes.dex */
public final class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI f891d;

    public m(com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI baseSettingPrefUI) {
        this.f891d = baseSettingPrefUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f891d.onBackPressed();
        return true;
    }
}
