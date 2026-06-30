package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes8.dex */
public final class t8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 f192091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237) {
        super(0);
        this.f192091d = activityC13996x5a58c237;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        android.text.Editable text;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13996x5a58c237 activityC13996x5a58c237 = this.f192091d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC13996x5a58c237.A;
        if (c22621x7603e017 == null || (text = c22621x7603e017.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        java.lang.String b17 = hc2.l.b(str);
        activityC13996x5a58c237.L = b17;
        boolean z17 = !(b17.length() == 0);
        activityC13996x5a58c237.e7(z17);
        if (z17) {
            android.widget.ImageView imageView = activityC13996x5a58c237.B;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            android.widget.ImageView imageView2 = activityC13996x5a58c237.B;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
        }
        return jz5.f0.f384359a;
    }
}
