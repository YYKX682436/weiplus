package com.tencent.mm.plugin.downloader_app.model;

/* loaded from: classes8.dex */
public class l implements m02.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m02.b f97288b;

    public l(android.content.Context context, m02.b bVar) {
        this.f97287a = context;
        this.f97288b = bVar;
    }

    @Override // m02.b
    public void a(m02.a aVar, long j17) {
        com.tencent.mm.plugin.downloader_app.model.o.a(this.f97287a);
        m02.b bVar = this.f97288b;
        if (bVar != null) {
            bVar.a(aVar, j17);
        }
    }
}
