package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/RingtoneRefreshHeader;", "Landroid/widget/RelativeLayout;", "Lon5/d;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneRefreshHeader */
/* loaded from: classes15.dex */
public final class C17245x46724ca6 extends android.widget.RelativeLayout implements on5.d {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f240109d;

    /* renamed from: e, reason: collision with root package name */
    public int f240110e;

    /* renamed from: f, reason: collision with root package name */
    public float f240111f;

    public C17245x46724ca6(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
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
    public boolean e() {
        return false;
    }

    @Override // on5.g
    public void f(on5.f refreshLayout, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f240109d;
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
        if (ordinal == 3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f240109d;
            if (c22627xa933f8e4 != null) {
                c22627xa933f8e4.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressView");
                throw null;
            }
        }
        if (ordinal != 5) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e42 = this.f240109d;
        if (c22627xa933f8e42 != null) {
            c22627xa933f8e42.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressView");
            throw null;
        }
    }

    @Override // on5.g
    /* renamed from: getSpinnerStyle */
    public sn5.c mo56606x2a3c758e() {
        return sn5.c.f491707b;
    }

    @Override // on5.g
    /* renamed from: getView */
    public android.view.View mo56607xfb86a31b() {
        return this;
    }

    @Override // on5.g
    public int h(on5.f refreshLayout, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f240109d;
        if (c22627xa933f8e4 != null) {
            c22627xa933f8e4.setVisibility(8);
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressView");
        throw null;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
        if (this.f240110e != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f240109d;
            if (c22627xa933f8e4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mProgressView");
                throw null;
            }
            c22627xa933f8e4.b((i17 - r1) / this.f240111f);
        }
        this.f240110e = i17;
    }

    public C17245x46724ca6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570953ch2, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567216im4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f240109d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) findViewById;
        this.f240111f = getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
    }
}
