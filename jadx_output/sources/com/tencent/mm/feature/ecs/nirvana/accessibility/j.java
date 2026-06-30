package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes7.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f65708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.accessibility.l f65709e;

    public j(com.tencent.mm.feature.ecs.nirvana.accessibility.l lVar, org.json.JSONObject jSONObject) {
        this.f65709e = lVar;
        this.f65708d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.feature.ecs.nirvana.accessibility.k kVar = this.f65709e.f65710a;
        if (kVar != null) {
            ((com.tencent.mm.feature.ecs.nirvana.accessibility.a) kVar).a(this.f65708d);
        }
    }
}
