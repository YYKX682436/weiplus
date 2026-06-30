package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes9.dex */
public final class ki extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f107215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.li f107216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f107217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f107218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(java.lang.String str, com.tencent.mm.plugin.finder.feed.li liVar, boolean z17, int i17) {
        super(0);
        this.f107215d = str;
        this.f107216e = liVar;
        this.f107217f = z17;
        this.f107218g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f107215d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.finder.feed.li liVar = this.f107216e;
        if (K0) {
            android.widget.TextView textView = liVar.f107303p;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            android.widget.TextView textView2 = liVar.f107303p;
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText(str);
                textView2.setClickable(this.f107217f);
                textView2.setTextColor(this.f107218g);
            }
        }
        return jz5.f0.f302826a;
    }
}
