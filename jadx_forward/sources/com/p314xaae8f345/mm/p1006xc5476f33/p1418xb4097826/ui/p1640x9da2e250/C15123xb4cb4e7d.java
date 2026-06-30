package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHalfScreenDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroidx/lifecycle/x;", "Landroid/content/Context;", "context", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderHalfScreenDialogFragment */
/* loaded from: classes14.dex */
public final class C15123xb4cb4e7d extends com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15123xb4cb4e7d(android.content.Context context, dh5.a halfScreenParam) {
        super(context, halfScreenParam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenParam, "halfScreenParam");
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public int p0() {
        android.content.Context context = this.f290336d;
        return context.getResources().getConfiguration().orientation == 2 ? w0() - com.p314xaae8f345.mm.ui.bl.h(context) : (int) (w0() * 0.75d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public int r0() {
        return this.f290336d.getResources().getConfiguration().orientation == 2 ? w0() : ((java.lang.Number) ((jz5.n) this.f290340h).mo141623x754a37bb()).intValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public float s0() {
        return 0.5f;
    }
}
