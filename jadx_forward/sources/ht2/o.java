package ht2;

/* loaded from: classes2.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f366402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f366403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f366404f;

    public o(yz5.p pVar, android.widget.TextView textView, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f366402d = pVar;
        this.f366403e = textView;
        this.f366404f = c22789xd23e9a9b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f366402d.mo149xb9724478(this.f366403e, this.f366404f);
    }
}
