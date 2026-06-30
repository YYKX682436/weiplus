package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class b8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f106356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.f8 f106357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106358f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f106359g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f106360h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106361i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(boolean z17, com.tencent.mm.plugin.finder.feed.f8 f8Var, java.lang.String str, android.widget.TextView textView, int i17, int i18) {
        super(0);
        this.f106356d = z17;
        this.f106357e = f8Var;
        this.f106358f = str;
        this.f106359g = textView;
        this.f106360h = i17;
        this.f106361i = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!this.f106356d) {
            this.f106357e.e(this.f106358f, this.f106359g, this.f106360h, this.f106361i);
        }
        return jz5.f0.f302826a;
    }
}
