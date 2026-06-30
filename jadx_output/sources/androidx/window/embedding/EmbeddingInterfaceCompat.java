package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\nJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\u000b"}, d2 = {"Landroidx/window/embedding/EmbeddingInterfaceCompat;", "", "", "Landroidx/window/embedding/EmbeddingRule;", "rules", "Ljz5/f0;", "setSplitRules", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "embeddingCallback", "setEmbeddingCallback", "EmbeddingCallbackInterface", "window_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes14.dex */
public interface EmbeddingInterfaceCompat {

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Ljz5/f0;", "onSplitInfoChanged", "window_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes14.dex */
    public interface EmbeddingCallbackInterface {
        void onSplitInfoChanged(java.util.List<androidx.window.embedding.SplitInfo> list);
    }

    void setEmbeddingCallback(androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface);

    void setSplitRules(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> set);
}
