package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class q9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f108803a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f108804b;

    /* renamed from: c, reason: collision with root package name */
    public long f108805c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108806d;

    /* renamed from: e, reason: collision with root package name */
    public int f108807e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FeedData f108808f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f108809g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f108810h;

    /* renamed from: i, reason: collision with root package name */
    public final int f108811i;

    /* renamed from: j, reason: collision with root package name */
    public final fc2.d f108812j;

    public q9(com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f108803a = activity;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        this.f108811i = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.L).getValue()).r()).intValue();
        this.f108812j = new com.tencent.mm.plugin.finder.feed.p9(this);
    }

    public abstract void a(androidx.recyclerview.widget.RecyclerView recyclerView);

    public abstract void b(fc2.t tVar);

    public abstract void c();

    public void d(long j17) {
        this.f108804b = true;
    }

    public void e(long j17) {
        this.f108809g = true;
    }
}
