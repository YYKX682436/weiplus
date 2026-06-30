package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaTextView extends android.widget.TextView {
    public KindaTextView(android.content.Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void findViewsWithText(java.util.ArrayList<android.view.View> arrayList, java.lang.CharSequence charSequence, int i17) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_kinda_textview, false)) {
            super.findViewsWithText(arrayList, charSequence, i17);
        } else {
            arrayList.remove(this);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_kindatext_tts, false)) {
            accessibilityNodeInfo.setText("");
            accessibilityNodeInfo.setContentDescription("");
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfo.setHintText("");
            }
            accessibilityNodeInfo.setFocusable(true);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_kindatext_tts, false)) {
            if ((accessibilityEvent.getEventType() & 32768) == 32768) {
                com.tenpay.android.wechat.TenpayTTSUtil.checkInit(getContext());
                com.tenpay.android.wechat.TenpayTTSUtil.speak(getText().toString());
            }
            accessibilityEvent.getText().clear();
        }
    }
}
