package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.MMDatePickerView */
/* loaded from: classes.dex */
public class ViewOnClickListenerC22620x9b43c861 extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f292845d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f292846e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f292847f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22630x1f521715 f292848g;

    public ViewOnClickListenerC22620x9b43c861(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byb, this);
        this.f292845d = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.ptb);
        this.f292846e = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.jqe);
        this.f292847f = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.cqv);
        this.f292848g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22630x1f521715) inflate.findViewById(com.p314xaae8f345.mm.R.id.jlu);
        this.f292845d.setOnClickListener(this);
        this.f292846e.setOnClickListener(this);
        this.f292847f.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/MMDatePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.p314xaae8f345.mm.R.id.ptb) {
            this.f292848g.m81390xc7abc553(0);
        } else if (id6 == com.p314xaae8f345.mm.R.id.jqe) {
            this.f292848g.m81390xc7abc553(1);
        } else {
            this.f292848g.m81390xc7abc553(2);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/MMDatePickerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public ViewOnClickListenerC22620x9b43c861(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
