package com.tencent.mm.plugin.crashfix.patch.killself;

/* loaded from: classes5.dex */
public class a implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.crashfix.patch.killself.b f96669d;

    public a(com.tencent.mm.plugin.crashfix.patch.killself.b bVar) {
        this.f96669d = bVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        this.f96669d.f96670a = false;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        this.f96669d.f96670a = true;
    }
}
