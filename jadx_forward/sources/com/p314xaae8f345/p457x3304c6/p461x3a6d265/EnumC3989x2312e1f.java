package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJAIGCCancelReason */
/* loaded from: classes5.dex */
public enum EnumC3989x2312e1f {
    Default(0),
    UserAbandon(1),
    RemindLater(2);


    /* renamed from: value */
    private final int f15817x6ac9171;

    EnumC3989x2312e1f(int i17) {
        this.f15817x6ac9171 = i17;
    }

    /* renamed from: fromValue */
    public static com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f m32485x447c3e7(int i17) {
        for (com.p314xaae8f345.p457x3304c6.p461x3a6d265.EnumC3989x2312e1f enumC3989x2312e1f : m32487xcee59d22()) {
            if (enumC3989x2312e1f.f15817x6ac9171 == i17) {
                return enumC3989x2312e1f;
            }
        }
        return Default;
    }

    /* renamed from: getValue */
    public int m32488x754a37bb() {
        return this.f15817x6ac9171;
    }
}
