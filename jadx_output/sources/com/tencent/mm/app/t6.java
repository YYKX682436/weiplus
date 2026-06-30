package com.tencent.mm.app;

/* loaded from: classes12.dex */
public enum t6 {
    UNTIL_TINKER_LOADED(196609, true),
    UNTIL_ON_BASE_CONTEXT_ATTACHED_END(196610, false),
    UNTIL_APPLICATION_ON_CREATE_END(196611, false),
    UNTIL_KERNEL_STARTUP_BEGIN(196612, true),
    UNTIL_PRELOAD_ON_SPLASH_BEGIN(196613, false),
    UNTIL_PRELOAD_ON_SPLASH_END(196614, false),
    UNTIL_INVOKE_KERNEL_EXTENSION_BEGIN(196615, false),
    UNTIL_INVOKE_KERNEL_EXTENSION_END(196616, false),
    UNTIL_KERNEL_STARTUP_END(196617, true),
    UNTIL_LAUNCHER_UI_ON_CREATE_BEGIN(196618, false),
    UNTIL_LAUNCHER_UI_ON_CREATE_END(196619, false),
    UNTIL_LAUNCHER_UI_ON_RESUME_END(196620, true),
    UNTIL_LAUNCHER_UI_FIRST_FRAME_END(196621, true);


    /* renamed from: d, reason: collision with root package name */
    public final int f53817d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f53818e;

    t6(int i17, boolean z17) {
        this.f53817d = i17;
        this.f53818e = z17;
    }
}
