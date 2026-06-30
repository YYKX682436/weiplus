package com.tencent.mm.chatting.component;

/* loaded from: classes13.dex */
public class ListScrollPAGView extends com.tencent.mm.view.MMPAGView {
    public ListScrollPAGView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p();
    }

    @Override // com.tencent.mm.view.MMPAGView
    public void g() {
        jx3.f.INSTANCE.d(22021, 20250627, 0, "useRfx:" + getUseRfx());
        super.g();
    }

    public final void p() {
        o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxPaySwitch()) == 1);
        com.tencent.mars.xlog.Log.i(this.f213327d, "asyncDestroy, useRfx:" + this.useRfx);
        this.f213328e.setSurfaceDestroyTaskExecutor(this.f213335o);
        this.f213329f.setSurfaceDestroyTaskExecutor(this.f213336p);
    }

    public ListScrollPAGView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p();
    }
}
