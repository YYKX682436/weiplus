package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes9.dex */
public final class u3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView f98209d;

    public u3(com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView emoticonCustomCreateResultView) {
        this.f98209d = emoticonCustomCreateResultView;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f98209d.finish();
        return true;
    }
}
