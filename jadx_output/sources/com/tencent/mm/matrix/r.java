package com.tencent.mm.matrix;

/* loaded from: classes12.dex */
public class r implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.matrix.o f68841d;

    public r(com.tencent.mm.matrix.o oVar) {
        this.f68841d = oVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        this.f68841d.n(false);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        this.f68841d.n(true);
    }
}
