package jq4;

/* loaded from: classes5.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a f382654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382655e;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a, android.view.View view) {
        this.f382654d = c18930xb402610a;
        this.f382655e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.p2352xc84b4196.C18930xb402610a c18930xb402610a = this.f382654d;
        android.view.ViewGroup.LayoutParams layoutParams = c18930xb402610a.getLayoutParams();
        android.view.View view = this.f382655e;
        layoutParams.width = view.getWidth();
        layoutParams.height = view.getHeight();
        c18930xb402610a.setLayoutParams(layoutParams);
    }
}
