package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes5.dex */
public enum o0 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    AFFROAM_TASK_TYPE_UNKNOWN(0),
    AFFROAM_TASK_TYPE_AUTO_BACKUP(1),
    AFFROAM_TASK_TYPE_BACKUP(2),
    AFFROAM_TASK_TYPE_RESTORE(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f297470d;

    o0(int i17) {
        this.f297470d = i17;
    }

    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 a(int i17) {
        if (i17 == 0) {
            return AFFROAM_TASK_TYPE_UNKNOWN;
        }
        if (i17 == 1) {
            return AFFROAM_TASK_TYPE_AUTO_BACKUP;
        }
        if (i17 == 2) {
            return AFFROAM_TASK_TYPE_BACKUP;
        }
        if (i17 != 3) {
            return null;
        }
        return AFFROAM_TASK_TYPE_RESTORE;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f297470d;
    }
}
