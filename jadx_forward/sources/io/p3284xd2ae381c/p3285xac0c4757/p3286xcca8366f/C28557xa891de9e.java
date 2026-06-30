package io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f;

/* renamed from: io.flutter.embedding.android.KeyChannelResponder */
/* loaded from: classes15.dex */
public class C28557xa891de9e implements io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder {
    private static final java.lang.String TAG = "KeyChannelResponder";

    /* renamed from: characterCombiner */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.CharacterCombiner f70678x8d9f915c = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.CharacterCombiner();

    /* renamed from: keyEventChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8 f70679xd31dbd08;

    public C28557xa891de9e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8 c28655x97b074e8) {
        this.f70679xd31dbd08 = c28655x97b074e8;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder
    /* renamed from: handleEvent */
    public void mo137299x5797ad52(android.view.KeyEvent keyEvent, final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f70679xd31dbd08.m138167x1060af0f(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.FlutterKeyEvent(keyEvent, this.f70678x8d9f915c.m137333xe95c6ec2(keyEvent.getUnicodeChar())), action != 0, new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.EventResponseHandler() { // from class: io.flutter.embedding.android.KeyChannelResponder$$a
                @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28655x97b074e8.EventResponseHandler
                /* renamed from: onFrameworkResponse */
                public final void mo137300x49d85840(boolean z17) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28564x6c2609a6.Responder.OnKeyEventHandledCallback.this.mo137335x7b44e762(z17);
                }
            });
        } else {
            onKeyEventHandledCallback.mo137335x7b44e762(false);
        }
    }
}
