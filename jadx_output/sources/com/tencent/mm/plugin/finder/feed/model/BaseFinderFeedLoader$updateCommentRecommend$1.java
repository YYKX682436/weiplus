package com.tencent.mm.plugin.finder.feed.model;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Long;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BaseFinderFeedLoader$updateCommentRecommend$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ long $commentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFinderFeedLoader$updateCommentRecommend$1(long j17) {
        super(1);
        this.$commentId = j17;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(java.lang.Long l17) {
        return java.lang.Boolean.valueOf(l17 != null && l17.longValue() == this.$commentId);
    }
}
