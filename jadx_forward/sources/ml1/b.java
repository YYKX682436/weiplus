package ml1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f408723a = new ml1.a(this, android.os.Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public volatile ml1.d f408724b;

    public void a(java.lang.CharSequence charSequence, boolean z17) {
        if (charSequence == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f408723a;
        android.os.Message mo50291x733c63a2 = n3Var.mo50291x733c63a2(1000, android.text.Selection.getSelectionEnd(charSequence), 0, charSequence.toString());
        n3Var.mo50303x856b99f0(1000);
        n3Var.mo50311x7ab51103(mo50291x733c63a2, z17 ? 150L : 0L);
    }
}
