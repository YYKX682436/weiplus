package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/window/embedding/EmbeddingTranslatingCallback;", "Ljava/util/function/Consumer;", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "Ljz5/f0;", "accept", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "callback", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "Landroidx/window/embedding/EmbeddingAdapter;", "adapter", "Landroidx/window/embedding/EmbeddingAdapter;", "<init>", "(Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;Landroidx/window/embedding/EmbeddingAdapter;)V", "window_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: androidx.window.embedding.EmbeddingTranslatingCallback */
/* loaded from: classes14.dex */
public final class C1212x1071cb39 implements java.util.function.Consumer<java.util.List<? extends androidx.window.extensions.embedding.SplitInfo>> {
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1202x9bd59818 adapter;
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.InterfaceC1210xf54719e4.EmbeddingCallbackInterface callback;

    public C1212x1071cb39(p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.InterfaceC1210xf54719e4.EmbeddingCallbackInterface callback, p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1202x9bd59818 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.callback = callback;
        this.adapter = adapter;
    }

    @Override // java.util.function.Consumer
    public void accept(java.util.List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(splitInfoList, "splitInfoList");
        this.callback.mo8434xa45c2ab(this.adapter.m8414x3ec0f14e(splitInfoList));
    }
}
