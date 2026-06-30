package bq2;

/* loaded from: classes2.dex */
public final class e extends bq2.b {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f23566e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.storage.FinderItem feedItem, int i17, androidx.recyclerview.widget.RecyclerView belongRecyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter belongAdapter) {
        super(i17, belongRecyclerView, belongAdapter);
        kotlin.jvm.internal.o.g(feedItem, "feedItem");
        kotlin.jvm.internal.o.g(belongRecyclerView, "belongRecyclerView");
        kotlin.jvm.internal.o.g(belongAdapter, "belongAdapter");
        this.f23566e = feedItem;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id: ");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f23566e;
        sb6.append(finderItem.getFeedObject().getId());
        sb6.append(" nonceid: ");
        sb6.append(finderItem.getFeedObject().getObjectNonceId());
        sb6.append(" nickName: ");
        sb6.append(finderItem.getNickName());
        sb6.append(" belongRecyclerView: ");
        sb6.append(this.f23561b);
        sb6.append(" belongAdapter: ");
        sb6.append(this.f23562c);
        return sb6.toString();
    }
}
