package com.tencent.kinda.framework.kindalite;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/kinda/framework/kindalite/KindaLiteUseCase;", "invoke", "(Ljava/lang/ref/WeakReference;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KindaLiteMgr$compressCache$1 extends kotlin.jvm.internal.q implements yz5.l {
    public static final com.tencent.kinda.framework.kindalite.KindaLiteMgr$compressCache$1 INSTANCE = new com.tencent.kinda.framework.kindalite.KindaLiteMgr$compressCache$1();

    public KindaLiteMgr$compressCache$1() {
        super(1);
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(java.lang.ref.WeakReference<com.tencent.kinda.framework.kindalite.KindaLiteUseCase> it) {
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.get() == null);
    }
}
