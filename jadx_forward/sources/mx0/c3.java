package mx0;

/* loaded from: classes5.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 f413399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413400e;

    public c3(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303, int i17) {
        this.f413399d = c10973x5ab09303;
        this.f413400e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303 = this.f413399d;
        android.view.View view = c10973x5ab09303.f151034d;
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) (view != null ? view.getBackground() : null);
        if (gradientDrawable != null) {
            android.view.View view2 = c10973x5ab09303.f151034d;
            gradientDrawable.setColor(i65.a.d(view2 != null ? view2.getContext() : null, this.f413400e));
        }
    }
}
