package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class c extends x92.l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // x92.l, x92.r
    public void O6(int i17, java.lang.String str) {
        super.O6(i17, str);
        android.widget.ImageView imageView = this.f452703g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.view.ViewGroup viewGroup = this.f452705i;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }
}
