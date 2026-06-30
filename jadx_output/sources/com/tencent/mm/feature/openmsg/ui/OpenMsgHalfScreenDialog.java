package com.tencent.mm.feature.openmsg.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/feature/openmsg/ui/OpenMsgHalfScreenDialog;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenMaxHeightDialogFragment;", "Landroid/content/Context;", "context", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "feature-openmsg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class OpenMsgHalfScreenDialog extends com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment {
    public static final /* synthetic */ int H = 0;
    public final jz5.g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenMsgHalfScreenDialog(android.content.Context context, dh5.a halfScreenParam) {
        super(context, halfScreenParam);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(halfScreenParam, "halfScreenParam");
        this.G = jz5.h.b(new ib0.f(this, context));
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment
    public int C0() {
        return ((java.lang.Number) ((jz5.n) this.G).getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment
    public bh5.l m0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        bh5.l m07 = super.m0(context);
        android.view.Window window = m07.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        return m07;
    }

    @Override // com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        o0().setBackgroundResource(com.tencent.mm.R.color.f478490b);
    }
}
