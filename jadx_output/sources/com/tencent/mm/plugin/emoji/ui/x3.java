package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes9.dex */
public final class x3 implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView f98556a;

    public x3(com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView emoticonCustomCreateResultView) {
        this.f98556a = emoticonCustomCreateResultView;
    }

    @Override // sr.b
    public void a(int i17) {
        if (i17 == 1) {
            com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView emoticonCustomCreateResultView = this.f98556a;
            com.tencent.mm.ui.widget.button.WeButton weButton = emoticonCustomCreateResultView.f97863h;
            if (weButton == null) {
                kotlin.jvm.internal.o.o("doneBtn");
                throw null;
            }
            weButton.setEnabled(true);
            com.tencent.mm.ui.widget.button.WeButton weButton2 = emoticonCustomCreateResultView.f97862g;
            if (weButton2 != null) {
                weButton2.setEnabled(true);
            } else {
                kotlin.jvm.internal.o.o("sendBtn");
                throw null;
            }
        }
    }
}
