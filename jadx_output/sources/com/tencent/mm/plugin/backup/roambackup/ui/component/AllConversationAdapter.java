package com.tencent.mm.plugin.backup.roambackup.ui.component;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0014R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0013j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/component/AllConversationAdapter;", "Lwo1/v;", "Landroid/content/Intent;", "intent", "", "Lwo1/n;", "convList", "Ljz5/f0;", "initAdapter", "Landroid/content/Context;", "ctx", "", dm.i4.COL_USERNAME, "", "getSpannedName", "Lwo1/m;", "createSortTypeAdapter", "TAG", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "spannedName", "Ljava/util/HashMap;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AllConversationAdapter extends wo1.v {
    public static final int $stable = 8;
    private final java.lang.String TAG = "AllConversationAdapter";
    private final java.util.HashMap<java.lang.String, java.lang.CharSequence> spannedName = new java.util.HashMap<>();

    @Override // wo1.v
    public wo1.m createSortTypeAdapter(android.content.Context ctx) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        return new wo1.e(ctx, this);
    }

    @Override // wo1.v
    public java.lang.CharSequence getSpannedName(android.content.Context ctx, java.lang.String username) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.CharSequence charSequence = this.spannedName.get(username);
        if (charSequence != null) {
            return charSequence;
        }
        java.lang.CharSequence a17 = oo1.g.f347143a.a(ctx, username);
        this.spannedName.put(username, a17);
        return a17;
    }

    @Override // wo1.v
    public void initAdapter(android.content.Intent intent, java.util.List<wo1.n> convList) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(convList, "convList");
        setShowSize(intent.getBooleanExtra("contactListShowSize", false));
        setShowMore(intent.getBooleanExtra("contactAdapterShowDot3Icon", false));
        convList.clear();
        kotlinx.coroutines.l.f(null, new wo1.f(convList, null), 1, null);
    }
}
