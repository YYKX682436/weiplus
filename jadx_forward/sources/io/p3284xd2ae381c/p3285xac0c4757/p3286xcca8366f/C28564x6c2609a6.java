package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.KeyboardManager */
/* loaded from: classes15.dex */
public class C28564x6c2609a6 implements io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d.KeyboardDelegate, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28657x666876fc.KeyboardMethodHandler {
    private static final java.lang.String TAG = "KeyboardManager";

    /* renamed from: redispatchedEvents */
    private final java.util.HashSet<android.view.KeyEvent> f70706x5c401945 = new java.util.HashSet<>();

    /* renamed from: responders */
    protected final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder[] f70707xda3c44b1;

    /* renamed from: viewDelegate */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.ViewDelegate f70708x1f29074a;

    /* renamed from: io.flutter.embedding.android.KeyboardManager$CharacterCombiner */
    /* loaded from: classes15.dex */
    public static class CharacterCombiner {

        /* renamed from: combiningCharacter */
        private int f70709xcfcc584d = 0;

        /* renamed from: applyCombiningCharacterToBaseCharacter */
        public java.lang.Character m137333xe95c6ec2(int i17) {
            char c17 = (char) i17;
            if ((Integer.MIN_VALUE & i17) != 0) {
                int i18 = i17 & Integer.MAX_VALUE;
                int i19 = this.f70709xcfcc584d;
                if (i19 != 0) {
                    this.f70709xcfcc584d = android.view.KeyCharacterMap.getDeadChar(i19, i18);
                } else {
                    this.f70709xcfcc584d = i18;
                }
            } else {
                int i27 = this.f70709xcfcc584d;
                if (i27 != 0) {
                    int deadChar = android.view.KeyCharacterMap.getDeadChar(i27, i17);
                    if (deadChar > 0) {
                        c17 = (char) deadChar;
                    }
                    this.f70709xcfcc584d = 0;
                }
            }
            return java.lang.Character.valueOf(c17);
        }
    }

    /* renamed from: io.flutter.embedding.android.KeyboardManager$PerEventCallbackBuilder */
    /* loaded from: classes15.dex */
    public class PerEventCallbackBuilder {

        /* renamed from: isEventHandled */
        boolean f70710x320d2d8c = false;

        /* renamed from: keyEvent */
        final android.view.KeyEvent f70711x1c71077b;

        /* renamed from: unrepliedCount */
        int f70713x77ba34af;

        /* renamed from: io.flutter.embedding.android.KeyboardManager$PerEventCallbackBuilder$Callback */
        /* loaded from: classes15.dex */
        public class Callback implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback {

            /* renamed from: isCalled */
            boolean f70714xd6a65947;

            private Callback() {
                this.f70714xd6a65947 = false;
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback
            /* renamed from: onKeyEventHandled */
            public void mo137335x7b44e762(boolean z17) {
                if (this.f70714xd6a65947) {
                    throw new java.lang.IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f70714xd6a65947 = true;
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.PerEventCallbackBuilder perEventCallbackBuilder = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.PerEventCallbackBuilder.this;
                int i17 = perEventCallbackBuilder.f70713x77ba34af - 1;
                perEventCallbackBuilder.f70713x77ba34af = i17;
                boolean z18 = z17 | perEventCallbackBuilder.f70710x320d2d8c;
                perEventCallbackBuilder.f70710x320d2d8c = z18;
                if (i17 != 0 || z18) {
                    return;
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.this.m137331x8d7d9764(perEventCallbackBuilder.f70711x1c71077b);
            }
        }

        public PerEventCallbackBuilder(android.view.KeyEvent keyEvent) {
            this.f70713x77ba34af = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.this.f70707xda3c44b1.length;
            this.f70711x1c71077b = keyEvent;
        }

        /* renamed from: buildCallback */
        public io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback m137334xd773fcd3() {
            return new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.PerEventCallbackBuilder.Callback();
        }
    }

    /* renamed from: io.flutter.embedding.android.KeyboardManager$Responder */
    /* loaded from: classes15.dex */
    public interface Responder {

        /* renamed from: io.flutter.embedding.android.KeyboardManager$Responder$OnKeyEventHandledCallback */
        /* loaded from: classes15.dex */
        public interface OnKeyEventHandledCallback {
            /* renamed from: onKeyEventHandled */
            void mo137335x7b44e762(boolean z17);
        }

        /* renamed from: handleEvent */
        void mo137299x5797ad52(android.view.KeyEvent keyEvent, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback);
    }

    /* renamed from: io.flutter.embedding.android.KeyboardManager$ViewDelegate */
    /* loaded from: classes15.dex */
    public interface ViewDelegate {
        /* renamed from: getBinaryMessenger */
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 mo137265x3b5b91dc();

        /* renamed from: onTextInputKeyEvent */
        boolean mo137272xfbd0a119(android.view.KeyEvent keyEvent);

        /* renamed from: redispatch */
        void mo137273x58ad6fad(android.view.KeyEvent keyEvent);
    }

    public C28564x6c2609a6(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.ViewDelegate viewDelegate) {
        this.f70708x1f29074a = viewDelegate;
        this.f70707xda3c44b1 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder[]{new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28560xeb192bcb(viewDelegate.mo137265x3b5b91dc()), new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28557xa891de9e(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8(viewDelegate.mo137265x3b5b91dc()))};
        new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28657x666876fc(viewDelegate.mo137265x3b5b91dc()).m138169x8e479f40(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onUnhandled */
    public void m137331x8d7d9764(android.view.KeyEvent keyEvent) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.ViewDelegate viewDelegate = this.f70708x1f29074a;
        if (viewDelegate == null || viewDelegate.mo137272xfbd0a119(keyEvent)) {
            return;
        }
        this.f70706x5c401945.add(keyEvent);
        this.f70708x1f29074a.mo137273x58ad6fad(keyEvent);
        if (this.f70706x5c401945.remove(keyEvent)) {
            io.p3284xd2ae381c.Log.w(TAG, "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    /* renamed from: destroy */
    public void m137332x5cd39ffa() {
        io.p3284xd2ae381c.Log.i(TAG, "destroy KeyboardManager");
        int size = this.f70706x5c401945.size();
        if (size > 0) {
            io.p3284xd2ae381c.Log.w(TAG, "A KeyboardManager was destroyed with " + java.lang.String.valueOf(size) + " unhandled redispatch event(s).");
        }
        this.f70708x1f29074a = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28657x666876fc.KeyboardMethodHandler
    /* renamed from: getKeyboardState */
    public java.util.Map<java.lang.Long, java.lang.Long> mo44270x3f607534() {
        return ((io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28560xeb192bcb) this.f70707xda3c44b1[0]).m137324x40a30005();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28696x8a22c93d.KeyboardDelegate
    /* renamed from: handleEvent */
    public boolean mo44271x5797ad52(android.view.KeyEvent keyEvent) {
        if (this.f70706x5c401945.remove(keyEvent)) {
            return false;
        }
        if (this.f70707xda3c44b1.length <= 0) {
            m137331x8d7d9764(keyEvent);
            return true;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.PerEventCallbackBuilder perEventCallbackBuilder = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.PerEventCallbackBuilder(keyEvent);
        for (io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder responder : this.f70707xda3c44b1) {
            responder.mo137299x5797ad52(keyEvent, perEventCallbackBuilder.m137334xd773fcd3());
        }
        return true;
    }
}
