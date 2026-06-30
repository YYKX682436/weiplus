package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceResetUI */
/* loaded from: classes15.dex */
public class ActivityC18847x4de0beb1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18849x3feb382a
    public void a7() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/VoiceResetUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceResetUI", "onUnlockSuccess", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }
}
