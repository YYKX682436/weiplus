package com.tencent.kinda.framework.widget.base;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\"\u0010\u001d\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016J\u0012\u0010\u001e\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\"\u0010 \u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aH\u0016R\u0018\u0010!\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaPatternLockView;", "Lcom/tencent/kinda/framework/widget/base/MMKView;", "Landroid/view/View;", "Lcom/tencent/kinda/gen/KPatternLockView;", "Lcom/tencent/mm/plugin/walletlock/gesture/ui/widget/a;", "Landroid/content/Context;", "context", "createView", "", "getViewWidth", "getViewHeight", "Ljz5/f0;", "onVerifyPatternOK", "onVerifyPatternFail", "resetPatternView", "", "enable", "setEnableInput", "Lcom/tencent/kinda/gen/KPatternLockViewEndWithPatternCallback;", "callback", "setEndWithPatternCallback", "Lcom/tencent/kinda/gen/KPatternLockViewOnInputInvalidPatternCallback;", "setOnInputInvalidPatternCallback", "Lcom/tencent/mm/plugin/walletlock/gesture/ui/widget/PatternLockView;", "view", "onPatternStart", "", "Lhu4/k;", "newPattern", "onPatternGestureNodeJoin", "onPatternCleared", "pattern", "onPatternCompleted", "lockView", "Lcom/tencent/mm/plugin/walletlock/gesture/ui/widget/PatternLockView;", "endPatternCallback", "Lcom/tencent/kinda/gen/KPatternLockViewEndWithPatternCallback;", "invalidPatternCallback", "Lcom/tencent/kinda/gen/KPatternLockViewOnInputInvalidPatternCallback;", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class KindaPatternLockView extends com.tencent.kinda.framework.widget.base.MMKView<android.view.View> implements com.tencent.kinda.gen.KPatternLockView, com.tencent.mm.plugin.walletlock.gesture.ui.widget.a {
    public static final java.lang.String TAG = "KindaPatternLockView";
    private com.tencent.kinda.gen.KPatternLockViewEndWithPatternCallback endPatternCallback;
    private com.tencent.kinda.gen.KPatternLockViewOnInputInvalidPatternCallback invalidPatternCallback;
    private com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView lockView;

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.view.View createView(android.content.Context context) {
        if (context == null) {
            android.view.View createView = super.createView(context);
            kotlin.jvm.internal.o.f(createView, "createView(...)");
            return createView;
        }
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView = new com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView(context, null);
        patternLockView.setId(android.view.View.generateViewId());
        this.lockView = patternLockView;
        patternLockView.setEnableInput(true);
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView2 = this.lockView;
        if (patternLockView2 != null) {
            patternLockView2.setOnPatternListener(this);
        }
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView3 = this.lockView;
        if (patternLockView3 != null) {
            patternLockView3.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.kinda.framework.R.string.wc_pay_patternlock_view_tips));
        }
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView4 = this.lockView;
        kotlin.jvm.internal.o.e(patternLockView4, "null cannot be cast to non-null type com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView");
        return patternLockView4;
    }

    @Override // com.tencent.kinda.gen.KPatternLockView
    public int getViewHeight() {
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView = this.lockView;
        if (patternLockView != null) {
            return patternLockView.getSuggestedMinimumHeight();
        }
        return 0;
    }

    @Override // com.tencent.kinda.gen.KPatternLockView
    public int getViewWidth() {
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView = this.lockView;
        if (patternLockView != null) {
            return patternLockView.getSuggestedMinimumWidth();
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.walletlock.gesture.ui.widget.a
    public void onPatternCleared(com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView) {
        this.lockView = patternLockView;
        if (patternLockView != null) {
            patternLockView.setDisplayMode(com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Correct);
        }
    }

    @Override // com.tencent.mm.plugin.walletlock.gesture.ui.widget.a
    public void onPatternCompleted(com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView, java.util.List<hu4.k> list) {
        this.lockView = patternLockView;
        java.lang.Integer valueOf = list != null ? java.lang.Integer.valueOf(list.size()) : null;
        kotlin.jvm.internal.o.d(valueOf);
        if (valueOf.intValue() < 4) {
            if (patternLockView != null) {
                patternLockView.setDisplayMode(com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Wrong);
            }
            com.tencent.kinda.gen.KPatternLockViewOnInputInvalidPatternCallback kPatternLockViewOnInputInvalidPatternCallback = this.invalidPatternCallback;
            if (kPatternLockViewOnInputInvalidPatternCallback != null) {
                kPatternLockViewOnInputInvalidPatternCallback.onInputInvalidPattern();
                return;
            }
            return;
        }
        byte[] c17 = hu4.j.c(list);
        kotlin.jvm.internal.o.f(c17, "genPatternHash(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
        java.lang.String str = new java.lang.String(c17, UTF_8);
        com.tencent.kinda.gen.KPatternLockViewEndWithPatternCallback kPatternLockViewEndWithPatternCallback = this.endPatternCallback;
        if (kPatternLockViewEndWithPatternCallback != null) {
            kPatternLockViewEndWithPatternCallback.endWithPattern(str);
        }
    }

    @Override // com.tencent.mm.plugin.walletlock.gesture.ui.widget.a
    public void onPatternGestureNodeJoin(com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView, java.util.List<hu4.k> list) {
        this.lockView = patternLockView;
    }

    @Override // com.tencent.mm.plugin.walletlock.gesture.ui.widget.a
    public void onPatternStart(com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView) {
        this.lockView = patternLockView;
    }

    @Override // com.tencent.kinda.gen.KPatternLockView
    public void onVerifyPatternFail() {
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView = this.lockView;
        if (patternLockView != null) {
            patternLockView.setDisplayMode(com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Wrong);
        }
    }

    @Override // com.tencent.kinda.gen.KPatternLockView
    public void onVerifyPatternOK() {
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView = this.lockView;
        if (patternLockView != null) {
            patternLockView.setDisplayMode(com.tencent.mm.plugin.walletlock.gesture.ui.widget.b.Correct);
        }
    }

    @Override // com.tencent.kinda.gen.KPatternLockView
    public void resetPatternView() {
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView = this.lockView;
        if (patternLockView != null) {
            patternLockView.b();
        }
    }

    @Override // com.tencent.kinda.gen.KPatternLockView
    public void setEnableInput(boolean z17) {
        com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView patternLockView = this.lockView;
        if (patternLockView == null) {
            return;
        }
        patternLockView.setEnableInput(z17);
    }

    @Override // com.tencent.kinda.gen.KPatternLockView
    public void setEndWithPatternCallback(com.tencent.kinda.gen.KPatternLockViewEndWithPatternCallback kPatternLockViewEndWithPatternCallback) {
        this.endPatternCallback = kPatternLockViewEndWithPatternCallback;
    }

    @Override // com.tencent.kinda.gen.KPatternLockView
    public void setOnInputInvalidPatternCallback(com.tencent.kinda.gen.KPatternLockViewOnInputInvalidPatternCallback kPatternLockViewOnInputInvalidPatternCallback) {
        this.invalidPatternCallback = kPatternLockViewOnInputInvalidPatternCallback;
    }
}
