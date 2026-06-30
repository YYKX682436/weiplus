package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class s4 implements db2.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f66912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f66914c;

    public s4(yz5.q qVar, android.content.Context context, boolean z17) {
        this.f66912a = qVar;
        this.f66913b = context;
        this.f66914c = z17;
    }

    @Override // db2.c2
    public void a(int i17, int i18, java.lang.String str, r45.q62 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        pm0.v.X(new com.tencent.mm.feature.finder.live.r4(i17, i18, this.f66912a, resp, this.f66913b, this.f66914c));
    }
}
