package cl1;

/* loaded from: classes8.dex */
public class w extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView f42901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView, android.view.View view) {
        super(view);
        this.f42901d = appBrandDesktopView;
        cl1.v vVar = new cl1.v(this);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483104wo);
        if (textView != null) {
            textView.setFocusable(false);
            textView.setOnClickListener(vVar);
            textView.setImportantForAccessibility(2);
            view.setImportantForAccessibility(1);
            view.setContentDescription(appBrandDesktopView.getContext().getString(com.tencent.mm.R.string.f489712l));
        }
        view.setOnClickListener(vVar);
    }
}
