package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f65706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.accessibility.l f65707e;

    public i(com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar, java.util.List list) {
        this.f65707e = lVar;
        this.f65706d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.feature.ecs.nirvana.accessibility.k kVar = this.f65707e.f65710a;
        if (kVar != null) {
            ((com.tencent.mm.feature.ecs.nirvana.accessibility.a) kVar).b(this.f65706d);
        }
    }
}
