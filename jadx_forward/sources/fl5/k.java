package fl5;

/* loaded from: classes15.dex */
public class k extends android.view.inputmethod.InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22662x5b8d7ea8 f345487a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.api.C22662x5b8d7ea8 c22662x5b8d7ea8, android.view.inputmethod.InputConnection inputConnection, boolean z17) {
        super(inputConnection, z17);
        this.f345487a = c22662x5b8d7ea8;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        fl5.f fVar = this.f345487a.L2;
        if (fVar != null) {
            fVar.a(charSequence);
        }
        return super.commitText(charSequence, i17);
    }
}
