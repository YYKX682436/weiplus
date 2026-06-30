package com.tencent.mm.feature.emoji;

/* loaded from: classes3.dex */
public final class b2 implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f66181a;

    public b2(kotlinx.coroutines.q qVar) {
        this.f66181a = qVar;
    }

    @Override // qr.i
    public final void onResult(int i17, java.lang.String str) {
        kotlinx.coroutines.q qVar = this.f66181a;
        if (((kotlinx.coroutines.r) qVar).n()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Integer.valueOf(i17), str)));
        }
    }
}
