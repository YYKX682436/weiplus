package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class bi implements in5.y0 {
    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        java.util.LinkedList<in5.x0> linkedList = data.f293156i;
        for (in5.x0 x0Var : linkedList) {
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", " last firstVisibleItemPosition " + data.f293151d + "  lastVisibleItemPosition :" + data.f293152e + "    lastFirstVisibleItemPosition   " + data.f293149b + " lastLastVisibleItemPosition  " + data.f293150c + "  diffVisibleDataList.size:" + linkedList.size() + " acrossDataList " + data.f293154g.size() + "   visibleDataList:" + data.f293153f.size());
    }
}
