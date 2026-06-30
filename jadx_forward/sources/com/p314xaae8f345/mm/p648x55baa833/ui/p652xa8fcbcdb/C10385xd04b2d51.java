package com.p314xaae8f345.mm.p648x55baa833.ui.p652xa8fcbcdb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/chatroom/ui/preference/StillNotifyMessagePreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatroom.ui.preference.StillNotifyMessagePreference */
/* loaded from: classes.dex */
public final class C10385xd04b2d51 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public java.lang.String M;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10385xd04b2d51(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void M() {
        java.lang.String str = this.M;
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = this.N;
            if (c22632xdab56332 == null) {
                return;
            }
            c22632xdab56332.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab563322 = this.N;
        if (c22632xdab563322 != null) {
            c22632xdab563322.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab563323 = this.N;
        if (c22632xdab563323 == null) {
            return;
        }
        c22632xdab563323.setText(this.M);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.N = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332) view.findViewById(com.p314xaae8f345.mm.R.id.va8);
        M();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.View findViewById = u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
            viewGroup2.removeAllViews();
            android.view.View.inflate(this.f279303d, com.p314xaae8f345.mm.R.C30864xbddafb2a.ek6, viewGroup2);
            this.L = u17;
        }
        return this.L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10385xd04b2d51(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10385xd04b2d51(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
