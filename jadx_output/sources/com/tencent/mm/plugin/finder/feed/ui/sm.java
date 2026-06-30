package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class sm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI f110542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader f110543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI finderTingAudioCollectionUI, com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader) {
        super(0);
        this.f110542d = finderTingAudioCollectionUI;
        this.f110543e = finderAudioCollectionLoader;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.feed.ui.FinderTingAudioCollectionUI finderTingAudioCollectionUI = this.f110542d;
        com.tencent.mm.plugin.finder.feed.y00 y00Var = finderTingAudioCollectionUI.f109569u;
        if (y00Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x = y00Var.f106180m.getF213435x();
        if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setText(com.tencent.mm.R.string.f491896el3);
        }
        com.tencent.mm.plugin.finder.feed.y00 y00Var2 = finderTingAudioCollectionUI.f109569u;
        if (y00Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x2 = y00Var2.f106180m.getF213435x();
        android.widget.TextView textView2 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.feed.y00 y00Var3 = finderTingAudioCollectionUI.f109569u;
        if (y00Var3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x3 = y00Var3.f106180m.getF213435x();
        android.view.View findViewById = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderTingAudioCollectionUI$initOnCreate$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderTingAudioCollectionUI$initOnCreate$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader = finderTingAudioCollectionUI.f109570v;
        if (finderAudioCollectionLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        if (finderAudioCollectionLoader.getDataList().size() != finderTingAudioCollectionUI.f109573y) {
            java.lang.String b17 = this.f110543e.getB();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchEndCallback: refresh count, old=");
            sb6.append(finderTingAudioCollectionUI.f109573y);
            sb6.append(", new=");
            com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader2 = finderTingAudioCollectionUI.f109570v;
            if (finderAudioCollectionLoader2 == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            sb6.append(finderAudioCollectionLoader2.getDataList().size());
            com.tencent.mars.xlog.Log.i(b17, sb6.toString());
            com.tencent.mm.plugin.finder.feed.model.FinderAudioCollectionLoader finderAudioCollectionLoader3 = finderTingAudioCollectionUI.f109570v;
            if (finderAudioCollectionLoader3 == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            finderTingAudioCollectionUI.f109573y = finderAudioCollectionLoader3.getDataList().size();
            finderTingAudioCollectionUI.setMMTitle(finderTingAudioCollectionUI.getResources().getString(com.tencent.mm.R.string.f0b, java.lang.Integer.valueOf(finderTingAudioCollectionUI.f109573y)));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_audio_collection_count", finderTingAudioCollectionUI.f109573y);
            finderTingAudioCollectionUI.setResult(-1, intent);
        }
        return jz5.f0.f302826a;
    }
}
