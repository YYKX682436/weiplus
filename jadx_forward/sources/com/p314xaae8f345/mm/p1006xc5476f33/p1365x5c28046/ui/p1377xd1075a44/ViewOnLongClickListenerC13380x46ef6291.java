package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1377xd1075a44;

/* renamed from: com.tencent.mm.plugin.emoji.ui.widget.MMCopiableTextView */
/* loaded from: classes5.dex */
public class ViewOnLongClickListenerC13380x46ef6291 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22669xa5de5760 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public int f180070d;

    /* renamed from: e, reason: collision with root package name */
    public int f180071e;

    public ViewOnLongClickListenerC13380x46ef6291(android.content.Context context, android.util.AttributeSet attributeSet) {
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
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj) && (i17 = this.f180070d) > 0 && (i18 = this.f180071e) > 0 && i18 > i17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(obj.substring(i17, i18).trim());
            dp.a.m125853x26a183b(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571894st, 0).show();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/emoji/ui/widget/MMCopiableTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }

    /* renamed from: setEndIndex */
    public void m54870xdc339f39(int i17) {
        this.f180071e = i17;
    }

    /* renamed from: setStartIndex */
    public void m54871xbd67e792(int i17) {
        this.f180070d = i17;
    }

    public ViewOnLongClickListenerC13380x46ef6291(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setOnLongClickListener(this);
        setLongClickable(true);
    }
}
