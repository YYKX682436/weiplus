package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes14.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v f256976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.p f256977e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v vVar, com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.p pVar) {
        this.f256976d = vVar;
        this.f256977e = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/SelectLanguageUIC$DefaultLanguageItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v vVar = this.f256976d;
        java.util.Iterator it = vVar.f257008f.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.p) it.next()).f256989e.f256984d = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.p pVar = this.f256977e;
        pVar.f256989e.f256984d = true;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = vVar.f257009g;
        if (c22849x81a93d25 != null && (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) != null) {
            mo7946xf939df19.m8146xced61ae5();
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = vVar.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 abstractActivityC16711x120e7ae0 = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) m158354x19263085 : null;
        if (abstractActivityC16711x120e7ae0 != null) {
            android.content.Intent intent = abstractActivityC16711x120e7ae0.getIntent();
            intent.putExtra("intent_key_language_code", pVar.f256989e.f256983c);
            intent.putExtra("intent_key_language_name", pVar.f256989e.f256981a);
            abstractActivityC16711x120e7ae0.setResult(-1, intent);
            abstractActivityC16711x120e7ae0.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/SelectLanguageUIC$DefaultLanguageItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
