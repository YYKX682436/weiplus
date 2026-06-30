package xe5;

/* loaded from: classes3.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535598b;

    public l(xe5.i iVar, java.lang.String str) {
        this.f535597a = iVar;
        this.f535598b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            android.widget.TextView textView = this.f535597a.f535583k;
            if (textView != null) {
                textView.setVisibility(0);
            }
            xe5.g0.f535559g.putBoolean(this.f535598b, true);
        }
        return jz5.f0.f384359a;
    }
}
