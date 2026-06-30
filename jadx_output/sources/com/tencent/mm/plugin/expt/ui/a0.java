package com.tencent.mm.plugin.expt.ui;

/* loaded from: classes.dex */
public class a0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.KvInfoUI f99822d;

    public a0(com.tencent.mm.plugin.expt.ui.KvInfoUI kvInfoUI) {
        this.f99822d = kvInfoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99822d.finish();
        return true;
    }
}
