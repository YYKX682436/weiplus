package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class n0 {
    public n0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.ui.MMActivity context, java.lang.String tagName, com.tencent.mm.ui.xc onActResult) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(onActResult, "onActResult");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.fav.ui.FavChangeTagUI.class);
        intent.putExtra("origin_name", tagName);
        context.mmStartActivityForResult(onActResult, intent, 52428);
    }
}
