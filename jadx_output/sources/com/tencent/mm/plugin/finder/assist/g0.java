package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class g0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f102184a;

    public g0(yz5.l lVar) {
        this.f102184a = lVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        yz5.l lVar;
        if (!kotlin.jvm.internal.o.b(str, "finishSetWarningWording") || (lVar = this.f102184a) == null) {
            return false;
        }
        kotlin.jvm.internal.o.d(obj);
        lVar.invoke(obj);
        return false;
    }
}
