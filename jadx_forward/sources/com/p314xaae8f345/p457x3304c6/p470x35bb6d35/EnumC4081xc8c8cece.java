package com.p314xaae8f345.p457x3304c6.p470x35bb6d35;

/* renamed from: com.tencent.maas.instamovie.MJMovieSessionState */
/* loaded from: classes5.dex */
public enum EnumC4081xc8c8cece {
    Error(-1),
    Initial(0),
    InitialCreating(1),
    Ready(2),
    Recreating(3),
    Exporting(4),
    Playing(5),
    Updating(6),
    Teardowning(7),
    Switching(8);


    /* renamed from: value */
    private final int f16045x6ac9171;

    EnumC4081xc8c8cece(int i17) {
        this.f16045x6ac9171 = i17;
    }

    /* renamed from: fromInt */
    public static com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece m33490xdc92efe5(int i17) {
        for (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.EnumC4081xc8c8cece enumC4081xc8c8cece : m33492xcee59d22()) {
            if (enumC4081xc8c8cece.m33493x754a37bb() == i17) {
                return enumC4081xc8c8cece;
            }
        }
        return Error;
    }

    /* renamed from: getValue */
    public int m33493x754a37bb() {
        return this.f16045x6ac9171;
    }
}
