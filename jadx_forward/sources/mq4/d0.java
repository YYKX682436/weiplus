package mq4;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f412320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f412321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mq4.e0 f412323g;

    public d0(mq4.e0 e0Var, int i17, int i18, java.lang.String str) {
        this.f412323g = e0Var;
        this.f412320d = i17;
        this.f412321e = i18;
        this.f412322f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        mq4.e0 e0Var = this.f412323g;
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = e0Var.f412327e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(this.f412320d, this.f412321e, this.f412322f, e0Var);
        }
    }
}
