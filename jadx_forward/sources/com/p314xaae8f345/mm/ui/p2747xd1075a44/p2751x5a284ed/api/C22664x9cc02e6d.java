package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api;

/* renamed from: com.tencent.mm.ui.widget.cedit.api.PasterEditTextCompact */
/* loaded from: classes15.dex */
public class C22664x9cc02e6d extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.C22667x7baecd08 {
    public int A2;
    public boolean B2;
    public java.lang.String C2;
    public final java.util.List D2;
    public final java.util.LinkedList E2;
    public final java.util.LinkedList F2;

    /* renamed from: v2, reason: collision with root package name */
    public boolean f293099v2;

    /* renamed from: w2, reason: collision with root package name */
    public int f293100w2;

    /* renamed from: x2, reason: collision with root package name */
    public int f293101x2;

    /* renamed from: y2, reason: collision with root package name */
    public java.lang.CharSequence f293102y2;

    /* renamed from: z2, reason: collision with root package name */
    public java.lang.CharSequence f293103z2;

    public C22664x9cc02e6d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293099v2 = false;
        this.f293100w2 = 0;
        this.f293101x2 = 0;
        this.f293102y2 = "";
        this.f293103z2 = "";
        this.A2 = 0;
        this.B2 = false;
        this.C2 = "";
        this.D2 = new java.util.ArrayList();
        this.E2 = new java.util.LinkedList();
        this.F2 = new java.util.LinkedList();
        fl5.p pVar = new fl5.p(this);
        if (this.f293111J == null) {
            this.f293111J = new java.util.ArrayList();
        }
        this.f293111J.add(pVar);
    }

    /* renamed from: addTextChangedListener */
    public void m81594xeb238c3a(android.text.TextWatcher textWatcher) {
        this.E2.add(textWatcher);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023
    public boolean c0(int i17) {
        if (i17 != 16908322) {
            return i17 == 16908321 ? super.c0(i17) : super.c0(i17);
        }
        this.f293099v2 = true;
        return super.c0(i17);
    }

    /* renamed from: getPasterContent */
    public java.lang.CharSequence m81595xf23b5f84() {
        return this.f293103z2;
    }

    /* renamed from: getPasterLen */
    public int mo70737xc8d30aa0() {
        return this.A2;
    }

    /* renamed from: getSimilarPasteChange */
    public boolean m81596x8e20872e() {
        return this.B2;
    }

    /* renamed from: getSimilarPasteSeqStr */
    public java.lang.String m81597xa94aacd0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < 3; i17++) {
            java.util.List list = this.D2;
            if (i17 >= list.size()) {
                break;
            }
            if (i17 != 0) {
                sb6.append(",");
            }
            sb6.append(list.get(i17));
        }
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PasterEditTextCompact", "onKeyDown keyCode:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i17, int i18, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PasterEditTextCompact", "onKeyMultiple keyCode:%s repeatCount:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyMultiple(i17, i18, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View
    public boolean onKeyPreIme(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PasterEditTextCompact", "onKeyMultiple keyCode:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyPreIme(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View
    public boolean onKeyShortcut(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PasterEditTextCompact", "onKeyShortcut keyCode:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyShortcut(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PasterEditTextCompact", "onKeyUp keyCode:%s eventAction:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(keyEvent.getAction()));
        return super.onKeyUp(i17, keyEvent);
    }

    public void q() {
        this.B2 = false;
        this.D2.clear();
        this.C2 = "";
    }

    /* renamed from: removeTextChangedListener */
    public void m81598xf214c377(android.text.TextWatcher textWatcher) {
        this.E2.remove(textWatcher);
    }

    public C22664x9cc02e6d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293099v2 = false;
        this.f293100w2 = 0;
        this.f293101x2 = 0;
        this.f293102y2 = "";
        this.f293103z2 = "";
        this.A2 = 0;
        this.B2 = false;
        this.C2 = "";
        this.D2 = new java.util.ArrayList();
        this.E2 = new java.util.LinkedList();
        this.F2 = new java.util.LinkedList();
        fl5.p pVar = new fl5.p(this);
        if (this.f293111J == null) {
            this.f293111J = new java.util.ArrayList();
        }
        this.f293111J.add(pVar);
    }
}
