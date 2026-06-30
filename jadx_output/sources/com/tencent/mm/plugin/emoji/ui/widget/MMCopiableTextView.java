package com.tencent.mm.plugin.emoji.ui.widget;

/* loaded from: classes5.dex */
public class MMCopiableTextView extends com.tencent.mm.ui.widget.cedit.edit.EditTextCompatHeight implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f98537d;

    /* renamed from: e, reason: collision with root package name */
    public int f98538e;

    public MMCopiableTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnLongClickListener(this);
        setLongClickable(true);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean getDefaultEditable() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onCreateContextMenu(android.view.ContextMenu contextMenu) {
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/widget/MMCopiableTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.String obj = getEditableText().toString();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj) && (i17 = this.f98537d) > 0 && (i18 = this.f98538e) > 0 && i18 > i17) {
            com.tencent.mm.sdk.platformtools.b0.e(obj.substring(i17, i18).trim());
            dp.a.makeText(getContext(), com.tencent.mm.R.string.f490361st, 0).show();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/emoji/ui/widget/MMCopiableTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }

    public void setEndIndex(int i17) {
        this.f98538e = i17;
    }

    public void setStartIndex(int i17) {
        this.f98537d = i17;
    }

    public MMCopiableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setOnLongClickListener(this);
        setLongClickable(true);
    }
}
