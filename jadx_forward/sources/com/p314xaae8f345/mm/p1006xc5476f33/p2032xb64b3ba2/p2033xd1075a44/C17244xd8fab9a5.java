package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.p2033xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cR*\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/RingtoneLoaderMoreFooter;", "Landroid/widget/RelativeLayout;", "Lon5/c;", "", "value", "d", "Z", "getForceHideWhenNoMoreData", "()Z", "setForceHideWhenNoMoreData", "(Z)V", "forceHideWhenNoMoreData", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lsn5/c;", "getSpinnerStyle", "()Lsn5/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneLoaderMoreFooter */
/* loaded from: classes15.dex */
public final class C17244xd8fab9a5 extends android.widget.RelativeLayout implements on5.c {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean forceHideWhenNoMoreData;

    /* renamed from: e, reason: collision with root package name */
    public boolean f240108e;

    public C17244xd8fab9a5(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // on5.g
    public void a(on5.e kernel, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kernel, "kernel");
    }

    @Override // on5.c
    public boolean b(boolean z17) {
        if (this.f240108e == z17) {
            return true;
        }
        this.f240108e = z17;
        if (!z17) {
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ili);
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.ilg);
            if (findViewById == null) {
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/widget/RingtoneLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/ringtone/widget/RingtoneLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ili);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ilg);
        if (findViewById2 == null) {
            return true;
        }
        int i17 = this.forceHideWhenNoMoreData ? 8 : 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/ringtone/widget/RingtoneLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/ringtone/widget/RingtoneLoaderMoreFooter", "setNoMoreData", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
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
    }

    @Override // qn5.e
    public void g(on5.f refreshLayout, sn5.b oldState, sn5.b newState) {
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshLayout, "refreshLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldState, "oldState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        if (this.f240108e) {
            return;
        }
        if ((newState == sn5.b.f491689o || newState == sn5.b.f491688n) && (textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView.setVisibility(0);
        }
    }

    public final boolean getForceHideWhenNoMoreData() {
        return this.forceHideWhenNoMoreData;
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
        return 0;
    }

    @Override // on5.g
    public void i(boolean z17, float f17, int i17, int i18, int i19) {
    }

    /* renamed from: setForceHideWhenNoMoreData */
    public final void m68503x66e271c5(boolean z17) {
        android.view.View findViewById;
        this.forceHideWhenNoMoreData = z17;
        if (!z17 || (findViewById = findViewById(com.p314xaae8f345.mm.R.id.ilg)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/widget/RingtoneLoaderMoreFooter", "setForceHideWhenNoMoreData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/ringtone/widget/RingtoneLoaderMoreFooter", "setForceHideWhenNoMoreData", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public C17244xd8fab9a5(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570760bs5, this);
    }
}
