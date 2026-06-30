package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes11.dex */
public final class c4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity f97917d;

    public c4(com.tencent.mm.plugin.emoji.ui.EmoticonNewPersonCenterManagerActivity emoticonNewPersonCenterManagerActivity) {
        this.f97917d = emoticonNewPersonCenterManagerActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f97917d.finish();
        return true;
    }
}
