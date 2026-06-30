package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0014J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0014R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\u0013j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/component/AllConversationAdapter;", "Lwo1/v;", "Landroid/content/Intent;", "intent", "", "Lwo1/n;", "convList", "Ljz5/f0;", "initAdapter", "Landroid/content/Context;", "ctx", "", dm.i4.f66875xa013b0d5, "", "getSpannedName", "Lwo1/m;", "createSortTypeAdapter", "TAG", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "spannedName", "Ljava/util/HashMap;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.component.AllConversationAdapter */
/* loaded from: classes5.dex */
public final class C12855xae28020b extends wo1.v {

    /* renamed from: $stable */
    public static final int f35349x3b2de05f = 8;
    private final java.lang.String TAG = "AllConversationAdapter";
    private final java.util.HashMap<java.lang.String, java.lang.CharSequence> spannedName = new java.util.HashMap<>();

    @Override // wo1.v
    /* renamed from: createSortTypeAdapter */
    public wo1.m mo53981x3e90199b(android.content.Context ctx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        return new wo1.e(ctx, this);
    }

    @Override // wo1.v
    /* renamed from: getSpannedName */
    public java.lang.CharSequence mo53982xda5071f8(android.content.Context ctx, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.CharSequence charSequence = this.spannedName.get(username);
        if (charSequence != null) {
            return charSequence;
        }
        java.lang.CharSequence a17 = oo1.g.f428676a.a(ctx, username);
        this.spannedName.put(username, a17);
        return a17;
    }

    @Override // wo1.v
    /* renamed from: initAdapter */
    public void mo53983xa1b041f(android.content.Intent intent, java.util.List<wo1.n> convList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convList, "convList");
        m174248x62600720(intent.getBooleanExtra("contactListShowSize", false));
        m174247x625d6274(intent.getBooleanExtra("contactAdapterShowDot3Icon", false));
        convList.clear();
        p3325xe03a0797.p3326xc267989b.l.f(null, new wo1.f(convList, null), 1, null);
    }
}
