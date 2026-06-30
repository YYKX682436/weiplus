package bk1;

/* loaded from: classes4.dex */
public final class u implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.manage.LuggagePrivacyManageUI f21351d;

    public u(com.tencent.mm.plugin.appbrand.ui.privacy.manage.LuggagePrivacyManageUI luggagePrivacyManageUI) {
        this.f21351d = luggagePrivacyManageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f21351d.finish();
        return false;
    }
}
