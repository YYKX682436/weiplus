package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/widget/DemoHeader;", "Landroid/widget/LinearLayout;", "Lon5/d;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.profile.widget.DemoHeader */
/* loaded from: classes15.dex */
public final class C14923xdcf7270 extends android.widget.LinearLayout implements on5.d {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f205999d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f206000e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f206001f;

    public C14923xdcf7270(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        j();
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kernel, "kernel");
    }

    @Override // on5.g
    public void c(on5.f refreshLayout, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
    }

    @Override // on5.g
    public void d(float f17, int i17, int i18) {
    }

    @Override // on5.g
    public void f(on5.f refreshLayout, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f206001f;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.d();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressView");
            throw null;
        }
    }

    @Override // qn5.e
    public void g(on5.f refreshLayout, sn5.b oldState, sn5.b newState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldState, "oldState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        int ordinal = newState.ordinal();
        if (ordinal == 3 || ordinal == 5) {
            android.widget.TextView textView = this.f205999d;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderText");
                throw null;
            }
            textView.setText("下拉开始刷新");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f206000e;
            if (c22699x3dcdb352 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowView");
                throw null;
            }
            c22699x3dcdb352.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f206001f;
            if (c22627xa933f8e4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressView");
                throw null;
            }
            c22627xa933f8e4.setVisibility(8);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f206000e;
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.animate().rotation(0.0f);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowView");
                throw null;
            }
        }
        if (ordinal != 10) {
            if (ordinal != 12) {
                return;
            }
            android.widget.TextView textView2 = this.f205999d;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderText");
                throw null;
            }
            textView2.setText("释放立即刷新");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f206000e;
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.animate().rotation(180.0f);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowView");
                throw null;
            }
        }
        android.widget.TextView textView3 = this.f205999d;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderText");
            throw null;
        }
        textView3.setText("正在刷新");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = this.f206001f;
        if (c22627xa933f8e42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressView");
            throw null;
        }
        c22627xa933f8e42.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f206000e;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.setVisibility(8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mArrowView");
            throw null;
        }
    }

    @Override // on5.g
    public sn5.c getSpinnerStyle() {
        return sn5.c.f491707b;
    }

    @Override // on5.g
    public android.view.View getView() {
        return this;
    }

    @Override // on5.g
    public int h(on5.f refreshLayout, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f206001f;
        if (c22627xa933f8e4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressView");
            throw null;
        }
        c22627xa933f8e4.d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = this.f206001f;
        if (c22627xa933f8e42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressView");
            throw null;
        }
        c22627xa933f8e42.setVisibility(8);
        if (z17) {
            android.widget.TextView textView = this.f205999d;
            if (textView != null) {
                textView.setText("刷新完成");
                return 500;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderText");
            throw null;
        }
        android.widget.TextView textView2 = this.f205999d;
        if (textView2 != null) {
            textView2.setText("刷新失败");
            return 500;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mHeaderText");
        throw null;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }

    public final void j() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.b6u, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.crr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f205999d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.a4s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f206000e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f567216im4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f206001f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14923xdcf7270(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        j();
    }
}
