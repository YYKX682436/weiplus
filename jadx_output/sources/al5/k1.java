package al5;

/* loaded from: classes15.dex */
public class k1 extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f5938a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.ui.widget.MMEditText mMEditText, android.view.inputmethod.InputConnection inputConnection, boolean z17) {
        super(inputConnection, z17);
        this.f5938a = mMEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        fl5.f fVar = this.f5938a.B;
        if (fVar != null) {
            fVar.a(charSequence);
        }
        return super.commitText(charSequence, i17);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        fl5.f fVar = this.f5938a.B;
        if (fVar != null) {
            fVar.sendKeyEvent(keyEvent);
        }
        return super.sendKeyEvent(keyEvent);
    }
}
