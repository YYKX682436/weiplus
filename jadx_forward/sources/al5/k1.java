package al5;

/* loaded from: classes15.dex */
public class k1 extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f87471a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, android.view.inputmethod.InputConnection inputConnection, boolean z17) {
        super(inputConnection, z17);
        this.f87471a = c22621x7603e017;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        fl5.f fVar = this.f87471a.B;
        if (fVar != null) {
            fVar.a(charSequence);
        }
        return super.commitText(charSequence, i17);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        fl5.f fVar = this.f87471a.B;
        if (fVar != null) {
            fVar.mo480x359d3323(keyEvent);
        }
        return super.sendKeyEvent(keyEvent);
    }
}
