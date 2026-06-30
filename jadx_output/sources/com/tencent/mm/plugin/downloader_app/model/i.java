package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class i implements m02.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m02.b f97278b;

    public i(android.content.Context context, m02.b bVar) {
        this.f97277a = context;
        this.f97278b = bVar;
    }

    @Override // m02.b
    public void a(m02.a aVar, long j17) {
        if (aVar == m02.a.OK) {
            com.tencent.mm.plugin.downloader_app.model.o.a(this.f97277a);
        }
        m02.b bVar = this.f97278b;
        if (bVar != null) {
            bVar.a(aVar, j17);
        }
    }
}
