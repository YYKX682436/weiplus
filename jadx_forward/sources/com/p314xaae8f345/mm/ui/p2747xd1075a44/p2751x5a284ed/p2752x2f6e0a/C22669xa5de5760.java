package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/widget/cedit/edit/EditTextCompatHeight;", "Landroid/widget/EditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.cedit.edit.EditTextCompatHeight */
/* loaded from: classes5.dex */
public class C22669xa5de5760 extends android.widget.EditText {
    public C22669xa5de5760(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!com.p314xaae8f345.mm.ui.b4.b(getContext()) || android.os.Build.VERSION.SDK_INT < 35) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }

    public C22669xa5de5760(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        if (!com.p314xaae8f345.mm.ui.b4.b(getContext()) || android.os.Build.VERSION.SDK_INT < 35) {
            return;
        }
        setLocalePreferredLineHeightForMinimumUsed(false);
    }
}
