package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public interface w20 {
    com.tencent.mm.view.recyclerview.WxRecyclerAdapter a(android.content.Context context);

    androidx.recyclerview.widget.p2 b(android.content.Context context);

    default r45.ri0 d() {
        return null;
    }

    void e(android.content.Context context, android.widget.FrameLayout frameLayout);

    int f();

    void g(android.view.View view);

    int getScene();

    void h(yw2.n nVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.protobuf.g gVar, java.util.LinkedList linkedList);

    androidx.recyclerview.widget.RecyclerView.LayoutManager i(android.content.Context context);

    void onDetach();
}
