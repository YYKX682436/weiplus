package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class dz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f106597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f106598f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f106599g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f106600h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106601i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz(com.tencent.mm.plugin.finder.feed.pz pzVar, int i17, int i18, int i19, int i27, java.lang.String str) {
        super(0);
        this.f106596d = pzVar;
        this.f106597e = i17;
        this.f106598f = i18;
        this.f106599g = i19;
        this.f106600h = i27;
        this.f106601i = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.finder.feed.ct ctVar = this.f106596d.f108759m;
        if (ctVar != null && (recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView()) != null) {
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.cz(this.f106596d, this.f106597e, this.f106598f, this.f106599g, this.f106600h, this.f106601i));
        }
        return jz5.f0.f302826a;
    }
}
