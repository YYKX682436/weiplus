package cl1;

/* loaded from: classes8.dex */
public class o extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView f42890n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView, android.content.Context context) {
        super(context);
        this.f42890n = appBrandDesktopView;
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        return super.l(h3.a.b(i17, java.lang.Math.round(this.f42890n.getContext().getResources().getDisplayMetrics().heightPixels * 0.75f), 3000));
    }
}
