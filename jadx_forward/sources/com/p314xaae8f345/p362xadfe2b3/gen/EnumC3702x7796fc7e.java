package com.p314xaae8f345.p362xadfe2b3.gen;

/* renamed from: com.tencent.liteapp.gen.LogType */
/* loaded from: classes5.dex */
public enum EnumC3702x7796fc7e {
    UNDEFINED(1),
    PRELOAD(2),
    START(3),
    RUNNING(4),
    END(5),
    DOWNLOAD(6),
    OTHER(100),
    DESKTOP(101),
    DIRTY(102),
    DESKTOP_START(200),
    DESKTOP_END(299);


    /* renamed from: value */
    private final int f14184x6ac9171;

    EnumC3702x7796fc7e(int i17) {
        this.f14184x6ac9171 = i17;
    }

    /* renamed from: fromValue */
    public static com.p314xaae8f345.p362xadfe2b3.gen.EnumC3702x7796fc7e m28961x447c3e7(int i17) {
        for (com.p314xaae8f345.p362xadfe2b3.gen.EnumC3702x7796fc7e enumC3702x7796fc7e : m28963xcee59d22()) {
            if (enumC3702x7796fc7e.f14184x6ac9171 == i17) {
                return enumC3702x7796fc7e;
            }
        }
        return m28963xcee59d22()[0];
    }

    /* renamed from: getValue */
    public int m28964x754a37bb() {
        return this.f14184x6ac9171;
    }
}
