package com.tencent.matrix.hook.junwind;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0087 J!\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0087 J)\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0087 J\u0019\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0087 ¨\u0006\u000f"}, d2 = {"Lcom/tencent/matrix/hook/junwind/ThreadKillerJni;", "", "", "syscall", "", "pid", "signal", "", "nativeKill", "tid", "nativeTkill", "tgid", "nativeTgkill", "status", "nativeExit", "matrix-hooks_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ThreadKillerJni {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.matrix.hook.junwind.ThreadKillerJni f52655a = new com.tencent.matrix.hook.junwind.ThreadKillerJni();

    public final native long nativeExit(boolean syscall, int status);

    public final native long nativeKill(boolean syscall, int pid, int signal);

    public final native long nativeTgkill(boolean syscall, int tgid, int tid, int signal);

    public final native long nativeTkill(boolean syscall, int tid, int signal);
}
