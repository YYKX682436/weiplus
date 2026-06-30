package com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 f233847d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1) {
        this.f233847d = abstractActivityC16727x398198e1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.AbstractActivityC16727x398198e1 abstractActivityC16727x398198e1 = this.f233847d;
        if (abstractActivityC16727x398198e1.f233777t == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseLifeUI", "Location is null");
            yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11138, "1", java.lang.Integer.valueOf(abstractActivityC16727x398198e1.f233768h.getCount() + 1), abstractActivityC16727x398198e1.F);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(abstractActivityC16727x398198e1, com.p314xaae8f345.mm.p1006xc5476f33.p1927x2d95e324.ui.ActivityC16731xe258a4be.class);
        intent.putExtra("get_lat", abstractActivityC16727x398198e1.f233777t.f453708e);
        intent.putExtra("get_lng", abstractActivityC16727x398198e1.f233777t.f453707d);
        intent.putExtra("get_preci", abstractActivityC16727x398198e1.f233777t.f453709f);
        intent.putExtra("get_poi_name", abstractActivityC16727x398198e1.f233768h.f233843r);
        intent.putExtra("get_cur_lat", abstractActivityC16727x398198e1.f233778u);
        intent.putExtra("get_cur_lng", abstractActivityC16727x398198e1.f233779v);
        intent.putExtra("get_accuracy", abstractActivityC16727x398198e1.f233781x);
        intent.putExtra("get_loctype", abstractActivityC16727x398198e1.f233780w);
        intent.putExtra("search_id", abstractActivityC16727x398198e1.F);
        intent.putExtra("get_is_mars", abstractActivityC16727x398198e1.f233782y);
        abstractActivityC16727x398198e1.startActivityForResult(intent, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
