package com.p314xaae8f345.p3210x3857dc.p3212x5b09653;

/* renamed from: com.tencent.xweb.debug.FragmentLog */
/* loaded from: classes13.dex */
public class C27828xb1690eb4 extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f301783d;

    public C27828xb1690eb4(qx5.l lVar) {
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.p3222x9cba06de.R.C27875xbddafb2a.f61374x21e1c884, viewGroup, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61360xe5a1a17c);
        this.f301783d = textView;
        by5.w wVar = by5.c4.f117956a;
        android.content.SharedPreferences a17 = by5.d4.a("UPDATELOG", true);
        textView.setText(a17 != null ? a17.getString("log", "") : "");
        this.f301783d.setOnLongClickListener(new qx5.h(this));
        return inflate;
    }
}
