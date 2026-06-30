package com.tencent.mm.plugin.finder.live.aiassistant.tools;

@com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolSchema(description = "Echo the input message back. For debugging purposes only.", name = "debug::echo", timeoutSeconds = 10, version = "1.0.0")
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/aiassistant/tools/EchoParams;", "Lyd2/l;", "", com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, "Ljava/lang/String;", "getMessage$annotations", "()V", "<init>", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EchoParams extends yd2.l {
    public java.lang.String message = "Hello World";

    @com.tencent.mm.plugin.finder.live.aiassistant.annotation.ToolField(defaultValue = "Hello World", description = "任意文本，原样返回")
    public static /* synthetic */ void getMessage$annotations() {
    }
}
