package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoNotFollowPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoNotFollowPreference */
/* loaded from: classes.dex */
public final class C16883x1cf16fde extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public final java.lang.String M;

    public C16883x1cf16fde(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.t(view);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.akf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.L = (android.widget.TextView) findViewById;
        java.lang.String str = this.M;
        if (!r26.n0.N(str)) {
            android.widget.TextView textView = this.L;
            if (textView != null) {
                textView.setText(str);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTv");
                throw null;
            }
        }
    }

    public C16883x1cf16fde(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = "";
    }
}
