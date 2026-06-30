package wq4;

/* loaded from: classes14.dex */
public class d0 implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f530154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f530155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f530156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f530157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wq4.k0 f530158e;

    public d0(wq4.k0 k0Var, java.lang.String str, long j17, boolean z17, int i17) {
        this.f530158e = k0Var;
        this.f530154a = str;
        this.f530155b = j17;
        this.f530156c = z17;
        this.f530157d = i17;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(android.media.MediaPlayer mediaPlayer) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        wq4.k0 k0Var = this.f530158e;
        if (currentTimeMillis - k0Var.f530185f > 70000) {
            k0Var.getClass();
        }
        if (k0Var.f530184e) {
            java.lang.String str = this.f530154a;
            long j17 = this.f530155b;
            wq4.j0 j0Var = new wq4.j0(k0Var, str, j17, this.f530156c, this.f530157d);
            k0Var.f530189j = j0Var;
            k0Var.f530188i.mo50297x7c4d7ca2(j0Var, j17);
        }
    }
}
