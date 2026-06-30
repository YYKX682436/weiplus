package rf4;

/* loaded from: classes4.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f f476581d;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f) {
        this.f476581d = c18482x82fd8d8f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f = this.f476581d;
        c18482x82fd8d8f.f253490f.getClass();
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f.N;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCommentView", "LogStory: comment recycler count is " + c18482x82fd8d8f.f253489e.getChildCount());
        int childCount = c18482x82fd8d8f.f253489e.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c18482x82fd8d8f.f253489e.getChildAt(i17);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7 = (com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7) childAt;
                long childCount2 = (c18482x82fd8d8f.f253489e.getChildCount() - i17) * 30;
                float b17 = (r5 + 1) * i65.a.b(c18474x76daa3b7.getContext(), 16);
                c18474x76daa3b7.setAlpha(0.0f);
                c18474x76daa3b7.setTranslationY(b17);
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c18474x76daa3b7, "translationY", b17, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setStartDelay(childCount2);
                ofFloat.start();
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c18474x76daa3b7, "alpha", 0.0f, 1.0f);
                ofFloat2.setDuration(150L);
                ofFloat2.setStartDelay(childCount2);
                ofFloat2.start();
            }
        }
    }
}
