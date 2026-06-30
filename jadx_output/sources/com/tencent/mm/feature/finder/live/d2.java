package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class d2 implements ke2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66653b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f66654c;

    public d2(android.content.Context context, yz5.l lVar, int i17) {
        this.f66652a = context;
        this.f66653b = lVar;
        this.f66654c = i17;
    }

    @Override // ke2.l0
    public void a(int i17, int i18, java.lang.String str) {
        pm0.v.X(new com.tencent.mm.feature.finder.live.b2(this.f66653b, str, this.f66652a));
    }

    @Override // ke2.l0
    public void b(r45.jb2 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        pm0.v.X(new com.tencent.mm.feature.finder.live.c2(this.f66652a, this.f66653b, this.f66654c));
    }
}
