package com.tencent.mm.modelstat;

/* loaded from: classes4.dex */
public enum j0 {
    Chat(1),
    TalkChat(2),
    Sns(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f71529d;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.modelstat.SnsStatExtUtil$EScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.modelstat.SnsStatExtUtil$EScene");
    }

    j0(int i17) {
        this.f71529d = 0;
        this.f71529d = i17;
    }

    public static com.tencent.mm.modelstat.j0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.modelstat.SnsStatExtUtil$EScene");
        com.tencent.mm.modelstat.j0 j0Var = (com.tencent.mm.modelstat.j0) java.lang.Enum.valueOf(com.tencent.mm.modelstat.j0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.modelstat.SnsStatExtUtil$EScene");
        return j0Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static com.tencent.mm.modelstat.j0[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.modelstat.SnsStatExtUtil$EScene");
        com.tencent.mm.modelstat.j0[] j0VarArr = (com.tencent.mm.modelstat.j0[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.modelstat.SnsStatExtUtil$EScene");
        return j0VarArr;
    }
}
