package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/SayHiPictureHalfScreenDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenMaxHeightDialogFragment;", "Landroidx/lifecycle/x;", "Landroid/content/Context;", "context", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.SayHiPictureHalfScreenDialogFragment */
/* loaded from: classes14.dex */
public final class C16869xff3e4b69 extends com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104 {
    public static final /* synthetic */ int H = 0;
    public final jz5.g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16869xff3e4b69(android.content.Context context, dh5.a halfScreenParam) {
        super(context, halfScreenParam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenParam, "halfScreenParam");
        this.G = jz5.h.b(new hr3.md(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104
    public int C0() {
        return ((java.lang.Number) ((jz5.n) this.G).mo141623x754a37bb()).intValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public bh5.l m0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        bh5.l m07 = super.m0(context);
        android.view.Window window = m07.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        return m07;
    }
}
