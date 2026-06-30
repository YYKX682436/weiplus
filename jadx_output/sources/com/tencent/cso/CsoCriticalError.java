package com.tencent.cso;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/cso/CsoCriticalError;", "Ljava/lang/UnsatisfiedLinkError;", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "", "(Ljava/lang/String;)V", "cso-loader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CsoCriticalError extends java.lang.UnsatisfiedLinkError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CsoCriticalError(java.lang.String message) {
        super(message);
        kotlin.jvm.internal.o.g(message, "message");
    }
}
