package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/widgets/MJEditText;", "Lcom/tencent/mm/ui/widget/cedit/edit/AppCompatEditTextCompatHeight;", "", ya.b.f77479x42930b2, "Ljz5/f0;", "setSelection", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.widgets.MJEditText */
/* loaded from: classes5.dex */
public final class C10997xb9369314 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22666xcf3be4c3 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10997xb9369314(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final int c(int i17) {
        if (i17 < 0) {
            i17 = 0;
        }
        android.text.Editable text = getText();
        int length = text != null ? text.length() : 0;
        return i17 > length ? length : i17;
    }

    @Override // android.widget.EditText
    public void setSelection(int i17, int i18) {
        super.setSelection(c(i17), c(i18));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10997xb9369314(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.widget.EditText
    public void setSelection(int i17) {
        super.setSelection(c(i17));
    }
}
