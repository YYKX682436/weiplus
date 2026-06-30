package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes9.dex */
public final class ki extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li f188749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f188750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f188751g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar, boolean z17, int i17) {
        super(0);
        this.f188748d = str;
        this.f188749e = liVar;
        this.f188750f = z17;
        this.f188751g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f188748d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = this.f188749e;
        if (K0) {
            android.widget.TextView textView = liVar.f188836p;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            android.widget.TextView textView2 = liVar.f188836p;
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText(str);
                textView2.setClickable(this.f188750f);
                textView2.setTextColor(this.f188751g);
            }
        }
        return jz5.f0.f384359a;
    }
}
