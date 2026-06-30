package com.p314xaae8f345.p3210x3857dc.p3212x5b09653;

/* renamed from: com.tencent.xweb.debug.FragmentInfo */
/* loaded from: classes13.dex */
public class C27827x7bb7673e extends com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6 {

    /* renamed from: d, reason: collision with root package name */
    public final qx5.l f301781d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f301782e;

    public C27827x7bb7673e(qx5.l lVar) {
        this.f301781d = lVar;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(com.p314xaae8f345.p3222x9cba06de.R.C27875xbddafb2a.f61373x1a55e76e, viewGroup, false);
        this.f301782e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.p3222x9cba06de.R.id.f61359xce912d76);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        qx5.l lVar = this.f301781d;
        sb6.append(qx5.x.c(lVar.mo161097x86b9ebe3()));
        sb6.append("\n");
        sb6.append(qx5.x.b(lVar.mo161097x86b9ebe3()));
        sb6.append("\n");
        sb6.append(qx5.u.d());
        this.f301782e.setText(sb6.toString());
        this.f301782e.setOnLongClickListener(new qx5.g(this));
        return inflate;
    }
}
