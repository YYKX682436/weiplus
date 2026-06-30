package bd4;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f19353a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f19354b;

    public h1(java.lang.String left, java.lang.String right) {
        kotlin.jvm.internal.o.g(left, "left");
        kotlin.jvm.internal.o.g(right, "right");
        this.f19353a = left;
        this.f19354b = right;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
            return true;
        }
        if (!(obj instanceof bd4.h1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
            return false;
        }
        bd4.h1 h1Var = (bd4.h1) obj;
        if (!kotlin.jvm.internal.o.b(this.f19353a, h1Var.f19353a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f19354b, h1Var.f19354b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        int hashCode = (this.f19353a.hashCode() * 31) + this.f19354b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        java.lang.String str = "PunctuationPair(left=" + this.f19353a + ", right=" + this.f19354b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper$PunctuationPair");
        return str;
    }
}
