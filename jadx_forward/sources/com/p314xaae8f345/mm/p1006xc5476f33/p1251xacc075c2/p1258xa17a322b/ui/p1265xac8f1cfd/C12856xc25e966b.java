package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R0\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120\u0019j\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/ui/component/BackedUpConversationAdapter;", "Lwo1/v;", "", "Lwo1/n;", "convList", "Lcom/tencent/wechat/aff/affroam/f;", "convInfo", "Ljz5/f0;", "setupData", "Landroid/content/Intent;", "intent", "initAdapter", "Landroid/content/Context;", "ctx", "Lwo1/m;", "createSortTypeAdapter", "", dm.i4.f66875xa013b0d5, "", "getSpannedName", "TAG", "Ljava/lang/String;", "Lfo1/h;", "getContactHelper", "Lfo1/h;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "spannedName", "Ljava/util/HashMap;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.ui.component.BackedUpConversationAdapter */
/* loaded from: classes5.dex */
public final class C12856xc25e966b extends wo1.v {

    /* renamed from: $stable */
    public static final int f35351x3b2de05f = 8;
    private final java.lang.String TAG = "BackedUpConversationAdapter";
    private final fo1.h getContactHelper = new fo1.h();
    private final java.util.HashMap<java.lang.String, java.lang.CharSequence> spannedName = new java.util.HashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupData */
    public final void m53987x5cd917c7(java.util.List<wo1.n> list, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.f fVar) {
        list.clear();
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.TAG, "conv info is null");
            return;
        }
        java.util.LinkedList linkedList = fVar.f297357d;
        int size = linkedList.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = (java.lang.String) linkedList.get(i17);
            java.lang.Long l17 = (java.lang.Long) fVar.f297358e.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            list.add(new wo1.n(str, 0L, l17.longValue(), false, 8, null));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "dataSource convList.size = " + list.size());
    }

    @Override // wo1.v
    /* renamed from: createSortTypeAdapter */
    public wo1.m mo53981x3e90199b(android.content.Context ctx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        return new wo1.i(ctx, this);
    }

    @Override // wo1.v
    /* renamed from: getSpannedName */
    public java.lang.CharSequence mo53982xda5071f8(android.content.Context ctx, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        boolean c17 = this.getContactHelper.c(username);
        oo1.g gVar = oo1.g.f428676a;
        if (!c17) {
            this.getContactHelper.b(username, new wo1.j(this, username, ctx));
            return gVar.a(ctx, username);
        }
        java.lang.CharSequence charSequence = this.spannedName.get(username);
        if (charSequence == null) {
            charSequence = gVar.a(ctx, username);
            this.spannedName.put(username, charSequence);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(charSequence);
        return charSequence;
    }

    @Override // wo1.v
    /* renamed from: initAdapter */
    public void mo53983xa1b041f(android.content.Intent intent, java.util.List<wo1.n> convList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convList, "convList");
        m174248x62600720(true);
        long longExtra = intent.getLongExtra("packageId", -1L);
        if (longExtra == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.TAG, "Fail to get packageId from intent");
            return;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.l(longExtra, new wo1.k(this, convList, countDownLatch));
        countDownLatch.await();
    }
}
