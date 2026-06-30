package a63;

/* loaded from: classes8.dex */
public final class c implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.TouchableLayout f1749a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.view.TouchableLayout f1750b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.FrameLayout f1751c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f1752d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f1753e;

    public c(com.tencent.mm.view.TouchableLayout touchableLayout, com.tencent.mm.view.TouchableLayout touchableLayout2, android.widget.FrameLayout frameLayout, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout) {
        this.f1749a = touchableLayout;
        this.f1750b = touchableLayout2;
        this.f1751c = frameLayout;
        this.f1752d = recyclerView;
        this.f1753e = refreshLoadMoreLayout;
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f1749a;
    }
}
