package ff;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f343106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ff.e f343107b;

    public b(ff.e eVar, android.view.View view) {
        this.f343107b = eVar;
        this.f343106a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(final int i17) {
        this.f343106a.post(new java.lang.Runnable() { // from class: ff.b$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i18 = i17 & 4;
                ff.e eVar = ff.b.this.f343107b;
                if (i18 == 0) {
                    eVar.f343113b.m138207xd0484ceb(true);
                } else {
                    eVar.f343113b.m138207xd0484ceb(false);
                }
            }
        });
    }
}
