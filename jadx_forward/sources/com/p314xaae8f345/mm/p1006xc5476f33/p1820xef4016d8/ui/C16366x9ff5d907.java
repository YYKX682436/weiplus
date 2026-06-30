package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyExclusiveSelectView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/luckymoney/ui/d6;", "", "getInputViewId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectView */
/* loaded from: classes3.dex */
public final class C16366x9ff5d907 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f227650d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f227651e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f227652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16366x9ff5d907(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeSet, "attributeSet");
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bud, this);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.j1i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f227650d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.j1h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f227651e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.j1e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f227652f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void a() {
        android.widget.TextView textView = this.f227651e;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f227652f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.i(getContext()));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("arrowIv");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public void b() {
        android.widget.TextView textView = this.f227651e;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f227652f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("arrowIv");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public java.lang.String d(int i17) {
        if (i17 != 3 && i17 != 4) {
            return "";
        }
        android.content.Context context = getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.widget.TextView textView = this.f227651e;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
            throw null;
        }
        objArr[0] = textView.getText();
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573969gn3, objArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.d6
    public int e() {
        android.widget.TextView textView = this.f227650d;
        if (textView != null) {
            return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(textView.getText()) ? 0 : 4;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("usernameTv");
        throw null;
    }

    /* renamed from: getInputViewId */
    public int m66172xcc1739d4() {
        return 0;
    }
}
