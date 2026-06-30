package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class hp extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f250060d;

    public hp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
        this.f250060d = snsSettingUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        java.util.LinkedList linkedList = this.f250060d.e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        int size = linkedList.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        return size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        int i18 = com.tencent.mm.plugin.sns.ui.SnsSettingUI.g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        java.util.LinkedList linkedList = this.f250060d.e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsSettingUI");
        java.lang.Object obj = linkedList.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        android.widget.TextView textView = new android.widget.TextView(this.f250060d);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp lpVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lp) getItem(i17);
        textView.setTag(lpVar);
        textView.setText(lpVar.a() + "->:" + lpVar.mo71141x6ac9171());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setHeight(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50));
        if (i17 % 2 == 1) {
            textView.setBackgroundColor(android.graphics.Color.parseColor("#e2efda"));
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.gp(this, lpVar, textView));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$ChoiceAdapter");
        return textView;
    }
}
