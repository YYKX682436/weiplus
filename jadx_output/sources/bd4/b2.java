package bd4;

/* loaded from: classes4.dex */
public final class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f19299e;

    public b2(bd4.f2 f2Var, android.view.MotionEvent motionEvent) {
        this.f19298d = f2Var;
        this.f19299e = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.MotionEvent copied = this.f19299e;
        bd4.f2 f2Var = this.f19298d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$showMagnifierOnNextDraw$1");
        try {
            if (bd4.f2.c(f2Var)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                int i17 = f2Var.A;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                int i18 = f2Var.f19345z;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                if (i17 > i18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    int i19 = f2Var.f19345z;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    int i27 = f2Var.A;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMagnifierHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMagnifierHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    xl5.c cVar = (xl5.c) ((jz5.n) f2Var.D).getValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMagnifierHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMagnifierHelper", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                    kotlin.jvm.internal.o.f(copied, "$copied");
                    cVar.b(copied, (i19 + i27) / 2);
                }
            }
        } finally {
            copied.recycle();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$showMagnifierOnNextDraw$1");
        }
    }
}
