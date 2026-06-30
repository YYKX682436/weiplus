package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class oe extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 f242922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f242923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891, boolean z17) {
        super(0);
        this.f242922d = activityC17429xf3011891;
        this.f242923e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17429xf3011891 activityC17429xf3011891 = this.f242922d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.me meVar = activityC17429xf3011891.K;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.me meVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.me.f242860d;
        boolean z17 = this.f242923e;
        if (meVar == meVar2) {
            android.widget.TextView textView = activityC17429xf3011891.f241991d;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            textView.setText(z17 ? activityC17429xf3011891.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5d) : activityC17429xf3011891.getString(com.p314xaae8f345.mm.R.C30867xcad56011.p0p));
        } else {
            android.widget.TextView textView2 = activityC17429xf3011891.f241991d;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
                throw null;
            }
            textView2.setText(z17 ? activityC17429xf3011891.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o5x) : activityC17429xf3011891.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575314p16));
        }
        android.widget.TextView textView3 = activityC17429xf3011891.f241991d;
        if (textView3 != null) {
            sa5.d.c(textView3, 0.0f, 0L, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ne.f242892d, 3, null);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTV");
        throw null;
    }
}
