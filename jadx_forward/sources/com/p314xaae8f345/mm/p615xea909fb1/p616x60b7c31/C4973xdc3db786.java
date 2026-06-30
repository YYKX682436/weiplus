package com.p314xaae8f345.mm.p615xea909fb1.p616x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/adplayable/jsapi/MagicPlayableContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.adplayable.jsapi.MagicPlayableContainer */
/* loaded from: classes10.dex */
public class C4973xdc3db786 extends android.widget.FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4973xdc3db786(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public /* synthetic */ C4973xdc3db786(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4973xdc3db786(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String str = "";
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.dd.f159113a, i17, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i18 = 0; i18 < indexCount; i18++) {
                int index = obtainStyledAttributes.getIndex(i18);
                if (index == 0 && (string = obtainStyledAttributes.getString(index)) != null) {
                    str = string;
                }
            }
            obtainStyledAttributes.recycle();
        }
        setBackgroundColor(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicPlayableContainer", "MagicPlayableContainer init:" + str);
    }
}
