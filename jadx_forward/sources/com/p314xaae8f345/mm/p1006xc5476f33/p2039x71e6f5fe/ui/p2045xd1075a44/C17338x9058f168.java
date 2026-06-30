package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScrollTab;", "Landroid/widget/LinearLayout;", "Ld04/k;", "", "getTabId", "", "getTabTitle", "tabId", "Ljz5/f0;", "setTabId", "tabTitle", "setTabTitle", "", "enable", "setTabEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScrollTab */
/* loaded from: classes8.dex */
public final class C17338x9058f168 extends android.widget.LinearLayout implements d04.k {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f241340d;

    /* renamed from: e, reason: collision with root package name */
    public int f241341e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17338x9058f168(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // d04.k
    /* renamed from: getTabId, reason: from getter */
    public int getF241341e() {
        return this.f241341e;
    }

    /* renamed from: getTabTitle */
    public java.lang.String m68854x452b2539() {
        android.widget.TextView textView = this.f241340d;
        if (textView != null) {
            return textView.getText().toString();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabTitle");
        throw null;
    }

    @Override // d04.k
    /* renamed from: setTabEnabled */
    public void mo68855xc315a7ee(boolean z17) {
        if (z17) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.3f);
        }
    }

    /* renamed from: setTabId */
    public void m68856x53bbf84e(int i17) {
        this.f241341e = i17;
    }

    /* renamed from: setTabTitle */
    public void m68857x3fe38645(java.lang.String tabTitle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabTitle, "tabTitle");
        android.widget.TextView textView = this.f241340d;
        if (textView != null) {
            textView.setText(tabTitle);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabTitle");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17338x9058f168(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f241341e = -1;
        android.view.View findViewById = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570745bp3, this).findViewById(com.p314xaae8f345.mm.R.id.mck);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f241340d = textView;
        textView.setAlpha(0.5f);
    }
}
