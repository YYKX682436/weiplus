package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.TaskStatus */
/* loaded from: classes.dex */
public enum EnumC4529xb09bd5f7 implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    TASK_STATUS_RUNNING(0),
    TASK_STATUS_WAITING(1),
    TASK_STATUS_NOT_EXISTS(2),
    TASK_STATUS_COMPLETED(3);


    /* renamed from: TASK_STATUS_COMPLETED_VALUE */
    public static final int f19057x6e3cb7ea = 3;

    /* renamed from: TASK_STATUS_NOT_EXISTS_VALUE */
    public static final int f19059xb8d719ad = 2;

    /* renamed from: TASK_STATUS_RUNNING_VALUE */
    public static final int f19061x503f739e = 0;

    /* renamed from: TASK_STATUS_WAITING_VALUE */
    public static final int f19063x302ed1ac = 1;

    /* renamed from: value */
    public final int f19064x6ac9171;

    EnumC4529xb09bd5f7(int i17) {
        this.f19064x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4529xb09bd5f7 m39607x382ad972(int i17) {
        if (i17 == 0) {
            return TASK_STATUS_RUNNING;
        }
        if (i17 == 1) {
            return TASK_STATUS_WAITING;
        }
        if (i17 == 2) {
            return TASK_STATUS_NOT_EXISTS;
        }
        if (i17 != 3) {
            return null;
        }
        return TASK_STATUS_COMPLETED;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f19064x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4529xb09bd5f7 m39608xdce0328(int i17) {
        return m39607x382ad972(i17);
    }
}
