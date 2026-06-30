package xe5;

/* loaded from: classes3.dex */
public final class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535608b;

    public o(xe5.i iVar, java.lang.String str) {
        this.f535607a = iVar;
        this.f535608b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            android.widget.TextView textView = this.f535607a.f535583k;
            if (textView != null) {
                textView.setVisibility(8);
            }
            xe5.g0.f535559g.putBoolean(this.f535608b, false);
        }
        return jz5.f0.f384359a;
    }
}
