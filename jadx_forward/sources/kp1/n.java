package kp1;

/* loaded from: classes11.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 f392456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ np1.a f392457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 abstractC12879x228c0db6, np1.a aVar) {
        super(0);
        this.f392456d = abstractC12879x228c0db6;
        this.f392457e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1271x2e97505b.p1272x373aa5.AbstractC12879x228c0db6 abstractC12879x228c0db6 = this.f392456d;
        np1.a aVar = this.f392457e;
        abstractC12879x228c0db6.m54040x1180add9(aVar);
        java.lang.String f17 = abstractC12879x228c0db6.f(aVar);
        if (f17 == null || f17.length() == 0) {
            android.widget.TextView textView = abstractC12879x228c0db6.recentDescTextView;
            if (textView != null) {
                textView.setText(textView.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hja));
                textView.setTextColor(textView.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
                textView.setVisibility(0);
            }
        } else {
            android.widget.TextView textView2 = abstractC12879x228c0db6.recentDescTextView;
            if (textView2 != null) {
                textView2.setText(f17);
                textView2.setTextColor(textView2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                textView2.setVisibility(0);
            }
        }
        abstractC12879x228c0db6.n(abstractC12879x228c0db6.getMCurrentPlayState());
        abstractC12879x228c0db6.k(aVar);
        return jz5.f0.f384359a;
    }
}
