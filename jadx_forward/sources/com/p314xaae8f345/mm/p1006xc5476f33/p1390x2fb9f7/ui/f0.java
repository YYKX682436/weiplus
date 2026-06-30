package com.p314xaae8f345.mm.p1006xc5476f33.p1390x2fb9f7.ui;

/* loaded from: classes12.dex */
public class f0 extends android.widget.ArrayAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.expt.ui.KvInfoUI f181367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.expt.ui.KvInfoUI kvInfoUI, android.content.Context context, int i17, int i18) {
        super(context, i17, i18);
        this.f181367d = kvInfoUI;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i17, view, viewGroup);
        g62.h hVar = (g62.h) this.f181367d.f.getItem(i17);
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.hrw);
        if (hVar == null || !hVar.f350619d) {
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        } else {
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        }
        return view2;
    }
}
