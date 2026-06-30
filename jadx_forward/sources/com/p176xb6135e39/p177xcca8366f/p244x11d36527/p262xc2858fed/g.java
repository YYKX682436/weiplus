package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed;

/* loaded from: classes14.dex */
public class g extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 f126155e;

    public g(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07) {
        this.f126155e = c2720x269bcc07;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View view, o3.l lVar) {
        super.mo7102x1bd2f9af(view, lVar);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07 = this.f126155e;
        android.widget.EditText m20398xdb574fcd = c2720x269bcc07.m20398xdb574fcd();
        android.text.Editable text = m20398xdb574fcd != null ? m20398xdb574fcd.getText() : null;
        java.lang.CharSequence m20404xfb8046fd = c2720x269bcc07.m20404xfb8046fd();
        java.lang.CharSequence m20399x74627852 = c2720x269bcc07.m20399x74627852();
        java.lang.CharSequence m20396xf2ffa6f4 = c2720x269bcc07.m20396xf2ffa6f4();
        boolean z17 = !android.text.TextUtils.isEmpty(text);
        boolean z18 = !android.text.TextUtils.isEmpty(m20404xfb8046fd);
        boolean z19 = !android.text.TextUtils.isEmpty(m20399x74627852);
        boolean z27 = false;
        boolean z28 = z19 || !android.text.TextUtils.isEmpty(m20396xf2ffa6f4);
        if (z17) {
            lVar.v(text);
        } else if (z18) {
            lVar.v(m20404xfb8046fd);
        }
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = lVar.f424175a;
        if (z18) {
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 >= 26) {
                accessibilityNodeInfo.setHintText(m20404xfb8046fd);
            } else {
                o3.g.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", m20404xfb8046fd);
            }
            if (!z17 && z18) {
                z27 = true;
            }
            if (i17 >= 26) {
                accessibilityNodeInfo.setShowingHintText(z27);
            } else {
                lVar.j(4, z27);
            }
        }
        if (z28) {
            if (!z19) {
                m20399x74627852 = m20396xf2ffa6f4;
            }
            accessibilityNodeInfo.setError(m20399x74627852);
            accessibilityNodeInfo.setContentInvalid(true);
        }
    }

    @Override // n3.c
    /* renamed from: onPopulateAccessibilityEvent */
    public void mo20440x6b5fe1b5(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.mo20440x6b5fe1b5(view, accessibilityEvent);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p262xc2858fed.C2720x269bcc07 c2720x269bcc07 = this.f126155e;
        android.widget.EditText m20398xdb574fcd = c2720x269bcc07.m20398xdb574fcd();
        java.lang.CharSequence text = m20398xdb574fcd != null ? m20398xdb574fcd.getText() : null;
        if (android.text.TextUtils.isEmpty(text)) {
            text = c2720x269bcc07.m20404xfb8046fd();
        }
        if (android.text.TextUtils.isEmpty(text)) {
            return;
        }
        accessibilityEvent.getText().add(text);
    }
}
